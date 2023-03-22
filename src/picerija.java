import javax.swing.JOptionPane;

public class picerija {

	public static void main(String[] args) {
		int apt=0;
		String izvele;
		String izvelne[] = {"Apskatît çdienkarti", "Pasûtît picu", "Apturçt" };
		String piegade[] = {"Saòemt klâtienç", "Piegâdât uz mâjâm"};
		String picas[] = {"Studentu", "Pepperoni", "Havajas"};
		String piedevas[] = {"Siers", "Síiòíis", "Pepperoni", "Nav nepiecieðams"};
		String merces[] = {"Tomâtu", "Asâ", "Èili", "Nav nepiecieðams"};
		do{
		izvele = (String) JOptionPane.showInputDialog(null, "Izvçlies darbîbu", "Izvçle", JOptionPane.INFORMATION_MESSAGE, null, izvelne, izvelne[0] );
		switch (izvele) {
		case "Apskatît çdienkarti":
			JOptionPane.showMessageDialog(null, " ");
			break;
		case "Pasûtît picu":
			String nosaukums = (String) JOptionPane.showInputDialog(null, "Izvçlies picu", "Izvçle", JOptionPane.INFORMATION_MESSAGE, null, picas, picas[0]);
			String piedeva = (String) JOptionPane.showInputDialog(null, "Izvçlies picu", "Izvçle", JOptionPane.INFORMATION_MESSAGE, null, piedevas, piedevas[0]);
			break;
		case "Apturçt":
			 apt = JOptionPane.showConfirmDialog(null, "Tieðâm vçlies aizvçrt programmu?", "Aizvçrt?", JOptionPane.YES_NO_OPTION, apt);
		if (apt==JOptionPane.YES_OPTION){
			JOptionPane.showMessageDialog(null, "Programma apturçta!", "Informâcija",JOptionPane.INFORMATION_MESSAGE);
			System.exit(0);
			break;
		}
	
		default:
			break;
			}
		}while(!izvele.equalsIgnoreCase(""));
		
	}

}
