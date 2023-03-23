
public class pica extends picerija{
//Atributi
	private int diametrs;
	private String nosaukums;
	private String piedeva;
	private String merce;
	
//konstruktor
	 pica(String nosaukums, int diametrs, String piedeva, String merce) {
		nosaukums = this.nosaukums;
		diametrs = this.diametrs;
		piedeva = this.piedeva;
		merce = this.merce;
	}
//metod
	 public int getDiametrs() {
		 return diametrs;
	 }
	 public String getNosaukums() {
		 return nosaukums;
	 }
	public String getPiedeva() {
		 return piedeva;
	 }
	public String getMerce() {
		 return merce;
	 }
}
