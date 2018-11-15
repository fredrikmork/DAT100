package JP11Oppg2;

public class Sang {
  private String tittel;
  private int tid;
  private Sjanger genre;
  
  public Sang(String tittel, int tid, Sjanger genre) {
    this.tittel = tittel;
    this.tid = tid;
    this.genre = genre;
  }
  
  public enum Sjanger{POP,ROCK,EDM};
  
  public String getTittel () {
    return tittel;
  }
  public int getTid () {
    return tid;
  }
  public Sjanger getGenre () {
    return genre;
  }
  public void setTittel(String tittel){
    this.tittel = tittel;
  }
  public void setTid(int tid){
    this.tid = tid;
  }
  public void setGenre(Sjanger genre){
    this.genre = genre;
  }
 
  public void skrivUt() {
    String print = "Tittel: " + getTittel() + "\nTid(s): " + getTid() + "\nGenre: " + getGenre() + "\n";
    System.out.println(print);
  }
}
