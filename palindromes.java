import java.util.*;
class palindromes{
      public static void main(String args[]) {
          System.out.println("Enter the string");
          Scanner sc=new Scanner(System.in);
          String str=sc.nextLine();
          int strlen = str.length();
          int middle = strlen/2;
          int flag=0;

          for(int i=0;i<=middle;i++){
	    if(str.charAt(i) != str.charAt(strlen-i-1)) {
	    flag=1;
	    break;
              }
            }
          if(flag==1)
	    System.out.println("String is not palindrome");
          else
                System.out.println("String is palindrome");
}
}


