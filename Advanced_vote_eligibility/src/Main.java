import java.util.Scanner;

interface is {

	public void eligibility(int age);

}

public class Main {

	public static void main(String[] args) {
			is obj = (age) -> {
			if (age >= 18)
				System.out.println("Eligible");
			else
				System.out.println("Not Eligible");
		};
		Scanner sc = new Scanner(System.in);

		obj.eligibility(sc.nextInt());

	}
}
