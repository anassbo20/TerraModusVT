package com.example.terramodusvt;
import com.lowagie.text.DocumentException;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import java.io.*;
@SpringBootApplication
public class TerraModusVTApplication {

    public static void main(String[] args) throws IOException, DocumentException {
        SpringApplication.run(TerraModusVTApplication.class, args);

        /*PdfReader reader = new PdfReader("C:\\Users\\anass\\Downloads\\springboot-jasperreports-advanced-demo-master\\TerraModusvc\\src\\main\\resources\\Devis 51-2023 CBRE - Comparables- Ain Sebaa - Casablanca.pdf");
        PdfStamper stamper = new PdfStamper(reader, new FileOutputStream("C:\\Users\\anass\\Downloads\\exported_report.pdf"));
        AcroFields fields = stamper.getAcroFields();
        fields.setField("ice", "111111111111111111111");
        fields.setField("ville", "rabat");
        fields.setField("ref-numero", "11111111");
        fields.setField("dev-numero", "11111111");
        fields.setField("date", "13/04/2023");
        fields.setField("test", "etttttttttttttttttttttttttttttttttttttdgggg");
        fields.setField("cons", "etttttttttttttttttttttttttttttttttttttdgggg");
        fields.setFieldProperty("ice", "setfflags", PdfFormField.FF_READ_ONLY, null);
        fields.setFieldProperty("ville", "setfflags", PdfFormField.FF_READ_ONLY, null);
        fields.setFieldProperty("ville", "setfflags", PdfFormField.FF_READ_ONLY, null);
        stamper;
        stamper.close();
    */
    }
}