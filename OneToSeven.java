package controlstatements;

public class OneToSeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int day = 3;
	        String dayName;

	        switch(day) {
	            case 1: dayName = "Sunday"; break;
	            case 2: dayName = "Monday"; break;
	            case 3: dayName = "Tuesday"; break;
	            case 4: dayName = "Wednesday"; break;
	            case 5: dayName = "Thursday"; break;
	            case 6: dayName = "Friday"; break;
	            case 7: dayName = "Saturday"; break;
	            default: dayName = "Invalid day"; 
	        }

	        System.out.println(dayName);
	}

}
