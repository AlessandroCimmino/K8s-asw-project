# K8s-asw-project

Progetto valido per il corso di Architetture dei Sistemi Software, anno accademico 2017/2018.
Tipologia progetto: definizione e sperimentazione di ambienti virtuali per Kubernetes

# Team: 

Luigi Bevilacqua, Eleonora Bartolomucci, Alessandro Cimmino

# Specifiche:
Il software è scritto in Java e costruito con Gradle;
Ciascun ambiente di esecuzione distribuito è composto da una macchina virtuale creata con VirtualBox.
L'ambiente di esecuzione è basato su contenitori Docker

# Utilizzo:

All'interno della cartella k8s-asw-project è presente uno script go.sh il quale gestirà l'inizializzazione dell'ambiente, la compilazione dei microservizi, la creazione dei contenitori necessari per l'esecuzione dei micro servizi e la gestione dei pod di kubernetes. 

-> sh go.sh

Alternativamente è possibile lanciare ogni singolo comando presente nello script go.sh

# Sviluppo

L'applicazione implementata è scritta in java e prevede una comunicazione tra due micro servizi in cui viene stampata a schermo una stringa.

I micro servizi sono compilati con gradle.

Si è utilizzato minikube creando un cluster con un singolo nodo e un pod (che ospiterà un'istanza dell'applicazione) con due contenitori, i quali condividono lo stesso dominio.  

Inoltre è stato creato un deployment necessario per esporre il servizio, che è stato autoscalato fino ad un massimo di 3 repliche.

# Goditi la birra!!

