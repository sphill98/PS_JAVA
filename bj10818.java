import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");

        int[] arr = new int[N];

        for (int i = 0; i < N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        
        int max_arr = arr[0];
        int min_arr = arr[0];

        for (int i = 1; i < N; i++){
            max_arr = Math.max(max_arr, arr[i]);
            min_arr = Math.min(min_arr, arr[i]);
        }

        System.out.print(min_arr);
        System.out.print(" ");
        System.out.println(max_arr);
    }
}
