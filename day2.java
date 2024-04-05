import java.lang.reflect.Array;

public class day2 {

    public static int adding(int a, int b) {
        int c = a + b;
        return c;

    }

    public static double CtoF(int C) {
        double F = (C * 1.8) + 32;
        return F;
    }

    public static double AreaofTheCricle(int r) {
        double Area = 3.14159 * r * r;
        return Area;
    }

    public static double AreaofTheTriangle(double h, double b) {
        double Area = (h * b) / 2;
        return Area;
    }

    public static int NextMultipleOff100(int value) {
        int answer = value % 100;
        int nxt = value + (100 - answer);
        return nxt;
    }

    public static double MinutesToYears(double minutes) {
        double years = minutes / 525600;
        return years;
    }

    public static int SumfoTwoDigits(int number) {
        return (number / 10) + (number % 10);
    }

    public static int LargestNumber(int n1, int n2) {
        if (n1 > n2) {
            return n1;
        } else {
            return n2;
        }
    }

    public static int LargestNumberofthree(int n1, int n2, int n3) {
        if (n1 > n2 && n1 > n3) {
            return n1;
        } else if (n2 > n3) {
            return n2;
        } else {
            return n3;
        }
    }

    public static void evenoddsum() {
        int n = 10;
        if (n % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }

    public static void EvenOddSum(){
        int arr[] = {1,2,3,4,5,6,7,8,9,10};

        for(int i=0;i<arr.length;i++){
            int even[]=new int[arr.length];
            int odd[]=new int[arr.length];
            if(arr[i]%2==0){
           even[i]+=arr[i];
        //    System.out.println(even[i]);
            }else{
                odd[i]+=arr[i];
        //    System.out.println(odd[i]);
            }
            int sumofeven=0;
            for(int j=0;j<arr.length;j++){
                sumofeven+=even[i];

            }
               
        }
    }

    public static void main(String[] args) {
        // System.out.println(LargestNumberofthree(10, 9, 8));
        // evenoddsum();
        EvenOddSum();
    

        // System.out.println(LargestNumber(10, 20));
        // System.out.println("Sum of two numbers = "+SumfoTwoDigits(55));
        // System.out.println(MinutesToYears(525600));
        // System.out.println(NextMultipleOff100(39872));
        // System.out.println(AreaofTheTriangle(10, 10));
        // System.out.println(AreaofTheCricle(20));
        // System.out.println(CtoF(27));
        // System.out.println(adding(10,20));
        // int a = 12;
        // int b = 10;
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(a+=b);
        // System.err.println(b-=a);
        // System.out.println(a);
        // System.out.println(b);
        // System.out.println(--a);
        // System.out.println(a);
        // System.out.println(b++);
        // System.out.println(b);

        // int number = 62;

        // if(number % 2 == 0){
        // System.out.println("even");
        // }else{
        // System.out.println("odd");
        // }

        // int number = 62;

        // int result=number%10;

        // int sec=number/10;

        // System.out.println(result+sec);

        

    }
}
