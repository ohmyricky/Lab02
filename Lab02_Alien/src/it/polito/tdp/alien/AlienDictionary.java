package it.polito.tdp.alien;

import java.util.LinkedList;

public class AlienDictionary {
	
	LinkedList<Word>parole=new LinkedList<Word>();
	//TreeMap<String, Word>parole=new TreeMap<String, Word>();
	
	public void addWord(String alienWord, String translation) {
		
		Word tmp=new Word(alienWord, translation);
		
		for(Word t: parole) {
			if(t.equals(tmp))
				parole.remove(t);
		}
		
		parole.add(tmp);
	}
	
	public String traslateWord(String alienWord) {
		
		for(Word w: parole) {
			parole.set(0, w);
			Word t=parole.getFirst();
			return t.getTranslation();
		}
			
		return null;
	}

}
