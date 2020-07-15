
package rental;

public class Ordered extends AbstractEvent {

    private Long id;
    private Long productId;
    private Integer qty;
    private String contractDate;
    private String startYmd;
    private String period;
    private Integer rentalPrice;
    private String status;

    public Ordered(){
        this.eventType = Ordered.class.getSimpleName();
    }
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }
    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }
    public String getContractDate() {
        return contractDate;
    }

    public void setContractDate(String contractDate) {
        this.contractDate = contractDate;
    }
    public String getStartYmd() {
        return contractDate;
    }

    public void setStartYmd(String contractDate) {
        this.startYmd = contractDate;
    }
    public Integer getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(Integer rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }
}
