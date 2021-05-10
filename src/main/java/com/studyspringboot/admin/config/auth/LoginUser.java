package com.studyspringboot.admin.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) // 파라미터에서만 쓸 수 있다
@Retention(RetentionPolicy.RUNTIME)
public @interface LoginUser {
}
