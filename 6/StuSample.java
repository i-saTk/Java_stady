public class StuSample {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Student stu1 = new Student("竹内");
		Student stu2 = new Student("竹内");
		
		boolean result = stu1.equals(stu2);
		System.out.println(result);
		System.out.println(stu1);
	}

}
