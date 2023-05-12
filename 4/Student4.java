public final class Student4 extends Person4 {
    private int sutNo;

    public Student4(String name, int stuNo){
        super(name);
        this.sutNo = stuNo;
    }

    public void display(){
        super.display();
        System.out.println("学籍番号：" + sutNo);
    }
    
}
