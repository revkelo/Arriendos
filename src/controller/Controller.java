package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Iterator;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

import com.aspose.words.Document;
import com.aspose.words.DocumentBuilder;

import model.ArriendosDTO;
import model.FachadaModel;
import view.FachadaView;
import view.VentanaGuardar;

public class Controller implements ActionListener {

	private FachadaView vp;
	private FachadaModel md;
	private File comprobante;
	private int precio;

	public Controller() {
		vp = new FachadaView();
		md = new FachadaModel();
		action();
		cargarCombo();

	}

	public void cargarCombo() {

		DefaultComboBoxModel<String> comboBoxModel = new DefaultComboBoxModel<>();
		for (ArriendosDTO objeto : md.getArridao().getLista()) {
			comboBoxModel.addElement(objeto.getNombre_inmueble());
		}

		vp.getVguard().getArriendosCombo().setModel(comboBoxModel);
	}

	public void action() {
		vp.getVprin().getAgregar_b().addActionListener(this);
		vp.getVprin().getModificar_b().addActionListener(this);
		vp.getVprin().getEliminar_b().addActionListener(this);
		vp.getVprin().getSalir_b().addActionListener(this);
		vp.getVguard().getComprobante().addActionListener(this);
		vp.getVguard().getGuardar().addActionListener(this);

		vp.getVguard().getPrecioText().addFocusListener(new FocusListener() {
			@Override
			public void focusGained(FocusEvent e) {

			}

			@Override
			public void focusLost(FocusEvent e) {

				try {
				
					String numeroFormateado = VentanaGuardar
							.formatearNumeroConComas(Integer.parseInt(vp.getVguard().getPrecioText().getText()));

					precio = Integer.parseInt(vp.getVguard().getPrecioText().getText());
					vp.getVguard().getPrecioText().setText(numeroFormateado);
				} catch (Exception e2) {
				System.out.println("ERROR");
				}

			}
		});

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

	@Override
	public void actionPerformed(ActionEvent e) {
		String comando = e.getActionCommand();
		// VENTANA PRINCIPAL
		if (comando.equals("Agregar")) {
			vp.getVprin().setVisible(false);
			vp.getVguard().setVisible(true);
		}

		if (comando.equals("Modificar")) {
			System.out.println(comando);

			System.out.println(md.getPagodao().getLista().size());
		}

		if (comando.equals("Eliminar")) {
			System.out.println(comando);
		}

		if (comando.equals("Salir")) {
			System.out.println(comando);
		}

		// VENTANA GUARDAR
		if (comando.equals("Comprobante")) {

			// TRUCO DE FILECHOOSER

			try {
				UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			} catch (Exception e12) {
				e12.printStackTrace();
			}

			// Crear un cuadro de diálogo de selección de archivo
			JFileChooser fileChooser = new JFileChooser();
			fileChooser.setDialogTitle("Seleccionar archivo");

			// Filtrar solo archivos PDF e imágenes
			FileNameExtensionFilter filter = new FileNameExtensionFilter("Archivos PDF e imágenes", "pdf", "jpg",
					"jpeg", "png", "gif");
			fileChooser.setFileFilter(filter);

			// Mostrar el cuadro de diálogo
			int userSelection = fileChooser.showOpenDialog(null);

			if (userSelection == JFileChooser.APPROVE_OPTION) {
				// Obtener el archivo seleccionado
				File file = fileChooser.getSelectedFile();
				comprobante = file;
				vp.getVguard().getRuta().setText(comprobante.getAbsolutePath() + " ");
				// Verificar si es un PDF o una imagen
				String extension = getFileExtension(file);

				if (extension.equals("pdf")) {
					System.out.println("Se seleccionó un archivo PDF: " + file.getAbsolutePath());
				} else {
					System.out.println("Se seleccionó una imagen: " + file.getAbsolutePath());
				}
			}
		}

		if (comando.equals("Guardar_1")) {
		
			String Nombreinmueble = vp.getVguard().getArriendosCombo().getSelectedItem().toString();
			
			String nombreCarpeta = Nombreinmueble;
	        String nombreArchivo = "Verificacion.txt";
	        String mensaje = "¡Carpeta arriendo!";
	        
	        File carpeta = new File(nombreCarpeta);
	        File archivo = new File(nombreCarpeta, nombreArchivo);
	        
	        if (carpeta.exists()) {
	       
	        } else {
	            if (carpeta.mkdir()) {
	             
	            } else {
	                System.out.println("No se pudo crear la carpeta.");
	            }
	        }
	        
	        if (archivo.exists()) {
	    
	            FileWriter writer;
				try {
					writer = new FileWriter(archivo);
		            writer.write(mensaje);
		            writer.close();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

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
	            } catch (IOException e1) {
	                System.out.println("Ocurrió un error al crear el archivo: " + e1.getMessage());
	            }
	        }
			System.out.println(carpeta.getAbsoluteFile());
			
			
			
		String DESTINATION_DIRECTORY = Nombreinmueble; // Reemplaza con la ruta deseada

			
			
             String fileName = comprobante.getName();
             File destinationFile = new File(DESTINATION_DIRECTORY, fileName);
			
             try {
                 Files.copy(comprobante.toPath(), destinationFile.toPath());
                 JOptionPane.showMessageDialog(null, "El archivo se copió correctamente.");
             } catch (IOException ex) {
                 JOptionPane.showMessageDialog(null, "Ocurrió un error al copiar el archivo: " + ex.getMessage());
             }
			
			md.getPagodao().crear(Nombreinmueble, precio, comprobante.getAbsolutePath(), "Truco");
			

			try {

			Document doc = new Document();
			DocumentBuilder builder = new DocumentBuilder(doc);

				builder.insertImage(comprobante.getAbsolutePath());
			

			doc.save(Nombreinmueble);	
			
			
			} catch (Exception e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	}

}