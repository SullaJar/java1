package java1.lesson7;

import java.nio.charset.StandardCharsets;

public class StringTest {
    public static void main() {
        java.lang.String s1 = "Java";
        StringExamples s2 = new StringExamples("Java");
        StringExamples s3 = new StringExamples(new char[]{'A','B','C'});
        StringExamples s4 = new StringExamples(s3);
        StringExamples s5 = new StringExamples(new byte[]{65,66,67});
        StringExamples s6 = new StringExamples(new byte[]{0,65,0,66}, StandardCharsets.UTF_16);
        System.out.printf("s1 = %s, s2 = %s, s3 = %s, s4 = %s, s5 = %s, s6 = %s", s1,s2,s3,s4,s5,s6);
    }
}
