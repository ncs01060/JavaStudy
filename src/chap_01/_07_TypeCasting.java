package chap_01;

public class _07_TypeCasting {
    public static void main(String[] args) {
        // 형변환 TypeCasting
        // 정수 -> 실수, 실수 -> 정수

        //int score = 93;
//        System.out.println(score); // 93
//        System.out.println((float) score); //93.0
//        System.out.println((double) score); // 93.0

        float score_f = 93.3F;
        double score_d = 99.8;
//        System.out.println((int) score_f);
//        System.out.println((int) score_d);
//
//        System.out.println((int) score_d + (int) score_f);


        String s1 = String.valueOf(93);
        s1 = Integer.toString(93);
        System.out.println(s1);

        String s2 = String.valueOf(98.8);
        System.out.println(s2);


        //문자를 숫자로
        int i = Integer.parseInt("93");
        System.out.println(i);

        double d = Double.parseDouble("98.8");
        System.out.println(d);


    }
}
