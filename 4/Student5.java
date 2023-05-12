public final class Student5 extends Person5 {
    private int sutNo;

    public Student5(String name, int stuNo){
        super(name);
        this.sutNo = stuNo;
    }

    public void display(){
        super.display();
        System.out.println("学籍番号：" + sutNo);
    }
    public void chgStuNo(int stuNo){
        this.sutNo = stuNo;
    }
    
}
