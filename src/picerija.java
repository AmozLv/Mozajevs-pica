import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.JOptionPane;

public class picerija {
	static int Izvele(ArrayList<Object> gatPicas){
		String[] rSaraksts = new String[gatPicas.size()];
		for(int i=0; i<rSaraksts.length; i++){
			rSaraksts[i] = (((pica)gatPicas.get(i)).getNosaukums()+" "+((pica)gatPicas.get(i)).getCena());
		}
		String izveletais = (String)JOptionPane.showInputDialog(null, "Kuru izvēlēsies?", "Izvele", JOptionPane.QUESTION_MESSAGE, null, rSaraksts, rSaraksts[0]);
		return Arrays.asList(rSaraksts).indexOf(izveletais);
	}

	public static void main(String[] args) {
		ArrayList<Object> picas = new ArrayList<Object>(); 
		ArrayList<Object> gatPicas = new ArrayList<Object>(); 
		int apt=0;
		int diametri[] = {20, 30, 50};
		String picasV[] = {"Studentu", "Pepperoni", "Havajas"};
		Double cenasPicam[]= {5.99, 6.99, 7.99};
		String piedevas[] = {"Siers ", "Sķiņķis ", "Pepperoni ", "Nav nepieciešams"};
		Double cenasPiedevam[]= {1.50, 2.00, 2.25};
		String merces[] = {"Tomātu ", "Asā", "Čili", "Nav nepieciešams"};
		Double cenasMercem[]= {0.50, 0.75, 1.20};
		String izvele;
		String izvelne[] = {"Apskatīt ēdienkarti", "Pasūtīt picu", "Apturēt" };
		String piegade[] = {"Saņemt klātienē", "Piegādāt uz mājām"};
		
		gatPicas.add(new pica("Studentu", 20, "Siers", "Tomātu", 5.99));
		
		
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskatīt ēdienkarti":
			
			if(gatPicas.size()>0){
				
				String str = "Picu skaits: "+gatPicas.size()+"\n_____________\n";
				for(int i=0; i<gatPicas.size(); i++){
					str += ((pica)gatPicas.get(i)).picasInfo()+"\n_____________\n";
				}
				
				JOptionPane.showMessageDialog(null, str, "Datoru saraksts", JOptionPane.INFORMATION_MESSAGE);
			}else
				JOptionPane.showMessageDialog(null, "Nav pieejams neviens dators", "Kluda", JOptionPane.ERROR_MESSAGE);
					break;
		case "Pasūtīt picu":
			int atk=0;
			int diametrs;
			//do {
				String nosaukums = (String) JOptionPane.showInputDialog(null, "Izv�lies picu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, picasV, picasV[0]);
			//do {
				 diametrs =  Integer.parseInt(JOptionPane.showInputDialog(null, "Izv�lies picas diametru"));
			//}while(diametrs != 20|| diametrs != 30||diametrs != 50 );
			//do {
				String piedeva = (String) JOptionPane.showInputDialog(null, "Izvēlies extra piedevu", "Izvēle", JOptionPane.INFORMATION_MESSAGE, null, piedevas, piedevas[0]);
				// atk = JOptionPane.showConfirmDialog(null, "Vēlies vēl extra piedevu?", "Papildus?", JOptionPane.YES_NO_OPTION, atk);
			//} while (atk!= JOptionPane.YES_OPTION);
			//do {
				String merce = (String) JOptionPane.showInputDialog(null, "Izv�lies merci", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, merces, merces[0]);
				//atk = JOptionPane.showConfirmDialog(null, "Vēlies vēl mērci?", "Papildus?", JOptionPane.YES_NO_OPTION, atk);
			//} while (atk!= JOptionPane.YES_OPTION);
				double cena = 1.00;
			 picas.add(new pica(nosaukums, diametrs, piedeva, merce, cena));
			//atk = JOptionPane.showConfirmDialog(null, "Vēlies pasūtīt vēlvienu picu?", "Vēl?", JOptionPane.YES_NO_OPTION, atk);
			//} while (atk!= JOptionPane.YES_OPTION);
			
			String piegadePicas =(String) JOptionPane.showInputDialog(null, "Kā saņemsi?", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, piegade, piegade[0]); 
			if(piegadePicas=="Piegādāt uz mājām") {
				
			}else JOptionPane.showMessageDialog(null, "Gaidīsim Jūs picērijā pēc 1h");
			break;
		case "Apturēt":
			 apt = JOptionPane.showConfirmDialog(null, "Tiešām vēlies aizvērt programmu?", "Aizvērt?", JOptionPane.YES_NO_OPTION, apt);
		if (apt==JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Programma apturēta!", "Informācija",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			
		}
		break;
	
		default:
			break;
			}
		}while(apt!=JOptionPane.YES_OPTION);
		
	}

}
