package cn.zh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@SpringBootApplication
@MapperScan("cn.zh.dao")
@EnableTransactionManagement  // 配合service层的@Transaction
public class VipManagerSystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(VipManagerSystemApplication.class, args);
    }

}
