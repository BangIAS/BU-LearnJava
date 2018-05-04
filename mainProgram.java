import java.util.Scanner;
public class mainProgram {
	
	public static void main (String[] args){
		Scanner scan = new Scanner(System.in);
	int a=1;

	
	while(a>0){
		System.out.println("\n\n--Pilih Karaktermu--");
		System.out.println("1. Orc");
		System.out.println("2. Elf");
		System.out.println("3. Exit");
		System.out.print("\t Enter your Pilihan = ");
		int pilihan = scan.nextInt();
		if (pilihan==1){
			 Orc Orc1 = new Orc("Male",10,10,5,5,2);
			 Orc1.name= "Iqbal";
			 Orc1.level=3;
			 Orc1.increaseAbilities();
			 Orc1.info();
		}
		else if(pilihan == 2){
			Elf Elf1 = new Elf("Female",10,5,10,10,3);
			Elf1.name= "Ias ";
			Elf1.level=3;
			Elf1.increaseAbilities();
			Elf1.info();
		}
		else{
			break;
		}
	}
	} 
}