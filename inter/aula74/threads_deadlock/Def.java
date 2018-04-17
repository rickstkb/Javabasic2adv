package inter.aula74.threads_deadlock;

// Deadlock, supondo que existam duas threads
// A primeira quer usar o obj1, entao bloqueia o obj1 usando syncronized 
// Porem como existe o obj2 e a thread 2 quer usar o obj2 e bloqueou tbm 

// Ocorre um impasse pois t1 quer usar o obj2 e t2 o obj1
// Ambas segurando ambos objetos cria se o deadlock
// Um processo ou thread bloqueia o outro

// Para evitar o deadlock usa o wait para libear o recurso, e notify para retornar ao uso dele
public class Def {

}
