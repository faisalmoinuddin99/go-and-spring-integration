package com.kakashi.reactivedemo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserResponse {
    private int id ;
    private String firstName ;
    private String lastName ;
    private int age ;
    private String email ;
    private String city ;
    private String country ;
    private String state ;
}
