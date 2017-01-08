package data;

public class User {
    private String pesel;
    private int wiek;
    private String imię;
    private String nazwisko;

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public int getWiek() {
        return wiek;
    }

    public void setWiek(int wiek) {
        this.wiek = wiek;
    }

    public String getImię() {
        return imię;
    }

    public void setImię(String imię) {
       this.imię = imię;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public User (){

    }

    public User(String pesel, int wiek, String imię, String nazwisko) {
        this.pesel = pesel;
        this.wiek = wiek;
        this.imię = imię;
        this.nazwisko = nazwisko;
    }
}
