package objectClass.examples;
/*
 * Exploring getClass() and getSuperClass() methods of Object class.
 */
public class Sample1 {

	public static void main(String[] args) {
		showClassInfo("sample");
		Student stu = new Student();
		showClassInfo(stu);
		Object obj = new Object();
		showClassInfo(obj);
	}
	
	static void showClassInfo(Object obj) {
		Class cls = obj.getClass();
		System.out.println("Class Name:"+cls.getName());
		Class scls = cls.getSuperclass();
		if(scls != null) {
			System.out.println("Super Class Name:"+scls.getName());
		}
		else {
			System.out.println("No Super Class");
		}
	}

}

class Person{}
class Student extends Person{}
