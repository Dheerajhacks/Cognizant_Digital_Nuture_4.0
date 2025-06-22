public class Main {
    public static void main(String[] args) {
        System.out.println("\nDocument Factory Pattern Example\n");

        DocumentFactory excelFactory = new ExcelDocFactory();
        Document excelDoc = excelFactory.createDocument("excel");
        excelDoc.create();

        DocumentFactory wordFactory = new WordDocFactory();
        Document wordDoc = wordFactory.createDocument("word");
        wordDoc.create();

        DocumentFactory pdfFactory = new PdfDocFactory();
        Document pdfDoc = pdfFactory.createDocument("pdf");
        pdfDoc.create();

        System.out.println();
    }
}
