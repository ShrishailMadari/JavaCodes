package arrays;

public class Demo2
{
    public static void main(String[] args) {
        System.out.println("Arrays using loops");
        int [] numbers = new int[5];
        int arr[] = {1,3,4,5,6};
        int []arrrr_1= {2,5,6,78,8,5,5};

        System.out.println("using for loop");
        for (int i=0; i<arr.length;i+=1){
            System.out.println(arr[i]);
        }

        System.out.println("For Each Loop");
        for (int num : arr){
            System.out.println(num);
        }
        System.out.println("Using while loop");
        int i = 0;
        System.out.println(arr.length);
        System.out.println();
        while (i<arr.length)
        {
            System.out.println(arr[i]);
            i+=1;
        }
    }
}
