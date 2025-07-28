package javaNinja;
// treinando conceitos de Herança
public class Main {
    public static void main(String[] args) {
        Uzumaki naruto = new Uzumaki();
        naruto.nome = "Naruto Uzumaki";
        naruto.aldeia = "Aldeia da folha";
        naruto.idade = 17;
        naruto.modoSeninAtivado();
        naruto.lancarKunai();

        Uchiha sasuke = new Uchiha();
        sasuke.nome = "Sasuke Uchiha";
        sasuke.aldeia = "Aldeia da folha";
        sasuke.idade = 18;
        sasuke.sharinganAtivado();
        sasuke.lancarKunai();
    }
}
