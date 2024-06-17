package Data;

import java.util.Scanner;

public class Main {
	
public static void main(String[] args) {
	Data data = new Data();
	Scanner sc = new Scanner(System.in);
	int diaSc = 0, mesSc, anoSc, dia = 0, mes =0, ano = 0;
	
	System.out.println("Informe um dia: ");
	diaSc = sc.nextInt();
	dia = data.getDia(diaSc);
	
	System.out.println("Informe um mes: ");
	mesSc  = sc.nextInt();
	mes = data.getMes(mesSc);
	
	System.out.println("Informe um ano: ");
	anoSc  = sc.nextInt();
	ano = data.getAno(anoSc);
	///////////////////////////////////////////////
	//Resultados
	//////////////////////////////////////////////

	String conteudoPadrao = data.DataCompleta(01,01,1900);
	String conteudoCompleto = data.DataCompleta(dia,mes,ano);
	String conteudoDia = data.DataDia(dia);
	String conteudoDia_Mes = data.DataDia_Mes(dia, mes);
	String conteudoSimplificado = data.DataCompletaSimplificada(dia, mes, ano);
	String conteudoExtenso = data.DataCompletaExtensa(dia, mes, ano);
	
	//1.data padrão
	System.out.println("Data padrão: "+ conteudoPadrao);
	//2.data com o Dia
	System.out.println("Data do dia: "+ conteudoDia);
	//3.data com dia e mês
	System.out.println("Data do dia junto do mês: "+ conteudoDia_Mes );
	//3.data completa
	System.out.println("Data completa: " + conteudoCompleto);
	//
	System.out.println("Data completa simplificada: " + conteudoSimplificado);
	//
    String dataCompleta = data.DataCompletaExtensa(12, 12, 2007);
    System.out.println("Data completa Extensa: " + conteudoExtenso); // imprime "12 de dezembro de 2007"
		    }
	}