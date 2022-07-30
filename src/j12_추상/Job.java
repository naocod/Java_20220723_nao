package j12_추상;

/*
 * 추상 클래스, 추상 메소드
 * 
 * 1. 상속을 꼭 받아서 구현을 해줘야한다.
 * 2. 추상 클래스는 생성을 할 수 없다. 
 */

public abstract class Job { // 일반 클래스와의 차이점 > 추상 메소드를 포함한 클래스. 생성이 안된다. 
	private String weapon;
	private String[] beginnerSkill;
	private String[] fistClassSkill;
	private String[] secondClassSkill;
	
	
	//추상메소드
	public abstract void showSkillList();
	

	public String getWeapon() {
		return weapon;
	}


	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}


	public String[] getBeginnerSkill() {
		return beginnerSkill;
	}


	public void setBeginnerSkill(String[] beginnerSkill) {
		this.beginnerSkill = beginnerSkill;
	}


	public String[] getFistClassSkill() {
		return fistClassSkill;
	}


	public void setFistClassSkill(String[] fistClassSkill) {
		this.fistClassSkill = fistClassSkill;
	}


	public String[] getSecondClassSkill() {
		return secondClassSkill;
	}


	public void setSecondClassSkill(String[] secondClassSkill) {
		this.secondClassSkill = secondClassSkill;
	}
	

}
