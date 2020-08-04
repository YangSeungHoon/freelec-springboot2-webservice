package com.sh.book.springboot.config.auth;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.PARAMETER) //이 어노테이션은 파라미터에 쓰겠다.
@Retention(RetentionPolicy.RUNTIME) //어느 시점까지 어노테이션의 영향이 미치는지..
public @interface LoginUser {
}
