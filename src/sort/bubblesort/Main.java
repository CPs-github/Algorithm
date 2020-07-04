package sort.bubblesort;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.SimpleFormatter;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[5];
        for (int i = 0; i < 5; i++){
            arr[i] = (int) (Math.random()*800000);
        }

        printTime();
        new BubbleSort(arr);
        printTime();
        System.out.println(Arrays.toString(arr));
    }
    private static void printTime(){
        Date date = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yy-MM-dd: HH:mm:ss");
        String s = simpleDateFormat.format(date);
        System.out.println(s);
    }
}
