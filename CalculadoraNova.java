pacote  com.teste ;

public  class  CalculadoraNova {
	
	public  int  somar ( int ... valores ) {
		int soma =  0 ;
		for ( int valor : valores) {
			soma += valor;
		}
		retornar soma;
	}
}
