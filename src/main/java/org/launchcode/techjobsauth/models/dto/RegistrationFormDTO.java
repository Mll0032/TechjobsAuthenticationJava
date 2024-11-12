package org.launchcode.techjobsauth.models.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class RegistrationFormDTO extends LoginFormDTO{

    @NotNull(message = "Password is required.")
    @NotBlank(message = "Password is required.")
    @Size(min = 8, max = 30, message = "Password must be 3-30 characters long.")
    private String verifyPassword;

    public @NotNull(message = "Password is required.") @NotBlank(message = "Password is required.") @Size(min = 8, max = 30, message = "Password must be 3-30 characters long.") String getVerifyPassword() {
        return verifyPassword;
    }

    public void setVerifyPassword(@NotNull(message = "Password is required.") @NotBlank(message = "Password is required.") @Size(min = 8, max = 30, message = "Password must be 3-30 characters long.") String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }
}
