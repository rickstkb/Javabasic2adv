package inter.aula77.stringextraindochars;

import java.util.Arrays;

public class Aula77 {

		public static void main(String[] args) {
			
			// String e array de caracteres
			String java = "Java";
			
			// Cada caracter da variavel em cada linha
			for (int i=0; i<java.length(); i++){
				System.out.println(java.charAt(i));
			}

			// Extrair caracteres da string e atribuir a um array de chars
			char[] jav = new char[3];
			// indice do caracter que quer copiar (0), caracter final (3), destino (variavel vetor), de onde e desejado iniciar no vetor destino
			java.getChars(0, 3, jav, 0);
			System.err.println(jav);
			
			//seria o mesmo que
			for (int i=0, j=0; i<3; i++, j++){
				jav[j] = java.charAt(i);
			}
			System.out.println(jav);
			
			
			// O mesmo com array de bytes
			byte[] javBytes = new byte[3];
			// muda o metodo getchars para getbytes pelo tipo de vetor
			java.getBytes(0, 3, javBytes, 0);
			// Convertendo para string e imprimindo o valor em formato ascii
			System.out.println(Arrays.toString(javBytes));
			
			// Transf string em array de chars
			char[] javaChars = java.toCharArray();
			System.out.println(javaChars);
		}
}
