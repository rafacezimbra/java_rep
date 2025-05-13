package aplicacao;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Programa4 {

	public static void main(String[] args) {
		// Cálculos com datas e horas
		
		// Para instanciar uma data ISO8601 a partir de uma string
		LocalDate d01 = LocalDate.parse("2023-04-20");
		System.out.println("Data gerada a partir de uma string = " + d01);
			
		// Para calcular a data da semana passa
		LocalDate semanaPassada = d01.minusDays(7);
		System.out.println("Semana Passada = "+semanaPassada);
		
		// Para calcular a data da semana que vem
		LocalDate semanaQueVem = d01.plusDays(7);
		System.out.println("Semana que vem = "+semanaQueVem);
		System.out.println();
		
		// Para instanciar uma data ISO8601 com horário a partir de uma string
		LocalDateTime d02 = LocalDateTime.parse("2023-04-20T01:30:26");
		System.out.println("Data gerada a partir de uma string com horário= " + d02);
		
		// Para calcular a data da semana passa incluindo horas
		LocalDateTime semanaPassadaComHoras = d02.minusDays(7);
		System.out.println("Semana passada com horas= "+semanaPassadaComHoras);
		
		// Para calcular a data da sema que vem incluindo horas
		LocalDateTime semanaQueVemComHoras = d02.plusDays(7);
		System.out.println("Semana que vem com horas= "+semanaQueVemComHoras);
		System.out.println();
		
		// Para gerar uma data no padrão UTC (Londres)
		Instant d03 = Instant.parse("2023-04-20T01:30:26Z");
		System.out.println("Data gerada a partir de uma string com horário no padrão UTC (Horário de Londres) = " + d03);
		
		// Para calcular a data da semana passa incluindo horas com time zone
		Instant semanaPassadaComTimeZone = d03.minus(7, ChronoUnit.DAYS);
		System.out.println("Semana passada com Time Zone= "+semanaPassadaComTimeZone);
		
		// Para calcular a data da semana que vem com time zone
		Instant semanaQueVemComTimeZone = d03.plus(7, ChronoUnit.DAYS);
		System.out.println("Semana que vem com Time Zone= "+semanaQueVemComTimeZone);
		System.out.println();
		
		// Para calcular a duração entre duas datas
		Duration t1 = Duration.between(semanaPassada.atStartOfDay(), d01.atStartOfDay());
		System.out.println("Total de dias entre duas datas (semana passada e hoje) = "+t1.toDays());
		System.out.println();
		
		// Para calcular a duração entre duas datas com horas
		Duration t2 = Duration.between(semanaPassadaComHoras, d02);
		System.out.println("Total de dias entre duas datas com horas (semana passada e hoje) = "+t2.toDays());
		System.out.println();
		
		// Para calcular a duração entre duas datas com Time Zone
		Duration t3 = Duration.between(semanaPassadaComTimeZone, d03);
		System.out.println("Total de dias entre duas datas com Time Zone (semana passada e hoje) = "+t3.toDays());
		System.out.println();
		
		// Para calcular a duração entre datas com a data menor na frente
		Duration t4 = Duration.between(d03, semanaPassadaComTimeZone);
		System.out.println("Total de dias entre uma data maior e uma menor = "+t4.toDays());
	}
}
