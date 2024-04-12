
import java.util.*;


/**
 * Class Libro
 */
public class Libro {

  //
  // Fields
  //

  private String titulo;
  private String autor;
  private String isbn;
  
  //
  // Constructors
  //
  public Libro () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of titulo
   * @param newVar the new value of titulo
   */
  public void setTitulo (String newVar) {
    titulo = newVar;
  }

  /**
   * Get the value of titulo
   * @return the value of titulo
   */
  public String getTitulo () {
    return titulo;
  }

  /**
   * Set the value of autor
   * @param newVar the new value of autor
   */
  public void setAutor (String newVar) {
    autor = newVar;
  }

  /**
   * Get the value of autor
   * @return the value of autor
   */
  public String getAutor () {
    return autor;
  }

  /**
   * Set the value of isbn
   * @param newVar the new value of isbn
   */
  public void setIsbn (String newVar) {
    isbn = newVar;
  }

  /**
   * Get the value of isbn
   * @return the value of isbn
   */
  public String getIsbn () {
    return isbn;
  }

  //
  // Other methods
  //

  /**
   * @return       String
   */
  public String prestar()
  {
  }


  /**
   * @return       String
   */
  public String devolver()
  {
  }


}
