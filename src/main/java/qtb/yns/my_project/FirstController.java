package qtb.yns.my_project;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
public class FirstController {

//    @GetMapping("/hello")
//    public String sayHello() {
//        return "Hello World";
//    }

    @PostMapping("/post")
    public String sayHelloPost( @RequestBody String message) {
        return "post methode message is  " + message;
    }

    @PostMapping("/post-order")
    public String order( @RequestBody Order order) {
        return "my order is  " + order.toString();
    }

    @PostMapping("/post-order-record")
    public String orderRecord( @RequestBody OrderRecord order) {
        return "my order is  " + order.toString();
    }

    @GetMapping("/hello/{user-name}")
    public String pathValue(@PathVariable("user-name") String userName) {
        return "this is my path value " + userName;
    }

    @GetMapping("/hello")
    public String paramsValue(@RequestParam("user-name") String userName, @RequestParam int age) {
        return "this is my path value " + userName + " is " + age;
    }
}
