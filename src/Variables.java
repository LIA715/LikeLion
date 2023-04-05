public class Variables {
    //변수 = 데이터가 저장되는 공간
    //1. 한개의 변수에는 한개의 값만 할당 가능
    //2. 변수에 저장된 값은 재할당을 통해 변경 가능. 재할당시 자료형값 정의 X
    //3. 값의 형태에 맞는 자료형 사용
    //4. 변수명은 소문자로 시작
    //5. 대소문자 구분, 공백 포함 불가능. 공백 - 뒤에는 명령이 나와야함.
    //6. 자바 예약어는 사용이 불가능 int int(int라는 변수 안됨)


    public static void main(String[] args) {

        int num = 1;
        double width = 12.34; //소수 가능
        String content = "Programming";
        //참조형 데이터. 데이터 자체는 메모리의 힙에 참조. content 에는 heap 메모리의 주소만 참조
        num = 10;
        System.out.println(num);
    }
}
