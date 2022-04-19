package study.a22;
import studya.a21.A21_StrArray;
class A22_StrArray extends A21_StrArray {

    A21_StrArray a21_strarray = new A21_StrArray();

    // 全ての要素を配列で取得
    public String[] getAll() {

        return items;

    }

    public int getIndex() {
    	
        return items.length;
        
    }

    // 昇順
    public static final int ASC_SORT = 0;
    // 降順
    public static final int DESC_SORT = 1;

    // ソートする
    // 引数 mode ASC_SORT:昇順／DESC_SORT:降順

    public void sort(int mode) {

        if (mode == 0) {

            for (int i = 0; i < items.length - 1; i++) {

                for (int j = i + 1; j < items.length; j++) {

                    if (items[i].compareTo(items[j]) < 0) {

                        String k = items[i];
                        items[i] = items[j];
                        items[j] = k;

                    }
                }
            }

        } else {

            for (int i = 0; i < items.length - 1; i++) {

                for (int j = i + 1; j < items.length; j++) {

                    if (items[i].compareTo(items[j]) > 0) {

                        String k = items[i];
                        items[i] = items[j];
                        items[j] = k;

                    }
                }
            }
        }

        for (int j = 0; j < items.length; j++) {

        }
       
    }
}

