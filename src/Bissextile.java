
		
		System.out.println("Entrez l'ann�e :");
		int year = input.nextInt();
		
		if ( year % 400 == 0) {
			System.out.println("L'ann�e est bissextile");
		}	
		else {
			if ( year % 4 == 0 && year / 100 != 0 ) {
				System.out.println("L'ann�e est bissextile");
			}
				else {
					System.out.println("L'ann�e n'est pas bissextile");
				}
		}
		input.close();
	}
}