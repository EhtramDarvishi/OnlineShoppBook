package com.example.onlineshopebook.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;


@Getter
@AllArgsConstructor
@Valid
public class UserRequest {

    @NotNull(message = "{UserName.is.null}")
    @NotBlank(message = "{UserName.is.blank}")
    private final String userName;
    @NotNull(message = "{Password.is.null}")
    @NotBlank(message = "{Password.is.blank}")
    private final String password;

}
