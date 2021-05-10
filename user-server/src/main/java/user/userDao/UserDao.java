package user.userDao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import user.userEntity.User;

@Mapper
public interface UserDao extends BaseMapper<User> {
}
