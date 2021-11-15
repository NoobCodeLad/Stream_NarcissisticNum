import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LambdaFn lf = new LambdaFn();
        int a=1;
        int b=1000000;
        List<String> listOfIntegers = new ArrayList<>();
        for(long i=a;i<=b;i++)
        {
            listOfIntegers.add(i+"");
        }
        int actual = lf.functionalProgramming(listOfIntegers).hashCode();
        System.out.println(actual);





    }
}
