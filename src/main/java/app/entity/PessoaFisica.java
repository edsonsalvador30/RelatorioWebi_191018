package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PESSOAFISICA
 * @generated
 */
@Entity
@Table(name = "\"PESSOAFISICA\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.PessoaFisica")
public class PessoaFisica implements Serializable {

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
  @Column(name = "NomePessoa", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomePessoa;

  /**
  * @generated
  */
  @Column(name = "Idade", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer idade;

  /**
  * @generated
  */
  @Column(name = "Imagem", nullable = true, unique = false, insertable=true, updatable=true)
  
  private byte[] imagem;

  /**
   * Construtor
   * @generated
   */
  public PessoaFisica(){
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
  public PessoaFisica setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomePessoa
   * return nomePessoa
   * @generated
   */
  
  public java.lang.String getNomePessoa(){
    return this.nomePessoa;
  }

  /**
   * Define nomePessoa
   * @param nomePessoa nomePessoa
   * @generated
   */
  public PessoaFisica setNomePessoa(java.lang.String nomePessoa){
    this.nomePessoa = nomePessoa;
    return this;
  }

  /**
   * Obtém idade
   * return idade
   * @generated
   */
  
  public java.lang.Integer getIdade(){
    return this.idade;
  }

  /**
   * Define idade
   * @param idade idade
   * @generated
   */
  public PessoaFisica setIdade(java.lang.Integer idade){
    this.idade = idade;
    return this;
  }

  /**
   * Obtém imagem
   * return imagem
   * @generated
   */
  
  public byte[] getImagem(){
    return this.imagem;
  }

  /**
   * Define imagem
   * @param imagem imagem
   * @generated
   */
  public PessoaFisica setImagem(byte[] imagem){
    this.imagem = imagem;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    PessoaFisica object = (PessoaFisica)obj;
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
