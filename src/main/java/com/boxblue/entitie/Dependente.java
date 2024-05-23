package com.boxblue.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Dependente")
public class Dependente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String cpf;
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String telefone;
	
	@ManyToOne
	@JoinColumn(name = "id_funcionario")
	private Funcionario funcionario;
}
