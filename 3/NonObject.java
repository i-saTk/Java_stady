public class NonObject {
    public static void main(String[] args) {
       int[] score ={80, 100, 75};
       String[] name = {"竹内", "山田", "西野"};
       
       for(int i = 0; i < score.length; i++){
        System.out.println(name[i] + "さん：" + score[i] + "点");
       }
    }
}
