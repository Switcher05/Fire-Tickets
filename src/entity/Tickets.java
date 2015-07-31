package entity;
// Generated Jul 18, 2015 10:35:28 PM by Hibernate Tools 4.3.1


import java.util.Date;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

/**
 * Tickets generated by hbm2java
 */
@Entity
@Table(name="tickets"
    ,catalog="fire_tickets"
    , uniqueConstraints = @UniqueConstraint(columnNames="Serial") 
)
public class Tickets  implements java.io.Serializable {


     private TicketsId id;
     private Date datePlaced;
     private Date dateRemoved;
     private Integer unsoldAmt;
     private Integer actualGross;
     private Integer actualPrizes;
     private Integer actualNet;
     private Integer bin;
     private Boolean inplay;
     private Integer closed;
     private Integer unsoldTickets;
     private Byte lastSaleRem;
     private Integer prizeRem1;
     private Integer prizeRem2;
     private Integer prizeRem3;
     private Integer prizeRem4;
     private Integer prizeRem5;
     private Integer prizeRem6;
     private Integer prizeRem7;
     private Integer prizeRem8;
     private Integer prizeRem9;
     private Integer prizeRem10;
     private Integer prizeRem11;
     private Integer prizeRem12;
     private Integer prizeRem13;
     private Integer prizeRem14;
     private Integer prizeRem15;
     private Date datePurch;
     private String invoiceNum;

    public Tickets() {
    }

	
    public Tickets(TicketsId id) {
        this.id = id;
    }
    public Tickets(TicketsId id, Date datePlaced, Date dateRemoved, Integer unsoldAmt, Integer actualGross, Integer actualPrizes, Integer actualNet, Integer bin, Boolean inplay, Integer closed, Integer unsoldTickets, Byte lastSaleRem, Integer prizeRem1, Integer prizeRem2, Integer prizeRem3, Integer prizeRem4, Integer prizeRem5, Integer prizeRem6, Integer prizeRem7, Integer prizeRem8, Integer prizeRem9, Integer prizeRem10, Integer prizeRem11, Integer prizeRem12, Integer prizeRem13, Integer prizeRem14, Integer prizeRem15, Date datePurch, String invoiceNum) {
       this.id = id;
       this.datePlaced = datePlaced;
       this.dateRemoved = dateRemoved;
       this.unsoldAmt = unsoldAmt;
       this.actualGross = actualGross;
       this.actualPrizes = actualPrizes;
       this.actualNet = actualNet;
       this.bin = bin;
       this.inplay = inplay;
       this.closed = closed;
       this.unsoldTickets = unsoldTickets;
       this.lastSaleRem = lastSaleRem;
       this.prizeRem1 = prizeRem1;
       this.prizeRem2 = prizeRem2;
       this.prizeRem3 = prizeRem3;
       this.prizeRem4 = prizeRem4;
       this.prizeRem5 = prizeRem5;
       this.prizeRem6 = prizeRem6;
       this.prizeRem7 = prizeRem7;
       this.prizeRem8 = prizeRem8;
       this.prizeRem9 = prizeRem9;
       this.prizeRem10 = prizeRem10;
       this.prizeRem11 = prizeRem11;
       this.prizeRem12 = prizeRem12;
       this.prizeRem13 = prizeRem13;
       this.prizeRem14 = prizeRem14;
       this.prizeRem15 = prizeRem15;
       this.datePurch = datePurch;
       this.invoiceNum = invoiceNum;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="serial", column=@Column(name="Serial", unique=true, nullable=false, length=12) ), 
        @AttributeOverride(name="gameTemplatesPartNum", column=@Column(name="game_templates_part_num", nullable=false, length=12) ) } )
    public TicketsId getId() {
        return this.id;
    }
    
    public void setId(TicketsId id) {
        this.id = id;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_placed", length=10)
    public Date getDatePlaced() {
        return this.datePlaced;
    }
    
    public void setDatePlaced(Date datePlaced) {
        this.datePlaced = datePlaced;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="Date_removed", length=10)
    public Date getDateRemoved() {
        return this.dateRemoved;
    }
    
    public void setDateRemoved(Date dateRemoved) {
        this.dateRemoved = dateRemoved;
    }

    
    @Column(name="Unsold_amt")
    public Integer getUnsoldAmt() {
        return this.unsoldAmt;
    }
    
    public void setUnsoldAmt(Integer unsoldAmt) {
        this.unsoldAmt = unsoldAmt;
    }

    
    @Column(name="Actual_gross")
    public Integer getActualGross() {
        return this.actualGross;
    }
    
    public void setActualGross(Integer actualGross) {
        this.actualGross = actualGross;
    }

    
    @Column(name="Actual_prizes")
    public Integer getActualPrizes() {
        return this.actualPrizes;
    }
    
    public void setActualPrizes(Integer actualPrizes) {
        this.actualPrizes = actualPrizes;
    }

    
    @Column(name="Actual_net")
    public Integer getActualNet() {
        return this.actualNet;
    }
    
    public void setActualNet(Integer actualNet) {
        this.actualNet = actualNet;
    }

    
    @Column(name="Bin")
    public Integer getBin() {
        return this.bin;
    }
    
    public void setBin(Integer bin) {
        this.bin = bin;
    }

    
    @Column(name="Inplay")
    public Boolean getInplay() {
        return this.inplay;
    }
    
    public void setInplay(Boolean inplay) {
        this.inplay = inplay;
    }

    
    @Column(name="Closed")
    public Integer getClosed() {
        return this.closed;
    }
    
    public void setClosed(Integer closed) {
        this.closed = closed;
    }

    
    @Column(name="Unsold_tickets")
    public Integer getUnsoldTickets() {
        return this.unsoldTickets;
    }
    
    public void setUnsoldTickets(Integer unsoldTickets) {
        this.unsoldTickets = unsoldTickets;
    }

    
    @Column(name="Last_sale_rem")
    public Byte getLastSaleRem() {
        return this.lastSaleRem;
    }
    
    public void setLastSaleRem(Byte lastSaleRem) {
        this.lastSaleRem = lastSaleRem;
    }

    
    @Column(name="Prize_rem1")
    public Integer getPrizeRem1() {
        return this.prizeRem1;
    }
    
    public void setPrizeRem1(Integer prizeRem1) {
        this.prizeRem1 = prizeRem1;
    }

    
    @Column(name="Prize_rem2")
    public Integer getPrizeRem2() {
        return this.prizeRem2;
    }
    
    public void setPrizeRem2(Integer prizeRem2) {
        this.prizeRem2 = prizeRem2;
    }

    
    @Column(name="Prize_rem3")
    public Integer getPrizeRem3() {
        return this.prizeRem3;
    }
    
    public void setPrizeRem3(Integer prizeRem3) {
        this.prizeRem3 = prizeRem3;
    }

    
    @Column(name="Prize_rem4")
    public Integer getPrizeRem4() {
        return this.prizeRem4;
    }
    
    public void setPrizeRem4(Integer prizeRem4) {
        this.prizeRem4 = prizeRem4;
    }

    
    @Column(name="Prize_rem5")
    public Integer getPrizeRem5() {
        return this.prizeRem5;
    }
    
    public void setPrizeRem5(Integer prizeRem5) {
        this.prizeRem5 = prizeRem5;
    }

    
    @Column(name="Prize_rem6")
    public Integer getPrizeRem6() {
        return this.prizeRem6;
    }
    
    public void setPrizeRem6(Integer prizeRem6) {
        this.prizeRem6 = prizeRem6;
    }

    
    @Column(name="Prize_rem7")
    public Integer getPrizeRem7() {
        return this.prizeRem7;
    }
    
    public void setPrizeRem7(Integer prizeRem7) {
        this.prizeRem7 = prizeRem7;
    }

    
    @Column(name="Prize_rem8")
    public Integer getPrizeRem8() {
        return this.prizeRem8;
    }
    
    public void setPrizeRem8(Integer prizeRem8) {
        this.prizeRem8 = prizeRem8;
    }

    
    @Column(name="Prize_rem9")
    public Integer getPrizeRem9() {
        return this.prizeRem9;
    }
    
    public void setPrizeRem9(Integer prizeRem9) {
        this.prizeRem9 = prizeRem9;
    }

    
    @Column(name="Prize_rem10")
    public Integer getPrizeRem10() {
        return this.prizeRem10;
    }
    
    public void setPrizeRem10(Integer prizeRem10) {
        this.prizeRem10 = prizeRem10;
    }

    
    @Column(name="Prize_rem11")
    public Integer getPrizeRem11() {
        return this.prizeRem11;
    }
    
    public void setPrizeRem11(Integer prizeRem11) {
        this.prizeRem11 = prizeRem11;
    }

    
    @Column(name="Prize_rem12")
    public Integer getPrizeRem12() {
        return this.prizeRem12;
    }
    
    public void setPrizeRem12(Integer prizeRem12) {
        this.prizeRem12 = prizeRem12;
    }

    
    @Column(name="Prize_rem13")
    public Integer getPrizeRem13() {
        return this.prizeRem13;
    }
    
    public void setPrizeRem13(Integer prizeRem13) {
        this.prizeRem13 = prizeRem13;
    }

    
    @Column(name="Prize_rem14")
    public Integer getPrizeRem14() {
        return this.prizeRem14;
    }
    
    public void setPrizeRem14(Integer prizeRem14) {
        this.prizeRem14 = prizeRem14;
    }

    
    @Column(name="Prize_rem15")
    public Integer getPrizeRem15() {
        return this.prizeRem15;
    }
    
    public void setPrizeRem15(Integer prizeRem15) {
        this.prizeRem15 = prizeRem15;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="date_purch", length=10)
    public Date getDatePurch() {
        return this.datePurch;
    }
    
    public void setDatePurch(Date datePurch) {
        this.datePurch = datePurch;
    }

    
    @Column(name="invoice_num", length=10)
    public String getInvoiceNum() {
        return this.invoiceNum;
    }
    
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }




}

