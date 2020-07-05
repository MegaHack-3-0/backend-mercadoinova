package br.com.megahack.entity;

import java.io.Serializable;

public class User implements Serializable {

	private static final long serialVersionUID = 1L;
	String name;
	int experience;
	int stars;
	int byts;

	public User() {
	}

	public User(String name, int experience, int stars, int byts) {
		this.name = name;
		this.experience = experience;
		this.stars = stars;
		this.byts = byts;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public int getStars() {
		return stars;
	}

	public void setStars(int stars) {
		this.stars = stars;
	}

	public int getByts() {
		return byts;
	}

	public void setByts(int byts) {
		this.byts = byts;
	}

	@Override
	public String toString() {
		return new StringBuilder().append(getName()).append(getExperience()).append(getStars()).append(getByts())
				.toString();
	}

}
