package gr.codelearn.spring.app.helper;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class CsvWriter<T> {

    public void writeToCsv(List<T> objectList, String header,String path, String fileName) throws IOException {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String stringPath = path +   dtf.format(LocalDateTime.now());

        if(!Files.exists(Paths.get("stringPath"))){
            File f1 = new File(stringPath);
            f1.mkdir();
        }
        PrintWriter writer = new PrintWriter( stringPath + "/" + fileName + ".csv");
        writer.println(header);

        for (T object : objectList) {
            writer.println(object.toString());
        }
        writer.close();



    }
}
