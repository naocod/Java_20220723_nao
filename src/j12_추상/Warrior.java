package j12_추상;

public class Warrior extends Beginner { 
	
	public Warrior() {
		String[] firstClassSkill = {
				"HP 증가",
				"가디언 아머",
				"아이언 바디",
				"파워스트라이크",
				"슬래시 블러스트"	
		};
		
		super.setWeapon("전사");
		super.setFistClassSkill(firstClassSkill); // 상속받아서 가지고 있기에 생략가능하지만 적어주는것이 좋음
	}
	
	
	@Override
	public void showSkillList() {
		super.showSkillList();
		System.out.println("전사 스킬 리스트");
		
		String[] firstClassSkill = super.getFistClassSkill(); // 부모의 배열을 가져옴
		
		for(int i = 0; i < firstClassSkill.length; i++) {
			System.out.println(i + 1 + ". " + firstClassSkill[i]);
		}
		System.out.println();
	}

}
