
import java.util.Date;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author JoseSanchez
 * @version 1.0
 * Clase para representar la factura 
 */
public final class Factura {    
   
    private Date date; // Fecha de la factura
    private Table table; //Mesa a facturar
    private Client client;// Cliente a facturar
    private List <Product> products; //lista de productos (platos de comida) a facturar
    private Double amount;// monto de la factura
    
     //Constructor clase factura     
     public Factura(Date date, Table table, Client client, List<Product> products) {
       
        this.date = date;
        this.table = table;
        this.client = client;
        this.products = products;
        this.setAmount(0.00);//se inicializa el monto de la factura en valor 0.00
       
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }
    
  public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }

   /**
    * Metodo que genera la facturación
    */
    public void facturar(){                 
            System.out.println("*************************************************************");
            System.out.println("*************** FACTURA NRO XXXXXXXXXXX ********************* ");
            System.out.println("*************************************************************");
            System.out.println("Fecha Factura :"+getDate());
            System.out.println("Datos del Cliente :"+getClient().getName());
            System.out.println("Mesa del cliente  : "+ getTable().getName() +  ", Cantidad de personas :"+getTable().getNumberChairs());
            System.out.println("Datos de los productos o servicios consumidos : ");  
             for (Product prod: getProducts()) //se recorre cada producto para obtener el costo de cada uno.
            {
                System.out.println("Producto  : "+prod.getName()+ " Costo : "+prod.getCost());  
                setAmount(getAmount()+ prod.getCost());
            }
            System.out.println("Valor factura  :"+getAmount());               
            Double serviceFour= getAmount()*0.045;//se calcula el servicio de 4.5 sobre el monto
            System.out.println("Recargo servicio 4.5%  :"+serviceFour);            
            Double servicePlusSix=calculateServicePlusSix();           
            Double total=getAmount()+serviceFour+servicePlusSix+calculateVAT(servicePlusSix);
            
            System.out.println("Valor total a pagar + servicios e impuestos   -------> "+total);
            
    }
    
    /**
     * Metodo para calcular el servicio de 10% cuando existan mas de 6 personas en la mesa
     * @return Double
     */
  
    private Double calculateServicePlusSix(){
    
         if (getTable().getNumberChairs()>6){
                
                System.out.println("Valor servicio 10%  :"+(getAmount()*0.10));
                
                return(getAmount()*0.10);
                
            }else{  
                System.out.println("Valor servicio 10%  :"+0.00); 
                return 0.00;
         }
    
    }
    
    /**
     * Metodo para calcular el impuesto de 12% VAT
     * @return Double
     */
    private Double calculateVAT(Double servicePlusSix ){
        
            if (servicePlusSix==null || servicePlusSix==0.00 )
            {
                
                 System.out.println("Impuesto VAT 12%  :"+(getAmount()*0.12));
                 return(getAmount()*0.12);
            }else{
                 System.out.println("Impuesto VAT 12%  :"+0.00);
                 return 0.00;
            }
    
    }
     
}
