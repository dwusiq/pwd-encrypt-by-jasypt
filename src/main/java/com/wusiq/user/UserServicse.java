package com.wusiq.user;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicse {

    @Autowired
    private UserRepository userRepository;

    public void addUser() {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS");
        String now = LocalDateTime.now().format(dtf);
        UserInfo userInfo = new UserInfo();
        userInfo.setAccountName("test"+now);
        userInfo.setAccountNameZh("测试账号"+now);
        userRepository.save(userInfo);
    }
}
