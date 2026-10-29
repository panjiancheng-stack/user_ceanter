import com.panjiancheng.user_center.UserCenterApplication;
import com.panjiancheng.user_center.mapper.UserMapper;
import com.panjiancheng.user_center.model.User;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@SpringBootTest(classes = UserCenterApplication.class)
public class SampleTest {

    @Resource
    private UserMapper userMapper;

    @Test
    public void testSelect() {
        System.out.println("----- selectAll method test ------");
        List<User> userList = userMapper.selectList(null);
        userList.forEach(System.out::println);
    }
}
