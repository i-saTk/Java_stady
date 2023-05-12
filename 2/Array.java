public class Array {
    public static void main(String[] atgs){
        int[] score = new int[3];
        score[0] = 80;
        score[1] = 100;
        score[2] = 75;

        String[] name = {"竹内","榊原","前田"};

        for(int i = 0; i < score.length; i++){
            System.out.println(name[i] +"さん：" + score[i] + "点");            
        }

        /* 
        System.out.println(name[0] +"さん：" + score[0] + "点");
        System.out.println(name[1] +"さん：" + score[1] + "点");
        System.out.println(name[2] +"さん：" + score[2] + "点");
        */
        System.out.println("受験者数：" + score.length + "名");
    }
}
