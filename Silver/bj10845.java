import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int hd = 0;
        int sz = 0;
        int init_size = 10000;

        int[] que = new int[init_size];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            StringTokenizer st = new StringTokenizer(str, " ");

            String comm = st.nextToken();
            int cur = (hd + sz) % init_size;
            if (comm.equals("push")) {
                que[cur] = Integer.parseInt(st.nextToken());
                sz++;
            } else if (comm.equals("pop")) {
                if (sz == 0) {
                    System.out.println(-1);
                } else {
                    System.out.println(que[hd]);
                    hd++;
                    sz--;
                }
            } else if (comm.equals("size")) {
                System.out.println(sz);
            } else if (comm.equals("empty")) {
                if (sz == 0) {
                    System.out.println(1);
                } else {
                    System.out.println(0);
                }
            }else if(comm.equals("front")){
                if (sz == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(que[hd]);
                }
            }else{
                if (sz == 0){
                    System.out.println(-1);
                }else{
                    System.out.println(que[cur-1]);
                }
            }
        }
    }
}
