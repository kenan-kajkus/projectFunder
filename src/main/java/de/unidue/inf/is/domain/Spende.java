package de.unidue.inf.is.domain;

public class Spende {
	private int kennung;
	private String spender;
	private int spende;
	
	public Spende(int kennung, String spender, int spende)
	{
		this.setKennung(kennung);
		this.setSpender(spender);
		this.setSpende(spende);
	}

	public int getKennung() {
		return kennung;
	}

	public void setKennung(int kennung) {
		this.kennung = kennung;
	}

	public int getSpende() {
		return spende;
	}

	public void setSpende(int spende) {
		this.spende = spende;
	}

	public String getSpender() {
		return spender;
	}

	public void setSpender(String spender) {
		this.spender = spender;
	}
	
	
}
