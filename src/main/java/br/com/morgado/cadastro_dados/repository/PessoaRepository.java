/**
 * 
 */
package br.com.morgado.cadastro_dados.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.morgado.cadastro_dados.model.PessoaDTO;

/**
 * 
 */
@Repository
public interface PessoaRepository extends JpaRepository<PessoaDTO, Long> {

	
	List<PessoaDTO> findByNome(@Param("nome") final String nome);
	
	List<PessoaDTO> findByRg(@Param("rg") final String rg);
	
	List<PessoaDTO> findByNomeAndRg(@Param("rg") final String rg,@Param("nome") final String nome);
	
}
