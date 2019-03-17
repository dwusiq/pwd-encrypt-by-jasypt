package com.wusiq.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import lombok.Data;

@Table(name = "user_info")
@Data
@Entity
public class UserInfo {
    @Id
    @Column(name = "account_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "1")
    @TableGenerator(initialValue = 100000,allocationSize=1,name = "account_id")
    private Long accountId;
    @Column(name = "account_name", columnDefinition = "varchar(50) not null unique  COMMENT '帐号'")
    private String accountName;
    @Column(name = "account_name_zh", columnDefinition = "varchar(50) not null  COMMENT '帐号中文名'")
    private String accountNameZh;
}
