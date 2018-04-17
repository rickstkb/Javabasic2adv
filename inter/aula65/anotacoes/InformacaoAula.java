package inter.aula65.anotacoes;

// Para definir que essa classe e uma anotacao, utiliza se a notacao @interface 

//Anotacoes sao metadados que permite embutir infos complementares no codigo fonte
//Como informacoes pro compilador, em tempo de execucao que ira tomar alguma acao com base nelas
//O codigo fonte pode tbm utilizar os metadados para compilar o fonte ou no deploy, 
//O container conseguira ler as informacoes e executar configs, (.war pacotes java web) (.jar java desktop)

//Anotacoes sao precedidas de "@", das mais comuns sao os os overrides, ferramentas de testes, etc
//Anotacoes tbm podem ser criadas 
@interface InformacaoAula {

	// Assinatura dos metodos
	String autor();
	int aulaNumero();
	
	// No caso de um valor padrao para alguma dessas anotacoes utiliza o default com string 
	String blog() default "http://eu.com";
	String site() default "http://eu.com";
}
