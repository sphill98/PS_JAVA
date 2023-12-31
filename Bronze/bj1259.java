import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        while (!str.equals("0")){
            int cnt = 0;

            for (int i = 0; i < (str.length() / 2); i++){
                if (str.charAt(i) == str.charAt(str.length()-1-i)){
                    cnt ++;
                }
            }

            if (str.length()%2 == 0){
                if (cnt == str.length()/2){
                    System.out.println("yes");
                }else{
                    System.out.println("no");
                }
            }else{
                if (cnt == (str.length() - 1)/2){
                    System.out.println("yes");
                }else {
                    System.out.println("no");
                }
            }
            str = br.readLine();
        }
    }
}
