package jsp_projet_pizza_package;

public class Pizza implements java.io.Serializable{
	
	
	
	Integer  nropizza  ;
	String nompizza ;
	Float  prixpizza ;

	 public Pizza( ) {
		 
		}
	 public Pizza(Integer nropizza,String nompizza  , Float prixpizza) {
			super();
			this.nompizza = nompizza;
			this.nropizza = nropizza;
			this.prixpizza = prixpizza;
		}
		  
	  public String getNompizza() {
		return nompizza;
	}
	public void setNompizza(String nompizza) {
		this.nompizza = nompizza;
	}
	public Integer getNropizza() {
		return nropizza;
	}
	public void setNropizza(Integer nropizza) {
		this.nropizza = nropizza;
	}
	public Float getPrixpizza() {
		return prixpizza;
	}
	public void setPrixpizza(Float prixpizza) {
		this.prixpizza = prixpizza;
	}

}
