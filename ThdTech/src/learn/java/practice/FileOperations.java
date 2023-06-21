package learn.java.practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class FileOperations {

	public static void main(String[] args) throws IOException {
		try (BufferedReader br = new BufferedReader(
				new InputStreamReader(new FileInputStream(new File("D:\\credentials.txt"))))) {

			String line;

			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (Exception e) {
		}

	}
}
