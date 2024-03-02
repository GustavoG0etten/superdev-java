package br.com.helloWorld;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MainList {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// CRIAR UM INTERATIVO COM O USUARIO PARA QUE SEJA 
		// COM AS SEGUINTES OPÇÕES 
		// [1] EXIBIR LISTA
		// [2] NOVO ALUNO
		// [3] REMOVER ALUNO
		// [0] CANCELAR
		
		// DICA: Utiliza a estrutura 'WHILE'
		
		int opcao = 1;
		while (opcao != 0) {
			System.out.println("""
					Menu Aluno:
					[1] - Exibir Lista
					[2] - Novo Aluno
					[3] - Remover Aluno
					[4] - Alterar Aluno
					[0] - Cancelar
					
					Escolha uma opção: 
					""");
			
			opcao = scan.nextInt();
		}
		
		// Estrutura de dados LIST
		
		// Declaração da lista
		List<String> listaAlunos = new ArrayList<String>();
		
		
		// Inserir um elemento novo na lista
		listaAlunos.add("Zeka");
		listaAlunos.add("Jão");
		listaAlunos.add("Tião");
		
		
		System.out.println("Quantidade de alunos: " + listaAlunos.size());
		
		
		// Imprimir os elementos da lista através do 'FOR'
		System.out.println("* Impressão com 'FOR' *");
		for (int i = 0; i < listaAlunos.size(); i++) {
			System.out.println(listaAlunos.get(i));
		}
		
		
		// Imprimir os elementos da lista através do 'FOR..OF'
		System.out.println("* Impressão com 'FOR..OF' *");
		for (String aluno: listaAlunos) {
			System.out.println(aluno);
		}
		
		
		// Remover um elemento da lista
		Integer indexRemocao = listaAlunos.indexOf("Zeka");
		if (indexRemocao >= 0) {
			System.out.println("Removendo Zeka");
			listaAlunos.remove (indexRemocao);
		}
		
		System.out.println("Lista de alunos atualizada: ");
		for (String aluno: listaAlunos) {
			System.out.println(aluno);
		}
		
		
		

	}

}