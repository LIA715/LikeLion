public class Operators {
    public static void main(String[] args) {

        //산술 연산자
        int a = 10;
        int b = 20;
        String c = "abc";

        System.out.println(a+b);

        double d= 10;
        double e= 20;
        System.out.println(d/e);

        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b); //몫을 나누는 것
        System.out.println(a%b);


        //비교 연산자
        int z=5;
        int x=8;

        System.out.println(a>b);
        System.out.println(a<b);

        //비교
        System.out.println(a>=b);
        System.out.println(a<=b);

        //=대입연산자. 우측 값을 좌측에 대입. ==비교연산자
        System.out.println(a==b);
        System.out.println(a!=b);


        //논리 연산자
        int f = 3;
        int g = 3;
        int h = 5;

        //AND(&&) 모두 true여야 true 반환. 교집합
        System.out.println(h > f && h > g); //각각 비교하고 평가를 함. true && true.

        //OR(||) 합집합
        System.out.println(h > f || h < g);

        //NOT(!) 여집합
        System.out.println(!true);
        System.out.println(!false);


        //대입 연산자
        int i = 1;
        double price = 12.5;

        //증감 연산자
        i++; //i = i+1
        i--; //i = i-1
        ++i; //데이터 사용 전에 더하기
        --i;

    }
}
