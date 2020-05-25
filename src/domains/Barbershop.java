package domains;

import java.util.List;

public class Barbershop {
    // Atributos de la clase Client
    private long id;
    private String name;
    private String address;
    private List <Barber> barbers;
    //Cosntructores de la Calse

    public Barbershop() {
    }

    public Barbershop(long id, String name, String address, List<Barber> barbers) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.barbers = barbers;
    }

    // Metodos Get and Set

    public long getId() {
        return id;
    }

    public Barbershop setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Barbershop setName(String name) {
        this.name = name;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public Barbershop setAddress(String address) {
        this.address = address;
        return this;
    }

    public List<Barber> getBarbers() {
        return barbers;
    }

    public Barbershop setBarbers(List<Barber> barbers) {
        this.barbers = barbers;
        return this;
    }

    @Override
    public String toString() {
        return "Barbershop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", barbers=" + barbers +
                '}';
    }
}
