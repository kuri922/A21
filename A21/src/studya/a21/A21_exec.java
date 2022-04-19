package studya.a21;

class A21_exec {

	public static void main(String[] args) {
		 A21_StrArray strArray = new A21_StrArray();

	        //aaa～ddを追加
	        strArray.add("aaa");
	        strArray.add("bbb");
	        strArray.add("ccc");
	        strArray.add("dd");

	        //4つの要素を取得して表示
	        for (int i = 0; i < 4; i++) {

	            System.out.println(strArray.items[i]);

	        }

	        //すべてクリア
	        strArray.clear();

	        //ee001～e100の100個追加
	        java.text.DecimalFormat format = new java.text.DecimalFormat("ee000");
	        for (int i = 1; i < 101; i++) {

	            strArray.add(format.format(i));

	        }

	        //76番目の要素を取得して表示
	        strArray.get(76);
	        for (int i = 0; i < 0; i++) {

	            System.out.println(strArray.items[76]);

	        }

	        //先頭の要素をa001に上書き
	        strArray.set(0, "a001");

	        //最後の要素をz100に上書き
	        strArray.set(99, "z100");
	        String number1 = strArray.get(0);

	        // 最後の要素を取得して表示
	        String number2 = strArray.get(99);

	        //すべてクリア
	        strArray.clear();



	}

}