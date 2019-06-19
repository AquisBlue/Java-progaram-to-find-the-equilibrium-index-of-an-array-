
public class EqulibriumPoint 
{
	public static void find(int arr[])
	{
		int sumf=0,suml=0,eq=0,flag=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sumf=sumf+arr[i];
			for(int j=arr.length-1;j!=i;j--)
			{
				suml=suml+arr[j];
				
				if(sumf==suml)
				{
					eq=i+1;
					flag=1;
					break;
				}
			}
			suml=0;
			if(flag==1)
				break;
		}
		System.out.println(eq);
		
	}

	public static void main(String[] args) 
	{
		int a[] = {-7, 1, 5, 2, -4, 3, 0};
		int arr[] = { 1,2,0,3}; 
		find(arr);

	}

}
