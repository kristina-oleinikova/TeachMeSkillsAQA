public class Document {
    public Document(){};

    public static void split(String document){
        String[] x = document.split("-");
        System.out.println(x[0] +" " + x[2]);
    }

    public static void replaceDocument(String document){
        String[] x = document.split("-");
        x[1] = "***";
        x[3] = "***";

        for(String a : x){
            System.out.print(a);
        }
        System.out.println();
    }

    public static void printOnlyLetters(String document){
        String[] x = document.split("-");
        String[] a = x[4].split("[0-9]");

        System.out.println(x[1] + "/" + x[3] + "/" + a[1] + "/" + a[2]);
    }

    public static void getStringBuilder(String document){
        String[] x = document.split("-");
        String[] a = x[4].split("[0-9]");
        String doc = x[1].toUpperCase() + "/" +
                x[3].toUpperCase() + "/" +
                a[1].toUpperCase() + "/" +
                a[2].toUpperCase() + "/";
        System.out.println("Letters: " + doc);
    }

    public static void stringContainsABC(String document){
        if (document.contains("abc")|| document.contains( "ABC" )){
            System.out.print("The document contains 'abc' or 'ABC'");
        }else {
            System.out.println("The document doesn't contain 'abc' or 'ABC'.");
        }
    }

    public static void stringStartsWithFives(String document){
        if (document.startsWith("555")) {
            System.out.println("The document starts with '555'");
        }
        else {
            System.out.println("The document doesn't start with '555'");
        }
    }

    public static void stringEndsWith(String document){
        if (document.endsWith("1a2b")) {
            System.out.println("The document ends with '1a2b'");
        }
        else {
            System.out.println("The document doesn't ends with '1a2b'");
        }
    }

}
