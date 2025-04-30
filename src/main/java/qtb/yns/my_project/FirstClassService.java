package qtb.yns.my_project;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
@PropertySource("classpath:custom.properties")
public class FirstClassService {

    private final firstClass varServiceClass ;
    private Environment environment;

    @Value("${my.prop}")
    private String dataFromAnotherFile;
    @Value("${my.custom.prop}")
    private String dataFromAppFile;


    @Autowired
    FirstClassService(@Qualifier("mySecondBean") firstClass varServiceClass){
        this.varServiceClass = varServiceClass;
    }

    public String saySomething() {
        return "look what my class say "  + varServiceClass.myFunc();
    }

    public String showVersion() {
        return environment.getProperty("java.version");
    }

    @Autowired
    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

    public String getDataFromAnotherFile() {
        return dataFromAnotherFile;
    }

    public String getDataFromAppFile() {
        return dataFromAppFile;
    }


}
