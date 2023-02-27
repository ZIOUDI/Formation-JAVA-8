package src.version_java11.classes_imbriquees;


    /*
         Cela permet à la classe Inner d'accéder de manière privilégiée à la variable x de la classe Outer.
     */
    public class Outer_Inner_Annotations { //  ====>  @NestHost / public
        private int x;

        public class Inner2 { //  ====>   @Nest  / public
            public void setX(int x) {
                Outer_Inner_Annotations.this.x = x; // Accès privilégié à x de Outer
            }
        }
    }

