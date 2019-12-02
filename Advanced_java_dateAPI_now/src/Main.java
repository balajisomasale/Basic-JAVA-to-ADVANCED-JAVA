import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String date = sc.nextLine();
		DateTimeFormatter d2 = DateTimeFormatter.ofPattern("d MMM yyyy, HH:mm:ssa");

		LocalDateTime post = LocalDateTime.parse(date, d2);
		System.out.println(post);
		LocalDateTime now = LocalDateTime.now();
		
		//System.out.println(now);
		Duration dur = Duration.between(post, now);
		if (dur.getSeconds() > 60) {
			if (dur.toMinutes() > 60) {
				if (dur.toHours() > 1 && dur.toHours() < 8) {
					System.out.println(dur.toHours() + " hours ago");
				}

			} else {
				System.out.println(dur.toMinutes() + " minutes ago");
			}

		} else {
			System.out.println(" Few seconds ago");
		}

	}
}
