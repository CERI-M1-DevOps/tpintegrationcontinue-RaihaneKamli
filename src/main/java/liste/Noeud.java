package liste;

public class Noeud {
    private Object element;
    private Noeud suivant;

    /**
     * Constructeur de la classe Noeud.
     * @param e L'élément à stocker dans le nœud.
     * @param suivant Le nœud suivant dans la liste.
     */

    public Noeud(int e, Noeud suivant) {
        element = e;
        this.suivant = suivant;
    }

    /**
     * Obtient l'élément stocké dans le nœud.
     * @return L'élément du nœud.
     */
    public Object getElement() {
        return element;
    }

    /**
     * Modifie l'élément stocké dans le nœud.
     * @param element Le nouvel élément à stocker dans le nœud.
     */
    public void setElement(Object element) {
        this.element = element;
    }

    /**
     * Obtient le nœud suivant dans la liste.
     * @return Le nœud suivant.n
     */
    public Noeud getSuivant() {
        return suivant;
    }

    /**
     * Modifie le nœud suivant dans la liste.
     * @param suivant Le nouveau nœud suivant.
     */
    public void setSuivant(Noeud suivant) {
        this.suivant = suivant;
    }

    /**
     * Retourne une représentation sous forme de chaîne de caractères du nœud.
     * @return Une chaîne représentant le nœud.
     */
    public String toString() {
        return "Noeud(" + element + ")";
    }
}
