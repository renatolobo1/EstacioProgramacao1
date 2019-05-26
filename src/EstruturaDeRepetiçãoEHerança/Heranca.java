package EstruturaDeRepeti��oEHeran�a;
import java.util.Date;


public class Heranca {
/* A heran�a � um mecanismo da Orienta��o a Objeto que permite criar
 *  novas classes a partir de classes j� existentes, aproveitando-se 
 *  das caracter�sticas existentes na classe a ser estendida
 */
	
	public class Produto {
	    public String codigo;
	    public String descricao;
	    public double preco;
	    public double peso;
	   
	    
	    public Produto(String _codigo, String _descricao, double _preco,double _peso) {
	        this.codigo = _codigo;
	        this.descricao = _descricao;
	        this.preco = _preco;
	        this.peso = _peso;
	       
	    }
	      
	    
	}
	public class CD extends Produto {
	    public CD(String _codigo, String _descricao, double _preco,double _peso) {
	        super(_codigo, _descricao, _preco,_peso );
	    }
	    public String nomeDaBanda;
	}
	public class Livro extends Produto {
	    public Livro(String _codigo, String _descricao, double _preco,double _peso) {
	        super(_codigo, _descricao, _preco,_peso );
	    }
	    public String nomeDoAutor;
	}
	public class Software extends Produto {
	    public Software(String _codigo, String _descricao, double _preco,double _peso) {
	        super(_codigo, _descricao, _preco,_peso );
	    }
	    public String categoria;
	}

}
