
class Cipher{

	static String[] alpha  = "A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, V, X, Y, Z".split(",");
	static int M = alpha.length;

	public static void main(String args []){
		System.out.println(cipher("Attack zerg at dawn",3));
	}

	public static String cipher(String text, int k){

		String msg = text.toLowerCase();

		String toReturn = "";

		for(int i=0;i<msg.length();i++){
			
			for(int j=0;j<M;j++){
			
				if(msg.charAt(i)==(' ')){
					toReturn += " ";
				}
				else if(msg.substring(i,i+1)==alpha[j].toLowerCase()) {
				
					toReturn+=alpha[(j+k)%M];
				}
			}

	
		}

		return toReturn;


	}

}
