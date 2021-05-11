
public class odev2ders14 {

	public static void main(String[] args) {
		String ogrenci1 = "Ehmet";
		String ogrenci2 = "Fuad";
		String ogrenci3 = "Ramiz";
		String ogrenci4 = "Ilham";
		System.out.println(ogrenci1);
		System.out.println(ogrenci2);
		System.out.println(ogrenci3);
		System.out.println(ogrenci4);
		System.out.println("-------------------------");
		String[] ogrenciler = new String[4];
		ogrenciler[0] = "Ehmet";
		ogrenciler[1] = "Fuad";
		ogrenciler[2] = "Ramiz";
		ogrenciler[3] = "Ilham";
		for (int i = 0; i < ogrenciler.length; i++) {
			System.out.println(ogrenciler[i]);

		}
		System.out.println("-------------------------");
		for(String ogrenci:ogrenciler) {
			System.out.println(ogrenci);
		}
	}

}
