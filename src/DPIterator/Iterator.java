package DPIterator;
/*L’interface Itérateur déclare les opérations nécessaires au parcours d’une collection :
récupérer le prochain élément,
donner la position actuelle,
recommencer la boucle depuis le
début, etc...*/
public interface Iterator {
    public boolean hasMore();
    public Object getNext();
    public void restart();
    public void addElement(Object elmnt);
}
