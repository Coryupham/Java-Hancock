public class Fib {

    public static long generate(int count){
        long  num1 = 0, num2 = 1;
        int i=1;
        while(i<=count)
        {
            long sumOfPrevTwo = num1 + num2;
            num1 = num2;
            num2 = sumOfPrevTwo;
            i++;
        }


    return num1;
    }
}
