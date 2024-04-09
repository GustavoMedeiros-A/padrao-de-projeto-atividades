package padroes_estruturais.proxy.report_proxy;

import java.util.List;

public class ReportProxy implements IReport {

    private Report report;
    private Integer id;

    public ReportProxy(int id) {
        this.id = id;
    }

    @Override
    public List<String> getReport() {
        if (this.report == null) {
            this.report = new Report(this.id);
        }
        return this.report.getReport();
    }

    @Override
    public List<String> viewContent(User user) {
        if (!user.hasAccessRights()) {
            throw new IllegalArgumentException("User not authorized");
        }
        if (this.report == null) {
            this.report = new Report(this.id);
        }
        return this.report.viewContent(user);
    }
}
