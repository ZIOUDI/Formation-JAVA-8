Inversion de Contrôle (IoC)
Concept : L'Inversion de Contrôle (IoC) est un principe de conception où le contrôle de la création et de la gestion des objets
            est transféré du programmeur à un conteneur ou framework. Au lieu de créer et gérer des objets manuellement,
            le conteneur s'occupe de ces tâches.

Injection de Dépendances (DI)
Concept : L'Injection de Dépendances (DI) est une technique utilisée pour implémenter IoC.
          Elle consiste à fournir les dépendances nécessaires à un objet par le conteneur au lieu de les créer manuellement.
            Cela peut se faire via le constructeur, des méthodes setter ou des propriétés.

Lien entre IoC et DI
Relation : IoC est le principe général qui délègue la gestion des objets au conteneur.
            DI est la méthode spécifique pour réaliser IoC, en injectant les dépendances dans les objets.
           En d'autres termes, DI est une façon de mettre en œuvre IoC en séparant la création des objets de leur utilisation,
            ce qui rend le code plus flexible et facile à maintenir.