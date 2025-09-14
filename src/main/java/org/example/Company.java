package org.example;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerNames;

    public Company(long id, String name, double giro, String[] developerNames) {
        this.id = id;
        this.name = name;
        setGiro(giro);
        this.developerNames = developerNames;
    }

    public long getId() { return id; }
    public void setId(long id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public double getGiro() { return giro; }
    public void setGiro(double giro) {
        if (giro < 0) {
            System.out.println("Uyarı: giro negatif olamaz. 0 olarak ayarlanıyor. (gelen: " + giro + ")");
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public String[] getDeveloperNames() { return developerNames; }
    public void setDeveloperNames(String[] developerNames) { this.developerNames = developerNames; }

    public void addEmployee(int index, String name) {
        if (developerNames == null) {
            System.out.println("Developer listesi tanımlı değil.");
            return;
        }
        if (index < 0 || index >= developerNames.length) {
            System.out.println("Geçersiz index: " + index);
            return;
        }
        if (developerNames[index] == null || developerNames[index].isEmpty()) {
            developerNames[index] = name;
            System.out.println("Çalışan eklendi -> index " + index + ": " + name);
        } else {
            System.out.println("Index " + index + " zaten dolu: " + developerNames[index]);
        }
    }

    public String toString() {
        StringBuilder devs = new StringBuilder("[");
        if (developerNames != null) {
            for (int i = 0; i < developerNames.length; i++) {
                devs.append(developerNames[i]);
                if (i < developerNames.length - 1) devs.append(", ");
            }
        }
        devs.append("]");
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", giro=" + giro +
                ", developerNames=" + devs +
                '}';
    }
}
