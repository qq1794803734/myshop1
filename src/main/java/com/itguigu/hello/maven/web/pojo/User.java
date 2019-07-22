package com.itguigu.hello.maven.web.pojo;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
public class User {
    private Integer id;

    @JsonProperty(value = "username")
    private String name;

    @JsonIgnore
    private String password;
    private String email;


}
