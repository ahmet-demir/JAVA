package sezarAlgoritması;
// girilen metinin harflerini alfabede belirli miktar kaydırarak yapılır.
public class Main {

	public static void main(String[] args) {
		String text ="sezar şifreleme";
		String cikan="";
		int kaydırmaSayısı = 1 ;
		String alfabe="abcçdefgğhıijklmnoöprsştuüvyzxw";  // 31 hafr var,
		String karisik="";
	
		for(int i=kaydırmaSayısı;i<kaydırmaSayısı+31;i++) {
			karisik += alfabe.charAt(i%31);
			}
		for(int i=0;i<text.length();i++) {
			for(int j=0;j<alfabe.length();j++) {
				if(text.charAt(i)==' ') {
					cikan += ' ';                  // kelimeleri takip etme amacıyla boşluk ekledim.
					break;							// kırılmasını kolaylaştırır 
				}									// günümüzde geçerli bir şifreleme değildir. kolaylıkla kırılır.
				if(text.charAt(i)==alfabe.charAt(j)) {
					cikan += karisik.charAt(j);
				}
				
			}
		}
		System.out.println(karisik);
		System.out.println(text);
		System.out.println(cikan);
		
	}

}
