package nachhilfe;

import java.util.LinkedList;
import java.util.List;

public class Student {


	private final int matr;
	private final String vorname;
	private final String name;
	List<Integer> grades;
	
	public Student(int matr, String vorname, String name) {
		this.matr = matr;
		this.vorname = vorname;
		this.name = name;
		grades = new LinkedList<>();
	}
	
	public void addNote(int note) {
		grades.add(note);
	}
	
	public double durchschnittNote() {
		int sum = 0;
		for(int e : grades) {
			sum += e;
		}
		return (double)sum / grades.size();
	}
	
	public int compare(Student other) {
		double avg = this.durchschnittNote();
		double avgother = other.durchschnittNote();
		return avg > avgother ? -1 : 1;
	}

	public int getMatr() {
		return matr;
	}

	public String getSurname() {
		return vorname;
	}

	public String getName() {
		return name;
	}

	public List<Integer> getGrades() {
		return grades;
	}

	@Override
	public String toString() {
		String ret =  vorname + " " + name + ", Matrikelnummer: " + matr +"\n";
		if(grades.size() != 0) {
			ret += "Noten: ";
		}
		for(Integer e : grades) {
			ret += e + ", ";
		}
		ret.substring(0, ret.length() - 2);
		return ret;
	}
	
	public static void main(String[] args) {
		Student hans = new Student(123, "Hans", "Landa");
		hans.addNote(2);
		hans.addNote(4);
		hans.addNote(1);
		System.out.println(hans.durchschnittNote());
		Student huns = new Student(234, "Hans2", "Nachname");
		huns.addNote(1);
		huns.addNote(1);
		huns.addNote(1);
		System.out.println(huns.durchschnittNote());
		System.out.println(huns.compare(hans));
		System.out.println(hans.compare(huns));
	}

}
