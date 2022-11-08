package tema7;

public class Qualification extends Teacher{
	
	
	
	
	public static void main(String[] args) {
		
		Teacher teacher1 = new Teacher();
		teacher1.setCourse("Java");
		teacher1.setExperienceYears(4);
		teacher1.setSchedule("Afternoon");
		
		
			
	}

	public void verify() {
		if (experienceYears > 3 && course == "Java" && schedule == "Afternoon") {
			System.out.println("You qualify to teach at this school!");
		}else {
			System.out.println("You do not qualify!");
		}
	}	
	
	

}
