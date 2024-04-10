package padroes_estruturais.proxy.report_proxy;

import java.util.HashMap;
import java.util.Map;

public class Database {
    private static Map<Integer, Report> reports = new HashMap<>();

    public static Report getContent(Integer id) {
        return reports.get(id);
    }

    public static void addReport(Report report) {
        reports.put(report.getId(), report);
    }

}
