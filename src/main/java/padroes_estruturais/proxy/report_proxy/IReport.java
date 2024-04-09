package padroes_estruturais.proxy.report_proxy;

import java.util.*;

public interface IReport {
    List<String> getReport();

    List<String> viewContent(User user);
}