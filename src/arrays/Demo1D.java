package arrays;

public class Demo1D {
    public static void main(String[] args) {
        System.out.println("working with the arrays");
        System.out.println("array initialization: 1st way");
         int[] age = new int[10];
        System.out.println(age.length);
         age[0] = 19;
         age[1] = 20;
         age[3] = 16;
         age[4] = 34;
         try {
             age[11] = 6;
         }
         catch (ArrayIndexOutOfBoundsException exception){
             System.out.println(exception.getMessage());
             System.out.println(exception.getStackTrace());
             System.out.println(exception.getLocalizedMessage());
             System.out.println(exception.getClass());
         }



         float[] weight = new float[5];
         weight[0] = 100.7f;
         weight[1] = 40F;
         weight[3] = 13.45F;
         weight[4] = 13f;
        System.out.println(weight.length);
        System.out.println();
         String[] veg = new String[4];
         veg[0] = "apple";
         veg[1] = "mango";
         veg[2] = "grapes";
         veg[3] = "Orange";
        System.out.println(veg.length);
        System.out.println();
        int [] i = {1,2,3,4,45};
        System.out.println(i[0]);
        System.out.println(i[5]);

    }
}
