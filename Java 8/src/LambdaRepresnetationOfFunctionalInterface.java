
@FunctionalInterface
interface Square{
    int calcualate(int x);
}

public class LambdaRepresnetationOfFunctionalInterface {

    public static void main(String[] args) {

        int a=5;

        //lambda representation
        Square s=x->x*x;

        int ans=s.calcualate(a);
        System.out.println(ans);
    }
}
