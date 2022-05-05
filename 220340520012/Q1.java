 /*Insertion Sort*/
 
 class Q1 {
	  void insertionSort(int a1[])
	  {
		  int n = a1.length;
		  for(int i=1; i<n; i++)
		  {
			  int k= a1[i];
			  int j= i-1;
			  while (j>=0 && a1[j]>k)
			  {
				  a1[j+1]=a1[j];
				  j=j-1;
			  }
			  a1[j+1]=k;
		  }
	  }
	  
	  void display(int a1[])
	  {
		  int n =a1.length;
		  for(int i=0;i<n;i++)
		  {
			   System.out.println(a1[i]+" ");
		  }
	  }
		  
	public static void main(String... args)
	{
		Q1 qs=new Q1();
		int a1[]={2,3,7,8,9,6};
		qs.insertionSort(a1);
		qs.display(a1);
		
	}
 }
 