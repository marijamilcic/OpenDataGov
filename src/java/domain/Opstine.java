/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author marij
 */
@Entity
@Table(name = "opstine")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Opstine.findAll", query = "SELECT o FROM Opstine o"),
    @NamedQuery(name = "Opstine.findBy\u0418\u0414\u041e\u043f\u0448\u0442\u0438\u043d\u0430", query = "SELECT o FROM Opstine o WHERE o.\u0438\u0414\u041e\u043f\u0448\u0442\u0438\u043d\u0430 = :\u0438\u0414\u041e\u043f\u0448\u0442\u0438\u043d\u0430"),
    @NamedQuery(name = "Opstine.findBy\u0418\u0414\u041e\u043a\u0440\u0443\u0433", query = "SELECT o FROM Opstine o WHERE o.\u0438\u0414\u041e\u043a\u0440\u0443\u0433 = :\u0438\u0414\u041e\u043a\u0440\u0443\u0433"),
    @NamedQuery(name = "Opstine.findBy\u041e\u043f\u0448\u0442\u0438\u043d\u0430", query = "SELECT o FROM Opstine o WHERE o.\u043e\u043f\u0448\u0442\u0438\u043d\u0430 = :\u043e\u043f\u0448\u0442\u0438\u043d\u0430"),
    @NamedQuery(name = "Opstine.findBy\u041e\u043f\u0448\u0442\u0438\u043d\u0430\u043b\u0430\u0442\u0438\u043d\u0438\u0446\u0430", query = "SELECT o FROM Opstine o WHERE o.\u043e\u043f\u0448\u0442\u0438\u043d\u0430\u043b\u0430\u0442\u0438\u043d\u0438\u0446\u0430 = :\u043e\u043f\u0448\u0442\u0438\u043d\u0430\u043b\u0430\u0442\u0438\u043d\u0438\u0446\u0430")})
public class Opstine implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\u0418\u0414 \u041e\u043f\u0448\u0442\u0438\u043d\u0430")
    private Integer иДОпштина;
    @Column(name = "\u0418\u0414 \u041e\u043a\u0440\u0443\u0433")
    private Integer иДОкруг;
    @Size(max = 37)
    @Column(name = "\u041e\u043f\u0448\u0442\u0438\u043d\u0430")
    private String општина;
    @Size(max = 19)
    @Column(name = "\u041e\u043f\u0448\u0442\u0438\u043d\u0430 (\u043b\u0430\u0442\u0438\u043d\u0438\u0446\u0430)")
    private String општиналатиница;
    @OneToMany(mappedBy = "listOpstinaId")
    private Collection<Skole> skoleCollection;

    public Opstine() {
    }

    public Opstine(Integer иДОпштина) {
        this.иДОпштина = иДОпштина;
    }

    public Integer getИДОпштина() {
        return иДОпштина;
    }

    public void setИДОпштина(Integer иДОпштина) {
        this.иДОпштина = иДОпштина;
    }

    public Integer getИДОкруг() {
        return иДОкруг;
    }

    public void setИДОкруг(Integer иДОкруг) {
        this.иДОкруг = иДОкруг;
    }

    public String getОпштина() {
        return општина;
    }

    public void setОпштина(String општина) {
        this.општина = општина;
    }

    public String getОпштиналатиница() {
        return општиналатиница;
    }

    public void setОпштиналатиница(String општиналатиница) {
        this.општиналатиница = општиналатиница;
    }

    @XmlTransient
    public Collection<Skole> getSkoleCollection() {
        return skoleCollection;
    }

    public void setSkoleCollection(Collection<Skole> skoleCollection) {
        this.skoleCollection = skoleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (иДОпштина != null ? иДОпштина.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Opstine)) {
            return false;
        }
        Opstine other = (Opstine) object;
        if ((this.иДОпштина == null && other.иДОпштина != null) || (this.иДОпштина != null && !this.иДОпштина.equals(other.иДОпштина))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Opstine[ \u0438\u0414\u041e\u043f\u0448\u0442\u0438\u043d\u0430=" + иДОпштина + " ]";
    }
    
}
