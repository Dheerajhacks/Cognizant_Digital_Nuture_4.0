public class PdfDocFactory extends DocumentFactory {
    
    public Document createDocument(String type) {
        if (type.equalsIgnoreCase("pdf")) {
            return new PdfDocument();
        } 
        return null;
    }
    
    
}
