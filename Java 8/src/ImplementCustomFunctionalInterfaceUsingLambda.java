
@FunctionalInterface
interface MyFunction{
    void display(String message);
}

public class ImplementCustomFunctionalInterfaceUsingLambda {

    public static void main(String[] args) {

        String msg="My message to you";
        MyFunction m=(message)-> System.out.println("Message->"+message);
        m.display(msg);
    }
}
