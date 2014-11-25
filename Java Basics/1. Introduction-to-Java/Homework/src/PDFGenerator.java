import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileOutputStream;

public class PDFGenerator {

        public static void main(String[] args) {
                try {
                        Document document = new Document();
                        PdfWriter.getInstance(document, new FileOutputStream(
                                        "Deck-Of-Cards.pdf"));
                        document.open();

                        PdfPTable table = new PdfPTable(4);
                        table.setWidthPercentage(100);
                        table.getDefaultCell().setFixedHeight(180);

                        BaseFont baseFont = BaseFont.createFont(
                                        "C:\\Windows\\Fonts\\times.ttf", BaseFont.IDENTITY_H, true);
                        Font black = new Font(baseFont, 75f, 0, BaseColor.BLACK);
                        Font red = new Font(baseFont, 75f, 0, BaseColor.RED);

                        String card = "";
                        char color = ' ';

                        for (int i = 2; i <= 14; i++) {
                                switch (i) {
                                case 10:
                                        card = "10";
                                        break;
                                case 11:
                                        card = " J";
                                        break;
                                case 12:
                                        card = " Q";
                                        break;
                                case 13:
                                        card = " K";
                                        break;
                                case 14:
                                        card = " A";
                                        break;
                                default:
                                        card = " " + i;
                                        break;
                                }
                                for (int j = 1; j <= 4; j++) {
                                        switch (j) {
                                        case 1:
                                                color = '\u2660';
                                                table.addCell(new Paragraph(card + color + " ", black));
                                                break;
                                        case 2:
                                                color = '\u2665';
                                                table.addCell(new Paragraph(card + color + " ", red));
                                                break;
                                        case 3:
                                                color = '\u2663';
                                                table.addCell(new Paragraph(card + color + " ", black));
                                                break;
                                        case 4:
                                                color = '\u2666';
                                                table.addCell(new Paragraph(card + color + " ", red));
                                                break;
                                        }
                                }
                        }
                        document.add(table);
                } catch (Exception e) {
                        e.printStackTrace();
                } finally {
                        document.close();
                }
        }
}