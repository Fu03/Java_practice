package Test;

import java.util.Scanner;
import java.util.Stack;

public class Day01 {
    public static void showTriangle(int n){
        //第一题：打印三⻆
        for (int i = 1; i <=n; i++) {
            for(int j=0;j<n-i;j++){
                System.out.printf(" ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.printf("*");
            }
            System.out.println();
        }
    }

    //第二题：颠倒字符串
    public static void reverseSUM(String s) {
        char[] chars = s.toCharArray();

        Stack stack=new Stack();
        for(char ch:chars){
            stack.push(ch);
        }
        int n=stack.size();
        for (int i = 0; i <n; i++) {
            chars[i]= (char) stack.pop();
        }
        String s1 = String.valueOf(chars);
        System.out.println(chars.length);
        System.out.println(s1);
    }
    //第三题回文数
    public static void isPalindrome(int num) {
        boolean flag = false;
        String s = String.valueOf(num);
        int i=0,j=s.length()-1;
        while (i<=j){
            if(s.charAt(i)!=s.charAt(j)){
                flag=true;
                break;
            }
            i++;
            j--;
        }
        if (!flag) {
            System.out.println("是的");
        } else
            System.out.println("不是");
    }
    //第四题：水仙花数
    public static void ShuiXianHua() {
        for(int i=100;i<=999;i++){
            int a=i/100;//百位
            int b=(i-a*100)/10;//十位
            int c=i%10;//个位
            if((Math.pow(a,3)+Math.pow(b,3)+Math.pow(c,3))==i){
                System.out.printf(i+" ");
            }
        }
        System.out.println();
    }
    //第五题：包含十个整数
    public static void arraysDemo() {
        int[] a=new int[]{4,2,3,1,5,6,7,8,9,10};//自行定义一个数组即可
        int max=a[0],min=a[0];
        for(int i:a){
            max=Math.max(i,max);
            min=Math.min(i,min);
        }
        System.out.println("max="+max+",min="+min);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("1、B  2、B  3、D  4、B  5、D");
        showTriangle(10);
        String s=sc.nextLine();
        reverseSUM(s);
        isPalindrome(222);
        ShuiXianHua();
        arraysDemo();
    }
}
