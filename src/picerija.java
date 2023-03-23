import javax.swing.JOptionPane;

public class picerija {

	public static void main(String[] args) {
		int apt=0;
		int diametri[] = {20, 30, 50};
		Double cenasPicam[]= {5.99, 6.99, 7.99};
		Double cenasPiedevam[]= {5.99, 6.99, 7.99};
		Double cenasMercem[]= {5.99, 6.99, 7.99};
		String izvele;
		String izvelne[] = {"Apskatīt ēdienkarti", "Pasūtīt picu", "Apturēt" };
		String piegade[] = {"Saņemt klātienē", "Piegādāt uz mājām"};
		String picas[] = {"Studentu "+cenasPicam[0], "Pepperoni "+cenasPicam[1], "Havajas "+cenasPicam[2]};
		String piedevas[] = {"Siers "+cenasPiedevam[0], "Sķiņķis "+cenasPiedevam[1], "Pepperoni "+cenasPiedevam[2], "Nav nepieciešams"};
		String merces[] = {"Tomātu "+cenasMercem[0], "Asā"+cenasMercem[1], "Čili"+cenasMercem[2], "Nav nepieciešams"};
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izvēlies darbību", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskat�t �dienkarti":
			JOptionPane.showMessageDialog(null, " ");
			break;
		case "Pasūtīt picu":
			int atk=0;
			int diametrs;
			do {
				String nosaukums = (String) JOptionPane.showInputDialog(null, "Izv�lies picu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, picas, picas[0]);
			do {
				 diametrs =  Integer.parseInt(JOptionPane.showInputDialog(null, "Izv�lies picas diametru", diametri));
			}while(diametrs != 20|| diametrs != 30||diametrs != 50 );
			do {
				String piedeva = (String) JOptionPane.showInputDialog(null, "Izvēlies extra piedevu", "Izvēle", JOptionPane.INFORMATION_MESSAGE, null, piedevas, piedevas[0]);
				 atk = JOptionPane.showConfirmDialog(null, "Vēlies vēl extra piedevu?", "Papildus?", JOptionPane.YES_NO_OPTION, atk);
			} while (atk!= JOptionPane.YES_OPTION);
			do {
				String merce = (String) JOptionPane.showInputDialog(null, "Izv�lies picu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, piedevas, piedevas[0]);
				atk = JOptionPane.showConfirmDialog(null, "Vēlies vēl extra piedevu?", "Papildus?", JOptionPane.YES_NO_OPTION, atk);
			} while (atk!= JOptionPane.YES_OPTION);
			
			
			
			} while (atk!= JOptionPane.YES_OPTION);
			
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
