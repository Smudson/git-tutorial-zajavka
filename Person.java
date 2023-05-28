import java.math.BigDecimal;

public class Person {

    //jakies zmiany
    public static final String HEIGHT = "100";
    private String name;
    private BigDecimal salary;
    private String pesel;
    private String surname;

    public Integer age(){
        return 40;
    }

    public String whatIsYourHobby(){
        return "pizza";
    }

    public void hello(){
        System.out.println("Hello!");
        System.out.println("Hello2!");
        System.out.println("Hello3!");
        System.out.println("Hello4!");
        System.out.println("Hello5!");
        System.out.println("Hello6!");
    }
}
