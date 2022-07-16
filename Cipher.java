
class Cipher{

	static String[] alpha  = "A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z".split(", ");
	static int M = alpha.length;

	public static String cipher(String text, int k){

		String msg = text.toLowerCase();

		String toReturn = "";

		for(int i=0;i<msg.length();i++){
			
			for(int j=0;j<M;j++){
			
				if(msg.substring(i,i+1).equals(" ")){
					toReturn += " ";
					break;
				}
				else if(msg.substring(i,i+1).equals(alpha[j].toLowerCase())) {
				
					toReturn+=alpha[(j+k)%M]; //(j+k)%M ensures that when J+k > M it resets

				}
			}
		}

		return toReturn;
	}
	
	public static String decipher(String text, int k){

		String msg = text.toLowerCase();

		String toReturn = "";

		for(int i=0;i<msg.length();i++){
			
			for(int j=0;j<M;j++){
			
				if(msg.substring(i,i+1).equals(" ")){
					toReturn += " ";
					break;
				}
				else if(msg.substring(i,i+1).equals(alpha[j].toLowerCase())) {

					if(j-k <=0) { toReturn+=alpha[(M+(j-k))%M]; }
				
					else{ toReturn+=alpha[Math.abs((j-k)%M)];}//(j+k)%M ensures that when J+k > M it resets

				}
			}
		}

		return toReturn.toLowerCase();
	}
}
