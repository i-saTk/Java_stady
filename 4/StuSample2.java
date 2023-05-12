public class StuSample2 {
    public static void main(String[] args) {
        Student2 stu = new Student2();

        //スーパークラスのメソッド
        stu.setName("竹内");

        //サブクラスのメソッド
        stu.setStuNo(1);
        stu.display();
    }
}
