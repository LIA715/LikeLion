public class ReferenceType {
    public static void main(String[] args) {

        //참조형
        //참조형 데이터의 값 => 힙 메모리 영역
        //변수에 대입되는 값 => 힙 메모리 영역의 주소 값

        String a = new String("Hello"); //new 새로운 데이터 생성. 기존 데이터 유무 상관 안함
        System.out.println(a);

        String b = "Hello";
        String c = "Hello";

        if (a == b) { //a,b의 주소가 같다면 출력해
            System.out.println("a==b");
        }
        if ( b== c) {
            System.out.println("b==c");
        }

    }
}
