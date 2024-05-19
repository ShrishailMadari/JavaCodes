package arrays;

public class Demo4 {
    public static void main(String[] args) {
        int [][] multi = new int[3][4];
        multi[0][0] = 34;
        multi[0][1] = 14;
        multi[0][2] = 94;
        multi[1][0] = 54;
        multi[1][1] = 45;
        multi[1][2] = 74;
        multi[2][0] = 49;
        multi[2][1] = 742;
        multi[2][2] = 742;
        System.out.println(multi.length);

        for(int i = 0; i< multi.length; i++){
            for (int j = 0; j< multi[i].length; j++){
                System.out.print(multi[i][j]+" ");
            }
        }


    }

}
