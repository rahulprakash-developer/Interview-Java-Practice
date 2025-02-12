package com.java.StreamMapping;

import java.util.List;

public class Details {

	private int id;
	private List<String> parts;

	public Details(int id, List<String> parts) {
		this.id = id;
		this.parts = parts;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

	@Override
	public String toString() {
		return "Details [id=" + id + ", parts=" + parts + "]";
	}

}
