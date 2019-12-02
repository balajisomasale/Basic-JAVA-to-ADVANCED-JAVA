package practice_hands3;

public class Main {
public static void main(String [] args)
{

	int a[]={10,20,450,455};
	int temp,temp1,g;
	for(int i=0;i<(a.length-1);i++)
	{
		temp=a[i];
		for(int j=i+1;j<(a.length-1);j++)
		{
			if(a[i]>a[j])
			{
				
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
					}
			
			
		}	}
	System.out.println(a[a.length-1]);
	
	System.out.println(a[0]);

/*
for(int k=0;k<(a.length-1);k++)
{
	temp1=a[k];
	for(int l=k+1;l<(a.length-1);l++)
	{
		if(a[k]<a[l])
		{
			
			temp1=a[k];
			a[k]=a[l];
			a[l]=temp1;
				}
		
	}	}
System.out.println(a[a.length-1]);


}


*/	
	
}
}
