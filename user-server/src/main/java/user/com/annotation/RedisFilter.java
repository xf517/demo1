package user.com.annotation;

import java.lang.annotation.*;

/**
 * @author ajxt
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface RedisFilter {

    int num() default 1;
}
