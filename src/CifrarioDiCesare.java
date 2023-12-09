
public class CifrarioDiCesare {
    private int rotazione = 3;

    private char[] alfabeto;

    public CifrarioDiCesare() {
        alfabeto = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
    }

    public String criptazione(String str){
        String criptato = "";
        for(int i = 0; i < str.length(); i++){
            criptato += getCharCifrato(str.charAt(i), rotazione, true);
        }

        return criptato;
    }

    public String decriptazione(String str){
        String decriptato = "";
        for(int i = 0; i < str.length(); i++){
            decriptato += getCharCifrato(str.charAt(i), rotazione, false);
        }

        return decriptato;
    }

    private char getCharCifrato(char carattere, int rotazione, boolean isCriptazione){
        int i = 0;
        for(char ch : alfabeto){
            if(ch == carattere){
                if(isCriptazione){
                    try {
                        return alfabeto[i + rotazione];
                    }catch (IndexOutOfBoundsException e) {
                        return alfabeto[i + rotazione - alfabeto.length];
                    }
                }else{
                    try {
                        return alfabeto[i - rotazione];
                    }catch (IndexOutOfBoundsException e) {
                        return alfabeto[i - rotazione + alfabeto.length];
                    }
                }
            }
            char lowerCase = Character.toLowerCase(carattere);
            if (ch == lowerCase) {
                if(isCriptazione){
                    try {
                        return Character.toUpperCase(alfabeto[i + rotazione]);
                    }catch (IndexOutOfBoundsException e) {
                        return Character.toUpperCase(alfabeto[i + rotazione - alfabeto.length]);
                    }
                }else{
                    try {
                        return Character.toUpperCase(alfabeto[i - rotazione]);
                    }catch (IndexOutOfBoundsException e) {
                        return Character.toUpperCase(alfabeto[i - rotazione + alfabeto.length]);
                    }
                }
            }
            i++;
        }
        return ' ';
    }
}
