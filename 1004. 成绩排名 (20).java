
/*
1004. 成绩排名 (20)
读入n名学生的姓名、学号、成绩，分别输出成绩最高和成绩最低学生的姓名和学号。

输入格式：每个测试输入包含1个测试用例，格式为

  第1行：正整数n
  第2行：第1个学生的姓名 学号 成绩
  第3行：第2个学生的姓名 学号 成绩
  ... ... ...
  第n+1行：第n个学生的姓名 学号 成绩
其中姓名和学号均为不超过10个字符的字符串，成绩为0到100之间的一个整数，这里保证在一组测试用例中没有两个学生的成绩是相同的。
输出格式：对每个测试用例输出2行，第1行是成绩最高学生的姓名和学号，第2行是成绩最低学生的姓名和学号，字符串间有1空格。

输入样例：
3
Joe Math990112 89
Mike CS991301 100
Mary EE990830 95
输出样例：
Mike CS991301
Joe Math990112
 */

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        class Sample implements Comparable<Sample>{
            private String name;
            private String number;
            private int score;

            public int compareTo(Sample o) {
                return Integer.compare(score,o.score);
            }
        }

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Sample[] sample = new Sample[n];

        for(int i = 0;i < n;i++)
        {
            sample[i] = new Sample();
            sample[i].name = in.next();
            sample[i].number = in.next();
            sample[i].score = in.nextInt();
        }

        Arrays.sort(sample);
        System.out.println(sample[n-1].name + " "+sample[n-1].number);
        System.out.println(sample[0].name+" "+sample[0].number);




    }
}