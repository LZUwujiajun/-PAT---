/*1002. 写出这个数 (20)
读入一个自然数n，计算其各位数字之和，用汉语拼音写出和的每一位数字。

输入格式：每个测试输入包含1个测试用例，即给出自然数n的值。这里保证n小于10100。

输出格式：在一行内输出n的各位数字之和的每一位，拼音数字间有1 空格，但一行中最后一个拼音数字后没有空格。

输入样例：
1234567890987654321123456789
输出样例：
yi san wu
*/

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        int n = 0;
        for(int i = 0;i < s.length();i++)
            n += s.charAt(i) - '0';

        String b = String.valueOf(n);

        for(int i = 0;i < b.length();i++)
        {
            if(b.charAt(i) == '0') System.out.print("ling");
            if(b.charAt(i) == '1') System.out.print("yi");
            if(b.charAt(i) == '2') System.out.print("er");
            if(b.charAt(i) == '3') System.out.print("san");
            if(b.charAt(i) == '4') System.out.print("si");
            if(b.charAt(i) == '5') System.out.print("wu");
            if(b.charAt(i) == '6') System.out.print("liu");
            if(b.charAt(i) == '7') System.out.print("qi");
            if(b.charAt(i) == '8') System.out.print("ba");
            if(b.charAt(i) == '9') System.out.print("jiu");
            if(i < b.length()-1)
                System.out.print(" ");
            if(i == b.length()-1)
                System.out.println();
        }

    }
}