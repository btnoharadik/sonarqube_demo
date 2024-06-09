package com.example.demo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

		try {
			File file = new File("file.txt");
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}

		try {
			File file = new File("file.txt");
			Scanner scanner = new Scanner(file);

			while (scanner.hasNextLine()) {
				String line = scanner.nextLine();
				System.out.println(line);
			}

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

}
