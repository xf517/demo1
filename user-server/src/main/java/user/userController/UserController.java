package user.userController;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import user.com.annotation.RedisFilter;
import user.userDao.RedisDao;
import user.userDao.UserDao;
import user.userEntity.User;

@RestController
@Slf4j
public class UserController {
    @Autowired
    private UserDao userDao;
    @Autowired
    private RedisDao redisDao;

    @RedisFilter(num = 2)
    @PostMapping("/test")
    public User test(){
        User user = userDao.selectById("1");
        String value = redisDao.getValue(user.getName());
        if(value == null){
            log.warn("redis里面没有该用户11:{}",user.getName());
            redisDao.setKey(user.getName(),user.getPassword());
        }else{
            log.warn("redis里面已有该用户:{}",user.getName());
        }
        return user;
    }

    @GetMapping("/hello")
    private String test1(){
        return "user-server";
    }
}
