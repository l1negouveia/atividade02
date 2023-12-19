package qualidadeAr;

public class Efeitos implements QualidadeAr {

	private double indice;
	private String efeitos;

	public Efeitos (double indice) {
		this.indice = indice;
		
		  
	}

	@Override
	public void classificacao(double indice, ClassificacaoQualidadeAr classificacao) {
		
	}

	@Override
	public void efeitos(double indice, String efeitos) {
		
	}

	public double getIndice() {
		return indice;
	}

	public void setIndice2(double indice) {
		this.indice = indice;
	}

	public String getEfeitos() {
		return efeitos;
	}
	
	public void efeitos() {
		
		if(this.indice <=100) {
			this.efeitos = "Ausência de sintomas.";
		}else if(this.indice <=199) {
			this.efeitos = "Leve agravamento dos sintomas de pessoas suscetiveis";
		}else if(this.indice <=299) {
			this.efeitos = "Decréscimo da resistencia física e significativo agravamento";
		}else if(this.indice <=399) {
			this.efeitos = "Aparecimento prematuro de certas doenças";
		}else {
			this.efeitos = "Morte prematura de pessoas doentes e pessoas idosas";
		}
	}
}



