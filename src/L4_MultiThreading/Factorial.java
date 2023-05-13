package L4_MultiThreading;

import java.math.BigInteger;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Factorial {

    public static void main(String[] args) {
        List<Integer> nums = List.of(2,4,5,6); 
        List<BigInteger> result = nums.stream().map(
                Factorial::calculateFactorial
        ).collect(Collectors.toList());
        System.out.println(result);
    }

    public static BigInteger calculateFactorial(int num) {
         BigInteger result = BigInteger.ONE;
         for(int i=2;i<=num;i++) {
             result = result.multiply(BigInteger.valueOf(i));
         }
         return result;

//        return IntStream.range(2, num+1)
//                .mapToObj(BigInteger::valueOf)
//                .reduce(BigInteger.ONE, (x,y)-> x.multiply(y));
    }
}
