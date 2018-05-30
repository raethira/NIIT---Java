import java.rmi.*;
public class MultiplicationClient {
	public static void main(String a[]) throws Exception {
		Multiplication m=(Multiplication)Naming.lookup("rmi://localhost/mulp1");
		System.out.println(m.mul(25,25));
	}
}