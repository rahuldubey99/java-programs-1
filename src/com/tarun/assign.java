import java.util.Scanner;
public class assign {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double mark_avg;
        int result;
        int i;
        int s;
        //define size of array
        s = input.nextInt();
        //The array is defined "arr" and inserted marks into it of integer type.
        int[] arr = new int[s];

        for (i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        //Initialize maximum element as first element of the array.
        //Traverse array elements to get the current max.
        //Store the highest mark in the variable result.
        //Store average mark in avgMarks.
        int max = arr[0];
        for (i = 0; i < s; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }


        int sum = 0;
        System.out.println(max);
        for (i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        mark_avg = sum / s;
        System.out.print(mark_avg);
    }
}