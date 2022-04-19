package study.a22;

class A22_exec {

  public static void main(String[] args) {

      A22_StrArray strArray = new A22_StrArray();

      //"bbb"~"123"を追加
      strArray.add("bbb");
      strArray.add("aaa");
      strArray.add("ddd");
      strArray.add("ccc");
      strArray.add("123");

    
      System.out.println("要素数表示");
      
      for (int i = 0; i < 1; i++) {

          System.out.println(strArray.items.length);

      }

      System.out.println("降順ソート");
      strArray.sort(0);
      

      System.out.println("昇順ソート");
      strArray.sort(1);
  }
}