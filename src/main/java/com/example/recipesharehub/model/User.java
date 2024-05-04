package com.example.recipesharehub.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter //we use lombok so no need create getters and setters
public class User {
    private Long id;
    private String password;
    private String email;
    private String fullName;


}
