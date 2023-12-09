public class Main {
    public static void main(String[] args) {
        CifrarioDiCesare cifrarioDiCesare = new CifrarioDiCesare();

        System.out.println(cifrarioDiCesare.criptazione("ABCX Yz"));
        System.out.println(cifrarioDiCesare.decriptazione("DEFA Bc"));
    }
}