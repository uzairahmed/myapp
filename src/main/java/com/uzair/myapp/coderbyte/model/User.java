package com.uzair.myapp.coderbyte.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String name;
    private String gender;
    private String email;
    private String status;
}
