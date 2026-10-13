public class Client {
    private string cin;
    private string nom;
    private string prenom;
    private string telephone;
    public Client (string cin, string nom, string prenom, string telephone){
        this.cin=cin;
        this.nom=nom;
        this.prenom=prenom;
        this.telephone=teephone;
    }
    public string Getcin(){ return cin;}
    public void  Setcin(string cin){ this.cin=cin;}
    public string Getnom(){ this.nom=nom; }
    public void Setnom(string nom) { this.nom=nom;}
    public string Getprenom(){ return prenom; }
    public void Setprenom(string prenom ){ this.prenom=prenom; }
    public String getTelephone() { return telephone; }
    public void setTelephone(String telephone) { this.telephone = telephone; }
    public void afficherClient(){
        system.out.printLn("[CIN:" + cin + " ] nom & prenom: " +nom+ "" +prenom+ "| Tél: " + telephone);
    }
}