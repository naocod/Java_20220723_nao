package j12_추상;

public class MapleStory {

	public static void main(String[] args) {
		
		Beginner beginner = new Beginner();
		
//		beginner.showSkillList();
		
		Warrior warrior = new Warrior();
		
//		warrior.showSkillList();
		
		Job[] jobs = new Job[2];
		
		//beginner와 warrior는 job배열로 묶을 수 있음
		jobs[0] = beginner;
		jobs[1] = warrior;
		
		for(int i = 0; i < jobs.length; i++) {
			jobs[i].showSkillList();
		}
		
	}

}
