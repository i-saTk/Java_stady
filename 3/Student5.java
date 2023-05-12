public class Student5 {
    //メンバ変数（属性）
    private String name;
    private int score;

    //メソッド（操作）
    public Student5(String n){
        name = n;
    }
    public void setScore(int s){
        if(0 <= s && s <= 100){
            score = s;
        }else{
            System.out.println(name + "さんの得点が範囲外です");
            score = 0;
        }
    }

    void display(){
        System.out.println(name + "さん：" + score + "点");
    }
}
