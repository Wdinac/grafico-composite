public class ProjetoGraficoComposite {
    public static void main(String[] args) {
        // Crio as folhas
        Grafico circulo = new Circulo();
        Grafico retangulo = new Retangulo();
        
        // Cria a compsição e adiciona as folhas nela
        CompositeGrafico composite = new CompositeGrafico();
        composite.adicionar(circulo);
        composite.adicionar(retangulo);
        
        // Uma composição dentro de outra (hierarquia)
        // Cria uma composição superior
        CompositeGrafico encadeado = new CompositeGrafico();
        // Adiciona outra composição nela
        encadeado.adicionar(composite);
        // Adiciona uma folha nela
        encadeado.adicionar(new Circulo());
        
        encadeado.desenhar();
    }
}
