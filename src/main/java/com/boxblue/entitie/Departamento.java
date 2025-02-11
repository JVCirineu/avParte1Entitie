package com.boxblue.entitie;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
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
@Table(name="Departamento")
public class Departamento {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@NotNull
	private Long id;
	
	@NotBlank
	private String cidade;
	
	@NotBlank
	private String email;
	
	@NotBlank
	private String nome;
	
	@NotNull
	private int qntdePessoas;
	
	@NotBlank
	private String telefone;
	
}
