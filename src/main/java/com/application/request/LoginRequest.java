
package com.application.request;

import javax.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginRequest {
   
   @NotBlank(message = "Email is required") 
   private String email;
   
   @NotBlank(message = "Password is required")
   private String password;
    
    
    
}
