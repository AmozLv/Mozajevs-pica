import javax.swing.JOptionPane;

public class picerija {

	public static void main(String[] args) {
		String izvele;
		String izvelne[] = {"Apskatît çdienkarti", "Pasûtît picu", "Apturçt" };
		String piegade[] = {"Saòemt klâtienç", "Piegâdât uz mâjâm"};
		String piedevas[] = {"Siers", "Síiòíis", "Pepperoni"};
		String merces[] = {"Tomâtu", "Íiploku", "Èili"};
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izvçlies darbîbu", "Izvçle", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskatît çdienkarti":
			
			break;
		case "Pasûtît picu":
			
			break;
		case "Apturçt": 
			
			JOptionPane.showMessageDialog(null, "Programma apturçta!", "Informâcija",JOptionPane.INFORMATION_MESSAGE); break;
		default:
			break;
			}
		}while(!izvele.equalsIgnoreCase("Apturçt"));
		System.exit(0);
	}

}
