package javaHomework;


public class Main {

	public static void main(String[] args) {
		Category category1 = new Category();
		category1.id = 1;
		category1.name = "Kurslarým";

		Category category2 = new Category();
		category2.id = 2;
		category2.name = "Tüm Kurslarým";

		Category category3 = new Category();
		category3.id = 3;
		category3.name = "Sýkça Sorulan Sorular";

		Category[] categories = { category1, category2, category3 };
		for (Category category : categories) {
			System.out.println(category.name);

		}
		;

		Course course1 = new Course(1, "C# Kursu", 0.00, "Engin Demirog", "Bu kursu kaçýrmayýnýz");
		Course course2 = new Course(2, "Java&React Kursu", 0.00, "Engin Demirog", "Ýþ bulmak garnati gençler :)");
		Course course3 = new Course(3, "Temel Kurs", 0.00, "Engin Demirog", "Bilmiyorsan öðrenmelisin");

		Course[] courses = { course1, course2, course3 };
		for (Course course : courses) {
			System.out.println(course.name);
		}
		;

		CourseManager courseManager = new CourseManager();
		courseManager.addToCourse(course1);
		courseManager.addToCourse(course2);
		courseManager.addToCourse(course3);

	}

}
