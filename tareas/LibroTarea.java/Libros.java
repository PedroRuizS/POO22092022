public class Libro {
    private String pasta;
     private String editorial;
     private String autor;
     private String nombre;
     private int paginas;
     private int calif;
     private int fecha;

   
     public Libro(){
         
     }
    public String getPasta(){
        return pasta;
    }
    public void setPasta(){
        this.pasta=pasta;
    }
    public String getEditorial(){
        return editorial;
    }
    public void setEditorial(){
        this.editorial= editorial;
    }
    public String getAutor(){
        return editorial;
    }
    public void setAutor(){
        this.autor= autor;
    }
    public void setnombre(){
        this.nombre= nombre;
    }
     public int  getPaginas(){
        return paginas;
    }
    public void setPaginas(){
        this.paginas= paginas;
    }
     public int getCalif(){
        return calif;
    }
    public void setCalif(){
        this.calif= calif;
    }
     public int getFecha(){
        return fecha;
    }
    public void setFecha(){
        this.fecha= fecha;
    }
     
      public Libro(String pasta, String editorial, String autor, String nombre, int paginas, int calif, int fecha){
         this.pasta= "Blanda";
         this.editorial= "Paidos";
         this.autor="Simon Sebag";
         this.nombre="La corte del zar rojo";
         this.paginas=928;
         this.calif=86;
         this.fecha=2003;
     }
     
     
     @Override
     public String toString(){
         return "Libro{" + "pasta=" + pasta + ", editorial =" + editorial + ", autor=" + autor + ", nombre=" + nombre + ", paginas=" + paginas + ",calif=" + ", calif=" + calif + ", fecha =" + fecha +'}';
   }
     }