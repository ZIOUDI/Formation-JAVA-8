package Inteface_ClasseAbstraite;

public interface AnInterface {
	
	 // Par d�faut, une m�thode d'interface est publique et abstraite.
    // Il n'est donc pas n�cessaire de commencer par public abstract.
    void firstAbstractMethod( int param );
    String secondAbstractMethod();
    
    // Mais vous pouvez utiliser les deux mots cl�s si vous trouverez cela plus lisible
    public abstract void thirdMethod();


}
