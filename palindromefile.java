
import java.util.*;
import java.io.*;

public class palindromefile {
    public static void main(String args[]) throws IOException {
        String s;
        int F = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        s = sc.nextLine();
        int slen = s.length();
        int mid = slen/2;
        for(int i=0;i<mid;i++) {
            if (s.charAt(i) != s.charAt(slen-1-i)) {
                F=1;
                break;
            }
        }
        if(F==1) {
            BufferedWriter writer = new BufferedWriter(new FileWriter("Second.txt"));
            writer.write(s);
            writer.close();
            BufferedReader reader = new BufferedReader(new FileReader("Second.txt"));
            System.out.println("THe file in second.txt is: "+reader.readLine());
            reader.close();
        }
        else {
            BufferedWriter writer = new BufferedWriter(new FileWriter("First.txt"));
            writer.write(s);
            writer.close();
        }

    }
}
