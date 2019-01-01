import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main (String[] args){
        System.out.println("Hello World");
        List<Integer> liste = creerList();

        System.out.println(liste);
        System.out.println((partition(liste, 1)));
        System.out.println((partition(liste, 2)));
        System.out.println((partition(liste, 3)));
        System.out.println((partition(liste, 4)));
        System.out.println((partition(liste, 5)));
    }

    public static List creerList(){
        List<Integer> liste = new LinkedList<Integer>();
        for (int i = 1; i < 6; i++) {
            liste.add(i);
        }
        return liste;
    }

    public static List partition(List liste,int taille){
        List<List> nouvelleListe = new ArrayList<List>(); //création de la liste à retourner
        for (int i = 0; i < liste.size(); i++) {
            if (i%taille==0.0){
                nouvelleListe.add(new ArrayList<Integer>());//création d'une nouvelle sous liste, toutes les -taille- index
            }
            nouvelleListe.get((int)Math.floor(i/taille)).add(liste.get(i)); //ajout des nouvels éléments dans la nouvelle liste
        }
        return nouvelleListe;
    }
}