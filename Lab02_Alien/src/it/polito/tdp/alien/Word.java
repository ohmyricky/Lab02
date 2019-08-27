package it.polito.tdp.alien;

import java.util.TreeMap;

public class Word extends AlienDictionary{
	
	private String alienWord;
	private String translation;
	
	//TreeMap<String, String>traduzioni=new TreeMap<String, String>();
	
	public Word(String alienWord, String translation) {
		this.alienWord=alienWord;
		this.translation=translation;
	}

	public String getAlienWord() {
		return alienWord;
	}

	public String getTranslation() {
		return translation;
	}



	@Override
	public boolean equals(Object obj) {
		if(alienWord.equals(obj))
			return true;
		else
			return false;
	}
	
	

}
