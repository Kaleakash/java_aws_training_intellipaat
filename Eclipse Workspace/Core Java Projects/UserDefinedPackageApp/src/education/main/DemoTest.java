package education.main;
//import education.college.*;
import education.college.Attendance;
//import education.school.Attendance;
public class DemoTest {

	public static void main(String[] args) {
		
	Attendance att1 = new Attendance();
	att1.display();
	education.school.Attendance att2 = new education.school.Attendance();
	att2.display();
	}

}
