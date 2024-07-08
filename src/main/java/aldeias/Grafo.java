package aldeias;

import org.jgrapht.Graph;
import org.jgrapht.alg.spanning.KruskalMinimumSpanningTree;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleWeightedGraph;

import java.util.Arrays;

public class Grafo {
    Graph<String, DefaultWeightedEdge> grafo;

    public Grafo(String[] vertices) {
        grafo = new SimpleWeightedGraph<>(DefaultWeightedEdge.class);
        Arrays.stream(vertices).forEach(vertice -> grafo.addVertex(vertice));
    }

    public void adicionarAresta(String vertice1, String vertice2, Double peso){
        grafo.setEdgeWeight(grafo.addEdge(vertice1, vertice2), peso);
    }

    public KruskalMinimumSpanningTree<String, DefaultWeightedEdge> arvoreGeradoraMinima(){
        return new KruskalMinimumSpanningTree<>(this.grafo);
    }
}
