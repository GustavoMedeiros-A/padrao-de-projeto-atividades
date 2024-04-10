package padroes_estruturais.proxy.report_proxy;

import java.util.List;

public class ReportProxy implements IReport {

    private Report report;
    private Integer id;

    public ReportProxy(int id) {
        this.id = id;
    }

    private void lazyReportLoader() {
        if (report == null) {
            report = Database.getContent(id);
            if (report == null) {
                throw new IllegalStateException("Report with ID " + id + " not found.");
            }
        }
    }

    @Override
    public List<String> getReport() {
        lazyReportLoader();
        return report.getReport();
    }

    @Override
    public List<String> viewContent(User user) {
        if (!user.hasAccessRights()) {
            throw new IllegalArgumentException("User not authorized");
        }
        lazyReportLoader();
        return report.viewContent(user);
    }
}
