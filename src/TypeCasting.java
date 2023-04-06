public class TypeCasting {
    public static void main(String[] args) {

        //형변환 (용량 순서대로, 정수보단 실수가 큰 범위)
        //byte < short < int < long <<< float < double
        //작은 범위로는 형 변환 불가능

        //강제 형변환 = 명시적 형변환
        int a = 128;
        short b = (short) a; //앞에 데이터형을 임의로 표시
        byte c = (byte) a; //-128~127 overflow발생해서 127보다 큰 결과X. 가장 작은 -128로
        //왜곡되지 않는지 범위 잘 생각하기
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //음수값 도출.

        int e = 10;
        short f = 20;

        short g = (short) (e+f); //뒤에도 괄호 필수. 결과물에도 형변환 적용
        System.out.println(g);
    }
}
