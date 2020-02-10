
package modelos;

public class Peliculas {

	private String idPeliculas;
	private int year;
	private String sinopsis;
	private CategoriaPeliculas categoria;
	public Peliculas()
	{
		
	}
	public Peliculas(String idPeliculas,int year,String sinopsis,CategoriaPeliculas cat)
	{
		this.idPeliculas=idPeliculas;
		this.year=year;
		this.sinopsis=sinopsis;
		this.categoria=cat;
	}
	public String getIdPeliculas() {
		return idPeliculas;
	}
	public void setIdPeliculas(String idPeliculas) {
		this.idPeliculas = idPeliculas;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getSinopsis() {
		return sinopsis;
	}
	public void setSinopsis(String sinopsis) {
		this.sinopsis = sinopsis;
	}
	public CategoriaPeliculas getCategoria() {
		return categoria;
	}
	public void setCategoria(CategoriaPeliculas categoria) {
		this.categoria = categoria;
	}
	@Override
	public String toString() {
		return "Peliculas [idPeliculas=" + idPeliculas + ", year=" + year + ", sinopsis=" + sinopsis + ", categoria="
				+ categoria + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((idPeliculas == null) ? 0 : idPeliculas.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Peliculas other = (Peliculas) obj;
		if (idPeliculas == null) {
			if (other.idPeliculas != null)
				return false;
		} else if (!idPeliculas.equals(other.idPeliculas))
			return false;
		return true;
	}
	
}

=======
package modelos;

public class Peliculas {

}
