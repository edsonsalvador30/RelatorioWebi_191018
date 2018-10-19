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
@Repository("AlunoLivrosDAO")
@Transactional(transactionManager="app-TransactionManager")
public interface AlunoLivrosDAO extends JpaRepository<AlunoLivros, java.lang.String> {

  /**
   * Obtém a instância de AlunoLivros utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Instância relacionada com o filtro indicado
   * @generated
   */    
  @Query("SELECT entity FROM AlunoLivros entity WHERE entity.id = :id")
  public AlunoLivros findOne(@Param(value="id") java.lang.String id);

  /**
   * Remove a instância de AlunoLivros utilizando os identificadores
   * 
   * @param id
   *          Identificador 
   * @return Quantidade de modificações efetuadas
   * @generated
   */    
  @Modifying
  @Query("DELETE FROM AlunoLivros entity WHERE entity.id = :id")
  public void delete(@Param(value="id") java.lang.String id);

  /**
   * Lista com paginação de acordo com a NamedQuery
   * 
   * @generated
   */
  @Query("select al from AlunoLivros al")
  public Page<AlunoLivros> list(Pageable pageable);
  


  /**
   * Foreign Key aluno
   * @generated
   */
  @Query("SELECT entity FROM AlunoLivros entity WHERE entity.aluno.id = :id")
  public Page<AlunoLivros> findAlunoLivrossByAluno(@Param(value="id") java.lang.String id, Pageable pageable);

  /**
   * Foreign Key livros
   * @generated
   */
  @Query("SELECT entity FROM AlunoLivros entity WHERE entity.livros.id = :id")
  public Page<AlunoLivros> findAlunoLivrossByLivros(@Param(value="id") java.lang.String id, Pageable pageable);

}
