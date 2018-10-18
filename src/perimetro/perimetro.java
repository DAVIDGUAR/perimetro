package perimetro;


public class perimetro {
    
    private float base,altura;
    
    //contructores por defecto
    
    public perimetro(){
    }

    
    //metodos
    
     public void setBase(float b){
        base=b;
    }
    public float getBase(){
        return base;
    }
    public void setAltura(float h){
        altura=h;
        
    }
    public float getAltura(){
        return altura;
    }
    public float calculoPerimetro(){
        float perimetro;
        perimetro=(base*2)+(altura*2);
        return perimetro;
    }
    
}
