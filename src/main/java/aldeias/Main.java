package aldeias;

public class Main {
    public static void main(String[] args) {
        String[] tabas = {"T1", "T2", "T3", "T4", "T5"};
        Grafo possiveisImpactosAmbientais = new Grafo(tabas);

        possiveisImpactosAmbientais.adicionarAresta("T1", "T2", 15.0);
        possiveisImpactosAmbientais.adicionarAresta("T1", "T3", 12.0);
        possiveisImpactosAmbientais.adicionarAresta("T2", "T3", 6.0);
        possiveisImpactosAmbientais.adicionarAresta("T2", "T4", 13.0);
        possiveisImpactosAmbientais.adicionarAresta("T2", "T5", 5.0);
        possiveisImpactosAmbientais.adicionarAresta("T3", "T4", 6.0);

        System.out.println("Melhor escolha:");
        possiveisImpactosAmbientais
                .arvoreGeradoraMinima()
                .getSpanningTree()
                .forEach(System.out::println);
    }
}