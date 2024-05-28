package com.LoveArt.ServiceAuth.Auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class RegisterRequest {
    String UserName;
    String FirtName;
    String LastName;
    String Email;
    String password;

}
