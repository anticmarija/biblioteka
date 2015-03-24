package biblioteka;

import java.util.LinkedList;

public class Knjiga {

	private String naslov;
	
	private long ISBN;
	
	private LinkedList<Autor> autori = new LinkedList<Autor>();
	
	private String izdavac;
	
	private int izdanje;

	public String getNaslov() {
		return naslov;
	}

	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}

	public long getISBN() {
		return ISBN;
	}

	public void setISBN(long iSBN) {
		ISBN = iSBN;
	}


	public String getIzdavac() {
		return izdavac;
	}

	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}

	public int getIzdanje() {
		return izdanje;
	}

	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	
	
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", izdavac=" + izdavac + ", ISBN="
				+ ISBN + ", izdanje=" + izdanje + ", autori=" + autori + "]";
	}
	
	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
}
