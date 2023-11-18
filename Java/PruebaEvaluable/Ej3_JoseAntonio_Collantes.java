import java.util.Scanner;
public class Ej3_JoseAntonio_Collantes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//obtención de datos del usuario
		System.out.println("Introduce tu primer apellido");
		String apell = sc.nextLine();
		System.out.println("Introduce tu dni");
		String dni = sc.nextLine();
		
		//declaracion de la variable que contendrá el usuario resultante
		String usuario = "";
		
		//se recorre el apellido para sustituir las tildes e introducirlas en la variable usuario
		for(int i = 0; i<apell.length();i++) {
			//switch para sustituir las tildes
			switch(apell.charAt(i)){
				case 'á':
					usuario+='a';
					break;
				case 'é':
					usuario+='e';
					break;
				case 'í':
					usuario+='i';
					break;
				case 'ó':
					usuario+='o';
					break;
				case 'ú':
					usuario+='u';
					break;
				default:
					usuario+=apell.charAt(i);
					break;
			}
		}
		
		//se concatenan los 4 últimos números del dni a la variable usuario
		usuario+=dni.substring(4,8);
		
		System.out.println("Su usuario es " + usuario);
	}

}
