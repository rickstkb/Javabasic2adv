package inter.aula56.metabstratoscomenums;

public class Pessoa {
	
	private TipoDocumento tipoDocumento;
	private String numeroDoc;
	
	public Pessoa() {
		super();
	}

	public Pessoa(TipoDocumento tipoDocumento, String numeroDoc) {
		super();
		this.tipoDocumento = tipoDocumento;
		this.numeroDoc = numeroDoc;
	}

	public TipoDocumento getTipoDocumento() {
		return tipoDocumento;
	}
	
	public void setTipoDocumento(TipoDocumento tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}
	
	public String getNumeroDoc() {
		return numeroDoc;
	}
	
	public void setNumeroDoc(String numeroDoc) {
		this.numeroDoc = numeroDoc;
	}

	@Override
	public String toString() {
		return "Pessoa [tipoDocumento=" + tipoDocumento + ", numeroDoc=" + numeroDoc + "]";
	}
	
	
	
}
