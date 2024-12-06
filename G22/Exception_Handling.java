interface MyInterface{
    void myMethod();
}
public class Exception_Handling {
    public static void main(String[] args) {
        MyInterface obj =() -> System.out.println("hello");
        obj.myMethod();
    }
}
;