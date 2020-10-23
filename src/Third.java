import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Third {
    public static void main(String[] args)throws IOException {
        System.out.println("Введіть радіус кола:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int r = Integer.parseInt(br.readLine());
        int r2 = r*r;
        float s = (float) (r2 * 3.14);
        float p = (float) (2*3.14*r);
        System.out.println("Периметр: "+p+" Площа: "+s);


    }
}
