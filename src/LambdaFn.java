
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;
public class LambdaFn {
    public List<Long> functionalProgramming(List<String> listOfIntegers)
    {
        List<Integer> tex = listOfIntegers.stream().map(Integer::parseInt).filter(i -> i%2 == 0).collect(Collectors.toList());
        List<Integer> num = listOfIntegers.stream().map(Integer::parseInt).collect(Collectors.toList());
        List<Long> outputList = new LinkedList<>();
        for(int i=0;i<num.size();i++)
        {
            int temp = num.get(i);
            int count=0, sum=0;
            if(temp==0)
                count=0;
            else{
                while(temp>0){
                temp=temp/10;
                ++count;}
            }
            temp=num.get(i);
            while (temp>0)
            {sum += Math.pow(temp%10,count);
                temp /= 10;}
            if(sum == num.get(i))
                outputList.add((long) sum);
        }
       return outputList;
    }
}