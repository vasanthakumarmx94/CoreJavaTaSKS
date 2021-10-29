package Session;

import java.io.*;

public class DisplyLineworlds14 {

	public static void main(String[] args) throws IOException {

		File file = new File("Resource/outfile.txt");
		FileOutputStream fileOutputStream = null;
		BufferedOutputStream bufferedOutputStream = null;
		File rfile = new File("Resource/readme.txt");
		FileInputStream fileInputStream = null;
		BufferedInputStream bufferedInputStream = null;

		try {
			fileOutputStream = new FileOutputStream(file);
			bufferedOutputStream = new BufferedOutputStream(fileOutputStream);

			fileInputStream = new FileInputStream(rfile);
			bufferedInputStream = new BufferedInputStream(fileInputStream);
			// Create buffer
			byte[] buffer = new byte[1024];
			int bytesRead = 0;
			while ((bytesRead = bufferedInputStream.read(buffer)) != -1) {
				bufferedOutputStream.write(new String(buffer, 0, bytesRead).getBytes());
			}

			bufferedOutputStream.flush();

			File filec = new File("Resource/outfile.txt");
			FileInputStream fileInputStream1 = new FileInputStream(filec);
			InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream1);
			@SuppressWarnings("resource")
			BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
			String line;
			int wordCount = 0;
			int counter = 0;
			while ((line = bufferedReader.readLine()) != null) {

				String words[] = line.split("\\s+");
				wordCount += words.length;
				counter++;
			}

			System.out.println("Total word count = " + wordCount);
			System.out.println("Total number of lines = " + counter);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (fileOutputStream != null) {
					fileOutputStream.close();
				}
				if (bufferedOutputStream != null) {
					bufferedOutputStream.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}
}
