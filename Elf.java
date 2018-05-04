//Character(nama berkas: Character.java)
	class Elf extends Character{
		private int magic;
		
	public Elf(String gender, int magic, int power, int mana, int intelegence, int speed){
	  races="Elf";
	  this.gender=gender;
	  this.magic=magic;
	  this.power=power;
	  this.mana=mana; 
	  this.intelegence=intelegence; 
	  this.speed=speed;
	}	
	public void increaseAbilities(){
		power = power + 5;
		mana = mana +15;
		intelegence = intelegence + 10;
		speed = speed +3;
		this.magic=this.magic +15;
	}
	public void info(){
		super.info();
		System.out.println("magic = " + magic);
		}
		 
}