public class ExcelDocFactory extends DocumentFactory {

    public Document createDocument(String type) {
        if (type.equals("excel")) {
            return new ExcelDocument();
        } 
        return null;
    }
}