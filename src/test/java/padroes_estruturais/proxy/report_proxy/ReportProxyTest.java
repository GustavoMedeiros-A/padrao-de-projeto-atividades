package padroes_estruturais.proxy.report_proxy;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.util.Arrays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReportProxyTest {

    @BeforeEach
    void setUp() {
        Database.addReport(new Report(1, "File one", "Content1"));
        Database.addReport(new Report(2, "Confidential File", "Confidential Content"));
    }

    @Test
    void shouldReturnReportInformation() {
        ReportProxy proxy = new ReportProxy(1);

        assertEquals(Arrays.asList("File one"), proxy.getReport());
    }

    @Test
    void shouldReturnContent() {
        var user = new User("Daris", true);
        ReportProxy proxy = new ReportProxy(2);

        assertEquals(Arrays.asList("Confidential Content"), proxy.viewContent(user));
    }

    @Test
    void shouldGetReportAndNotFound() {
        ReportProxy proxy = new ReportProxy(3);
        try {
            proxy.getReport();
            fail();
        } catch (IllegalStateException e) {
            assertEquals("Report with ID 3 not found.", e.getMessage());
        }
        ;
    }

    @Test
    void shouldNotReturnContent() {
        try {
            var user = new User("Bruno", false);
            ReportProxy proxy = new ReportProxy(2);
            proxy.viewContent(user);
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("User not authorized", e.getMessage());
        }
    }

}
