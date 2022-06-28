import java.time.LocalDate;
import java.time.Period;

public class Age {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		LocalDate birthDay = LocalDate.of(1992, 6, 14);
		int years = Period.between(birthDay, today).getDays();
		System.out.println(years);

	}

}
