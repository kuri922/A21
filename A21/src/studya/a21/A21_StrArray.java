package studya.a21;

public class A21_StrArray {

    // 文字列を保持する
    public String[] items = new String[0];
    public String[] items2 = new String[items.length + 1];
    public int size = 0;

    // 最下行に要素を追加
    public void ArrayAdd() {

        items2 = new String[items.length + 1];
        System.arraycopy(items, 0, items2, 0, items.length);
        items = items2;

    }

    public void add(String data) {

        ArrayAdd();
        items[size] = data;
        size++;

    }

    // 指定インデックスの要素を上書き（指定インデックスが無い場合エラー）
    public void set(int index, String data) {

        try {

            size = index;
            items[size] = data;

        } catch (java.lang.NullPointerException e) {

            System.out.println("指定のインデックスがありません");

        }

    }

    // 指定インデックスの要素を取得（指定インデックスが無い場合エラー）;
    public String get(int index) {

        size = index;

        try {

            System.out.println(items[size]);

        } catch (NullPointerException e) {

            System.out.println("指定のインデックスがありません。");

        }
        
        return items[size];


    }

    // 全ての要素をクリア
    public void clear() {

        items = new String[0];
        size = 0;
        System.out.println("削除しました");

    }

}