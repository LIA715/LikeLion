public class PrimitiveType {
    public static void main(String[] args) {
        //정수형
        //1. byte (1byte = 8bits) : -2^7 ~ 2^7-1(-128~127)
        //2. long (2bytes) : -2^15 ~ 2^15-1(-32,768 ~32767)
        //3. int (4bytes) : -2^31 ~ 2^31-1
        //4. long (8bytes) : -2^63 ~ 2^63-1

        //범위에 맞지 않은 숫자를 넣으면 오류 발생
        int b=10;


        //실수형
        //1. double (8bytes) : 소수점 이하 15자리까지
        //2. float (4bytes) : 7자리
        double a = 1.23;
        float c = 9.45f; //실제로는 f 표현 안됨
        System.out.println(a);
        System.out.println(c);


        //문자형 : 문자 1개만 다룰 수 있음
        //char (2bytes)
        //아스키, 유니코드 체계도 가능
        char char_1 ='a';
        char char_2 = 97; //아스키코드
        char char_3 = 0X61; //유니코드


        //논리형 : 참, 거짓 의미
        //boolean (1byte)
        boolean bool_1 = true;
        boolean bool_2 = false;
        boolean bool_3 = (100 < 0); //논리적으로 구분 가능한 식 넣어줘

        System.out.println(bool_1);
        System.out.println(bool_2);
        System.out.println(bool_3);

    }
}




