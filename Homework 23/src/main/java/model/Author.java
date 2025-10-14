package model;

public class Author {
    private String first_name;
    private String last_name;
    private String nationality;
    private int date_of_birth;
    private int date_of_death;

    public Author() {};

    public Author(String first_name, String last_name){
        this.first_name = first_name;
        this.last_name = last_name;
    };
    public Author(String first_name, String last_name, String nationality, int date_of_birth, int date_of_death) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.nationality = nationality;
        this.date_of_birth = date_of_birth;
        this.date_of_death = date_of_death;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(int date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public int getDate_of_death() {
        return date_of_death;
    }

    public void setDate_of_death(int date_of_death) {
        this.date_of_death = date_of_death;
    }
}
