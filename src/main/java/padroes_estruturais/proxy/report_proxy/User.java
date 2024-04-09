package padroes_estruturais.proxy.report_proxy;

public class User {

    private String name;
    private boolean hasAccessRights;

    public User(String name, boolean hasAccessRights) {
        this.name = name;
        this.hasAccessRights = hasAccessRights;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean hasAccessRights() {
        return hasAccessRights;
    }

    public void setAccessRights(boolean hasAccessRights) {
        this.hasAccessRights = hasAccessRights;
    }
}
