package entity;
// Generated Sep 8, 2015 7:01:42 PM by Hibernate Tools 4.3.1



/**
 * GameTemplates generated by hbm2java
 */
public class GameTemplates  implements java.io.Serializable {


     private GameTemplatesId id;
     private DistsId distsId;
     private MfgId mfgId;
     private String gameName;
     private Double gameCost;
     private Double ticketCost;
     private Integer numTickets;
     private Integer ideaGross;
     private Integer ideaPrizes;
     private Integer ideaNet;
     private Integer lastSale;
     private Integer lastSaleAllow;
     private Integer prizeAmt1;
     private Integer prizeAmt2;
     private Integer prizeAmt3;
     private Integer prizeAmt4;
     private Integer prizeAmt5;
     private Integer prizeAmt6;
     private Integer prizeAmt7;
     private Integer prizeAmt8;
     private Integer prizeAmt9;
     private Integer prizeAmt10;
     private Integer prizeAmt11;
     private Integer prizeAmt12;
     private Integer prizeAmt13;
     private Integer prizeAmt14;
     private Integer prizeAmt15;
     private Integer prizeAll1;
     private Integer prizeAll2;
     private Integer prizeAll3;
     private Integer prizeAll4;
     private Integer prizeAll5;
     private Integer prizeAll6;
     private Integer prizeAll7;
     private Integer prizeAll8;
     private Integer prizeAll9;
     private Integer prizeAll10;
     private Integer prizeAll11;
     private Integer prizeAll12;
     private Integer prizeAll13;
     private Integer prizeAll14;
     private Integer prizeAll15;

    public GameTemplates() {
    }

	
    public GameTemplates(GameTemplatesId id, DistsId distsId, MfgId mfgId) {
        this.id = id;
        this.distsId = distsId;
        this.mfgId = mfgId;
    }
    public GameTemplates(GameTemplatesId id, DistsId distsId, MfgId mfgId, String gameName, Double gameCost, Double ticketCost, Integer numTickets, Integer ideaGross, Integer ideaPrizes, Integer ideaNet, Integer lastSale, Integer lastSaleAllow, Integer prizeAmt1, Integer prizeAmt2, Integer prizeAmt3, Integer prizeAmt4, Integer prizeAmt5, Integer prizeAmt6, Integer prizeAmt7, Integer prizeAmt8, Integer prizeAmt9, Integer prizeAmt10, Integer prizeAmt11, Integer prizeAmt12, Integer prizeAmt13, Integer prizeAmt14, Integer prizeAmt15, Integer prizeAll1, Integer prizeAll2, Integer prizeAll3, Integer prizeAll4, Integer prizeAll5, Integer prizeAll6, Integer prizeAll7, Integer prizeAll8, Integer prizeAll9, Integer prizeAll10, Integer prizeAll11, Integer prizeAll12, Integer prizeAll13, Integer prizeAll14, Integer prizeAll15) {
       this.id = id;
       this.distsId = distsId;
       this.mfgId = mfgId;
       this.gameName = gameName;
       this.gameCost = gameCost;
       this.ticketCost = ticketCost;
       this.numTickets = numTickets;
       this.ideaGross = ideaGross;
       this.ideaPrizes = ideaPrizes;
       this.ideaNet = ideaNet;
       this.lastSale = lastSale;
       this.lastSaleAllow = lastSaleAllow;
       this.prizeAmt1 = prizeAmt1;
       this.prizeAmt2 = prizeAmt2;
       this.prizeAmt3 = prizeAmt3;
       this.prizeAmt4 = prizeAmt4;
       this.prizeAmt5 = prizeAmt5;
       this.prizeAmt6 = prizeAmt6;
       this.prizeAmt7 = prizeAmt7;
       this.prizeAmt8 = prizeAmt8;
       this.prizeAmt9 = prizeAmt9;
       this.prizeAmt10 = prizeAmt10;
       this.prizeAmt11 = prizeAmt11;
       this.prizeAmt12 = prizeAmt12;
       this.prizeAmt13 = prizeAmt13;
       this.prizeAmt14 = prizeAmt14;
       this.prizeAmt15 = prizeAmt15;
       this.prizeAll1 = prizeAll1;
       this.prizeAll2 = prizeAll2;
       this.prizeAll3 = prizeAll3;
       this.prizeAll4 = prizeAll4;
       this.prizeAll5 = prizeAll5;
       this.prizeAll6 = prizeAll6;
       this.prizeAll7 = prizeAll7;
       this.prizeAll8 = prizeAll8;
       this.prizeAll9 = prizeAll9;
       this.prizeAll10 = prizeAll10;
       this.prizeAll11 = prizeAll11;
       this.prizeAll12 = prizeAll12;
       this.prizeAll13 = prizeAll13;
       this.prizeAll14 = prizeAll14;
       this.prizeAll15 = prizeAll15;
    }
   
    public GameTemplatesId getId() {
        return this.id;
    }
    
    public void setId(GameTemplatesId id) {
        this.id = id;
    }
    public DistsId getDistsId() {
        return this.distsId;
    }
    
    public void setDistsId(DistsId distsId) {
        this.distsId = distsId;
    }
    public MfgId getMfgId() {
        return this.mfgId;
    }
    
    public void setMfgId(MfgId mfgId) {
        this.mfgId = mfgId;
    }
    public String getGameName() {
        return this.gameName;
    }
    
    public void setGameName(String gameName) {
        this.gameName = gameName;
    }
    public Double getGameCost() {
        return this.gameCost;
    }
    
    public void setGameCost(Double gameCost) {
        this.gameCost = gameCost;
    }
    public Double getTicketCost() {
        return this.ticketCost;
    }
    
    public void setTicketCost(Double ticketCost) {
        this.ticketCost = ticketCost;
    }
    public Integer getNumTickets() {
        return this.numTickets;
    }
    
    public void setNumTickets(Integer numTickets) {
        this.numTickets = numTickets;
    }
    public Integer getIdeaGross() {
        return this.ideaGross;
    }
    
    public void setIdeaGross(Integer ideaGross) {
        this.ideaGross = ideaGross;
    }
    public Integer getIdeaPrizes() {
        return this.ideaPrizes;
    }
    
    public void setIdeaPrizes(Integer ideaPrizes) {
        this.ideaPrizes = ideaPrizes;
    }
    public Integer getIdeaNet() {
        return this.ideaNet;
    }
    
    public void setIdeaNet(Integer ideaNet) {
        this.ideaNet = ideaNet;
    }
    public Integer getLastSale() {
        return this.lastSale;
    }
    
    public void setLastSale(Integer lastSale) {
        this.lastSale = lastSale;
    }
    public Integer getLastSaleAllow() {
        return this.lastSaleAllow;
    }
    
    public void setLastSaleAllow(Integer lastSaleAllow) {
        this.lastSaleAllow = lastSaleAllow;
    }
    public Integer getPrizeAmt1() {
        return this.prizeAmt1;
    }
    
    public void setPrizeAmt1(Integer prizeAmt1) {
        this.prizeAmt1 = prizeAmt1;
    }
    public Integer getPrizeAmt2() {
        return this.prizeAmt2;
    }
    
    public void setPrizeAmt2(Integer prizeAmt2) {
        this.prizeAmt2 = prizeAmt2;
    }
    public Integer getPrizeAmt3() {
        return this.prizeAmt3;
    }
    
    public void setPrizeAmt3(Integer prizeAmt3) {
        this.prizeAmt3 = prizeAmt3;
    }
    public Integer getPrizeAmt4() {
        return this.prizeAmt4;
    }
    
    public void setPrizeAmt4(Integer prizeAmt4) {
        this.prizeAmt4 = prizeAmt4;
    }
    public Integer getPrizeAmt5() {
        return this.prizeAmt5;
    }
    
    public void setPrizeAmt5(Integer prizeAmt5) {
        this.prizeAmt5 = prizeAmt5;
    }
    public Integer getPrizeAmt6() {
        return this.prizeAmt6;
    }
    
    public void setPrizeAmt6(Integer prizeAmt6) {
        this.prizeAmt6 = prizeAmt6;
    }
    public Integer getPrizeAmt7() {
        return this.prizeAmt7;
    }
    
    public void setPrizeAmt7(Integer prizeAmt7) {
        this.prizeAmt7 = prizeAmt7;
    }
    public Integer getPrizeAmt8() {
        return this.prizeAmt8;
    }
    
    public void setPrizeAmt8(Integer prizeAmt8) {
        this.prizeAmt8 = prizeAmt8;
    }
    public Integer getPrizeAmt9() {
        return this.prizeAmt9;
    }
    
    public void setPrizeAmt9(Integer prizeAmt9) {
        this.prizeAmt9 = prizeAmt9;
    }
    public Integer getPrizeAmt10() {
        return this.prizeAmt10;
    }
    
    public void setPrizeAmt10(Integer prizeAmt10) {
        this.prizeAmt10 = prizeAmt10;
    }
    public Integer getPrizeAmt11() {
        return this.prizeAmt11;
    }
    
    public void setPrizeAmt11(Integer prizeAmt11) {
        this.prizeAmt11 = prizeAmt11;
    }
    public Integer getPrizeAmt12() {
        return this.prizeAmt12;
    }
    
    public void setPrizeAmt12(Integer prizeAmt12) {
        this.prizeAmt12 = prizeAmt12;
    }
    public Integer getPrizeAmt13() {
        return this.prizeAmt13;
    }
    
    public void setPrizeAmt13(Integer prizeAmt13) {
        this.prizeAmt13 = prizeAmt13;
    }
    public Integer getPrizeAmt14() {
        return this.prizeAmt14;
    }
    
    public void setPrizeAmt14(Integer prizeAmt14) {
        this.prizeAmt14 = prizeAmt14;
    }
    public Integer getPrizeAmt15() {
        return this.prizeAmt15;
    }
    
    public void setPrizeAmt15(Integer prizeAmt15) {
        this.prizeAmt15 = prizeAmt15;
    }
    public Integer getPrizeAll1() {
        return this.prizeAll1;
    }
    
    public void setPrizeAll1(Integer prizeAll1) {
        this.prizeAll1 = prizeAll1;
    }
    public Integer getPrizeAll2() {
        return this.prizeAll2;
    }
    
    public void setPrizeAll2(Integer prizeAll2) {
        this.prizeAll2 = prizeAll2;
    }
    public Integer getPrizeAll3() {
        return this.prizeAll3;
    }
    
    public void setPrizeAll3(Integer prizeAll3) {
        this.prizeAll3 = prizeAll3;
    }
    public Integer getPrizeAll4() {
        return this.prizeAll4;
    }
    
    public void setPrizeAll4(Integer prizeAll4) {
        this.prizeAll4 = prizeAll4;
    }
    public Integer getPrizeAll5() {
        return this.prizeAll5;
    }
    
    public void setPrizeAll5(Integer prizeAll5) {
        this.prizeAll5 = prizeAll5;
    }
    public Integer getPrizeAll6() {
        return this.prizeAll6;
    }
    
    public void setPrizeAll6(Integer prizeAll6) {
        this.prizeAll6 = prizeAll6;
    }
    public Integer getPrizeAll7() {
        return this.prizeAll7;
    }
    
    public void setPrizeAll7(Integer prizeAll7) {
        this.prizeAll7 = prizeAll7;
    }
    public Integer getPrizeAll8() {
        return this.prizeAll8;
    }
    
    public void setPrizeAll8(Integer prizeAll8) {
        this.prizeAll8 = prizeAll8;
    }
    public Integer getPrizeAll9() {
        return this.prizeAll9;
    }
    
    public void setPrizeAll9(Integer prizeAll9) {
        this.prizeAll9 = prizeAll9;
    }
    public Integer getPrizeAll10() {
        return this.prizeAll10;
    }
    
    public void setPrizeAll10(Integer prizeAll10) {
        this.prizeAll10 = prizeAll10;
    }
    public Integer getPrizeAll11() {
        return this.prizeAll11;
    }
    
    public void setPrizeAll11(Integer prizeAll11) {
        this.prizeAll11 = prizeAll11;
    }
    public Integer getPrizeAll12() {
        return this.prizeAll12;
    }
    
    public void setPrizeAll12(Integer prizeAll12) {
        this.prizeAll12 = prizeAll12;
    }
    public Integer getPrizeAll13() {
        return this.prizeAll13;
    }
    
    public void setPrizeAll13(Integer prizeAll13) {
        this.prizeAll13 = prizeAll13;
    }
    public Integer getPrizeAll14() {
        return this.prizeAll14;
    }
    
    public void setPrizeAll14(Integer prizeAll14) {
        this.prizeAll14 = prizeAll14;
    }
    public Integer getPrizeAll15() {
        return this.prizeAll15;
    }
    
    public void setPrizeAll15(Integer prizeAll15) {
        this.prizeAll15 = prizeAll15;
    }




}


