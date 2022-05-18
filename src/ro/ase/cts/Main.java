package ro.ase.cts;

import ro.ase.cts.command.AlimentareCont;
import ro.ase.cts.command.Server;
import ro.ase.cts.command.Transfer;
import ro.ase.cts.memento.File;
import ro.ase.cts.memento.SnaphotFile;
import ro.ase.cts.memento.VersionControlSystem;

public class Main {
    public static void main(String[] args) {
//        MEMENTO
        VersionControlSystem vcs = new VersionControlSystem();
        File file = new File("continut1","fisier1",1);
        SnaphotFile sf = file.createSnaphot();
        vcs.addSnaphot(sf);
        vcs.printSnaphotList();
        file.setContinut("continut2");
        file.print();
        vcs.printSnaphotList();
        file.restoreFileContent(vcs.getSnaphot(1234));
        file.print();

//        COMMAND
        Server s = Server.getInstance();

        s.addOperatiune(new AlimentareCont());
        s.addOperatiune(new Transfer());
        try {
            s.prelucrareOperatiuni();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
