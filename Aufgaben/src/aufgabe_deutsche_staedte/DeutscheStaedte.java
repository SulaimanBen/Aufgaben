package aufgabe_deutsche_staedte;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UncheckedIOException;
import java.net.MalformedURLException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

public class DeutscheStaedte {

	public static void main(String[] args) throws IOException {
		
		
		String url = "https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
		
		Document doc = null;
		try {
			doc = Jsoup.connect(url).get();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Elements tabelleElements = doc.getElementsByTag("td");
		
		
		System.out.println(tabelleElements);
		System.out.println("*****************");
		

		
//		java.net.URL url2 = new java.net.URL( url );   
//		InputStream is = url2.openStream();   
//		Reader r = new InputStreamReader(is);  
//		StringBuilder sb;
//		try(BufferedReader in = new BufferedReader( r )) {
//			
//			sb = new StringBuilder();
//			String line;
//			while( (line = in.readLine()) != null ) {
//				sb.append(line).append("\n");
//			}
//			
//		} catch (IOException e) {
//			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
//		}
//		
//		System.out.println(sb);
	}

}
