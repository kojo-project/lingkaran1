class main {
    //artribut
    private int celcius;
    private int fahreheit;
    int temp;

    //konstruktor
    public Konverensisuhu (int celcius)
    {
        this.celcius = celcius;
    
    }
     public float Hitungsuhu(){
        return (9/5)+celcius+32;
     }

     public float getcelcius()
     {
        return celcius;
     }
}
//main program
public class main {
    public static void main(string[]args) {
        suhu hitung = new Konverensisuhu (celcius:25);
        
        float fahreheit = hitung.Hitungsuhu();
    }
}
