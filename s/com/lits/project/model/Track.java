package com.lits.project.model;

/**
 * 
 * @author Yuliya
 *
 */
public class Track implements Comparable<Track>{
	private int id;
	private String name;
	private String author;
	private String duration;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDuration() {
		return duration;
	}

	public void setDuration(String duration) {
		this.duration = duration;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "\nid=" + id + ", name=" + name + ", author=" + author + ", duration=" + duration;
	}

	public int compareTo(Track track) {
		return (this.name).compareTo(track.name);
	}
	
}
