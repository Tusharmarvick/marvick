class Cloth
{
int cost;
String size;
String colour;
Car(int a,String b,String c)
{
cost=a;
model=b;
name=c;
}
public static void main(String[] args)
{
Car t1=new Car(1010,"x","blue");
System.out.println(t1.cost+"");
System.out.println(""+t1.model);
System.out.println(t1.name);
}
}