package br.dev.davi.tarefas.model;

import java.time.LocalDate;

public class Tarefa {
	private String nome;
	private String descricao;
	private LocalDate dataInicio;
	private int prazo;
	private LocalDate dataPrevisaoDEEntrega;
	private LocalDate dataEntrega;
	private Status status;
	private Funcionario responsavel;
	
	public Tarefa() {
		System.out.println("criando um tarefa...");
		
	}
	public Tarefa(String nome) {
		System.out.println("criando um tarefa" + nome );
		this.nome = nome;
		
	}
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public LocalDate getDataInicio() {
		return dataInicio;
	}

	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}

	public int getPrazo() {
		return prazo;
	}

	public void setPrazo(int prazo) {
		this.prazo = prazo;
	}

	public LocalDate getDataPrevisaoDEEntrega() {
		return dataPrevisaoDEEntrega;
	}

	public void setDataPrevisaoDEEntrega(LocalDate dataPrevisaoDEEntrega) {
		this.dataPrevisaoDEEntrega = dataPrevisaoDEEntrega;
	}

	public LocalDate getDataEntrega() {
		return dataEntrega;
	}

	public void setDataEntrega(LocalDate dataEntrega) {
		this.dataEntrega = dataEntrega;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Funcionario getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(Funcionario responsavel) {
		this.responsavel = responsavel;
	}

}
