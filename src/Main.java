class Main {
    public static void main(String[] args)
    {
        Document doc = new Document();
        doc.split("3333-ttt-5677-sss-0y0y");
        doc.replaceDocument("3333-ttt-5677-sss-0y0y");
        doc.printOnlyLetters("3333-ttt-5677-sss-0y0y");
        doc.getStringBuilder("3333-ttt-5677-sss-0y0y");
        doc.stringContainsABC("3333-ttt-5677-sss-0y0y");
        doc.stringStartsWithFives("3333-ttt-5677-sss-0y0y");
        doc.stringEndsWith("3333-ttt-5677-sss-0y0y");

    }
}