import java.util.Scanner;
class Great
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int c=0,t=n;
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0;i<t;i++)
		{
			if(a[i]<a[t-1])
			{
				a[i]=a[i]+a[i+1];
				c++;
				for(int j=i;j<t;j++)
				{
					a[j]=a[j+1];
				
				}
				t--;
			}
		}
		for(int i=0;i<t;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println(c);

}
}
