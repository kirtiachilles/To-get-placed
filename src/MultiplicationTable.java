
public class MultiplicationTable {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 10; i++) {
			
			if (i<10) {
				System.out.print(" ");
			}
			System.out.print(i + ":");
			for (int j = 1; j < 10; j++) {
				int mult = i * j;
				System.out.print(" "+mult);
				if (mult < 10) {
					System.out.print("  ");
				}else if (mult<100) {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		/*
		int r, c, y ;

		r = 1 ;		
		do
		{
			c = 1 ;
			do
			{
				y = r * c ;
				System.out.println("\t"+y);
				c = c + 1 ;
			} while(c <= 10) ;
		System.out.println("\n\n");
		r = r + 1 ;
		} while(r <= 20) ;*/
	}

}
