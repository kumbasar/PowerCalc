import java.util.Scanner;


public class PowerCalcMain {
	
	private final String TEXT_1 = "\nEnter Power (mW) = ";
	private final String TEXT_2 = "Power (dBm) = ";
	private final double MAX_POWER = 10.0;

	public static void main(String[] args) {
		
		new PowerCalcMain();
		System.exit(0);
		
	}
	
	public PowerCalcMain() {
		
		Scanner input = new Scanner(System.in);
		
		double power_db = 0.0;
		double power = 0.0;
		
		System.out.print(TEXT_1);
		power = input.nextInt();
		
		power_db = 10.0 * Math.log10(power);
		
		System.out.print( TEXT_2 + power_db + "\n");
		
		System.out.print( "Power(mdB) \tPower(mW)\n");
		for(power_db = 0; power_db <= MAX_POWER; ++power_db ) {
			power = Math.pow(10.0 , power_db/10.0);
			System.out.print( "\n" + power_db + "\t\t"+  power);
		}
		
	}

}
