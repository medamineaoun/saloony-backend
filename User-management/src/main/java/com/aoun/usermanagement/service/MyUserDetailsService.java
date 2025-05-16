package com.aoun.usermanagement.service;

import com.aoun.usermanagement.entity.Customer;
import com.aoun.usermanagement.entity.Provider;
import com.aoun.usermanagement.entity.User;
import com.aoun.usermanagement.repository.CustomerRepository;
import com.aoun.usermanagement.repository.ProviderRepository;
import com.aoun.usermanagement.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MyUserDetailsService implements UserDetailsService {


    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        User user = userRepository.findByUserEmail(email)
                .orElseThrow(() -> new UsernameNotFoundException("Utilisateur non trouvé"));

        return new org.springframework.security.core.userdetails.User(
                user.getUserEmail(),
                user.getUserPassword(),
                List.of(new SimpleGrantedAuthority(user.getUserRole()))
        );
    }
}