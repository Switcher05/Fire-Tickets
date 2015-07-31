package entity;
// Generated Jul 18, 2015 10:35:28 PM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * GameTemplatesId generated by hbm2java
 */
@Embeddable
public class GameTemplatesId  implements java.io.Serializable {


     private String partNum;
     private int distsIdDistId;
     private int mfgIdMfgId;

    public GameTemplatesId() {
    }

    public GameTemplatesId(String partNum, int distsIdDistId, int mfgIdMfgId) {
       this.partNum = partNum;
       this.distsIdDistId = distsIdDistId;
       this.mfgIdMfgId = mfgIdMfgId;
    }
   


    @Column(name="part_num", unique=true, nullable=false, length=12)
    public String getPartNum() {
        return this.partNum;
    }
    
    public void setPartNum(String partNum) {
        this.partNum = partNum;
    }


    @Column(name="dists_id_dist_id", nullable=false)
    public int getDistsIdDistId() {
        return this.distsIdDistId;
    }
    
    public void setDistsIdDistId(int distsIdDistId) {
        this.distsIdDistId = distsIdDistId;
    }


    @Column(name="mfg_id_mfg_id", nullable=false)
    public int getMfgIdMfgId() {
        return this.mfgIdMfgId;
    }
    
    public void setMfgIdMfgId(int mfgIdMfgId) {
        this.mfgIdMfgId = mfgIdMfgId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof GameTemplatesId) ) return false;
		 GameTemplatesId castOther = ( GameTemplatesId ) other; 
         
		 return ( (this.getPartNum()==castOther.getPartNum()) || ( this.getPartNum()!=null && castOther.getPartNum()!=null && this.getPartNum().equals(castOther.getPartNum()) ) )
 && (this.getDistsIdDistId()==castOther.getDistsIdDistId())
 && (this.getMfgIdMfgId()==castOther.getMfgIdMfgId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + ( getPartNum() == null ? 0 : this.getPartNum().hashCode() );
         result = 37 * result + this.getDistsIdDistId();
         result = 37 * result + this.getMfgIdMfgId();
         return result;
   }   


}


