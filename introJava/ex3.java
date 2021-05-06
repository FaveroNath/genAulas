package lista1;
import java.util.*;

public class ex3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int s, h, m, seg;
		
		System.out.println("Digite o tempo em seg: ");
		s = in.nextInt();
		
		h = s/3600;
		m = (s%3600)/60;
		seg = (s%3600)%60;
		
		System.out.println(h + " horas " + m + " minutos " + seg + " segundos");
	}
}
