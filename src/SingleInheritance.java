
public class SingleInheritance  {
void m1() {
	System.out.println("Inside m1");
}
public static void main(String[] args) {
	// TODO Auto-generated method stub
	SingleInheritance si= new SingleInheritance();
	si.m1();
	si.hashCode();/* This method present in java.lang.Object which is automatically inherited by Every class  */
	si.getClass();/* This method present in java.lang.Object which is automatically inherited by Every class  */
}
}
