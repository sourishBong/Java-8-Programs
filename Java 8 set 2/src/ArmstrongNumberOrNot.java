public class ArmstrongNumberOrNot {

    public static void main(String[] args) {

        System.out.println(" Is Armstrong No : " + isArmStrong(153));
    }

    private static boolean isArmStrong(int n) {

        int len=String.valueOf(n).length();

        int sum=String.valueOf(n)
                .chars()
                .map(ch->Character.digit(ch,10))
                .map(digit->(int)Math.pow(digit,len))
                .sum();

        return sum==n;
    }
}
