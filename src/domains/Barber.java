package domains;

import ennumerations.Specialization;

public class Barber {
    // Atributos de la clase Barber
    private long id;
    private String name;
    private String nickname;
    private Specialization specialization;

    //Constructores de la clase

    public Barber(Barber barber) {
    }

    public Barber(long id, String name, String nickname, Specialization specialization) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.specialization = specialization;
    }
    // Metodos get and Set

    public long getId() {
        return id;
    }

    public Barber setId(long id) {
        this.id = id;
        return this;
    }

    public String getName() {
        return name;
    }

    public Barber setName(String name) {
        this.name = name;
        return this;
    }

    public String getNickname() {
        return nickname;
    }

    public Barber setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }

    public Specialization getSpecialization() {
        return specialization;
    }

    public Barber setSpecialization(Specialization specialization) {
        this.specialization = specialization;
        return this;
    }
    //Metodo to String

    @Override
    public String toString() {
        return "Barber{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickname='" + nickname + '\'' +
                ", specialization='" + specialization + '\'' +
                '}';
    }

}
