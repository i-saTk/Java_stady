public class Student2 extends Person2 {
    private int sutNo;

    public void setStuNo(int s){
        sutNo = s;
    }

    public void display(){
        System.out.println("名前" + getName());
        System.out.println("学籍番号：" + sutNo);
    }
    
}
