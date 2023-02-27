package src.version_java11.classes_imbriquees;




    /*
    la classe Inner est imbriquée dans la classe Outer.

    La méthode setX de la classe Inner peut accéder à la variable x de la classe Outer,

     car elle est déclarée private et peut être accédée de manière privilégiée par les classes imbriquées.
     */
    public class Outer_Normale {
        private int x;

        public class Inner {
            public void setX(int x) {
                Outer_Normale.this.x = x; // Accès privilégié à x de Outer
            }
        }
    }
