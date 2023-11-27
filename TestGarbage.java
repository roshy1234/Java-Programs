import java.util.*;
class x{
   int y;
}

class TestGarbage{

	public static void main(String args[])

{

Runtime r=Runtime.getRuntime();

System.out.println("Total memory:"+ r.totalMemory());

long mem1,mem2,mem3;
mem1=r.freeMemory();

System.out.println("Free memory:"+ mem1);

System.out.println("Enter size of array:");
Scanner sc=new Scanner(System.in);
int z= sc.nextInt();
int a[]=new int[z];

for(int i=0; i<z;i++){
	x y=new x();
}
Runtime g = Runtime.getRuntime();
mem2=g.freeMemory();
System.out.println("Free memory:"+ mem2);


r.gc();
mem3 = r.freeMemory();
System.out.println("Free memory after garbage collection:"+ mem3);
}
}


