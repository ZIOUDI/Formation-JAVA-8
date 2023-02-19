 Java 9 est une version majeure de Java qui a été publiée en 2017. Cette version a introduit plusieurs nouvelles fonctionnalités, améliorations et changements. Voici quelques-unes des nouveautés de Java 9 avec des exemples :

    Modules Java (Jigsaw) :

Java 9 introduit un nouveau concept de modules pour améliorer la structure de projet et la sécurité de l'application. Les modules permettent de définir des groupes de packages qui peuvent être utilisés par d'autres modules. Les modules Java permettent également de définir les dépendances entre modules, ce qui facilite la gestion des bibliothèques et des dépendances. Par exemple, voici comment vous pouvez définir un module :

java

module com.example.mymodule {
    requires mylibrary;
    exports com.example.mymodule.api;
}

    JShell :

JShell est un nouvel outil d'interface en ligne de commande (CLI) qui permet d'exécuter du code Java sans avoir besoin de créer un fichier source Java. Cela permet aux développeurs de tester rapidement des idées et des concepts en Java. Par exemple, vous pouvez ouvrir une session JShell et saisir du code Java comme ceci :

python

jshell> int x = 5;
x ==> 5

jshell> int y = 10;
y ==> 10

jshell> int z = x + y;
z ==> 15

 
    Amélioration de l'API de processus :

Java 9 améliore l'API de processus pour simplifier la gestion des processus et des sous-processus. Les nouvelles fonctionnalités incluent la prise en charge des processus descendants, la récupération des informations de processus, la gestion des processus avec des arguments de ligne de commande, etc. Par exemple, voici comment vous pouvez exécuter un processus et récupérer sa sortie :

 

ProcessBuilder pb = new ProcessBuilder("mycommand", "arg1", "arg2");
Process process = pb.start();


BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
String line;
while ((line = reader.readLine()) != null) {
    System.out.println(line);
}

