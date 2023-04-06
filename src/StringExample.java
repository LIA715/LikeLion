import java.sql.SQLOutput;

public class StringExample {

    public static void main(String[] args) {

        //String => 문자열 객체
        //객체 => 힙 메모리 영역
        //변수 => 힙 메모리 영역의 주소

        String str ="안녕하세요!"; //문자열 리터럴.
        String str_2 = new String("안녕하세요!"); //new로 생성된 객체가 str_2에 할당. 생성자.

        if(str.equals(str_2)){
            System.out.println("str.equals(str_2)");
        }

        String str_3 = "Hello, ";
        String str_4 = "World!";

        System.out.println(str_3+""+str_4);

        StringBuilder strBdr_1=new StringBuilder("Hello, ");
        strBdr_1.append("World!"); //메모리절약, 시간 단축 가능

        System.out.println(strBdr_1.toString());

        String str_new= strBdr_1.toString();
        System.out.println(str_new);

        String str_10 = "이름: 김자바";
        String str_name = str_10.substring(4,7);//마지막 인덱스 미만까지니까 +1 해줘서 적어야해.
        System.out.println(str_name);

        String str_11 = "abc";
        String str_12 = "ABC";

        str_11=str_11.toUpperCase(); //대문자
        str_12=str_12.toLowerCase(); //소문자

        System.out.println(str_11);
        System.out.println(str_12);

        if (str_11.equals(str_12)){
            System.out.println("str_11.equals(str_12)"); //값 출력 X = 같지않음
        }
        if (str_11.equalsIgnoreCase(str_12)) {
            System.out.println("str_11.equalsIgnoreCase(str_12)");
        }



        //공백 제거

        //1. 양쪽 끝 공백
        String str_21 ="    Hello    ";
        str_21 = str_21.trim();
        System.out.println(str_21);


        //2. 문자열 중간 공백
        String str_22 = "  Hel  lo   ";
        str_22 = str_22.trim();
        str_22 = str_22.replace(" ","");
        System.out.println(str_22);
    }

}
