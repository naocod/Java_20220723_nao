package j12_추상;

//초보자
public class Beginner extends Job {

	public Beginner() {
		String[] beginnerSkill = { // 초보자가 생성됐을때 beginnerSkill을 가진다
				"달팽이 세마리",
				"회복",
				"민첩한 몸놀림",
				"정령의 축복"
				
		};
		super.setWeapon("초보자");
		super.setBeginnerSkill(beginnerSkill);
	}
	
	@Override
	public void showSkillList() {
		System.out.println("초보자 스킬 조회");
		String[] beginnerSkill = super.getBeginnerSkill(); // 부모의 배열을 가져옴
		
		for(int i = 0; i < beginnerSkill.length; i++) {
			System.out.println(i + 1 + ". " + beginnerSkill[i]);
		}
		System.out.println();
	}
	

}
