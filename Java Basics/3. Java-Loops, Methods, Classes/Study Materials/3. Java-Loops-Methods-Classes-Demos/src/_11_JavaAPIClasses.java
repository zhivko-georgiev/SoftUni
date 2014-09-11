import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.time.LocalDate;
import java.util.Random;

public class _11_JavaAPIClasses {
	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println("Today is: " + today);
		LocalDate tomorrow = today.plusDays(1);
		System.out.println("Tomorrow will be: " + tomorrow);

		double cosine = Math.cos(Math.PI);
		System.out.println("cos(pi) = " + cosine);

		Random rnd = new Random();
		int randomNumber = 1 + rnd.nextInt(100);
		System.out.println("random[1..99] = " + randomNumber);

		String url = "https://softuni.bg";
		String fileName = "content.html";
		try {
			DownloadFileFromInternet(url, fileName);
			System.out.println("Downloaded file: " + fileName);
		} catch (IOException ioex) {
			System.out.println("Error: canot download " + url);
		}
	}

	private static void DownloadFileFromInternet(String url, String fileName)
			throws IOException {
		URL urlObject = new URL(url);
		try(
				InputStream inputStream = urlObject.openStream();
				OutputStream outputStream = new FileOutputStream(fileName);
		) {
			copyStream(inputStream, outputStream);
		}
	}

	public static void copyStream(InputStream inputStream, 
			OutputStream outputStream) throws IOException {
		byte[] buf = new byte[4096]; // 4 KB buffer size
		while (true) {
			int bytesRead = inputStream.read(buf);
			if (bytesRead == -1) {
				break;
			}
			outputStream.write(buf, 0, bytesRead);
		}
	}
}
