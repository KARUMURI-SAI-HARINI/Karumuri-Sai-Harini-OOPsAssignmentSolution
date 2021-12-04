package Departments;

public class techDepartment extends superDepartment {
	public String departmentName(String dept) {
		String deptname = "Tech Department ";
		System.out.println("Welcome to Tech Department");
		return deptname;
	}

	public String getTodaysWork(String twork) {
		String towork = "Complete coding of module 1";
		System.out.println("Complete coding of module 1");
		return towork;
	}

	public String getWorkDeadline(String gwd) {
		String gwdetails = "Complete by EOD ";
		System.out.println("Complete by EOD");
		return gwdetails;
	}

	public String getTechStackInformation(String gtsi) {
		String gtsinfo = "core Java";
		System.out.println("core Java");
		return gtsinfo;
	}

}
