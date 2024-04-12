package endes;

import java.util.*;


/**
 * Class Empleado
 */
public class Empleado {

  //
  // Fields
  //

  private String nombre;
  private String idEmpleado;
  
  //
  // Constructors
  //
  public Empleado () { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of idEmpleado
   * @param newVar the new value of idEmpleado
   */
  public void setIdEmpleado (String newVar) {
    idEmpleado = newVar;
  }

  /**
   * Get the value of idEmpleado
   * @return the value of idEmpleado
   */
  public String getIdEmpleado () {
    return idEmpleado;
  }

  //
  // Other methods
  //

  /**
   * @param        libro
   */
  public void procesarPrestamos(Libro libro)
  {
  }


  /**
   * @param        libro
   */
  public void procesarDevolucion(Libro libro)
  {
  }


}
