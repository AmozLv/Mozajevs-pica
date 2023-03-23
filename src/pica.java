
public class pica extends picerija{
//Atributi
	private int diametrs;
	private String nosaukums;
	private String piedeva;
	private String merce;
	private double cena;
	
//konstruktor
	 pica(String nosaukums, int diametrs, String piedeva, String merce, double cena) {
		nosaukums = this.nosaukums;
		diametrs = this.diametrs;
		piedeva = this.piedeva;
		merce = this.merce;
		cena = this.cena;
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
	public double getCena() {
		return cena;
	}
	public String picasInfo() {
		return "Nosaukums: "+nosaukums+"\nDiametrs: "+diametrs+
				" \nPiedeva: "+piedeva+"\n Merce: "+merce;
	}
}
