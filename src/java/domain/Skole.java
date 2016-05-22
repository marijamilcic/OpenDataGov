/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author marij
 */
@Entity
@Table(name = "skole")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Skole.findAll", query = "SELECT s FROM Skole s"),
    @NamedQuery(name = "Skole.findByListSkolaId", query = "SELECT s FROM Skole s WHERE s.listSkolaId = :listSkolaId"),
    @NamedQuery(name = "Skole.findByListPostanskiBroj", query = "SELECT s FROM Skole s WHERE s.listPostanskiBroj = :listPostanskiBroj"),
    @NamedQuery(name = "Skole.findByListMesto", query = "SELECT s FROM Skole s WHERE s.listMesto = :listMesto"),
    @NamedQuery(name = "Skole.findByListAdresa", query = "SELECT s FROM Skole s WHERE s.listAdresa = :listAdresa"),
    @NamedQuery(name = "Skole.findByListPak", query = "SELECT s FROM Skole s WHERE s.listPak = :listPak"),
    @NamedQuery(name = "Skole.findByListNazivSkoleLat", query = "SELECT s FROM Skole s WHERE s.listNazivSkoleLat = :listNazivSkoleLat"),
    @NamedQuery(name = "Skole.findByListNazivSkole", query = "SELECT s FROM Skole s WHERE s.listNazivSkole = :listNazivSkole"),
    @NamedQuery(name = "Skole.findByListMaticniBroj", query = "SELECT s FROM Skole s WHERE s.listMaticniBroj = :listMaticniBroj"),
    @NamedQuery(name = "Skole.findByListTipSkole", query = "SELECT s FROM Skole s WHERE s.listTipSkole = :listTipSkole"),
    @NamedQuery(name = "Skole.findByListImeDirektora", query = "SELECT s FROM Skole s WHERE s.listImeDirektora = :listImeDirektora"),
    @NamedQuery(name = "Skole.findByListPrezimeDirektora", query = "SELECT s FROM Skole s WHERE s.listPrezimeDirektora = :listPrezimeDirektora"),
    @NamedQuery(name = "Skole.findByListWww", query = "SELECT s FROM Skole s WHERE s.listWww = :listWww"),
    @NamedQuery(name = "Skole.findByListTel", query = "SELECT s FROM Skole s WHERE s.listTel = :listTel"),
    @NamedQuery(name = "Skole.findByListFax", query = "SELECT s FROM Skole s WHERE s.listFax = :listFax"),
    @NamedQuery(name = "Skole.findByListVrstaId", query = "SELECT s FROM Skole s WHERE s.listVrstaId = :listVrstaId"),
    @NamedQuery(name = "Skole.findByListPodrucjeRada", query = "SELECT s FROM Skole s WHERE s.listPodrucjeRada = :listPodrucjeRada"),
    @NamedQuery(name = "Skole.findByListSmer", query = "SELECT s FROM Skole s WHERE s.listSmer = :listSmer"),
    @NamedQuery(name = "Skole.findByListJubilej", query = "SELECT s FROM Skole s WHERE s.listJubilej = :listJubilej"),
    @NamedQuery(name = "Skole.findByListRazlogJubileja", query = "SELECT s FROM Skole s WHERE s.listRazlogJubileja = :listRazlogJubileja"),
    @NamedQuery(name = "Skole.findByListNazivOpstina", query = "SELECT s FROM Skole s WHERE s.listNazivOpstina = :listNazivOpstina"),
    @NamedQuery(name = "Skole.findByListNazivOkruga", query = "SELECT s FROM Skole s WHERE s.listNazivOkruga = :listNazivOkruga"),
    @NamedQuery(name = "Skole.findByListNazivSu", query = "SELECT s FROM Skole s WHERE s.listNazivSu = :listNazivSu"),
    @NamedQuery(name = "Skole.findByListVrsta", query = "SELECT s FROM Skole s WHERE s.listVrsta = :listVrsta")})
public class Skole implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "list_skola_id")
    private Integer listSkolaId;
    @Column(name = "list_postanski_broj")
    private Integer listPostanskiBroj;
    @Size(max = 23)
    @Column(name = "list_mesto")
    private String listMesto;
    @Size(max = 42)
    @Column(name = "list_adresa")
    private String listAdresa;
    @Size(max = 6)
    @Column(name = "list_pak")
    private String listPak;
    @Size(max = 64)
    @Column(name = "list_naziv_skole_lat")
    private String listNazivSkoleLat;
    @Size(max = 66)
    @Column(name = "list_naziv_skole")
    private String listNazivSkole;
    @Column(name = "list_maticni_broj")
    private Integer listMaticniBroj;
    @Size(max = 49)
    @Column(name = "list_tip_skole")
    private String listTipSkole;
    @Size(max = 18)
    @Column(name = "list_ime_direktora")
    private String listImeDirektora;
    @Size(max = 19)
    @Column(name = "list_prezime_direktora")
    private String listPrezimeDirektora;
    @Size(max = 63)
    @Column(name = "list_www")
    private String listWww;
    @Size(max = 34)
    @Column(name = "list_tel")
    private String listTel;
    @Size(max = 14)
    @Column(name = "list_fax")
    private String listFax;
    @Column(name = "list_vrsta_id")
    private Integer listVrstaId;
    @Column(name = "list_podrucje_rada")
    private Integer listPodrucjeRada;
    @Column(name = "list_smer")
    private Integer listSmer;
    @Lob
    @Size(max = 16777215)
    @Column(name = "list_opis")
    private String listOpis;
    @Column(name = "list_jubilej")
    @Temporal(TemporalType.TIMESTAMP)
    private Date listJubilej;
    @Size(max = 681)
    @Column(name = "list_razlog_jubileja")
    private String listRazlogJubileja;
    @Size(max = 19)
    @Column(name = "list_naziv_opstina")
    private String listNazivOpstina;
    @Size(max = 19)
    @Column(name = "list_naziv_okruga")
    private String listNazivOkruga;
    @Size(max = 18)
    @Column(name = "list_naziv_su")
    private String listNazivSu;
    @Size(max = 31)
    @Column(name = "list_vrsta")
    private String listVrsta;
    @JoinColumn(name = "list_opstina_id", referencedColumnName = "\u0418\u0414 \u041e\u043f\u0448\u0442\u0438\u043d\u0430")
    @ManyToOne
    private Opstine listOpstinaId;

    public Skole() {
    }

    public Skole(Integer listSkolaId) {
        this.listSkolaId = listSkolaId;
    }

    public Integer getListSkolaId() {
        return listSkolaId;
    }

    public void setListSkolaId(Integer listSkolaId) {
        this.listSkolaId = listSkolaId;
    }

    public Integer getListPostanskiBroj() {
        return listPostanskiBroj;
    }

    public void setListPostanskiBroj(Integer listPostanskiBroj) {
        this.listPostanskiBroj = listPostanskiBroj;
    }

    public String getListMesto() {
        return listMesto;
    }

    public void setListMesto(String listMesto) {
        this.listMesto = listMesto;
    }

    public String getListAdresa() {
        return listAdresa;
    }

    public void setListAdresa(String listAdresa) {
        this.listAdresa = listAdresa;
    }

    public String getListPak() {
        return listPak;
    }

    public void setListPak(String listPak) {
        this.listPak = listPak;
    }

    public String getListNazivSkoleLat() {
        return listNazivSkoleLat;
    }

    public void setListNazivSkoleLat(String listNazivSkoleLat) {
        this.listNazivSkoleLat = listNazivSkoleLat;
    }

    public String getListNazivSkole() {
        return listNazivSkole;
    }

    public void setListNazivSkole(String listNazivSkole) {
        this.listNazivSkole = listNazivSkole;
    }

    public Integer getListMaticniBroj() {
        return listMaticniBroj;
    }

    public void setListMaticniBroj(Integer listMaticniBroj) {
        this.listMaticniBroj = listMaticniBroj;
    }

    public String getListTipSkole() {
        return listTipSkole;
    }

    public void setListTipSkole(String listTipSkole) {
        this.listTipSkole = listTipSkole;
    }

    public String getListImeDirektora() {
        return listImeDirektora;
    }

    public void setListImeDirektora(String listImeDirektora) {
        this.listImeDirektora = listImeDirektora;
    }

    public String getListPrezimeDirektora() {
        return listPrezimeDirektora;
    }

    public void setListPrezimeDirektora(String listPrezimeDirektora) {
        this.listPrezimeDirektora = listPrezimeDirektora;
    }

    public String getListWww() {
        return listWww;
    }

    public void setListWww(String listWww) {
        this.listWww = listWww;
    }

    public String getListTel() {
        return listTel;
    }

    public void setListTel(String listTel) {
        this.listTel = listTel;
    }

    public String getListFax() {
        return listFax;
    }

    public void setListFax(String listFax) {
        this.listFax = listFax;
    }

    public Integer getListVrstaId() {
        return listVrstaId;
    }

    public void setListVrstaId(Integer listVrstaId) {
        this.listVrstaId = listVrstaId;
    }

    public Integer getListPodrucjeRada() {
        return listPodrucjeRada;
    }

    public void setListPodrucjeRada(Integer listPodrucjeRada) {
        this.listPodrucjeRada = listPodrucjeRada;
    }

    public Integer getListSmer() {
        return listSmer;
    }

    public void setListSmer(Integer listSmer) {
        this.listSmer = listSmer;
    }

    public String getListOpis() {
        return listOpis;
    }

    public void setListOpis(String listOpis) {
        this.listOpis = listOpis;
    }

    public Date getListJubilej() {
        return listJubilej;
    }

    public void setListJubilej(Date listJubilej) {
        this.listJubilej = listJubilej;
    }

    public String getListRazlogJubileja() {
        return listRazlogJubileja;
    }

    public void setListRazlogJubileja(String listRazlogJubileja) {
        this.listRazlogJubileja = listRazlogJubileja;
    }

    public String getListNazivOpstina() {
        return listNazivOpstina;
    }

    public void setListNazivOpstina(String listNazivOpstina) {
        this.listNazivOpstina = listNazivOpstina;
    }

    public String getListNazivOkruga() {
        return listNazivOkruga;
    }

    public void setListNazivOkruga(String listNazivOkruga) {
        this.listNazivOkruga = listNazivOkruga;
    }

    public String getListNazivSu() {
        return listNazivSu;
    }

    public void setListNazivSu(String listNazivSu) {
        this.listNazivSu = listNazivSu;
    }

    public String getListVrsta() {
        return listVrsta;
    }

    public void setListVrsta(String listVrsta) {
        this.listVrsta = listVrsta;
    }

    public Opstine getListOpstinaId() {
        return listOpstinaId;
    }

    public void setListOpstinaId(Opstine listOpstinaId) {
        this.listOpstinaId = listOpstinaId;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (listSkolaId != null ? listSkolaId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Skole)) {
            return false;
        }
        Skole other = (Skole) object;
        if ((this.listSkolaId == null && other.listSkolaId != null) || (this.listSkolaId != null && !this.listSkolaId.equals(other.listSkolaId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "domain.Skole[ listSkolaId=" + listSkolaId + " ]";
    }
    
}
