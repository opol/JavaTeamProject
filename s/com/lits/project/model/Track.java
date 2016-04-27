package com.lits.project.model;

public class Track implements Comparable<Track>{

	private String name;
	private String singer;
	private String duration;
	
	public Track(String name, String singer, String duration) {
		super();
		this.name = name;
		this.singer = singer;
		this.duration = duration;
	}
	public String getSinger() {
		return singer;
	}
	public void setSinger(String singer) {
		this.singer = singer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDuration() {
		return duration;
	}
	public void setDuration(String duration) {
		this.duration = duration;
	}
	@Override
	public int compareTo(Track track) {
		return (this.singer).compareTo(track.singer)|(this.name).compareTo(track.name);
	}
	@Override
	public String toString() {
		return "Track [name=" + name + ", singer=" + singer + ", duration=" + duration + "]";
	}
	
	
	
	
}
