import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine().toUpperCase();
        int[] alpha = new int[26];

        for (int i = 0; i < str.length(); i++){
            int ind = (int)str.charAt(i) - 65;
            alpha[ind] += 1;
        }
        
        int count = 0;
        int max_num = 0;
        int max_ind = 0;
        
        for (int i = 0; i < 26; i++){
            if(alpha[i] > max_num) {
                max_num = alpha[i];
                count = 1;
                max_ind = i;
            }else if(alpha[i] == max_num){
                count += 1;
                max_ind = i;
            }
        }
        
        if (count == 1){
            char ch = (char) (max_ind + 65);
            System.out.println(ch);
        }else{
            System.out.println("?");
        }

    }
}
