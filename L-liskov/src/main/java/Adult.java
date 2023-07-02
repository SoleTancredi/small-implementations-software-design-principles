public class Adult extends Person{

    private String ident;
    private String card;

    public Adult(String name, String lastName, String ident, String card) {
        super(name, lastName);
        this.ident = ident;
        this.card = card;
    }

    public String getIdent() {
        return ident;
    }

    public String getCard() {
        return card;
    }

    public void setIdent(String ident) {
        this.ident = ident;
    }

    public void setCard(String card) {
        this.card = card;
    }

    public void paid() {
        System.out.println("my id is " + getIdent() + " payment by card " + getCard());
    }
}
