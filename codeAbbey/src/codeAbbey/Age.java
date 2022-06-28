package codeAbbey;

import java.time.LocalDate;

public class Age {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDate = LocalDate.of(1992, 6, 14);
		int days = Period.between(birthDate,today).getYears();

	}

}
