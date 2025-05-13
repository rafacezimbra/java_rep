package aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Programa1 {

	public static void main(String[] args) {
		
		// Demostração de instâncias de datas com horários
		
		// Para instanciar a data atual local 
		LocalDate d01 = LocalDate.now();
		System.out.println("Data atual local = " + d01);
		System.out.println();
		
		// Para instanciar a data atual local com horário 
		LocalDateTime d02 = LocalDateTime.now();
		System.out.println("Data atual local com horário = " + d02);
		System.out.println();
		
		// Para instanciar a data atual global com horário 
		Instant d03 = Instant.now();
		System.out.println("Data atual global com horário = " + d03);
		System.out.println();
		
		// Para instanciar uma data ISO8601 a partir de uma string
		LocalDate d04 = LocalDate.parse("2023-04-20");
		System.out.println("Data gerada a partir de uma string = " + d04);
		System.out.println();
		
		// Para instanciar uma data ISO8601 com horário a partir de uma string
		LocalDateTime d05 = LocalDateTime.parse("2023-04-20T01:30:26");
		System.out.println("Data gerada a partir de uma string com horário= " + d05);
		System.out.println();
	
		// Para gerar uma data no padrão UTC (Londres)
		Instant d06 = Instant.parse("2023-04-20T01:30:26Z");
		System.out.println("Data gerada a partir de uma string com horário no padrão UTC= " + d06);
		System.out.println();
		
		// Para gerar uma data no Time Zone de São Paulo 
		// Será apresentada a data com 3 horas a mais (horário de Londres) 
		Instant d07 = Instant.parse("2023-04-20T01:30:26-03:00");
		System.out.println("Data gerada com o fuzo horário de São Paulo (3 horas a mais para Londres)= " + d07);
		System.out.println();
		
		// Para gerar uma data a partir de um padrão
		// Será necessário criar primeiro o formato
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/04/2023", fmt1);
		System.out.println("Data gerada a partir de um formato pré-definido= " + d08);
		System.out.println();
		
		// Para gerar uma data com horário a partir de um padrão
		// Será necessário criar primeiro o formato
		DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/04/2023 01:30", fmt2);
		System.out.println("Data gerada com horário a partir de um formato pré-definido= " + d09);
		System.out.println();

		// Para instanciar uma data com ano, dia e mês separados
		LocalDate d10 = LocalDate.of(2023, 04, 20);
		System.out.println("Instância com ano, dia e mês separados= " + d10);
		System.out.println();
		
		// Para instanciar uma data com ano, dia, mês e hora separados
		LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);
		System.out.println("Instância com ano, dia, mês e hora separados= " + d11);
	}
}
