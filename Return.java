public class Return 
{
int display()
 {
 System.out.println("Integer Type");
 return 100;
 }
 String display2()
 {
  return "Java";
 }
 double display3()
 {
  return 10.5;
 }
public static void main(String[] args)
 {
  Return R=new Return();
  R.display();
  String x=R.display2();
  System.out.println(x);
  System.out.println(R.display3());
 }
}
