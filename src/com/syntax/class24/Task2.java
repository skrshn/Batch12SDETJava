package com.syntax.class24;
//        Create a class File that will have the following behaviors: open, edit, close. Edit and close are implemented method
//        while open is an abstract. Create 3 subclasses: JavaFile, WordFile, PdfFile that will provide specific
//        implementation of open behaviour: Example: to open .java file we need notepad++ or sublime text, to open .doc
//        file we need Microsoft word to be installed etc
abstract class File{
     abstract void open();
     void edit(){
         System.out.println("Editing a class");
     }
     void close(){
         System.out.println("Closing the file");
     }
}

class JavaFile extends File{
    @Override
    void open() {
        System.out.println("Use Intellij to open Java file");
    }

}
class WordFile extends File{
    @Override
    void open() {
        System.out.println("Use Microsoft to open Word file");
    }
}
class PdfFile extends File{
    @Override
    void open() {
        System.out.println("Use Adobe to open Pdf file");
    }
}

public class Task2 {
    public static void main(String[] args) {

        File[] open = {new JavaFile(), new WordFile(), new PdfFile()};
        for (File elements : open) {
            elements.open();
            elements.edit();
            elements.close();
        }

//        int i =0;
//        while(i < file.length){
//            file[i].open();
//            file[i].edit();
//            file[i].close();
//            i++;
//        }
    }
}
