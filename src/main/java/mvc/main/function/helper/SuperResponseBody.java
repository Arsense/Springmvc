package mvc.main.function.helper;

import java.lang.annotation.*;

/**
 * Created by 伟 on 2017/9/25.
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
@Documented
public @interface SuperResponseBody {
}
