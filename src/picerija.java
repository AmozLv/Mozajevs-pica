import javax.swing.JOptionPane;

public class picerija {

	public static void main(String[] args) {
		String izvele;
		String izvelne[] = {"Apskat�t �dienkarti", "Pas�t�t picu", "Aptur�t" };
		String piegade[] = {"Sa�emt kl�tien�", "Pieg�d�t uz m�j�m"};
		String piedevas[] = {"Siers", "S�i��is", "Pepperoni"};
		String merces[] = {"Tom�tu", "�iploku", "�ili"};
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izv�lies darb�bu", "Izv�le", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskat�t �dienkarti":
			
			break;
		case "Pas�t�t picu":
			
			break;
		case "Aptur�t": 
			
			JOptionPane.showMessageDialog(null, "Programma aptur�ta!", "Inform�cija",JOptionPane.INFORMATION_MESSAGE); break;
		default:
			break;
			}
		}while(!izvele.equalsIgnoreCase("Aptur�t"));
		System.exit(0);
	}

}
