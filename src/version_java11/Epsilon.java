package src.version_java11;

public class Epsilon {
    /*
    Epsilon et les garbage collectors sont tous deux des mécanismes de gestion de la mémoire dans la machine virtuelle Java (JVM).

      Cependant, la différence principale entre eux est la façon dont ils gèrent la mémoire.
     */


    /*
    Les garbage collectors:
     sont des mécanismes de gestion de la mémoire qui ont pour but de récupérer la mémoire utilisée par les objets inutilisés (les "déchets")
     et de la remettre à la disposition de la JVM pour une utilisation ultérieure. Les garbage collectors peuvent être configurés pour optimiser la performance,
     minimiser la latence ou équilibrer les deux. Les garbage collectors standard de la JVM, tels que le Garbage First (G1) et le Concurrent Mark and Sweep (CMS),
     sont conçus pour optimiser la performance et minimiser la latence en récupérant régulièrement les déchets.

     Epsilon,
     en revanche, est un garbage collector expérimental qui a été introduit dans Java 11 et qui est conçu pour minimiser l'utilisation de la mémoire
     en évitant de réaliser la collecte de déchets. Au lieu de cela, Epsilon alloue de la mémoire sans jamais la libérer,
     ce qui peut être utile dans certains cas d'utilisation spécifiques où la récupération de la mémoire n'est pas nécessaire.

     */




    /*
    En résumé, la principale différence entre Epsilon et les garbage collectors standard de la JVM est que Epsilon n'effectue pas de collecte de déchets pour
    récupérer la mémoire, alors que les garbage collectors standard de la JVM sont conçus pour optimiser la performance et minimiser la latence en récupérant
    régulièrement les déchets. La configuration d'Epsilon peut entraîner des erreurs OutOfMemoryError plus fréquentes et une consommation de mémoire plus importante,
    car la mémoire allouée n'est jamais libérée. Epsilon est donc recommandé uniquement pour des cas d'utilisation spécifiques où la récupération de mémoire n'est pas
    nécessaire et où la consommation de mémoire peut être gérée de manière appropriée.
     */



    // utilisant Epsilon :
    // java -XX:+UnlockExperimentalVMOptions -XX:+UseEpsilonGC MonProgrammeJava

    /*
    L'option "-XX:+UnlockExperimentalVMOptions" doit être utilisée pour activer l'utilisation des options expérimentales de la JVM.
    L'option "-XX:+UseEpsilonGC" doit être utilisée pour spécifier l'utilisation de Epsilon comme garbage collector.

    */


     // en utilisant le garbage collector G1 :
    // java -XX:+UseG1GC -Xmx4g MonProgrammeJava

    /*
    Dans cette commande, l'option "-XX:+UseG1GC" est utilisée pour spécifier l'utilisation de G1 comme garbage collector,
    tandis que l'option "-Xmx4g" est utilisée pour spécifier la taille maximale de mémoire allouée à la JVM. La valeur "4g" spécifie une taille maximale
     */



}
