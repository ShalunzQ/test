package newpacket;
import java.util.Scanner;
public class EX529 {

	public static void main(String[] args) {
				// TODO Auto-generated method stub
				Scanner input = new Scanner(System.in);
		        System.out.println("输入年份和代表该年第一天是周几的数字");
		        int day1[]= {0,0,31,28,31,30,31,30,31,31,30,31,30};
		        int day2[]= {0,31,28,31,30,31,30,31,31,30,31,30,31};
		        int year = input.nextInt();
		        int day = input.nextInt();
		        //int year = 2022;
		       // int day = 1;
		        int flag;
		        if((year%4==0&&year%100!=0)||year%400==0) {
					flag=1;
				}
				else flag =0;
		        String str1 = "";
		        String str2 = "";
		        for (int i = 1; i <= 12 ; i++){
		            switch (i){
		                case 1: {str1 += "January "+year;} break;
		                case 2: {str1 += "Febuary "+year;} break;
		                case 3: {str1 += "March "+year;} break;
		                case 4: {str1 += "April "+year;} break;
		                case 5: {str1 += "May "+year;} break;
		                case 6: {str1 += "June "+year;} break;
		                case 7: {str1 += "July "+year;} break;
		                case 8: {str1 += "Auguest "+year;} break;
		                case 9: {str1 += "September "+year;} break;
		                case 10: {str1 += "October "+year;} break;
		                case 11: {str1 += "November "+year;} break;
		                case 12: {str1 += "December "+year;} break;
		                
		            }
		            day=day+day1[i];
		            if(flag==1) {
		            	day2[2]=day2[2]+1;
						if(i==3)
							day++;
					}
					int k;
					k=day%7;
		           // switch (k){
		            //    case 1:str2 = "\t\t";break;
		            //    case 2:str2 = "\t\t\t";break;
		            //    case 3:str2 = "\t\t\t\t";break;
		            //    case 4:str2 = "\t\t\t\t\t";break;
		            //    case 5:str2 = "\t\t\t\t\t\t";break;
		            //    case 6:str2 = "\t\t\t\t\t\t\t";break;
		            //    case 0:str2 = "\t";break;
		           // }
		            System.out.println("\t\t\t"+str1);
		            System.out.println("___________________________________________________________________");
		            System.out.println("\tSun\tMon\tTue\tWed\tThu\tFri\tSat");
		            //System.out.print("\t");
		            int day3=1;
		            for(int j=0;j<5;j++) {
		            	System.out.print("\t");
		            	for(int n=0;n<7;n++) {
		            		if(j==0&&n<k) {
		            			System.out.print("\t");
		            			continue;
		            		}
		            		if(day3>day2[i]) {
		            			break;
		            		}
		            		System.out.print(day3+"\t");
		            		day3++;
		            	}
		            	System.out.println();
		            }
		            System.out.println("___________________________________________________________________");
		            System.out.println();
		            str1 = "";
		            str2 = "";
		        }
			}

	}
