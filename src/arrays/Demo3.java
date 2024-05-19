package arrays;

public class Demo3 {
    public static void main(String[] args) {
        int array[][] = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
//        System.out.println(array[1].length);

        for (int i = 0; i< array.length;i++){
            for (int j = 0; j< array[i].length;j++){
                System.out.println(array[i][j]);
            }
            System.out.println();
        }
        Demo3 demo3 = new Demo3();
//        demo3.sumOfArray();
//        sumOfArray();
        maxOfArray();
        maxOfgArray();


    }
   static void sumOfArray(){
        int arr[]= {29,82,75,32};
        int sum = 0;
        for (int num: arr){
            sum = sum + num;
        }
        System.out.println(sum);}

    static void maxOfArray(){
        int[] array = {1,2,3,4,6,100};
        int max = 0;
        for (int num: array){
            if(max < num){
                 max = num;
            }
        }
        System.out.println(max);
    }
    static void maxOfgArray(){
        int[] array = {1,2,3,4,6,100};
        int max = 0;
        for (int num: array){
            if(num> max){
                max = num;
            }
        }
        System.out.println(max);
    }


}
