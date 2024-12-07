/**
 * 
 */
package br.com.morgado.cadastro_dados.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.morgado.cadastro_dados.model.PessoaDTO;

/**
 * 
 */
@Repository
public interface PessoaRepository extends JpaRepository<PessoaDTO, Long> {

}
