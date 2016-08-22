package ihundan.wukonglin.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 *运行  
 *	第一种方式
 *		通过在UserController中加上@EnableAutoConfiguration开启自动配置，
 *			然后通过SpringApplication.run(UserController.class);运行这个控制器；这种方式只运行一个控制器比较方便；
 *	第二种方式
 *		通过@Configuration+@ComponentScan开启注解扫描并自动注册相应的注解Bean
 * @author wukl3
 *
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
public class MainBoot {
	
	public static void main(String[] args) {
		SpringApplication.run(MainBoot.class, args);
	}
}
