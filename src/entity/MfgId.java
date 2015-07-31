package entity;
// Generated Jul 18, 2015 10:35:28 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * MfgId generated by hbm2java
 */
@Entity
@Table(name="mfg_id"
    ,catalog="fire_tickets"
)
public class MfgId  implements java.io.Serializable {


     private Integer mfgId;
     private String name;
     private String mfgAbr;
     private Set gameTemplateses = new HashSet(0);

    public MfgId() {
    }

    public MfgId(String name, String mfgAbr, Set gameTemplateses) {
       this.name = name;
       this.mfgAbr = mfgAbr;
       this.gameTemplateses = gameTemplateses;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="mfg_id", unique=true, nullable=false)
    public Integer getMfgId() {
        return this.mfgId;
    }
    
    public void setMfgId(Integer mfgId) {
        this.mfgId = mfgId;
    }

    
    @Column(name="name", length=20)
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    
    @Column(name="mfg_abr", length=12)
    public String getMfgAbr() {
        return this.mfgAbr;
    }
    
    public void setMfgAbr(String mfgAbr) {
        this.mfgAbr = mfgAbr;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="mfgId")
    public Set getGameTemplateses() {
        return this.gameTemplateses;
    }
    
    public void setGameTemplateses(Set gameTemplateses) {
        this.gameTemplateses = gameTemplateses;
    }




}


