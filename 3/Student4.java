public class Student4 {
    //メンバ変数（属性）
    String name;
    static int counter = 0;

    //メソッド（操作）
    Student4(String n){
        name = n;
        counter++;
        System.out.println(name + "さんをインスタンス化しました。");
    }

    static void display(){
        System.out.println((counter + "人です"));
    }
}
