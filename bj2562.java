import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int max_val = Integer.parseInt(br.readLine());
        int max_ind = 1;
        for (int i = 2; i < 10; i++){
            int n = Integer.parseInt(br.readLine());
            max_val = Math.max(max_val, n);
            if (max_val == n){
                max_ind = i;
            }
        }
        System.out.println(max_val);
        System.out.println(max_ind);
    }
}
