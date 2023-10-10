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

        int cnt = 0;

        for (int val : arr){
            if (isPrime(val)){
                cnt++;
            }
        }

        System.out.println(cnt);

    }

    static boolean isPrime(int P){
        if (P == 1){
            return false;
        }
        for (int i = 2; i <= Math.sqrt((double)P); i++){
            if (P % i == 0){
                return false;
            }
        }
        return true;
    }
}
