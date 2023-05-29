package com.example.its.web.validation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.Payload;

//@targetアノテーションを付与できる場所
@Target({ElementType.METHOD, ElementType.FIELD})
//@Retentionどの段階まで残すのか実行時まで
@Retention(RetentionPolicy.RUNTIME)
//validationを実行するクラスを指定する
@Constraint(validatedBy=UniqueUsernameValidator.class)
public @interface UniqueUsername {
    String message() default "入力されたユーザーはすでに存在しています。";
    Class<?>[] groups() default{};
    Class<? extends Payload>[] payload() default {};

}