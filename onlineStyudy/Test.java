package onlineStyudy;

import java.util.Scanner;

/**
 * Test
 */
public class Test {

    public static void main(String[] args) {
        System.out.print("반복 횟수 입력>");
		Scanner scan = new Scanner(System.in);
		int max = scan.nextInt();
		int i = 0;
		int count = 0;
		boolean flag = true;
		
		while(flag) {//flag는 자주 사용된다.			
			System.out.print("*");
			if(i == count) {
				i = 0;
				count++;
				System.out.println();
			}
			i++;
			if(count == max) {				
				flag = false;
			}
		}
	}
}