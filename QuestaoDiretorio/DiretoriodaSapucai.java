package QuestaoDiretorio;
import java.io.File;

public class DiretoriodaSapucai {
    public static void ListarDiretorio(String dir){
        File d = new File(dir);
        File[] files = d.listFiles();
        for (int i = 0; i < files.length ; i++) {

            if (files[i].isDirectory()) {
                System.out.println(files[i]);
                ListarDiretorio(String.valueOf(files[i]));
            } else {
                System.out.println(files[i]);
            }
        }
    }

    public static void main(String[] args) {
        ListarDiretorio("C:\\Users\\lucca\\IdeaProjects\\POO2");
    }
}
