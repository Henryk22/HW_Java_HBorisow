import java.util.Arrays;

public class aufg2 {
    public static void main(String[] args) {
        int [] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*90)+10;
        }
        System.out.println(Arrays.toString(arr));

        boolean flag = true;
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<=arr[i-1]){
                flag = false;
                break;
            }
        }
        if(flag){
            System.out.println("The array is a strictly increasing sequence");
        } else {
            System.out.println("The array is not a strictly increasing sequence");
        }
    }
}
}
