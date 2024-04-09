package padroes_estruturais.proxy.report_proxy;

import java.util.Arrays;
import java.util.List;

public class Report implements IReport {

    private Integer id;
    private String name;
    private String content;

    public Report(int id) {
        this.id = id;
        Report object = Database.getContent(id);
        this.name = object.name;
        this.content = object.content;
    }

    public Report(Integer id, String name, String content) {
        this.id = id;
        this.name = name;
        this.content = content;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public List<String> getReport() {
        return Arrays.asList(this.name);
    }

    @Override
    public List<String> viewContent(User user) {
        return Arrays.asList(this.content);
    }

}
