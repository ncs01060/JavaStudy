package chap_01;

public class _05_VariableNaming {
    public static void main(String[] args) {
        // 변수 이름 짓는 법
        // 1. 저장할 값에 어울리는 이름
        // 2.밑줄(_),문자(ABC),숫자(123) 사용 가능 (공백 사용 불가)
        // 3.밑줄 또는 문자로 시작 가능
        // 4.한 단어 또는 2개 이상의 단어의 연속
        // 5.소문자로 시작, 각 단어의 시작글자는 대문자 (첫 단어는 제외)
        // 6.예약어 사용 불가 (public void static int ...)

        //입국 신고서 (여행)
        String nationality = "대한민국"; //국적
        String firstName = "현성"; // 이름
        String lastName = "김"; // 성
        String dateOfBirth = "2001-12-31"; // 생년월일
        String residentialAddress = "무슨 호텔"; // 숙소
        String purposeOfVisit = "관광"; // 입국목적
        String flightNo = "KE697"; //항공운영
        String _flightNo = "KE697"; //밑줄 시작
        String flight_no_2 = "KE697"; //밑줄과 숫자 포함

        int accompany = 2;
        int lengthOfStay = 5;

        String item1 = "시계";
        String item2 = "가방";


        final String code = "abc";





    }
}
