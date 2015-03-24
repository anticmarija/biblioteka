package biblioteka;

public class Autor {

	private String ime;
	private String prezime;
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	
	public String toString () {
		return "Autor, ime: " +ime+" prezime: "+ prezime;
	}
	
	public boolean equals (Object obj) {
		 if (this == obj)
			 return true;
		 if (obj == null)
			 return false;
		 if (this.getClass() != obj.getClass())
			 return false;
		 
		 Autor autor = (Autor) obj;
		 
		 if (ime == null) {
				if (autor.ime != null)
					return false;
			} else if (!ime.equals(autor.ime))
				return false;
			if (prezime == null) {
				if (autor.prezime != null)
					return false;
			} else if (!prezime.equals(autor.prezime))
				return false;
			return true;
		}
	}

