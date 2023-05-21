public class Conditional {

    public static void main(String[] args){

        int a = 1;
        int b = 100;

//        if (a == b){
//            System.out.println("a==b");
//        }
//        else { //잘 처리해야 빈틈없이 모든 로직 구성 가능.
//            System.out.println("else block");
//        }

        //다중 조건의 경우을 만족하는 최초의 분기만 실행. 최초로 만족하는 조건만 실행.
        if (a==b){
            System.out.println("a==b");
        } else if(a<b){
            System.out.println("a<b");
        } else if(a<=b){
            System.out.println("a<=b");
        } else {
            System.out.println("else");
        }

        int c = 10;

        switch (c + 1){
            case 11:
                System.out.println("c+1=11");
                break; //switch 종료
            case 9:
                System.out.println("c+1=9");
                break;
            case 10:
                System.out.println("c+1=10");
                break;
            default:
                System.out.println("모든 switch 조건에 만족하지 않는 경우");

        }
    }
}
