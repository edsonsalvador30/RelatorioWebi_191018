package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela ALUNOLIVROS
 * @generated
 */
@Entity
@Table(name = "\"ALUNOLIVROS\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.AlunoLivros")
public class AlunoLivros implements Serializable {

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
  @ManyToOne
  @JoinColumn(name="fk_aluno", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Aluno aluno;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_livros", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Livros livros;

  /**
   * Construtor
   * @generated
   */
  public AlunoLivros(){
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
  public AlunoLivros setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém aluno
   * return aluno
   * @generated
   */
  
  public Aluno getAluno(){
    return this.aluno;
  }

  /**
   * Define aluno
   * @param aluno aluno
   * @generated
   */
  public AlunoLivros setAluno(Aluno aluno){
    this.aluno = aluno;
    return this;
  }

  /**
   * Obtém livros
   * return livros
   * @generated
   */
  
  public Livros getLivros(){
    return this.livros;
  }

  /**
   * Define livros
   * @param livros livros
   * @generated
   */
  public AlunoLivros setLivros(Livros livros){
    this.livros = livros;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    AlunoLivros object = (AlunoLivros)obj;
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
