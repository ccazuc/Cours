
		
		System.out.println("Entrez l'année :");
		int year = input.nextInt();
		
		if ( year % 400 == 0) {
			System.out.println("L'année est bissextile");
		}	
		else {
			if ( year % 4 == 0 && year / 100 != 0 ) {
				System.out.println("L'année est bissextile");
			}
				else {
					System.out.println("L'année n'est pas bissextile");
				}
		}
		input.close();
	}
}