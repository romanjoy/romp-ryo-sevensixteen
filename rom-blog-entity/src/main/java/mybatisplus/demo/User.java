package mybatisplus.demo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("mybatis_plus_user")
public class User {
    private Long id;
    private String name;
    private Integer age;
    private String email;
}
