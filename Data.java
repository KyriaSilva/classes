package Data;
public class Data {
	    private int dia;
	    private int mes;
	    private int ano;
	    
	    public Data() {
	    	this.dia=1;
	    	this.mes=1;
	    	this.ano=1900;
	    }
	    
	    public int getDia(int dia){
			if (dia < 0 || dia >= 31) {
				throw new IllegalArgumentException("dia tem que estar entre 1-31");
			}
	    	return dia;
	    }
		
	    //obtém o valor do mes
	    public int getMes(int mes){
	    	if (dia < 0 || dia >= 31) {
				throw new IllegalArgumentException("dia tem que estar entre 1-31");
			}
	    	return mes;
	    }
	    
	    //obtém o valor do ano
	    public int getAno(int ano) {
	    	if (dia < 0 || dia >= 31 || mes < 0 || mes > 12) {
				throw new IllegalArgumentException("dia tem que estar entre 1-31");
			}
	    	return ano;	
	    }
  
	    private boolean ehBissexto(int ano) {
	        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
	    }
	    
	    private int diasNoMes(int mes, int ano) {
	        switch (mes) {
	            case 2:
	                return ehBissexto(ano) ? 29 : 28;
	            case 4:
	            case 6:
	            case 9:
	            case 11:
	                return 30;
	            default:
	                return 31;
	        }
	    }
	    public String DataCompleta(int dia, int mes, int ano){
	        return String.format("%02d/%02d/%02d", dia, mes, ano);
	       }
	       
	       //Converte Dia em STr
	       public String DataDia(int dia){
	           return String.format("%02d", dia);
	       }
	       
	       //Converte Dia e Mes em STR
	       public String DataDia_Mes(int dia, int mes){
	           return String.format("%02d/%02d", dia, mes);
	       }
	       
	       //Data completa Simplificada
	       public String DataCompletaSimplificada(int dia, int mes, int ano){
	   		return String.format("%d/%d/%02d", dia, mes, ano-2000);
	   	}
	       
	       //Data extensa inacabada
	       public String DataCompletaExtensa(int dia, int mes, int ano){
	    	    String[] meses = {"janeiro", "fevereiro", "março", "abril", "maio", "junho",
	    	                      "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
	    	    return String.format("%d de %s de %d", dia, meses[mes-1], ano);
	    	}
	   	}
	       

	