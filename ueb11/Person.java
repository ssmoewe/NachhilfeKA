package ueb11;

import java.util.Arrays;

public class Person {
	private String name;
	private int id;
	private Geschenk[] geschenk;
	
	public Person(String name, int id) {
		this.name = name;
		this.id = id;
		this.geschenk = new Geschenk[4];
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Geschenk[] getGeschenk() {
		return this.geschenk;
	}
	
	public void setGeschenk(Geschenk[] geschenk) {
		this.geschenk = geschenk;
	}
	
	public void geschenkUeberreichen(Geschenk newGeschenk) {
		for(int i = 0; i < this.geschenk.length; i++) {
			if(geschenk[i] == null) {
				geschenk[i] = newGeschenk; return;
			}
		}
		System.out.println("Error");
	}
	
	public void geschenkeAusgeben(){
		for(int i = 0; i < geschenk.length; i++) {
			if(geschenk[i] == null) {
				System.out.println("null");
			} else {
				System.out.println(geschenk[i].toString());
			}
		}
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", id=" + id + ", geschenk=" + Arrays.toString(geschenk) + "]";
	}
}
