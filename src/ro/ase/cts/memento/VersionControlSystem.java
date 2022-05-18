package ro.ase.cts.memento;

import java.util.HashMap;

public class VersionControlSystem {
    static int id_snaphot=1234;
    HashMap<Integer,SnaphotFile> snaphotFileHashMap;

    public VersionControlSystem() {
        snaphotFileHashMap =new HashMap<Integer, SnaphotFile>();
    }

    public void addSnaphot(SnaphotFile snaphotFile)
    {

        snaphotFileHashMap.put(id_snaphot,snaphotFile);
        id_snaphot++;
    }
    public SnaphotFile getSnaphot(int id){
        return snaphotFileHashMap.get(id);
    }

    public void printSnaphotList()
    {
        for (Integer id : snaphotFileHashMap.keySet()) {
            System.out.println(snaphotFileHashMap.get(id).content+ id);
        }
    }

}
