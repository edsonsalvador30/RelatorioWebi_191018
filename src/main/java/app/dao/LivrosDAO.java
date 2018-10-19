package app.dao;

import app.entity.*;
import java.util.*;
import org.springframework.stereotype.*;
import org.springframework.data.jpa.repository.*;
import org.springframework.data.domain.*;
import org.springframework.data.repository.query.*;
import org.springframework.transaction.annotation.*; 


/**
 * Realiza operação de Create, Read, Update e Delete no banco de dados.
 * Os métodos de create, edit, delete e outros estão abstraídos no JpaRepository
 * 
 * @see org.springframework.data.jpa.repository.JpaRepository
 * 
 * @generated
 */
@Repository("LivrosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface LivrosDAO extends JpaRepository<Livros, java.lang.String> {

  /**
   * Obtém a instância de Livros utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM Livros entity WHERE entity.id = :id")
  public Livros findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de Livros utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM Livros entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);



  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM Livros entity WHERE entity.livros_0.id = :id")
  public Page<Livros> findLivros(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * OneToMany Relation
   * @generated
   */
  @Query("SELECT entity FROM AlunoLivros entity WHERE entity.livros.id = :id")
  public Page<AlunoLivros> findAlunoLivros(@Param(value="id") java.lang.String id, Pageable pageable);
  /**
   * ManyToOne Relation
   * @generated
   */
  @Query("SELECT entity.aluno FROM AlunoLivros entity WHERE entity.livros.id = :id")
  public Page<Aluno> listAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * ManyToOne Relation Delete
   * @generated
   */
  @Modifying
  @Query("DELETE FROM AlunoLivros entity WHERE entity.livros.id = :instanceId AND entity.aluno.id = :relationId")
  public int deleteAluno(@Param(value="instanceId") java.lang.String instanceId, @Param(value="relationId") java.lang.String relationId);

  /**
   * Foreign Key livros_0
   * @generated
   */
  @Query("SELECT entity FROM Livros entity WHERE entity.livros_0.id = :id")
  public Page<Livros> findLivrossByLivros_0(@Param(value="id") java.lang.String id, Pageable pageable);

}
