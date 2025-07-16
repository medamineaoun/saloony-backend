import { Component } from '@angular/core';
import {FormControl, FormGroup, ReactiveFormsModule, Validators} from "@angular/forms";
import {Router, RouterLink} from "@angular/router";
import {CommonModule} from "@angular/common";
import {AuthService} from "../services/auth.service";

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [ReactiveFormsModule, RouterLink, CommonModule],
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {
  loginForm = new FormGroup({
    email: new FormControl('', [Validators.required, Validators.email]),
    password: new FormControl('', [Validators.required, Validators.minLength(6)])
  });
  isLoading = false;
  errorMessage: string | null = null;
  constructor(
    private authService: AuthService,
    private router:Router
  ) {}

  onSubmit() {
    console.log("hiiiiiiiiiii");
    if (this.loginForm.invalid) {
      //this.markAllAsTouched();
      return;
    }

    this.isLoading = true;
    this.errorMessage = null;

    const { email, password } = this.loginForm.value;

    this.authService.login(email!, password!).subscribe({
      next: (response) => {
        // Succès de la connexion
        console.log("Login successful, navigating to dashboard");
        this.router.navigate(['/dash']);
      },
      error: (err) => {
        this.errorMessage = err;
        this.isLoading = false;
      }
    });
  }


}
