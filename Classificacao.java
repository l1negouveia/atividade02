package qualidadeAr;

public class Classificacao implements QualidadeAr {

	private double indice;
	private ClassificacaoQualidadeAr classificacao;
	
	public Classificacao(double indice) {
		this.indice = indice;
		
	}
	
	@Override
	public void classificacao(double indice, ClassificacaoQualidadeAr classificacao) {

	}
			@Override
	public void efeitos(double indice2, String efeitos) {
		// TODO Auto-generated method stub
		
	}
			
	public double getIndice() {
		return indice;
	}

	public void setIndice(double indice) {
		this.indice = indice;
	}

	public ClassificacaoQualidadeAr getClassificacao() {
		return classificacao;
	}

	public void classificacao() {
		
		if(this.indice <=50) {
			this.classificacao = ClassificacaoQualidadeAr.BOA;
		}else if(this.indice <=100) {
			this.classificacao = ClassificacaoQualidadeAr.REGULAR;
		}else if(this.indice <=199) {
			this.classificacao = ClassificacaoQualidadeAr.INADEQUADA;
		}else if(this.indice <=299) {
			this.classificacao = ClassificacaoQualidadeAr.MA;
		}else if(this.indice <=399) {
			this.classificacao = ClassificacaoQualidadeAr.PESSIMA;
		}else {
			this.classificacao =ClassificacaoQualidadeAr.CRITICA;
		}
	
		
		
	}


	
}
