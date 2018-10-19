package app.entity;

import java.io.*;
import javax.persistence.*;
import java.util.*;
import javax.xml.bind.annotation.*;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonFilter;
import cronapi.rest.security.CronappSecurity;


/**
 * Classe que representa a tabela PRODUTO
 * @generated
 */
@Entity
@Table(name = "\"PRODUTO\"")
@XmlRootElement
@CronappSecurity
@JsonFilter("app.entity.Produto")
public class Produto implements Serializable {

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
  @Column(name = "NomeProduto", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.String nomeProduto;

  /**
  * @generated
  */
  @Column(name = "Valor", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Double valor;

  /**
  * @generated
  */
  @Column(name = "Qtd", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Integer qtd;

  /**
  * @generated
  */
  @Temporal(TemporalType.TIMESTAMP)
  @Column(name = "Fabricacao", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.util.Date fabricacao;

  /**
  * @generated
  */
  @Column(name = "Disponivel", nullable = true, unique = false, insertable=true, updatable=true)
  
  private java.lang.Boolean disponivel;

  /**
  * @generated
  */
  @ManyToOne
  @JoinColumn(name="fk_pedido", nullable = true, referencedColumnName = "id", insertable=true, updatable=true)
  
  private Pedido pedido;

  /**
   * Construtor
   * @generated
   */
  public Produto(){
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
  public Produto setId(java.lang.String id){
    this.id = id;
    return this;
  }

  /**
   * Obtém nomeProduto
   * return nomeProduto
   * @generated
   */
  
  public java.lang.String getNomeProduto(){
    return this.nomeProduto;
  }

  /**
   * Define nomeProduto
   * @param nomeProduto nomeProduto
   * @generated
   */
  public Produto setNomeProduto(java.lang.String nomeProduto){
    this.nomeProduto = nomeProduto;
    return this;
  }

  /**
   * Obtém valor
   * return valor
   * @generated
   */
  
  public java.lang.Double getValor(){
    return this.valor;
  }

  /**
   * Define valor
   * @param valor valor
   * @generated
   */
  public Produto setValor(java.lang.Double valor){
    this.valor = valor;
    return this;
  }

  /**
   * Obtém qtd
   * return qtd
   * @generated
   */
  
  public java.lang.Integer getQtd(){
    return this.qtd;
  }

  /**
   * Define qtd
   * @param qtd qtd
   * @generated
   */
  public Produto setQtd(java.lang.Integer qtd){
    this.qtd = qtd;
    return this;
  }

  /**
   * Obtém fabricacao
   * return fabricacao
   * @generated
   */
  
  public java.util.Date getFabricacao(){
    return this.fabricacao;
  }

  /**
   * Define fabricacao
   * @param fabricacao fabricacao
   * @generated
   */
  public Produto setFabricacao(java.util.Date fabricacao){
    this.fabricacao = fabricacao;
    return this;
  }

  /**
   * Obtém disponivel
   * return disponivel
   * @generated
   */
  
  public java.lang.Boolean getDisponivel(){
    return this.disponivel;
  }

  /**
   * Define disponivel
   * @param disponivel disponivel
   * @generated
   */
  public Produto setDisponivel(java.lang.Boolean disponivel){
    this.disponivel = disponivel;
    return this;
  }

  /**
   * Obtém pedido
   * return pedido
   * @generated
   */
  
  public Pedido getPedido(){
    return this.pedido;
  }

  /**
   * Define pedido
   * @param pedido pedido
   * @generated
   */
  public Produto setPedido(Pedido pedido){
    this.pedido = pedido;
    return this;
  }

  /**
   * @generated
   */
  @Override
  public boolean equals(Object obj) {
    if (this == obj) return true;
    if (obj == null || getClass() != obj.getClass()) return false;
    Produto object = (Produto)obj;
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
