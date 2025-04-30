package qtb.yns.my_project;

public class firstClass {

    String newVar;
    public firstClass(String newVar) {
        this.newVar = newVar;
    }

    public String myFunc(){

        return "hello world LOOK " + this.newVar;
    }
}
