import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        int[][] mc = new int[N][M];

        for (int i = 0; i < N; i++) { //배열 생성
            str = br.readLine();
            StringTokenizer st_n = new StringTokenizer(str, " ");
            for (int j = 0; j < M; j++) {
                mc[i][j] = Integer.parseInt(st_n.nextToken());
            }
        }

        int max_t = N * M * 256 * 2; //이거보다 많이 걸릴 수는 없음. 
        int max_h = 257;

        for (int i = 0; i < 257; i++){ //무식하게 다 돌려보자.
            int p_cnt = 0; //추가할 블록 수
            int m_cnt = 0; //제거할 블록 수

            for (int j = 0; j < N; j++){
                for (int k = 0; k < M; k++){
                    if (mc[j][k] < i){
                        p_cnt += (i - mc[j][k]); //블록 추가
                    }else{
                        m_cnt += (mc[j][k] - i); //블록 제거
                    }
                }
            }

            int time = p_cnt + (m_cnt * 2); //시간 계산

            if ((p_cnt <= m_cnt + B) && (time <= max_t)){ //제거한 블록 + 원래 있던 블록 >= 새로 쌓은 블록
                max_t = time;
                max_h = i;
            }
        }

        System.out.println(max_t + " " + max_h);
    }
}
