package inter.aula72.threads_notify_wait_all;

// Cenario para os tres metodos
// Existe uma thread que esta executando um met sincronizado, 
// Dentro desse metodo existe um recurso, que esta indisponivel
// Se a thread fica esperando pelo recurso ela vai bloquear o obj impedindo que outras threads acessem o mesmo
// E isso pode causar deadlock 

// Nesse caso a melhor alternativa e liberar temporariamente o objeto permitindo que as demais t's sejam executadas
// E quando tivermos o obj recurso que precisa, retorna e resume a exec da tarefa que esta fazendo

// Ex: Duas pessoas querendo usar uma caneta, a primeira usa a caneta, entra em espera e passa a caneta
// A seg pessoa usa, e quando termina volta para primeira pessoa informando que o uso da caneta esta livre

// Para o revezamento entre o objeto utilizam-se tres metodos wait(bloqueia a exec da thread temp colocando em espera)
// A thread entra em modo de espera ate que seja notificada, e pra fazer a notificacao existem os metodos (notify para retornar a exec)
// Caso exista mais de uma thread usa o metodo notifyAll notificando todas as threads que o objeto esta disponivel novamente
// A thread que tiver prioridade mais alta ganha acesso ao obj
public class Definicoes {

}
