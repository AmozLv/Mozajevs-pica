import javax.swing.JOptionPane;

public class picerija {

	public static void main(String[] args) {
		int apt=0;
		String izvele;
		String izvelne[] = {"Apskat�t �dienkarti", "Pas�t�t picu", "Aptur�t" };
		String piegade[] = {"Sa�emt kl�tien�", "Pieg�d�t uz m�j�m"};
		String picas[] = {"Studentu", "Pepperoni", "Havajas"};
		String piedevas[] = {"Siers", "S�i��is", "Pepperoni", "Nav nepiecie�ams"};
		String merces[] = {"Tom�tu", "As�", "�ili", "Nav nepiecie�ams"};
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izv�lies darb�bu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskat�t �dienkarti":
			JOptionPane.showMessageDialog(null, " ");
			break;
		case "Pas�t�t picu":
			String nosaukums = (String) JOptionPane.showInputDialog(null, "Izv�lies picu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, picas, picas[0]);
			String piedeva = (String) JOptionPane.showInputDialog(null, "Izv�lies picu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, piedevas, piedevas[0]);
			break;
		case "Aptur�t":
			 apt = JOptionPane.showConfirmDialog(null, "Tie��m v�lies aizv�rt programmu?", "Aizv�rt?", JOptionPane.YES_NO_OPTION, apt);
		if (apt==JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Programma aptur�ta!", "Inform�cija",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		}
	
		default:
			break;
			}
		}while(!izvele.equalsIgnoreCase(""));
		
	}

}
