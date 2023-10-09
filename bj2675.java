import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++){
            String[] str = br.readLine().split(" ");
            int N = Integer.parseInt(str[0]);
            for (int j = 0; j < str[1].length(); j++){
                for (int k = 0; k < N; k++){
                    System.out.print(str[1].charAt(j));
                }
            }
            System.out.println();
        }
    }
}
