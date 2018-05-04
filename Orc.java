//Character(nama berkas: Character.java)
	class Orc extends Character{
		private int strength;
		
	public Orc(String gender, int strength, int power, int mana, int intelegence, int speed){
	  races="Orc";
	  this.gender=gender;
	  this.strength=strength;
	  this.power=power;
	  this.mana=mana; 
	  this.intelegence=intelegence; 
	  this.speed=speed;
	}	
	public void increaseAbilities(){
		power = power + 15;
		mana = mana +5;
		intelegence = intelegence + 5;
		speed = speed +5;
		this.strength=this.strength +17;
	}
	public void info(){
		super.info();
	System.out.println("Strength = " + strength);
		}
		 
}