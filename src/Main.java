import java.lang.invoke.StringConcatFactory;

public class Main {
    public static void main(String[] args) {
        int a = 4;
        int b = 5;
        int c = 3;
        int d = 6;

        int sum1 = a + b;
        int sum2 = c + d;

/*        if (sum1 > sum2){
            System.out.println("sum1 > sum2: " + String.format("%d ",sum1) + String.format(" > %d ",sum2));
        }*/

        System.out.println(sum1 > sum2);
            sum1 ++;
            sum2 = sum2 - 2;

        System.out.println(sum1 > sum2);
        System.out.println((sum1 % 2 == 0) || (sum2 % 2 == 0));

    }
}