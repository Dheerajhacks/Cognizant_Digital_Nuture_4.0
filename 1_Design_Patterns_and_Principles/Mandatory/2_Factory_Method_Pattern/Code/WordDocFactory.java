public class WordDocFactory extends DocumentFactory {

    public Document createDocument(String type) {
        if (type.equals("word")) {
            return new WordDocument();
        }
        return null;
    }
}
