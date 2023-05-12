class StuSample2 {
    public static void main(String[] args){
        Student2 stu1 = new Student2();
        Student2 stu2 = new Student2();

        stu1.setData("竹内");
        stu1.setScore(90, 80);
        stu1.display();

        stu2.setData("長瀬", 75, 50);
        stu2.display();
    }
    
}
