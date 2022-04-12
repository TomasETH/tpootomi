package ar.edu.unju.edm.model;

import org.springframework.stereotype.Component;

//la calculadora es un componente ati tota    ..
@Component
public class Calculadora {
	//atribute
	private int numero1;
	private int numero2;
	
	
	//constructors
	
	public Calculadora() {
		
	}
	
	public Calculadora(int numero1,int numero2) {
		
		this.numero1=numero1;
		this.numero2=numero2;
		
	}
	
	//methods basics operations
	
	public int suma() {
		int resultadosuma=this.numero1 + this.numero2;
		return resultadosuma;	
	}
	
	public int resta() {
		int resultadoresta=this.numero1 - this.numero2;
		return resultadoresta;	
	}

	public int multiplicar() {
		int resultadomultiplicar=this.numero1 * this.numero2;
		return resultadomultiplicar;	
	}
	
	public double dividir() {
		if(numero2>0) {
			double resultadodividir=(double)this.numero1 / (double)this.numero2;//convierto en double las variantes que anteriormente eran de tipo entero(int)
			return resultadodividir;
		}
		else {
			return 0;
			
		}	
		
	}
	
	public int potencia() {
		double resultadopotencia=Math. pow((double)this.numero1,(double)this.numero2);
		return (int) resultadopotencia;	
	}
	
	public int raiz() {
		double resultadoraiz= Math.sqrt((double)this.numero1);
		return (int) resultadoraiz;	
	}
	
	public double raizn() {
		double resultadoraizn=Math. pow((double)this.numero1,(double)1/this.numero2);
		return resultadoraizn;	
	}

	
	//tengon que generar el get y set para encapsular los atributos
	//ya que estan privados y con esto yo lo puedo modificar o obtener sus valores
	
	public int getNumero1() {
		return numero1;
	}

	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}

	public int getNumero2() {
		return numero2;
	}

	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	
	
}
