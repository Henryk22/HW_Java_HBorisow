import java.util.Arrays;

public class aufg1 {
    public static void main(String[] args) {
        int [] arr = new int[8];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*50)+1;
        }
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if(i%2 == 1){
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
