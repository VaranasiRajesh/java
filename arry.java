import java.lang.reflect.Array;
import java.util.Arrays;

public class arry {

    public static void removingduplicate(int[] arr) {
        System.out.println("the duplicate values are : ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {

                    System.out.print(arr[j] + ",");
                }
            }

        }
    }

    public static void peakvalue(int[] arr) {
        int max = Arrays.stream(arr).max().getAsInt();
        System.out.println(max);
    }

    public static void reversethearray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void sortArray(int[] arr) {
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + ",");
        }
    }

    public static void kthLargestNumber(int[] arr, int k) {
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.println(x + ",");
        }
        System.out.println(k + " largest number is:- " + arr[arr.length - k]);
    }

    public static void kthSmallestNumber(int[] arr, int k) {
        Arrays.sort(arr);
        for (int x : arr) {
            System.out.print(x + ",");
        }
        System.out.println(k + " smallest number is:- " + arr[k - 1]);
    }

    public static void occurance(int[] arr, int k) {
        Arrays.sort(arr);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == k) {
                count++;
            }
        }
        System.out.println("the number " + k + " occurence is:-" + count);
    }

    public static void SubArraySum(int[] arr, int LowerBound, int UpperBound) {
        int sum = 0;
        for (int i = LowerBound; i < UpperBound + 1; i++) {
            sum += arr[i];
        }
        System.out.println("sum found between indexes " + LowerBound + " and " + UpperBound + " is " + sum);
    }

    public static void evenoddsum(int[] arr) {
        int even = 0;
        int odd = 0;
        // int[] evenno={};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0) {
                even += arr[i];
                // evenno[i]=arr[i];
            } else {
                odd += arr[i];
                // oddno[i]=arr[i];
            }
        }

        System.out.println("even number are:-" + even);
        System.out.println("odd number are :-" + odd);
        // System.out.println(evenno);

    }

    public static void adamnumber(int number) {

        String str = Integer.toString(number);
        

    }

    public static void main(String[] args) {
        // int[] arr = { 1, 2, 3, 4, 5 };
        // adamnumber(143);
        // areaofthecircle ar=new areaofthecircle();
        // ar.area();
        student stu=new student(101,"rajesh");
        stu.details();
        // evenoddsum(arr);
        // SubArraySum(arr, 0, 2);
        // int []arr= {0, 1, 1, 0, 1, 2, 1, 2, 0, 0, 0, 1};
        // removingduplicate(arr);
        // peakvalue(arr);
        // reversethearray(arr);
        // sortArray(arr);
        // kthLargestNumber(arr, 3);
        // kthSmallestNumber(arr, 3);
        // occurance(arr,5);
    }
}
