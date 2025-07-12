package com.aoun.salonmanagement.dto;

public class ProviderDto extends UserDto{
    private Boolean homeService;
    private String providerDescription;
    private Double providerRating;

    public ProviderDto(String userFirstName, String userLastName, String userGender, String userEmail, String userPhoneNumber, String userName, String userPassword, String userRole, Boolean homeService, String providerDescription, Double providerRating) {
        super(userFirstName, userLastName, userGender, userEmail, userPhoneNumber, userName, userPassword, userRole);
        this.homeService = homeService;
        this.providerDescription = providerDescription;
        this.providerRating = providerRating;
    }

    public ProviderDto() {
    }

    public Boolean getHomeService() {
        return homeService;
    }

    public void setHomeService(Boolean homeService) {
        this.homeService = homeService;
    }

    public String getProviderDescription() {
        return providerDescription;
    }

    public void setProviderDescription(String providerDescription) {
        this.providerDescription = providerDescription;
    }

    public Double getProviderRating() {
        return providerRating;
    }

    public void setProviderRating(Double providerRating) {
        this.providerRating = providerRating;
    }
}
