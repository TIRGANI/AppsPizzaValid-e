package beans;

public class Fruit {
    private int id;
    private String nom;
    private  int quantite;
    private int photo;
    private String desc;
    private String ingrediant;

    private static int compt;

    public Fruit() {

    }

    public Fruit(String nom, int quantite, int photo, String desc ,String ingrediant) {
        this.id = compt++;
        this.nom = nom;
        this.quantite = quantite;
        this.photo = photo;
        this.desc = desc;
        this.ingrediant = ingrediant;
    }

    public String getIngrediant() {
        return ingrediant;
    }

    public void setIngrediant(String ingrediant) {
        this.ingrediant = ingrediant;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public int getQuantite() {
        return quantite;
    }

    public int getPhoto() {
        return photo;
    }

    public String getDesc() {
        return desc;
    }

    public static int getCompt() {
        return compt;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public static void setCompt(int compt) {
        Fruit.compt = compt;
    }
}
