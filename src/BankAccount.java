public class BankAccount {

    //멤버변수
    int bankCode;
    int accountNo;
    String owner;
    int balance;
    boolean isDormant;
    int password;

    //메소드
    void inquiry() {}
    void deposit() {}
    void withdraw() {}
    void heldInDormant() {}

    //생성자
    //클래스 내부에 정의, 생성자 메서드명은 클래스명과 일치!
    //new 연산자와 함께 사용
    BankAccount(
            int bankCode,
            int accountNo,
            String owner,
            int balance,
            int password,
            boolean isDormant
    ) { //this는 인스턴스 자신을 가르킴
        this.bankCode = bankCode; //앞: 클래스 정의 멤버변수, 뒤: 사용자로부터 입력받은 값.
        this.accountNo = accountNo;
        this.owner = owner;
        this.balance = balance;
        this.password = password;
        this.isDormant = isDormant;
    }

}
