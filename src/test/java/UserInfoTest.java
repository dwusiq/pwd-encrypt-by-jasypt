import com.wusiq.Application;
import com.wusiq.user.UserServicse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试新增数据
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class UserInfoTest {

    @Autowired
    private UserServicse userServicse;

    @Test
    public void testAddUser() {
        userServicse.addUser();
    }
}
