package br.dev.davi.tarefas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import br.dev.davi.tarefas.model.Tarefa;

public class Main {
	static String caminho = "/Users/25132494/tarefasDS1TA/tarefas";

	public static void main(String[] args) {
		
		Tarefa tf1 = new Tarefa();
		
		
		//escreverArquivo();
		// lerArquivo();
	}

	private static void escreverArquivo() {

		FileWriter fw = null;
		BufferedWriter bw = null;
		try {
			fw = new FileWriter(caminho, true);
			bw = new BufferedWriter(fw);

			// escrevendo conteudo no arquivo
			bw.append("senai jandira\n ");
			bw.newLine();
			bw.append("Davi\n");
			bw.newLine();
			bw.append("lindo\n");
			bw.newLine();
			// mandando escrever no arquivo
			bw.flush();
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	private static void lerArquivo() {
		FileReader fr = null;
		BufferedReader br = null;

		try {
			fr = new FileReader(caminho);
			br = new BufferedReader(fr);

			String retorno = br.readLine();

			while (retorno != null)
				System.out.println(retorno);
			retorno = br.readLine();

			System.out.println(retorno);
		} catch (FileNotFoundException erro) {
			System.out.println("O arquivo não foi encontardo!");
		} catch (Exception erro) {
			System.out.println("ocorreu em erro de compilação");

		}
		System.out.println("fim");
	}

}
