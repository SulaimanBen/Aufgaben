package aufgabe_deutsche_staedte;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.io.IOException;
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
		
//		try {
//			a34();
//		} catch (IOException e) {
//			System.out.println("Fehler ! ");
//		}
//	
		
	}
	public static void a34() throws IOException  {
		
		
		String url = "https://de.wikipedia.org/wiki/Liste_der_Gro%C3%9Fst%C3%A4dte_in_Deutschland";
		
		Document doc = Jsoup.connect(url).get();
        Elements trow = doc.select("table td:eq(16)");
        
        List<Bundesland> bundislandList = new ArrayList<>();
        for (Element e : trow){
        	String subText = e.text().substring(0, e.text().indexOf(" "));
            bundislandList.add(new Bundesland(subText));
        }
        

        trow = doc.select("table td:eq(1)");
        List<Stadt> stadtList = new ArrayList<>();
        for (Element e : trow){
            stadtList.add(new Stadt(e.text()));
        }

        
        List<String> einwohnerZahl2018 = new ArrayList<>();
        trow = doc.select("table td:eq(11)");
        for (Element e : trow) {
			einwohnerZahl2018.add(e.text());
	   }
        
        String fmt = "|%-20s   | %-20s   | %-15s   |\n";
        
        System.out.printf(fmt,"Stadt Name","BundesLand","Einwohnerzahl");
        System.out.println("-----------------------------------------------------------------------------");
  
        for (int i = 0 ; i < bundislandList.size() ; i++ )  {
			
        	System.out.printf(fmt , stadtList.get(i) , bundislandList.get(i) , einwohnerZahl2018.get(i));
		}
        
  }
	
}








