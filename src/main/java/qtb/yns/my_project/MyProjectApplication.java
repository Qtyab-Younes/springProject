package qtb.yns.my_project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyProjectApplication {

    public static void main(String[] args) {
        var ctx= SpringApplication.run(MyProjectApplication.class, args);

        FirstClassService firstClassServ = ctx.getBean(FirstClassService.class);
        System.out.println(firstClassServ.saySomething());
        System.out.println(firstClassServ.showVersion());
        System.out.println(firstClassServ.getDataFromAnotherFile());
        System.out.println(firstClassServ.getDataFromAppFile());
    }



}