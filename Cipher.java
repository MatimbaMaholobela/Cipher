import java.lang.Math;
class Cipher{

	static String [] alpha  = "A, B, C, D, E, F, G, H, I, K, L, M, N, O, P, Q, R, S, T, V, X, Y, Z".toLowerCase().split(",");

	public static void main(String args []){
		System.out.println(decipher("DWWDFN CHUJ DW GDZQ",3));
	}

	public static String  decipher(String msg, int k){

		String toReturn = "";

		for(int i=0;i<msg.length();i++){

			if(msg.charAt(i)==(' ')){
				toReturn += " ";
			}
			else{

				int d = msg.charAt(i) -k;

				if(d<0){  toReturn += alpha[alpha.length-1-Math.abs(d)];
				}

				else { toReturn += alpha[d];
	
				}

			}

	
		}

		return toReturn;


	}

}