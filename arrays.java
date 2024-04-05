import java.util.Arrays;
import java.util.Collections;

public class arrays{


    public static void secondlargest(int[] arr){
		System.out.println("The original array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
		Arrays.sort(arr);
		System.out.println("\nThe sorted array is: ");
		for (int num : arr) {
			System.out.print(num + " ");
		}
        System.out.println("\n The second largest = "+arr[arr.length-2]);
    }
    for(int value:arr){

    }




    public static void main(String[] args){
        int[] arr1 = { 10,20,30,50,80,5,100 };
        int[] arr2={1,2,3,4,5,6,7,8};
        int[] arr3={430,480,350};
        int[] arr4={-5,-4,-3,-2,-1,0,1,2,-10};

		secondlargest(arr4);
    }

    
}