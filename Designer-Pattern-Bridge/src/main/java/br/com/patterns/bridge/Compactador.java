package br.com.patterns.bridge;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;


/**Objetivo da classe em compactar qualquer tipo de arquivo.
 * 
 * @author Danilo Silva
 *
 */
public class Compactador implements PosProcessador {

	public byte[] processar(byte[] bytes) {
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream();
		ZipOutputStream out = new ZipOutputStream(byteOut);
		try {
			out.putNextEntry(new ZipEntry("internal"));
			out.write(bytes);
			out.closeEntry();
			out.close();
		} catch (IOException e) {
			System.out.println("Erro ao gerar arquivo zipado");
			e.printStackTrace();
		}
		return byteOut.toByteArray();
	}

}
