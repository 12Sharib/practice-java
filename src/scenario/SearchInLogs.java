package scenario;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class SearchInLogs {

  private static final String LOG_FILE = "sample.log";
  private static final String FIND_ERROR = "[error]";

  private static void impl() {
    File logfile = new File(LOG_FILE);

    System.out.println("Starting parsing log file: " + logfile.getAbsolutePath());

    long start = System.currentTimeMillis();

    ExecutorService service = Executors.newFixedThreadPool(1);
    System.out.println(start);
    try (BufferedReader file = new BufferedReader(new FileReader(logfile))) {
      String line;
      List<String> list = new ArrayList<>(500);
      while ((line = file.readLine()) != null) {

        list.add(line);
        if (list.size() == 500) {
          List<String> batch = new ArrayList<>(list);

          service.submit(() -> {
            batch.parallelStream().filter(l -> l.contains(FIND_ERROR)).forEach(System.out::println);
          });
          list.clear();
        }
      }
      if (!list.isEmpty()) {
        List<String> batch = new ArrayList<>(list);
        service.submit(() -> {
          batch.parallelStream().filter(l -> l.contains(FIND_ERROR)).forEach(System.out::println);

        });
      }
    } catch (IOException e) {
      System.err.println(e.getMessage());
      Thread.currentThread().interrupt();
    }
    service.shutdown();

    try {
      service.awaitTermination(60, TimeUnit.SECONDS); // Wait for threads to finish
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }

    System.out.println("✅ Execution time: " + (System.currentTimeMillis() - start) + " ms");
  }

  public static void main(String[] args) {
    impl();

  }

}
