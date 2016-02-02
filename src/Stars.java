import java.util.Scanner;

public class Stars {
	public static void main( String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Entrez n");
		int n = input.nextInt();
		
		int i = 0;
		int j = 0;
		
		for(i=0;i<n;i++) {
			   for(j=0;j<n;j++) {
			    System.out.print('*');
			   }
			   System.out.print('\n');
			  }

		 for(i=0;i<n;i++) {
			 for(j=-1;j<i;j++) {
			    System.out.print('*');
			   }
			  System.out.print('\n');
			  }
			  
		 for(i=0;i<n;i++) {
			 for(j=0;j<n-i;j++) {
			    System.out.print(' ');
			   }
			 for(j=0;j<i+1;j++) {
			    System.out.print('*');
			   }
			 System.out.print('\n');
			  }
			  
		 for(i=0;i<n;i++) {
			 for(j=0;j<n-1-i;j++) {
			    System.out.print(' ');
			   }
			 for(j=0;j<i*2+1;j++) {
			    System.out.print('*');
			   }
			 System.out.print('\n');
			  }
		 for(i=0;i<n;i++) {
			 for(j=0;j<n;j++) {
			    if(j == i || n-j-1 == i) {
			    	System.out.print('*');
			    }
			    else {
			    	System.out.print(' ');
			    }
			   }
			 System.out.print('\n');
			  }
		 input.close();
	}
}