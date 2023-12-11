public class StrToken {
  public static void main(String args[]) {
	  int sum=0;
	  Scanner P=new Scanner(System.in);
	  System.out.println("Enter String of integers:");
	  String str=P.nextLine();
	  StringTokenizer token=new StringTokenizer(str," ");

	  while(token.hasMoreTokens()) {
		  String tokenizer=token.nextToken();
		  System.out.println(tokenizer);
		  int num=Integer.parseInt(tokenizer);
		  sum+=num;
	  }

	  System.out.println((int)sum);
  }
}
