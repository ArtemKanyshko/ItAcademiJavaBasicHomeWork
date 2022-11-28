package HomeWork12;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class Logger {
    private static Logger instance;
    private Logger() {}
    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }
        return instance;
    }
        private void log(String message) {
            try (FileWriter fileWriter = new FileWriter("./src/HomeWork12/logger.txt", true);
                 PrintWriter printWriter = new PrintWriter(fileWriter)) {
                StringBuilder sb = new StringBuilder();
                sb.append(LocalDateTime.now()).append(" - ").append(message);
                printWriter.println(sb);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        public void logPrint(String message) {
            log(message);
        }




}
