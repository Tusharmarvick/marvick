class Cours
{
int cost;
String branch;
String id;
Car(int a,String b,String c)
{
cost=a;
model=b;
name=c;
}
public static void main(String[] args)
{
Car t1=new Car(1010,"cs","t6y");
System.out.println(t1.cost+"");
System.out.println(""+t1.model);
System.out.println(t1.name);
}
}