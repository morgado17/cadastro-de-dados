/**
 * 
 */
package br.com.morgado.cadastro_dados.model;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * Objeto que representa o pessoa no banco.
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_pessoa")
public class PessoaDTO {

	@Id
	@Column(name = "id", nullable = true, insertable = false, unique = true, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "nome", nullable = false, insertable = true, unique = false, updatable = true, length = 200)
	private String nome;

	@Column(name = "data_nascimento", nullable = false, insertable = true, unique = false, updatable = true)
	private LocalDate nascimento;

	@Column(name = "email", nullable = true, insertable = true, unique = false, updatable = true)
	private String email;
	
	@Column(name = "registro_geral", nullable = false, insertable = true, unique = false, updatable = true)
	private String rg;
	
	@Column(name = "data_cadastro", nullable = false, insertable = true, unique = false, updatable = true)
	private LocalDateTime cadastro;
	
	@OneToMany(mappedBy = "pessoa")
	private List<EntradaDTO> entradas;

}
