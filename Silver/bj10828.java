import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int sz = 0;

        int[] stk = new int[10000];

        for (int i = 0; i < N; i++){
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            String comm = st.nextToken();
            
            if (comm.equals("push")){
                stk[sz] = Integer.parseInt(st.nextToken());
                sz++;
            }else if(comm.equals("pop")){
                if (sz == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(stk[sz-1]);
                    sz--;
                }
            }else if(comm.equals("size")){
                System.out.println(sz);
            }else if(comm.equals("empty")){
                if (sz == 0){
                    System.out.println(1);
                }else{
                    System.out.println(0);
                }
            }else{
                if (sz == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(stk[sz-1]);
                }
            }
        }
    }
}
