package chap_01;

public class _03_Variables {
    public static void main(String[] args) {
        String name = "***"; //문자'열'
        int hour = 15; // 정수
        System.out.println(name + "님 배송이 시작됩니다." + hour + "시에 방문 예정입니다.");
        System.out.println(name + "님 배송이 완료되었습니다.");

        double score = 90.5; // 실수
        char grade = 'A'; // '문자'
        name = "강백호";
        System.out.println(name + "님의 평균점수는 " +score + "점입니다.");
        System.out.println("학점은 " + grade + "입니다.");

        boolean pass = true;
        System.out.println("이번 시험에 합격 했을까요? " + pass);

        double d = 3.14123456789;
        float f = 3.14123456789f;
        System.out.println(d);
        System.out.println(f);

        long l = 1000_0000_0000_0L;
        System.out.println(l);

    }
}
