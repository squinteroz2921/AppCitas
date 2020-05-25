package domains;

import ennumerations.DateType;

import java.util.Date;

public class Meet {
    //Atributos
    private Long id;
    private Date schedulDate;
    private Barber barber;
    private Client client;
    private DateType dateType;
// Constructores

    public Meet() {
    }

    public Meet(Long id, Date schedulDate, Barber barber, Client client, DateType dateType) {
        this.id = id;
        this.schedulDate = schedulDate;
        this.barber = barber;
        this.client = client;
        this.dateType = dateType;
    }

    public Long getId() {
        return id;
    }

    public Meet setId(Long id) {
        this.id = id;
        return this;
    }

    public Date getSchedulDate() {
        return schedulDate;
    }

    public Meet setSchedulDate(Date schedulDate) {
        this.schedulDate = schedulDate;
        return this;
    }

    public Barber getBarber() {
        return barber;
    }

    public Meet setBarber(Barber barber) {
        this.barber = barber;
        return this;
    }

    public Client getClient() {
        return client;
    }

    public Meet setClient(Client client) {
        this.client = client;
        return this;
    }

    public DateType getDateType() {
        return dateType;
    }

    public Meet setDateType(DateType dateType) {
        this.dateType = dateType;
        return this;
    }

    @Override
    public String toString() {
        return "Meet{" +
                "id=" + id +
                ", schedulDate=" + schedulDate +
                ", barber=" + barber +
                ", client=" + client +
                ", dateType=" + dateType +
                '}';
    }
}
