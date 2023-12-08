package com.gl.email_app;

public class EmailAppUtil {
	public static boolean validateDepartmentCode(
			int departmentCode) {
			
			if (departmentCode >=1 && departmentCode <=4) {
				return true;
			}else {
				return false;
			}
		}
}
