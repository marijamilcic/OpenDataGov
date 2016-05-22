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
@Table(name = "postojecismerovi")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Postojecismerovi.findAll", query = "SELECT p FROM Postojecismerovi p"),
    @NamedQuery(name = "Postojecismerovi.findBySsSmerId", query = "SELECT p FROM Postojecismerovi p WHERE p.ssSmerId = :ssSmerId"),
    @NamedQuery(name = "Postojecismerovi.findByNaziv", query = "SELECT p FROM Postojecismerovi p WHERE p.naziv = :naziv"),
    @NamedQuery(name = "Postojecismerovi.findByNazivKonkurs", query = "SELECT p FROM Postojecismerovi p WHERE p.nazivKonkurs = :nazivKonkurs"),
    @NamedQuery(name = "Postojecismerovi.findByPodrucjeRada", query = "SELECT p FROM Postojecismerovi p WHERE p.podrucjeRada = :podrucjeRada"),
    @NamedQuery(name = "Postojecismerovi.findByTrajanje", query = "SELECT p FROM Postojecismerovi p WHERE p.trajanje = :trajanje"),
    @NamedQuery(name = "Postojecismerovi.findByKompetencije", query = "SELECT p FROM Postojecismerovi p WHERE p.kompetencije = :kompetencije"),
    @NamedQuery(name = "Postojecismerovi.findByKvalifikacije", query = "SELECT p FROM Postojecismerovi p WHERE p.kvalifikacije = :kvalifikacije"),
    @NamedQuery(name = "Postojecismerovi.findByOpisZanimanja", query = "SELECT p FROM Postojecismerovi p WHERE p.opisZanimanja = :opisZanimanja"),
    @NamedQuery(name = "Postojecismerovi.findByKomentar", query = "SELECT p FROM Postojecismerovi p WHERE p.komentar = :komentar"),
    @NamedQuery(name = "Postojecismerovi.findByOgled", query = "SELECT p FROM Postojecismerovi p WHERE p.ogled = :ogled"),
    @NamedQuery(name = "Postojecismerovi.findBySluzbeniGlasnik", query = "SELECT p FROM Postojecismerovi p WHERE p.sluzbeniGlasnik = :sluzbeniGlasnik")})
public class Postojecismerovi implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ss_smer_id")
    private Integer ssSmerId;
    @Size(max = 172)
    @Column(name = "naziv")
    private String naziv;
    @Size(max = 137)
    @Column(name = "naziv_konkurs")
    private String nazivKonkurs;
    @Column(name = " podrucje_rada")
    private Integer podrucjeRada;
    @Size(max = 1)
    @Column(name = "trajanje")
    private String trajanje;
    @Size(max = 7328)
    @Column(name = "kompetencije")
    private String kompetencije;
    @Size(max = 2164)
    @Column(name = "kvalifikacije")
    private String kvalifikacije;
    @Size(max = 2889)
    @Column(name = "opis_zanimanja")
    private String opisZanimanja;
    @Size(max = 121)
    @Column(name = "komentar")
    private String komentar;
    @Size(max = 1)
    @Column(name = "ogled")
    private String ogled;
    @Size(max = 43)
    @Column(name = "sluzbeni_glasnik")
    private String sluzbeniGlasnik;

    public Postojecismerovi() {
    }

    public Postojecismerovi(Integer ssSmerId) {
        this.ssSmerId = ssSmerId;
    }

    public Integer getSsSmerId() {
        return ssSmerId;
    }

    public void setSsSmerId(Integer ssSmerId) {
        this.ssSmerId = ssSmerId;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public String getNazivKonkurs() {
        return nazivKonkurs;
    }

    public void setNazivKonkurs(String nazivKonkurs) {
        this.nazivKonkurs = nazivKonkurs;
    }

    public Integer getPodrucjeRada() {
        return podrucjeRada;
    }

    public void setPodrucjeRada(Integer podrucjeRada) {
        this.podrucjeRada = podrucjeRada;
    }

    public String getTrajanje() {
        return trajanje;
    }

    public void setTrajanje(String trajanje) {
        this.trajanje = trajanje;
    }

    public String getKompetencije() {
        return kompetencije;
    }

    public void setKompetencije(String kompetencije) {
        this.kompetencije = kompetencije;
    }

    public String getKvalifikacije() {
        return kvalifikacije;
    }

    public void setKvalifikacije(String kvalifikacije) {
        this.kvalifikacije = kvalifikacije;
    }

    public String getOpisZanimanja() {
        return opisZanimanja;
    }

    public void setOpisZanimanja(String opisZanimanja) {
        this.opisZanimanja = opisZanimanja;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }

    public String getOgled() {
        return ogled;
    }

    public void setOgled(String ogled) {
        this.ogled = ogled;
    }

    public String getSluzbeniGlasnik() {
        return sluzbeniGlasnik;
    }

    public void setSluzbeniGlasnik(String sluzbeniGlasnik) {
        this.sluzbeniGlasnik = sluzbeniGlasnik;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (ssSmerId != null ? ssSmerId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Postojecismerovi)) {
            return false;
        }
        Postojecismerovi other = (Postojecismerovi) object;
        if ((this.ssSmerId == null && other.ssSmerId != null) || (this.ssSmerId != null && !this.ssSmerId.equals(other.ssSmerId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Postojecismerovi[ ssSmerId=" + ssSmerId + " ]";
    }
    
}
