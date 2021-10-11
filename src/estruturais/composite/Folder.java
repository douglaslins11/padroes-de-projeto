package estruturais.composite;

import java.util.List;

/*
* Problema: Utilize o padrão quando você quer que o código cliente trate tanto os objetos simples como os compostos de forma uniforme.
* Solução: Declare a interface componente com uma lista de métodos que façam sentido para componentes complexos e simples.
* */

public class Folder implements FileSystemItem{

    private String name;
    private List<FileSystemItem> children;

    public Folder(String name, List<FileSystemItem> children) {
        this.name = name;
        this.children = children;
    }

    @Override
    public void print(String structure) {
        System.out.println(structure + name);
        for (FileSystemItem child : children){
            child.print(structure + "| ");
        }
    }
}
