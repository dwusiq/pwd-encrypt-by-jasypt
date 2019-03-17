import com.wusiq.Application;
import org.jasypt.util.text.BasicTextEncryptor;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * 测试生成密码
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class DbPwdTest {

    @Value("${jasypt.encryptor.password}")
    private String encodingPassword;
    @Value("${spring.datasource.password}")
    private String sdp;

    /**
     * 加密密码
     */
    @Test
    public void testEncrypt() {
        BasicTextEncryptor encryptor = new BasicTextEncryptor();
        //加密盐
        encryptor.setPassword(encodingPassword);
        //加密内容
        String encStr = encryptor.encrypt("123456");
        System.out.println(encStr);
    }
}
