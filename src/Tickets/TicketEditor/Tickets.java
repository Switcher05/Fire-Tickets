/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tickets.TicketEditor;

import java.io.Serializable;

/**
 *
 * @author Ryan
 */
public class Tickets implements Serializable{
    //Constants
    private static long serialVersionUID = 1L;
    private String serial;
    private String datePlaced;
    private String dateRemoved;
    public String invoiceNum;
    public String datePurchased;
    private String game_templates_part_num;
    private int unsoldAmt;
    private int unsoldTickets;
    private int actualGross;
    private int actualPrizes;
    private int actualNet;
    private int bin;
    private int inplay;
    private int lastSaleRem;
    private int distID;
    private int mfgID;
    private String partNum;
    private int prizeRem1;
    private int prizeRem2;
    private int prizeRem3;
    private int prizeRem4;
    private int prizeRem5;
    private int prizeRem6;
    private int prizeRem7;
    private int prizeRem8;
    private int prizeRem9;
    private int prizeRem10;
    private int prizeRem11;
    private int prizeRem12;
    private int prizeRem13;
    private int prizeRem14;
    private int prizeRem15;


    
    //Getters/setters
    public String getSerial(){
        return serial;
    }
    public void setSerial(String serial){
        this.serial = serial;
    }
    public int getUnsoldAmt(){
        return unsoldAmt;
    }
    public void setUnsoldAmt(int unsoldAmt){
        this.unsoldAmt = unsoldAmt;
    }
    public int getUnsoldTickets(){
        return unsoldTickets;
    }
    public void setUnsoldTickets(int unsoldTickets){
        this.unsoldTickets = unsoldTickets;
    }
    public String getDatePlaced(){
        return datePlaced;
    }
    public void setDatePlaced(String datePlaced){
    this.datePlaced = datePlaced;
    }
    public String getDateRemoved (){
        return dateRemoved;
    }
    public void setDateRemoved(String dateRemoved){
        this.dateRemoved = dateRemoved;
    }
    public int getActualGross(){
        return actualGross;
    }
    public void setActualGross(int actualGross){
        this.actualGross = actualGross;
    }

    /**
     * @return the serialVersionUID
     */
    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * @param aSerialVersionUID the serialVersionUID to set
     */
    public static void setSerialVersionUID(long aSerialVersionUID) {
        serialVersionUID = aSerialVersionUID;
    }

    /**
     * @return the game_templates_part_num
     */
    public String getGame_templates_part_num() {
        return game_templates_part_num;
    }

    /**
     * @param game_templates_part_num the game_templates_part_num to set
     */
    public void setGame_templates_part_num(String game_templates_part_num) {
        this.game_templates_part_num = game_templates_part_num;
    }

    /**
     * @return the actualPrizes
     */
    public int getActualPrizes() {
        return actualPrizes;
    }

    /**
     * @param actualPrizes the actualPrizes to set
     */
    public void setActualPrizes(int actualPrizes) {
        this.actualPrizes = actualPrizes;
    }

    /**
     * @return the actualNet
     */
    public int getActualNet() {
        return actualNet;
    }

    /**
     * @param actualNet the actualNet to set
     */
    public void setActualNet(int actualNet) {
        this.actualNet = actualNet;
    }

    /**
     * @return the bin
     */
    public int getBin() {
        return bin;
    }

    /**
     * @param bin the bin to set
     */
    public void setBin(int bin) {
        this.bin = bin;
    }

    /**
     * @return the inplay
     */
    public int getInplay() {
        return inplay;
    }

    /**
     * @param inplay the inplay to set
     */
    public void setInplay(int inplay) {
        this.inplay = inplay;
    }

    /**
     * @return the lastSaleRem
     */
    public int getLastSaleRem() {
        return lastSaleRem;
    }

    /**
     * @param lastSaleRem the lastSaleRem to set
     */
    public void setLastSaleRem(int lastSaleRem) {
        this.lastSaleRem = lastSaleRem;
    }

    /**
     * @return the distID
     */
    public int getDistID() {
        return distID;
    }

    /**
     * @param distID the distID to set
     */
    public void setDistID(int distID) {
        this.distID = distID;
    }

    /**
     * @return the mfgID
     */
    public int getMfgID() {
        return mfgID;
    }

    /**
     * @param mfgID the mfgID to set
     */
    public void setMfgID(int mfgID) {
        this.mfgID = mfgID;
    }
    public String getPartNum(){
        return partNum;
    }
    public void setPartNum(String partNum){
        this.partNum = partNum;
    }
    /**
     * @return the prizeRem1
     */
    public int getPrizeRem1() {
        return prizeRem1;
    }

    /**
     * @param prizeRem1 the prizeRem1 to set
     */
    public void setPrizeRem1(int prizeRem1) {
        this.prizeRem1 = prizeRem1;
    }

    /**
     * @return the prizeRem2
     */
    public int getPrizeRem2() {
        return prizeRem2;
    }

    /**
     * @param prizeRem2 the prizeRem2 to set
     */
    public void setPrizeRem2(int prizeRem2) {
        this.prizeRem2 = prizeRem2;
    }

    /**
     * @return the prizeRem3
     */
    public int getPrizeRem3() {
        return prizeRem3;
    }

    /**
     * @param prizeRem3 the prizeRem3 to set
     */
    public void setPrizeRem3(int prizeRem3) {
        this.prizeRem3 = prizeRem3;
    }

    /**
     * @return the prizeRem4
     */
    public int getPrizeRem4() {
        return prizeRem4;
    }

    /**
     * @param prizeRem4 the prizeRem4 to set
     */
    public void setPrizeRem4(int prizeRem4) {
        this.prizeRem4 = prizeRem4;
    }

    /**
     * @return the prizeRem5
     */
    public int getPrizeRem5() {
        return prizeRem5;
    }

    /**
     * @param prizeRem5 the prizeRem5 to set
     */
    public void setPrizeRem5(int prizeRem5) {
        this.prizeRem5 = prizeRem5;
    }

    /**
     * @return the prizeRem6
     */
    public int getPrizeRem6() {
        return prizeRem6;
    }

    /**
     * @param prizeRem6 the prizeRem6 to set
     */
    public void setPrizeRem6(int prizeRem6) {
        this.prizeRem6 = prizeRem6;
    }

    /**
     * @return the prizeRem7
     */
    public int getPrizeRem7() {
        return prizeRem7;
    }

    /**
     * @param prizeRem7 the prizeRem7 to set
     */
    public void setPrizeRem7(int prizeRem7) {
        this.prizeRem7 = prizeRem7;
    }

    /**
     * @return the prizeRem8
     */
    public int getPrizeRem8() {
        return prizeRem8;
    }

    /**
     * @param prizeRem8 the prizeRem8 to set
     */
    public void setPrizeRem8(int prizeRem8) {
        this.prizeRem8 = prizeRem8;
    }

    /**
     * @return the prizeRem9
     */
    public int getPrizeRem9() {
        return prizeRem9;
    }

    /**
     * @param prizeRem9 the prizeRem9 to set
     */
    public void setPrizeRem9(int prizeRem9) {
        this.prizeRem9 = prizeRem9;
    }

    /**
     * @return the prizeRem10
     */
    public int getPrizeRem10() {
        return prizeRem10;
    }

    /**
     * @param prizeRem10 the prizeRem10 to set
     */
    public void setPrizeRem10(int prizeRem10) {
        this.prizeRem10 = prizeRem10;
    }

    /**
     * @return the prizeRem11
     */
    public int getPrizeRem11() {
        return prizeRem11;
    }

    /**
     * @param prizeRem11 the prizeRem11 to set
     */
    public void setPrizeRem11(int prizeRem11) {
        this.prizeRem11 = prizeRem11;
    }

    /**
     * @return the prizeRem12
     */
    public int getPrizeRem12() {
        return prizeRem12;
    }

    /**
     * @param prizeRem12 the prizeRem12 to set
     */
    public void setPrizeRem12(int prizeRem12) {
        this.prizeRem12 = prizeRem12;
    }

    /**
     * @return the prizeRem13
     */
    public int getPrizeRem13() {
        return prizeRem13;
    }

    /**
     * @param prizeRem13 the prizeRem13 to set
     */
    public void setPrizeRem13(int prizeRem13) {
        this.prizeRem13 = prizeRem13;
    }

    /**
     * @return the prizeRem14
     */
    public int getPrizeRem14() {
        return prizeRem14;
    }

    /**
     * @param prizeRem14 the prizeRem14 to set
     */
    public void setPrizeRem14(int prizeRem14) {
        this.prizeRem14 = prizeRem14;
    }

    /**
     * @return the prizeRem15
     */
    public int getPrizeRem15() {
        return prizeRem15;
    }

    /**
     * @param prizeRem15 the prizeRem15 to set
     */
    public void setPrizeRem15(int prizeRem15) {
        this.prizeRem15 = prizeRem15;
    }

    
    
    //object overrides
    @Override
    //should compare tickets by serial
    public boolean equals(Object other){
        return (other instanceof Tickets) && (getSerial() != null)
                ? getSerial().equals(((Tickets)other).getSerial())
                :(other == this);
    }
    //ticket serial unique for each ticket so each ticket serial should return same hash code
    @Override
    public int hashCode(){
        return (getSerial() != null)
                ? (this.getClass().hashCode() + getSerial().hashCode())
                : super.hashCode();
    }
    @Override
    public String toString(){
        return String.format("\n Ticket serial [serial=%s, date purchased: =%s, invoice number=%s, dateplaced=%s, dateremoved=%s, actualgross=%d, acutalnet=%d, actualprizes=%d, unsoldamt=%d, unsoldtick=%d, bin=%d, inplay=%d, distID=%d, mfgID=%d, partnum=%s, prizerem1=%d]",
                getSerial(), getDatePurchased(), getInvoiceNum(), getDatePlaced(), getDateRemoved(), getActualGross(), getActualNet(), getActualPrizes(),getUnsoldAmt(), getUnsoldTickets(), getBin(), getInplay(), getDistID(), getMfgID(), getPartNum(), getPrizeRem1());
    }

    /**
     * @return the invoiceNum
     */
    public String getInvoiceNum() {
        return invoiceNum;
    }

    /**
     * @param invoiceNum the invoiceNum to set
     */
    public void setInvoiceNum(String invoiceNum) {
        this.invoiceNum = invoiceNum;
    }

    /**
     * @return the datePurchased
     */
    public String getDatePurchased() {
        return datePurchased;
    }

    /**
     * @param datePurchased the datePurchased to set
     */
    public void setDatePurchased(String datePurchased) {
        this.datePurchased = datePurchased;
    }

    
}

