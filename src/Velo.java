import java.util.Scanner;
public class Velo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ratio souhaité ? ");
		float baseRatio = input.nextFloat();

		float pignon = 11;
		float pedalier = 35;
		int maxPatches = 0;
		float maxPignon = 0;
		float maxPedalier = 0;
		float maxRatio = 0;
		float reste = 0;
		int i;
		
		System.out.println("\n    pignon  pédalier      ratio    patches");
		while(pignon <= 22) {
			pedalier = 35;
			while(pedalier <= 54) {
				if(pedalier/pignon <= 1.02*baseRatio && pedalier/pignon >= 0.98*baseRatio) {
					i = calcPatches(pedalier, pignon, reste);
					if(i > maxPatches) {
						maxPatches = i;
						maxPignon = pignon;
						maxPedalier = pedalier;
						maxRatio = Math.round(100.*maxPedalier/maxPignon)/100.f;
					}
					System.out.printf("%10d  %8d  %9.2f  %9d\n", (int)pignon, (int)pedalier, Math.round(100.*pedalier/pignon)/100., i);
				}
				pedalier++;
			}
			pignon++;
		}
		System.out.println("\nMeilleure combinaison");
		System.out.printf("%10d  %8d  %9.2f  %9d\n", (int)maxPignon, (int)maxPedalier, maxRatio, maxPatches);
		input.close();
	}
	
	private static int calcPatches(float pedalier, float pignon, float reste) {
		float resteBase = pedalier%pignon;
		int i = 1;
		reste = resteBase;
		reste = (reste+resteBase)%pignon;
		while(reste != resteBase) {
			reste = (reste+resteBase)%pignon;
			i++;
		}
		return i;
	}
}