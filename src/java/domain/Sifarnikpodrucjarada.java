/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marij
 */
@Entity
@Table(name = "sifarnikpodrucjarada")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Sifarnikpodrucjarada.findAll", query = "SELECT s FROM Sifarnikpodrucjarada s"),
    @NamedQuery(name = "Sifarnikpodrucjarada.findBy\u0418\u0414\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430", query = "SELECT s FROM Sifarnikpodrucjarada s WHERE s.\u0438\u0414\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430 = :\u0438\u0414\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430"),
    @NamedQuery(name = "Sifarnikpodrucjarada.findBy\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430", query = "SELECT s FROM Sifarnikpodrucjarada s WHERE s.\u043f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430 = :\u043f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430")})
public class Sifarnikpodrucjarada implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "\u0418\u0414 \u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435 \u0440\u0430\u0434\u0430")
    private Integer иДПодручјерада;
    @Size(max = 75)
    @Column(name = "\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435 \u0440\u0430\u0434\u0430")
    private String подручјерада;

    public Sifarnikpodrucjarada() {
    }

    public Sifarnikpodrucjarada(Integer иДПодручјерада) {
        this.иДПодручјерада = иДПодручјерада;
    }

    public Integer getИДПодручјерада() {
        return иДПодручјерада;
    }

    public void setИДПодручјерада(Integer иДПодручјерада) {
        this.иДПодручјерада = иДПодручјерада;
    }

    public String getПодручјерада() {
        return подручјерада;
    }

    public void setПодручјерада(String подручјерада) {
        this.подручјерада = подручјерада;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (иДПодручјерада != null ? иДПодручјерада.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sifarnikpodrucjarada)) {
            return false;
        }
        Sifarnikpodrucjarada other = (Sifarnikpodrucjarada) object;
        if ((this.иДПодручјерада == null && other.иДПодручјерада != null) || (this.иДПодручјерада != null && !this.иДПодручјерада.equals(other.иДПодручјерада))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Sifarnikpodrucjarada[ \u0438\u0414\u041f\u043e\u0434\u0440\u0443\u0447\u0458\u0435\u0440\u0430\u0434\u0430=" + иДПодручјерада + " ]";
    }
    
}
