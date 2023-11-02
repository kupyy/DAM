package Actividad6;

public class ej3 {
    public static void main(String[] args){
        int contVocal = 0;
        String texto = "La lluvia en Sevilla es una maravilla";

        for(int i = 0; i < texto.length(); i++){
            if(texto.charAt(i) == 'a' || 
            texto.charAt(i) == 'e' ||
            texto.charAt(i) == 'i' || 
            texto.charAt(i) == 'o' || 
            texto.charAt(i) == 'u'){
                contVocal++;
            }
                
        }
        System.out.println(contVocal);
    }
}
