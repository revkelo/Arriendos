package controller;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class CrearCarpeta {

	public static void main(String[] args) throws IOException {

		// CREAR CARPETA
		String nombreCarpeta = "Arriendo local 1 cumaral";
        String nombreArchivo = "Verificacion.txt";
        String mensaje = "¡Carpeta arriendo!";
        
        File carpeta = new File(nombreCarpeta);
        File archivo = new File(nombreCarpeta, nombreArchivo);
        
        if (carpeta.exists()) {
            System.out.println("La carpeta ya existe.");
        } else {
            if (carpeta.mkdir()) {
                System.out.println("La carpeta ha sido creada.");
            } else {
                System.out.println("No se pudo crear la carpeta.");
            }
        }
        
        if (archivo.exists()) {
            System.out.println("El archivo ya existe.");
            FileWriter writer = new FileWriter(archivo);
            writer.write(mensaje);
            writer.close();
        } else {
            try {
                if (archivo.createNewFile()) {
                    System.out.println("El archivo ha sido creado.");
                    
                    FileWriter writer = new FileWriter(archivo);
                    writer.write(mensaje);
                    writer.close();
                    System.out.println("Se ha escrito el mensaje en el archivo.");
               
                    
                    
                } else {
                    System.out.println("No se pudo crear el archivo.");
                }
            } catch (IOException e) {
                System.out.println("Ocurrió un error al crear el archivo: " + e.getMessage());
            }
        }
		System.out.println(carpeta.getAbsoluteFile());
		// TRUCO DE FILECHOOSER

		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Crear un cuadro de diálogo de selección de archivo
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setDialogTitle("Seleccionar archivo");

		// Filtrar solo archivos PDF e imágenes
		FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF e imágenes", "pdf", "jpg", "jpeg",
				"png", "gif");
		fileChooser.setFileFilter(filter);

		// Mostrar el cuadro de diálogo
		int userSelection = fileChooser.showOpenDialog(null);

		if (userSelection == JFileChooser.APPROVE_OPTION) {
			// Obtener el archivo seleccionado
			File file = fileChooser.getSelectedFile();

			// Verificar si es un PDF o una imagen
			String extension = getFileExtension(file);

			if (extension.equals("pdf")) {
				System.out.println("Se seleccionó un archivo PDF: " + file.getAbsolutePath());
			} else {
				System.out.println("Se seleccionó una imagen: " + file.getAbsolutePath());
			}
		}
	}

	private static String getFileExtension(File file) {
		String extension = "";
		String fileName = file.getName();
		int dotIndex = fileName.lastIndexOf('.');
		if (dotIndex > 0 && dotIndex < fileName.length() - 1) {
			extension = fileName.substring(dotIndex + 1).toLowerCase();
		}
		return extension;
	}
}
