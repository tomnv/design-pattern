package com.vn.ex1;

import javax.swing.JPanel;

public abstract class UIBuilder {
	
	protected JPanel searchUI;
	
	//add necessary UI Controls and initialize them
	public abstract void addUIControls();
	
	public abstract void initialize();
	
	//return the SELECT sql command for specified criteria
	public abstract String getSQL();
	
	
	public JPanel getSearchUI(){
		return searchUI;
	}
	

}
