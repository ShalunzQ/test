package newpacket;
import java.util.Scanner;
import java.security.DrbgParameters.NextBytes;

public class RegularExpression {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		String s=new String("");
		String regex="\\d{8,}+@qq+\\.+com";
		s+=n;
		s+="@qw.com";
		System.out.println(s);
		System.out.println(s.replaceAll("qw","QQ"));
		String[] tokens= "Java1HTML2Perl".split("\\d");
	}
}

