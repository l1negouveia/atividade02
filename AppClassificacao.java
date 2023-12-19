package qualidadeAr;

public class AppClassificacao {

	public static void main(String[] args) {
		
		Classificacao tabela01 = new Classificacao(400);
		System.out.println("Indice:  " + tabela01.getIndice());
		tabela01.classificacao();
		System.out.println("Classificação:  " + tabela01.getClassificacao());
		
		
		Efeitos tabela02 = new Efeitos(400);
		System.out.println("Indice:  " + tabela02.getIndice());
		tabela02.efeitos();
		System.out.println("Efeitos:  " + tabela02.getEfeitos());
		
	}

}
