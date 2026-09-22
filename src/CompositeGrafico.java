import java.util.ArrayList;
import java.util.List;

public class CompositeGrafico implements Grafico {
    // Princípio de Substituição de Liskov
    // Código que depende apenas de List poderá trabalhar
    // com qualquer subtipo dela - respeitando o princípio L do SOLID.
    private List<Grafico> filhos = new ArrayList<>();
    
    public void adicionar(Grafico grafico) {
        filhos.add(grafico);
    }
    
    public void remover(Grafico grafico) {
        filhos.remove(grafico);
    }
    
    @Override
    public void desenhar() {
        for (Grafico filho : filhos) {
            filho.desenhar();
        }
    }
}