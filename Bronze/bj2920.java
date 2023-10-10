import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str," ");
        int[] arr = new int[8];

        for (int i = 0; i < 8; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int flag = 0;
        for (int i = 0; i < 7; i++){
            if (arr[i] < arr[i+1]){
                flag++;
            } else {
                flag--;
            }
        }
        if (flag == 7){
            System.out.println("ascending");
        } else if(flag == -7){
            System.out.println("descending");
        }else{
            System.out.println("mixed");
        }
    }
}
