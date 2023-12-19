package qualidadeAr;

public enum ClassificacaoQualidadeAr {

	    BOA("Boa"),
	    REGULAR("Regular"),
	    INADEQUADA("Inadequada"),
	    MA("Má"),
	    PESSIMA("Péssima"),
	    CRITICA("Crítica");

	    private String descricao;

	    private ClassificacaoQualidadeAr(String descricao) {
	        this.descricao = descricao;
	    }

	    public String getDescricao() {
	        return descricao;
	    }
	
}
