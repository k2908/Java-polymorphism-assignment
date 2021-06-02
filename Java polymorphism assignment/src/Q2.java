
class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Monster  Monsters[]= new Monster[3];
		Monsters[0]=new FireMonster ("green", 5, 6);
		Monsters[1]=new WaterMonster("blue", 2, 5);
		Monsters[2]=new StoneMonster("white", 12, 20);
		for(int i=0; i< Monsters.length;i++) {
			System.out.println(Monsters[i].attack());
	}

}
	}
abstract class Monster{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAttp() {
		return Attp;
	}
	public void setAttp(int attp) {
		Attp = attp;
	}
	private int Attp;
public Monster(String name,int Attp) {
	this.Attp=Attp;
	this.name=name;
	// TODO Auto-generated constructor stub
}	
	public abstract String attack();
	
}
class WaterMonster extends Monster{
	
	private int waterLvl;
	public int getWaterLvl() {
		return waterLvl;
	}
	public void setWaterLvl(int waterLvl) {
		this.waterLvl = waterLvl;
	}
	public WaterMonster(String name,int Attp,int waterLvl) {
		// TODO Auto-generated constructor stub
		super(name, Attp);
		this.waterLvl=waterLvl;
	}
	@Override
	public String attack() {
		String damage;
		
		damage="the damage of the water monster is "+ getAttp()*waterLvl;
		return damage;
	}
	
}
class FireMonster extends Monster{
	int fireLvl;
	public FireMonster(String name,int Attp,int fireLvl) {
		// TODO Auto-generated constructor stub
		super(name, Attp);
		this.fireLvl =fireLvl;
		}
	public int getFireLvl() {
		return fireLvl;
	}
	public void setFireLvl(int fireLvl) {
		this.fireLvl = fireLvl;
	}
	@Override
	public String attack() {
		String damage;
		
		damage="the damage of the fire monster is "+getAttp()*fireLvl;
		return damage;
	}
	
}
class StoneMonster extends Monster{
	private int stoneLvl;
	
	public StoneMonster(String name,int Attp,int StoneLvl) {
		// TODO Auto-generated constructor stub
		super(name, Attp);
		this.stoneLvl=StoneLvl;}
	public int getStoneLvl() {
		return stoneLvl;
	}
	public void setStoneLvl(int stoneLvl) {
		this.stoneLvl = stoneLvl;
	}
	@Override
	public String attack() {
		String damage;
		
		damage="the damage of the stone monster is "+stoneLvl*getAttp();
		return damage;
	}
	
}