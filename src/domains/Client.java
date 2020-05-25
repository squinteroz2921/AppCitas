package domains;

public class Client {
    // Atributos de la clase Client
    private long id;
    private String name;
    private String cellphone;

    // Se crea el constructor Vacio
    public Client() {

    }

    // constructor con los Atributos
    public Client(long id, String name, String cellphone) {
        this.id = id;
        this.name = name;
        this.cellphone = cellphone;
    }

    // Metodos Get and Set de los Atributos
    public long getId() {
        return id;
    }

    public Client setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Client setName(String name) {
        this.name = name;
        return this;
    }

    public String getCellphone() {
        return cellphone;
    }

    public Client setCellphone(String cellphone) {
        this.cellphone = cellphone;
        return this;
    }

    @Override
    public String toString() {
        return "Client{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", cellphone='" + cellphone + '\'' +
                '}';
    }
}
