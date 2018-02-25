package Histoire;

public class MonHistoire {

	public static void main(String[] args) {
		Commercant Chloe = new Commercant(150,"Chloé");
		Yakuza Julien = new Yakuza(0,"Jus d'orange","Julien","OUI");
		Ronin Herve = new Ronin(50,"Sake","Herve");
		
		Chloe.direBonjour();
		Julien.direBonjour();
		Herve.direBonjour();
		Julien.boire();
		Herve.boire();
		Julien.extorquer(Chloe);
		Herve.donner(Chloe, 25);
		Herve.provoquer(Julien);
		
	}

}
