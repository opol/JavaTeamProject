package com.lits.project.util;

import java.io.IOException;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.lits.project.model.Track;

public class Parser {

	/**
	 * Parse xml
	 */
	public void parseXml() {
		Set<Track> trackSet = new TreeSet<Track>();
		Track currentTrack;

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("albums.xml");
			NodeList trackList = doc.getElementsByTagName("track");
			for (int i = 0; i < trackList.getLength(); i++) {
				Node t = trackList.item(i);
				if (t.getNodeType() == Node.ELEMENT_NODE) {
					Element track = (Element) t;
					String id = track.getAttribute("id");

					currentTrack = new Track();
					currentTrack.setId(Integer.parseInt(id));
					NodeList authorList = track.getChildNodes();
					for (int j = 0; j < authorList.getLength(); j++) {
						Node a = authorList.item(j);
						if (a.getNodeType() == Node.ELEMENT_NODE) {
							Element author = (Element) a;
//							System.out.println("track:" + id + author.getTagName() + "-" + author.getTextContent());
							if (author.getTagName().equals("author")) {
								currentTrack.setAuthor(author.getTextContent());
							} else if (author.getTagName().equals("trackName")) {
								currentTrack.setName(author.getTextContent());

							} else if (author.getTagName().equals("duration")) {
								currentTrack.setDuration(author.getTextContent());
							}

						}

					}

					trackSet.add(currentTrack);
				}

			}

			System.out.println("Album contains of: " + trackSet);
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
