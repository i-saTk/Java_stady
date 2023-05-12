public class Student extends Person {
    private int sutNo;

    public void setStuNo(int s){
        sutNo = s;
    }

    public void displayStuNo(){
        System.out.println("学籍番号：" + sutNo);
    }
    
}
