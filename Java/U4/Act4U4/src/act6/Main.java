package act6;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Serie s[] = new Serie[5];
		Videojuego v[] = new Videojuego[5];
		
		s[0] = new Serie("Como conoci a vuestra madre", "Morato", 5, "Comedia");
		s[1] = new Serie("Friends", "Wenfi", 11, "SitCom");
		s[2] = new Serie("La vida de un calvo", "Victor", 3, "Drama");
		s[3] = new Serie("Las crypto", "Morato", 4, "Amor");
		s[4] = new Serie("Prison Break", "Jose", 5, "Accion");
		
		 
		v[0] = new Videojuego("Metal Gear Solid 1", "Acción", "Konami", 12, true);
		v[1] = new Videojuego("League of Legens", "MOBA", "Riot Games", 50, false);
		v[2] = new Videojuego("Bloodborne", "Fantasia", "From Software", 40, false);
		v[3] = new Videojuego("Far Cry 3", "Accion", "Ubisoft", 30, true);
		v[4] = new Videojuego("DOOM Eternal", "Disparos", "Id Software", 25, false);
		
		s[1].entregar();
		s[4].entregar();
		v[0].entregar();
		v[3].entregar();
		
		int cant = 0;
		for(int i = 0; i < 5; i++) {
			if(s[i].isEntregado()) cant++;
			if(v[i].isEntregado()) cant++;
		}
		
		System.out.println("Series y videojuegos entregados: " + cant);
		
		
		Arrays.sort(s);
		Arrays.sort(v);
		
		System.out.println(s[s.length-1]);
		System.out.println(v[v.length-1]);
		
	}
}
