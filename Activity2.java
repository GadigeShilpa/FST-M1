import java.util.Arrays;

public class Activity2 {

    public static void main(String[] args) {
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));

        int SearchNum = 10;
        int fixedSum = 30;

        System.out.println("Result: " + result(numArr,SearchNum,fixedSum));

    }
    public static boolean result(int[] numbers, int SearchNum, int fixedSum){
     int tempSum = 0;
     for (int number : numbers){
         if (number == SearchNum){
             tempSum += SearchNum;
         }
         if (tempSum > fixedSum) {
             break;
         }
     }
        System.out.println("fixedSum=" +tempSum);
        return tempSum == fixedSum;

    }
}

