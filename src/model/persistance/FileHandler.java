/**
 * Paquete que pertenece al modelo que se encarga de que el objeto persista 
 */
package model.persistance;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Properties;
import java.util.Scanner;

/**
 * Clase FileHandler del proyecto.
 *
 * @author Daniela
 * @author Jose
 * @author Kevin
 * @author Nicolas
 */

public class FileHandler {

	/**
	 * Atributo tipo File file.
	 */
	private static File file;
	/**
	 * Atributo tipo Scanner reader.
	 */
	private static Scanner reader;
	/**
	 * Atributo tipo PrintWriter writer.
	 */
	private static PrintWriter writer;
	/**
	 * Atributo tipo Properties prop.
	 */
	private static Properties prop;

	/**
	 * Metodo tipo String encargado de cargar el archivo
	 * 
	 * @param filename variable tipo String
	 * @return content
	 */
	public static String loadFile(String filename) {
		file = new File("src/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can�t create new file");
				System.out.println(e.getMessage());
			}
		}
		String content = "";
		try {
			reader = new Scanner(file);
			while (reader.hasNext()) {
				content += reader.nextLine() + "\n";
			}
		} catch (FileNotFoundException e) {
			System.out.println("file don�t exists");
			e.printStackTrace();
		}
		reader.close();
		return content;

	}


	public static void writeFile(String filename, String content) {
		file = new File("src/model/persistance/" + filename);
		if (!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				System.out.println("can�t create new file");
				System.out.println(e.getMessage());
			}
		}
		try {
			writer = new PrintWriter(file);
			writer.print(content);
		} catch (FileNotFoundException e) {
			System.out.println("file don�t exists");
			e.printStackTrace();
		}
		writer.close();
	}




}
