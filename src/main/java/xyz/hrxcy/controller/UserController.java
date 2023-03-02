package xyz.hrxcy.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserController {
    private int uId;
    private String name;
    private String password;
    private int phone;
}