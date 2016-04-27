package com.lits.project.main;

import java.util.Set;
import java.util.TreeSet;

import com.lits.project.model.Track;

public class Main {

	public static void main(String[] args) {

		Set<Track> trackSet = new TreeSet<Track>();
		
		Track track1 = new Track("Woman in Love", "Roman", "4:33");
		Track track2 = new Track("Lehkyy", "Who let the dog", "5:33");
		Track track3 = new Track("Roman4uk", "Woman in Love", "4:33");
		Track track4 = new Track("And", "Woman in Love", "4:33");
		
		trackSet.add(track1);
		trackSet.add(track2);
		trackSet.add(track3);
		trackSet.add(track4);
		
		System.out.println(trackSet);
	}
}
