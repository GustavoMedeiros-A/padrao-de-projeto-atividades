package padroes_estruturais.proxy.report_proxy;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<Integer, Report> movies = new HashMap<>();

    public static Report getContent(Integer id) {
        return movies.get(id);
    }

    public static void addReport(Report report) {
        movies.put(report.getId(), report);
    }

}
