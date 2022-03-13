package newpacket;
import java.util.Scanner;
public class EX528 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int year=input.nextInt();
		int day=input.nextInt();
		String str1 = "";
        String str2 = "";
		int flag;
		int day1[]= {0,0,31,28,31,30,31,30,31,31,30,31,30};
		if((year%4==0&&year%100!=0)||year%400==0) {
			flag=1;
		}
		else flag =0;
			for(int i=1;i<13;i++) {
				switch(i) {
				case 1:{str1 += "January 1, ";} break;
				case 2:{str1 += "Febuary 1, ";} break;
				case 3:{str1 += "March 1, ";} break;
				case 4:{str1 += "April 1, ";} break;
				case 5:{str1 += "May 1, ";} break;
				case 6:{str1 += "June 1, ";} break;
				case 7:{str1 += "July 1, ";} break;
				case 8:{str1 += "Auguest 1, ";} break;
				case 9:{str1 += "September 1, ";} break;
				case 10:{str1 += "October 1, ";} break;
				case 11:{str1 += "November 1, ";} break;
				case 12:{str1 += "December 1, ";} break;	
				}
			day=day+day1[i];
			if(flag==1) {
				if(i==3)
					day++;
			}
			int k;
			k=day%7;
			switch(k) {
			case 1:str2 = " is Monday";break;
            case 2:str2 = " is Tuesday";break;
            case 3:str2 = " is Wednesday";break;
            case 4:str2 = " is Thurday";break;
            case 5:str2 = " is Friday";break;
            case 6:str2 = " is Saturday";break;
            case 0:str2 = " is Sunday";break;
			}
			System.out.println(str1 + year + str2);
            str1 = "";
            str2 = "";
		}
	}
}
