package com.CoreJava;
//                                      ClassNotFound Exception
public class ProduceException {
    public static void main(String[] args) {
        try {
            Class.forName("ClassNotFoundException");
        }
        catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//                                  NoClassDefFound Exception
class NoClassDefFound {
    void readBooks () {
        System.out.println("Random Book");
    }
}

class ProduceException {
    public static void main(String[] args) {
        NoClassDefFound ncdf = new NoClassDefFound();
        ncdf.readBooks();
    }
}
