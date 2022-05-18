package ro.ase.cts.command;
public class Transfer extends OperatiuneBancara {
    @Override
    public void efectuareOperatiune(int suma) throws InterruptedException {

        super.cont.Transfer(suma);

    }
}
