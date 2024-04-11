
package invoice;

import static java.time.Clock.system;
import static java.time.InstantSource.system;


public class Invoice {
    int numeroItem = 0;
    String descricaoItem;
    int quantidadeItem = 0;
    double precoUnitario = 0.00;

    public Invoice(int numeroItem, String descricaoItem, int quantidadeItem, double precoUnitario) {
        this.numeroItem = numeroItem;
        this.descricaoItem = descricaoItem;
        this.quantidadeItem = quantidadeItem;
        this.precoUnitario = precoUnitario; 
        
        if (quantidadeItem < 0) {
            this.quantidadeItem = 0;

        }
        if (precoUnitario< 0.0) {
            this.precoUnitario = 0.0;
        }
    }
    
   

    public int getNumeroItem() {
        return numeroItem;
    }

    public void setNumeroItem(int numeroItem) {
        this.numeroItem = numeroItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }
    
    public double calculadoraDeValor(){
        double valorFatura = this.quantidadeItem * this.precoUnitario;
        
        return valorFatura;
    }
    
 
    public static void main(String[] args) {
        
       Invoice produto = new Invoice(1, "teste de gravidez",76, 10.00);
       
       System.out.println(produto.calculadoraDeValor());
       System.out.println(produto.getDescricaoItem());
       System.out.println(produto.getNumeroItem());
       System.out.println(produto.getPrecoUnitario()); 
       System.out.println(produto.getQuantidadeItem()); 
            
        
    }
    
}
