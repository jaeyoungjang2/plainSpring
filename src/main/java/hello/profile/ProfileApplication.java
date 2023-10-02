package hello.profile;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

//@Import(MyDataSourceEnvConfig.class)
@Import(MyDataSourceValueConfig.class)
@SpringBootApplication(scanBasePackages = "hello.profile")
public class ProfileApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProfileApplication.class, args);
    }

}
