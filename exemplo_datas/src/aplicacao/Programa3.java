package aplicacao;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class Programa3 {

	public static void main(String[] args) {
		// Converter Data Hora de Global para Local
		
		// Para ver os Time Zone disponíveis
		for (String s : ZoneId.getAvailableZoneIds()) {
			System.out.println(s);
		}
		System.out.println();	
		
		// Para gerar uma data no padrão UTC (Londres)
		Instant d01 = Instant.parse("2023-04-20T01:30:26Z");
		System.out.println("Data gerada a partir de uma string com horário no padrão UTC= " + d01);

		// Para converter uma data global para o Time Zone local do computador
		LocalDate r1 = LocalDate.ofInstant(d01, ZoneId.systemDefault());
		System.out.println("Data global convertida para o time Zone local = " + r1);
		
		// Para converter uma data global para um Time Zone específico (Portugal)
		LocalDate r2 = LocalDate.ofInstant(d01, ZoneId.of("Portugal"));
		System.out.println("Data global convertida para o time Zone de Portugal = " + r2);
				
		// Para converter uma data e hora global para o Time Zone local do computador
		LocalDateTime r3 = LocalDateTime.ofInstant(d01, ZoneId.systemDefault());
		System.out.println("Data global e hora convertida para o time Zone local = " + r3);
		
		// Para converter uma data e hora global para um Time Zone específico (Portugal)
		LocalDateTime r4 = LocalDateTime.ofInstant(d01, ZoneId.of("Portugal"));
		System.out.println("Data global convertida e hora para o time de Portugal = " + r4);
		System.out.println();
		
		// Para instanciar uma data ISO8601 a partir de uma string
		LocalDate d02 = LocalDate.parse("2023-04-20");
		System.out.println("Data gerada a partir de uma string = " + d02);
		
		// Para pegar o dia, mês e ano separados, de uma data local
		System.out.println("Dia de uma data local = " + d02.getDayOfMonth());
		System.out.println("Mês de uma data local = " + d02.getMonthValue());
		System.out.println("Ano de uma data local = " + d02.getYear());
		System.out.println();
		
		// Para instanciar uma data ISO8601 com horário a partir de uma string
		LocalDateTime d03 = LocalDateTime.parse("2023-04-20T01:30:26");
		System.out.println("Data gerada a partir de uma string com horário= " + d03);
		
		// Para pegar a hora e mínutos de uma data local
		System.out.println("Horas = " + d03.getHour());
		System.out.println("Minutos = " + d03.getMinute());
		
	}

}
