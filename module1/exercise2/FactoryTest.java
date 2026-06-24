public class FactoryTest {

    public static void main(String[] args) {

        DocumentFactory wordFactory = new WordDocumentFactory();
        Document wordFile = wordFactory.createDocument();
        wordFile.open();

        DocumentFactory pdfFactory = new PdfDocumentFactory();
        Document pdfFile = pdfFactory.createDocument();
        pdfFile.open();

        DocumentFactory excelFactory = new ExcelDocumentFactory();
        Document excelFile = excelFactory.createDocument();
        excelFile.open();
    }
}