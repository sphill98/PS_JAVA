import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr1 = new int[N];
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        for (int i = 0; i < N; i++){
            arr1[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr1);

        int M = Integer.parseInt(br.readLine());

        str = br.readLine();
        st = new StringTokenizer(str, " ");
        for (int i = 0; i < M; i++){
            int target = Integer.parseInt(st.nextToken());

            int left = 0;
            int right = N - 1;
            int flag = 0;
            while (left <= right){
                int mid = (left + right) / 2;
                if (target == arr1[mid]){
                    flag = 1;
                    break;
                }else if (target < arr1[mid]){
                    right = mid - 1;
                }else{
                    left = mid + 1;
                }
            }
            System.out.println(flag);
        }
    }
}
