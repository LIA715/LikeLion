public class Loops {

    public static void main(String[] args) {

        //반복문
        //1.for
        //초기화된 변수. 조건식. 증감식. 조건 만족하면 반복해서 시행.

        for (int i = 0; i < 10; i++){
            System.out.println(i);
        }

        //2.while

        int b = 10;
//        while (b > 0){
//            System.out.println(b); 무한반복 발생.이런 경우는 유의
//        }
//        while (b > 0){
//            System.out.println(b);
//            b--;
//        }
        do { //무조건 한번은 실행하고 while로 넘어가.
            System.out.println(b);
            b--;
        }while (b > 0);



    }
}
