/**
 * 
 */
package br.com.morgado.cadastro_dados.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.morgado.cadastro_dados.model.PessoaDTO;
import br.com.morgado.cadastro_dados.repository.PessoaRepository;
import lombok.RequiredArgsConstructor;

/**
 * 
 */
@RequiredArgsConstructor
@Service
public class PessoaService {

	private final PessoaRepository pessoaRepository;

	private PessoaDTO gravarPessoa(final PessoaDTO pessoa) throws Exception {

		/**
		 * || = ou 
		 * && = e
		 * 
		 * 
		 * == igual != diferente
		 */
		if (pessoa.getNome() == null || pessoa.getNome().isBlank() || pessoa.getNome().length() > 200) {
			throw new RuntimeException("Falta passar o nome, e deve conter no máximo 200 caracteres.");
		}

		if (pessoa.getNascimento() == null) {
			throw new RuntimeException("Falta passar o data de nascimento.");
		}

		if (pessoa.getEmail() != null && pessoa.getEmail().length() > 200) {
			throw new RuntimeException("Falta passar o e-mail, e deve conter no máximo 200 caracteres.");
		}

		if (pessoa.getRg() == null || pessoa.getRg().isBlank() || pessoa.getRg().length() > 14) {
			throw new RuntimeException("Falta passar o RG, e deve conter no máximo 200 caracteres.");
		}

		if (pessoa.getId() == null) {
			pessoa.setCadastro(LocalDateTime.now());
		}

		return pessoaRepository.save(pessoa);
	}
	
	
	public List<PessoaDTO> buscarPessoasPessoasPorNome(final String nome){
		return pessoaRepository.findByNome(nome); 
	}
	
	
	public List<PessoaDTO> buscarPessoasPessoasPorRg(final String rg){
		return pessoaRepository.findByRg(rg); 
	}

	
	public List<PessoaDTO> buscarPessoasPessoasPorRg(final String rg,final String nome){
		return pessoaRepository.findByNomeAndRg(rg, nome) ;
	}
	
	
	public void apagarPessoa(final Long id) {
		pessoaRepository.deleteById(id);
	}
	
	
}
