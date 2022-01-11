pacote  com.teste ;

public  class  Calculadora {


	public  int  somar ( String  expressao ) {
		int soma =  0 ;
		for ( String valorSomar : expressao . split( " \\ + " ))
			soma +=  inteiro . valorOf(valorSomar);
		
		Sistema . para fora . println(soma);
		retornar soma;
	}
}
