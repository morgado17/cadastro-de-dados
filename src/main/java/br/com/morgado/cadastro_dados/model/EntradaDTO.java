/**
 * 
 */
package br.com.morgado.cadastro_dados.model;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 *  
 */
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tbl_entrada")
public class EntradaDTO {

	@Id
	@Column(name = "id", nullable = true, insertable = false, unique = true, updatable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_pessoa", insertable = true, updatable = false, nullable = false, unique = false)
	private PessoaDTO pessoa;
	
	
	@Column(name="entrada", insertable = true,updatable = false,nullable = false, unique = false)
	private LocalDateTime entrada ;
	
	
	
}
