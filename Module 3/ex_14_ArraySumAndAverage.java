import java.util.Scanner;
public class ex_14_ArraySumAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        
        System.out.println("Enter " + size + " elements:");
        for(int i=0; i<size; i++) arr[i] = sc.nextInt();
        
        int sum = 0;
        for(int num : arr) sum += num;
        
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + (double)sum/size);
    }
}
