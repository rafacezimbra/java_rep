package aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Programa2 {

	public static void main(String[] args) {
		// Converter data e hora para texto
		
		// Para instanciar uma data ISO8601 a partir de uma string
		LocalDate d01 = LocalDate.parse("2023-04-20");
		System.out.println("Data gerada a partir de uma string = " + d01);
	
		// Para formatar uma data
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		// Para imprimir formatado
		System.out.println("Primeira forma de imprimir formatado = " + d01.format(fmt1));
		
		// Outra forma de imprimir formatado
		System.out.println("Segunda forma de imprimir formatado = " + fmt1.format(d01));
	
		// Outra forma criando o objeto no parêmetro
		System.out.println("Terceira forma de imprimir formatado = " + d01.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
		System.out.println();
		
		// Para formatar a data com a hora
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		System.out.println();
		
		// Para instanciar uma data ISO8601 com horário a partir de uma string
		LocalDateTime d02 = LocalDateTime.parse("2023-04-20T01:30:26");
		System.out.println("Data gerada a partir de uma string com horário= " + d02);
		
		// Para imprimir formatada com a hora 
		System.out.println("Data formatada com a hora = " + d02.format(fmt2));
		System.out.println();
		
		// Para gerar uma data no padrão UTC (Londres)
		Instant d03 = Instant.parse("2023-04-20T01:30:26Z");
		System.out.println("Data gerada a partir de uma string com horário no padrão UTC (Horário de Londres) = " + d03);
	
		// Para formatar com o time zone do computador do usuário
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());		
		
		// Para imprimir uma data com time zone do computador do usuário 
		System.out.println("Data formatada com o Time Zone do computador do usuário (Horário Local em relação ao horário de Londres = " + fmt3.format(d03));
		System.out.println();
		
		// Para formatar uma data no formato ISO
		DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
		System.out.println("Data formatada com o formato ISO = " + fmt4.format(d02));
		System.out.println();
		
		// Para formatar a data com o fuzo horário padrão
		DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;
		System.out.println("Data formatada com o fuzo horário padrão (Londres)= " + fmt5.format(d03));
	}
}
