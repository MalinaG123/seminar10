package ro.ase.cts.memento;

public class File {
    String content;
    String name;
    int id;

    public File(String content, String name, int id) {
        this.content=content;
        this.name=name;
        this.id = id;
    }

    public File(String content) {
        this.content=content;
    }

    public String getContinut() {
        return content;
    }

    public void setContinut(String continut) {
        this.content=continut;
    }
    public SnaphotFile createSnaphot(){
        return new SnaphotFile(this.content);
    }
    public void restoreFileContent(SnaphotFile snaphotFile)
    {
        this.content=snaphotFile.content;
    }
    public void print()
    {
        System.out.println(this.content);
    }
}
