package study.a22;

public class A22_exec2 {
    public static void main (String[] args) {

        A22_StrArray strArray = new A22_StrArray();

        //項目10000個追加を繰り返す
        for (int i = 0; i <= 10;  i++) {

            for (int j = 0; j <= 10000;  j++) {

                strArray.add(String.format("%5d", j));

            }
            //5000番目の要素を表示
            strArray.get(5000);

            //降順ソート
            strArray.sort(0);

            //全てクリア
            strArray.clear();

        }
    }
 }