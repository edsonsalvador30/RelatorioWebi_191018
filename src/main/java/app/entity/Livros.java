package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela LIVROS
 * @generated
 */
@Entity
@Table(name = "\"LIVROS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Livros")
public class Livros implements Serializable {

  /**
   * UID da classe, necessário na serialização
   * @generated
   */
  private static final long serialVersionUID = 1L;

  /**
   * @generated
   */
  @Id
  @Column(name = "id", nullable = false, insertable=true, updatable=true)
  private java.lang.String id = UUID.randomUUID().toString().toUpperCase();

  /**
  * @generated
  */
  @Column(name = "Titulo", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String titulo;

  /**
  * @generated
  */
  @Column(name = "Autor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String autor;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_livros_0", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Livros livros_0;

  /**
   * Construtor
   * @generated
   */
  public Livros(){
  }


  /**
   * Obtém id
   * return id
   * @generated
   */
  
  public java.lang.String getId(){
    return this.id;
  }

  /**
   * Define id
   * @param id id
   * @generated
   */
  public Livros setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém titulo
   * return titulo
   * @generated
   */
  
  public java.lang.String getTitulo(){
    return this.titulo;
  }

  /**
   * Define titulo
   * @param titulo titulo
   * @generated
   */
  public Livros setTitulo(java.lang.String titulo){
    this.titulo = titulo;
    return this;
  }

  /**
   * Obtém autor
   * return autor
   * @generated
   */
  
  public java.lang.String getAutor(){
    return this.autor;
  }

  /**
   * Define autor
   * @param autor autor
   * @generated
   */
  public Livros setAutor(java.lang.String autor){
    this.autor = autor;
    return this;
  }

  /**
   * Obtém livros_0
   * return livros_0
   * @generated
   */
  
  public Livros getLivros_0(){
    return this.livros_0;
  }

  /**
   * Define livros_0
   * @param livros_0 livros_0
   * @generated
   */
  public Livros setLivros_0(Livros livros_0){
    this.livros_0 = livros_0;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Livros object = (Livros)obj;
    if (id != null ? !id.equals(object.id) : object.id != null) return false;
    return true;
  }

  /**
   * @generated
   */
  @Override
  public int hashCode() {
    int result = 1;
    result = 31 * result + ((id == null) ? 0 : id.hashCode());
    return result;
  }

}
