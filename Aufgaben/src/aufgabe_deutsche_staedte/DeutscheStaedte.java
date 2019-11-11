package aufgabe_deutsche_staedte;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class DeutscheStaedte {

	static String url = "https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
	public static void main(String[] args) {
	
		 // Frame window
        JFrame.setDefaultLookAndFeelDecorated(true);
        JFrame frame = new JFrame("Aufgabe Deutsche Staedte");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
        // 2 Buttons 
        JButton b1 = new JButton("Laden");      
        JButton b2 = new JButton("Parsen");          
         
        // panel to hold the buttons 
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());
        panel.add(b1 , BorderLayout.NORTH);
        panel.add(b2 , BorderLayout.SOUTH);
         
        frame.add(panel);
        frame.setSize(200, 200);
        frame.setVisible(true);  
        
        b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					a12(url);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
        
        b2.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					a34(url);
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		
        
		
	}
	private static void a34(String urlAsString) throws IOException  {
		
		Document doc = Jsoup.connect(urlAsString).get();
		Element table = doc.select("table").get(0);
        Elements row = table.select("td:eq(16)");
        
        List<Bundesland> bundislandList = new ArrayList<>();
        for (Element e : row){
        	String subText = e.text().substring(0, e.text().indexOf(" "));
            bundislandList.add(new Bundesland(subText));
        }
        

        row = table.select("td:eq(1)");
        List<Stadt> stadtList = new ArrayList<>();
        for (Element e : row){
            stadtList.add(new Stadt(e.text()));
        }

        
        List<String> einwohnerZahl2018 = new ArrayList<>();
        row = table.select("td:eq(11)");
        for (Element e : row) {
			einwohnerZahl2018.add(e.text());
	   }
        
        String fmt = "|%-25s   | %-20s   | %-15s   |\n";
        
        System.out.printf(fmt,"Stadt Name","BundesLand","Einwohnerzahl");
        System.out.println("-----------------------------------------------------------------------------");
  
        for (int i = 0 ; i < bundislandList.size() ; i++ )  {
			
        	System.out.printf(fmt , stadtList.get(i) , bundislandList.get(i) , einwohnerZahl2018.get(i));
		}
        
  }
	
	private static void a12(String urlAsString) throws IOException {
		
		java.net.URL url2 = new java.net.URL( url);   
		InputStream is = url2.openStream();   
		Reader r = new InputStreamReader(is);   
		try(BufferedReader in = new BufferedReader( r )) {
			
			StringBuilder sb = new StringBuilder();
			String line;
			while( (line = in.readLine()) != null ) {
				sb.append(line).append("\n");
			}
			System.out.println(sb.toString());
			
		} catch (IOException e) {
			throw new UncheckedIOException("Kann die Quelle nicht lesen", e);
		}
		
		
	}
	
}








