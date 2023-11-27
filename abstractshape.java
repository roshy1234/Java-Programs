abstract class Shape{ 
 abstract void numberofsides(); 
} 
class Rectangle extends Shape{ 
void numberofsides(){ 
int sides=4; 
System.out.println("Number of sides of Rectangle:" +sides); 
} 
} 
class Triangle extends Shape{ 
void numberofsides(){ 
int sides=3; 
System.out.println("Number of sides of Triangle:" +sides); 
} 
} 
class Hexagon extends Shape{ 
void numberofsides(){ 
int sides=6; 
System.out.println("Number of sides of Hexagon:" +sides); 
} 
} 
class abstractshape{ 
public static void main(String args[]) 
{ 
Rectangle rt=new Rectangle(); 
Triangle tr=new Triangle(); 
Hexagon hx=new Hexagon(); 
rt.numberofsides(); 
tr.numberofsides(); 
hx.numberofsides(); 
} 
} 
