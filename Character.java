//Character(nama berkas: Character.java)
class Character{
	protected int level=1, power, mana, intelegence,speed;
	protected String gender, races,name;
	public void increaseAbilities(){
		power = 10* level;
		mana = 10* level;
		intelegence = 10* level;
		speed = 10*level;
	}
	public void info(){
		System.out.println("Nama  = " +name);
		System.out.println("Gender= "+ gender);
		System.out.println("Power = " + power);
		System.out.println("mana  = " + mana);
		System.out.println("Intelegence  = " + intelegence);
		System.out.println("Speed  = " + speed);
		}
}