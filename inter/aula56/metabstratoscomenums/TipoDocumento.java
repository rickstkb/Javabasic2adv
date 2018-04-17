package inter.aula56.metabstratoscomenums;

public enum TipoDocumento {

	CPF {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cpf();
		}
	}, 
	
	CNPJ {
		@Override
		public String geraNumeroTeste() {
			return GeraCpfCnpj.cnpj();
		}
	};
	
	// Declarando um metodo para gerar um numero teste vindo da classe geracpfcnpj
	public abstract String geraNumeroTeste();
	
	
}
