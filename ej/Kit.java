package ej;

import ej.blocs.IBloc;
import ej.blocs.Mur;
import ej.blocs.Porte;

import java.util.LinkedHashSet;
import java.util.Set;

public class Kit implements IBloc {
    private Set<IBloc> blocSet = new LinkedHashSet<IBloc>();
    private Set<String> keywordSet = new LinkedHashSet<String>();

    public Kit() throws IllegalBlocException {

        blocSet.add(new Mur(3, 2, 2, true));
        blocSet.add(new Mur(3, 2, 2, true));
        blocSet.add(new Mur(2, 1, 2, false));
        blocSet.add(new Mur(2, 1, 2, false));
        blocSet.add(new Porte(1, 2, 2, true));

        keywordSet.add("Cabane");
        keywordSet.add("Muraille");
    }

    public void showKit() {
        System.out.println("There are " + blocSet.size() + " blocs in the list");
        System.out.print("Here are the keywords in the list: ");
        for (String kwd : keywordSet) {
            System.out.print(kwd + " ");
        }
    }

    /*
     * @Override
     * public String toString() {
     * StringBuilder sb = new StringBuilder();
     * keywordSet.forEach(kwd -> sb.append(kwd));
     * return sb.toString();
     * }
     */
}
