package Inteface_ClasseAbstraite;

public interface AnInterface {
	
	 // Par défaut, une méthode d'interface est publique et abstraite.
    // Il n'est donc pas nécessaire de commencer par public abstract.
    void firstAbstractMethod( int param );
    String secondAbstractMethod();
    
    // Mais vous pouvez utiliser les deux mots clés si vous trouverez cela plus lisible
    public abstract void thirdMethod();


}
