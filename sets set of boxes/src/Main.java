import java.util.Comparator;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;
class box
{
	 public double l,b,h;

	public double getL() {
		return l;
	}

	public void setL(double l) {
		this.l = l;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public box(double l, double b, double h) {
		super();
		this.l = l;
		this.b = b;
		this.h = h;
	}
	 public boolean equals(Object o)
	 {
		 box ob1=(box)o;
		 if((this.l)*(this.b)*(this.h)==(ob1.l)*(ob1.b)*(ob1.h))
		 {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	 }
	 public String toString()
		{
			String s1=String.format("Length =%.1f Width =%.1f Height =%.1f Volume =%.2f",l,b,h,(l*b*h));
			System.out.println(s1);
			return s1;

}
	 /*public int hashCode()
	 {
		 return Objects.hash(l,b,h);
	 }*/
}
class myc implements Comparator
{
	public int compare(Object o1,Object o2)
	{
		
		box ob1=(box)o1;
		box ob2=(box)o2;
		Double i1=(ob1.l)*(ob1.b)*(ob1.h);
		Double i2=(ob2.l)*(ob2.b)*(ob2.h);
		return i1.compareTo(i2);
		
	}
}
public class Main {
	public static void main(String[] args)
	{
		Set<Object> hs=new TreeSet<Object>(new myc());
		Scanner sc=new Scanner(System.in);
		int t;
		double le,br,he;
		System.out.println("Enter the number of Box");
		t=sc.nextInt();
		
		//box b1=new box(le,br,he);
		
		for(int i=0;i<t;i++)
		{
			System.out.println("Enter the Box " +(i+1)+ " details");
			System.out.println("Enter Length");
			le=sc.nextDouble();
			System.out.println("Enter Width");
			br=sc.nextDouble();
			System.out.println("Enter Height");
			he=sc.nextDouble();
			box b0=new box(le,br,he);

			boolean flag=false;
			for(Object o:hs)
			{
				if(b0.equals(o))
				{
					flag=true;
					break;
				}
			}
			if(!flag)
			{
				hs.add(b0);
			}
	
					
			
		}
		System.out.println("Unique Boxes in the Set are");
		for(Object o1:hs)
		{
			o1.toString();
		}
		
	}

}
