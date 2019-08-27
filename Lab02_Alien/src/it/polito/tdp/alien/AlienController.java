package it.polito.tdp.alien;

/**
 * Sample Skeleton for 'Alien.fxml' Controller Class
 */



import java.net.URL;
import java.util.ResourceBundle;
import java.util.StringTokenizer;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class AlienController {
	
	AlienDictionary alien;
	
    @FXML
    private ResourceBundle resources;
    @FXML
    private URL location;
    @FXML
    private TextField txtWord;
    @FXML
    private TextArea txtResult;
    @FXML
    private Button btnTranslate;
    @FXML
    private Button btnReset;
        
    
    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    	assert txtWord != null : "fx:id=\"txtWord\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert txtResult != null : "fx:id=\"txtResult\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnTranslate != null : "fx:id=\"bntTranslate\" was not injected: check your FXML file 'Alien.fxml'.";
    	assert btnReset != null : "fx:id=\"btnReset\" was not injected: check your FXML file 'Alien.fxml'.";
    	alien=new AlienDictionary();
    }
  
    
    @FXML
    void doTranslate(ActionEvent event) {
    	String p=txtWord.getText();
    	txtResult.clear();
    	try {
    		if(p.contains(" ")) {
    			StringTokenizer st=new StringTokenizer(p, " ");
    			String alienWord=st.nextToken().trim();
    			String translation=st.nextToken().trim();
    			alien.addWord(alienWord, translation);
    			txtResult.appendText("Parola aggiunta!");
    		}else {
    			String t=alien.traslateWord(p);
        		txtResult.appendText(t);
    		}
    		/*String [] s;
    		s=p.split(" ");
    		//Word w=new Word(s[0], s[1]);
    		alien.addWord(s[0], s[1]);*/
    	} catch (NumberFormatException e) {
    		System.out.println("errore");
    	}
    	
    }
    
    
    @FXML
    void doReset(ActionEvent event) {

    }
    
}
