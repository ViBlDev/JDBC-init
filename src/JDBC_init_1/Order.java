package JDBC_init_1;

public class Order {
    private int id;
    private int clientId;
    private String typePresta;
    private String designation;
    private int nbDays;
    private int unitPrice;
    private byte state;
    private float totalExcludeTaxe;
    private float totalWithTaxe;

    public Order(int id, int clientId, String typePresta, String designation, int nbDays, int unitPrice, byte state, float totalExcludeTaxe, float totalWithTaxe) {
        this.id = id;
        this.clientId = clientId;
        this.typePresta = typePresta;
        this.designation = designation;
        this.nbDays = nbDays;
        this.unitPrice = unitPrice;
        this.state = state;
        this.totalExcludeTaxe = totalExcludeTaxe;
        this.totalWithTaxe = totalWithTaxe;


    }

    public int getId() {
        return id;
    }

    public int getClientId() {
        return clientId;
    }

    public String getTypePresta() {
        return typePresta;
    }

    public String getDesignation() {
        return designation;
    }

    public int getNbDays() {
        return nbDays;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public byte getState() {
        return state;
    }

    public float getTotalExcludeTaxe() {
        return totalExcludeTaxe;
    }

    public float getTotalWithTaxe() {
        return totalWithTaxe;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", clientId=" + clientId +
                ", typePresta='" + typePresta + '\'' +
                ", designation='" + designation + '\'' +
                ", nbDays=" + nbDays +
                ", unitPrice=" + unitPrice +
                ", state=" + state +
                ", totalExcludeTaxe=" + totalExcludeTaxe +
                ", totalWithTaxe=" + totalWithTaxe +
                '}';
    }
}
