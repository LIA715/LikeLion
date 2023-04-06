public class Operators {
    public static void main(String[] args) {

        //산술 연산자
        int a = 10;
        int b = 20;
        String c = "abc";

        System.out.println(a+c);

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

        System.out.println(a>=b);
        System.out.println(a<=b);

        //=대입연산자. 우측 값을 좌측에 대입. ==비교연산자
        System.out.println(a==b);
        System.out.println(a!=b);
    }
}
