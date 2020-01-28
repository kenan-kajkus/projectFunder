package de.unidue.inf.is.domain;

public class Kommentar {

	private int kennung;
	private String benutzer;
	private String text;
	
	public Kommentar(int kennung, String benutzer, String text) {
		this.kennung = kennung;
		this.benutzer = benutzer;
		this.text = text;
	}

	public int getKennung() {
		return kennung;
	}

	public void setKennung(int kennung) {
		this.kennung = kennung;
	}

	public String getBenutzer() {
		return benutzer;
	}

	public void setBenutzer(String benutzer) {
		this.benutzer = benutzer;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

}
