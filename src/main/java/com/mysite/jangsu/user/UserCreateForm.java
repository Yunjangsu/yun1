package com.mysite.jangsu.user;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserCreateForm {
    @jakarta.validation.constraints.Size(min = 3, max = 25)
    @jakarta.validation.constraints.NotEmpty(message = "사용자ID는 필수항목입니다.")
    private String username;

    @jakarta.validation.constraints.NotEmpty(message = "비밀번호는 필수항목입니다.")
    private String password1;

    @jakarta.validation.constraints.NotEmpty(message = "비밀번호 확인은 필수항목입니다.")
    private String password2;

    @jakarta.validation.constraints.NotEmpty(message = "이메일은 필수항목입니다.")
    @jakarta.validation.constraints.Email
    private String email;
}