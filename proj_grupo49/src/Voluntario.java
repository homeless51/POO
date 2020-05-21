import java.util.ArrayList;
import java.util.List;

/**
 * Write a description of class Voluntario here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Voluntario
{
    private String pass;
    private String cod;
    private String nome;
    private GPS gps;
    private double raio;
    private boolean livre;
    private List<Encomenda> listenc;

    public Voluntario()
    {
        this.pass = new String();
        this.cod = new String();
        this.nome = new String();
        this.gps = new GPS();
        this.raio = 0;
        this.livre = true;
        this.listenc = new ArrayList<>();
    }

    public Voluntario (String s, String n, GPS gps, double r, boolean b, ArrayList<Encomenda> lista)
    {
        this.pass = s;
        this.cod = s;
        this.nome = n;
        this.gps = gps.clone();
        this.raio =r;
        this.livre = b;
        this.setList(lista);

    }
    public Voluntario (String p, String s, String n, GPS gps, double r)
    {
        this.pass = s;
        this.cod = s;
        this.nome = n;
        this.gps = gps.clone();
        this.raio =r;
        this.livre = true;
        this.listenc = new ArrayList<>();

    }

    public Voluntario (Voluntario u)
    {
        this.pass = u.getPass();
        this.cod = u.getCod();
        this.nome = u.getNome();
        this.gps = new GPS(u.getGPS());
        this.raio = u.getRaio();
        this.livre = u.getLivre();
        this.setList(u.getList());
    }
    public void setPass(String p){this.pass = p;}

    public String getPass(){return this.pass;}

    public String getCod()
    {
        return this.cod;
    }

    public String getNome()
    {
        return this.nome;
    }

    public GPS getGPS()
    {
        return this.gps;
    }

    public double getRaio()
    {
        return this.raio;
    }

    public boolean getLivre()
    {
        return this.livre;
    }

    public ArrayList<Encomenda> getList() {
        ArrayList<Encomenda> aux = new ArrayList<>();
        for (Encomenda l : this.listenc)
            aux.add(l);
        return aux;
    }

    public void setList (ArrayList<Encomenda> l)
    {
        this.listenc = new ArrayList<>();
        for(Encomenda li : l)
            this.listenc.add(li);
    }

    public void setCod(String s)
    {
        this.cod = s;
    }

    public void setNome(String n)
    {
        this.nome = n;
    }

    public void setGPS (double l, double lo)
    {
        this.gps.setGPS(l,lo);
    }

    public void setRaio (double r)
    {
        this.raio = r;
    }

    public void setLivre(boolean b)
    {
        this.livre = b;
    }

    public Voluntario clone()
    {
        return new Voluntario(this);
    }

    public boolean equals (Object o)
    {
        if (o == this) return true;
        if (o == null || o.getClass() != this.getClass()) return false;
        Voluntario u = (Voluntario) o;
        return this.cod.equals(u.getCod()) &&
               this.nome.equals(u.getNome()) &&
               this.gps.equals(u.getGPS()) &&
               this.raio == u.getRaio() &&
               this.livre == u.getLivre();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Voluntario{");
        sb.append("cod='").append(cod).append('\'');
        sb.append(", nome='").append(nome).append('\'');
        sb.append(", gps=").append(gps);
        sb.append(", raio=").append(raio);
        sb.append(", livre=").append(livre);
        sb.append(", listenc=").append(listenc);
        sb.append('}');
        return sb.toString();
    }
    public boolean validaPass(String p){
        return this.pass.equals(p);
    }
}