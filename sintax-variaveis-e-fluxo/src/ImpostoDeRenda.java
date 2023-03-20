
public class ImpostoDeRenda {
	public static void main(String[] args) {
		double salario = 4600.0;
		double ir;
		int deduzir;
		
		if(salario >= 1900 && salario <= 2800) {
			ir = 0.075;
			deduzir = 142; 
		} else {
			if(salario > 2800 && salario <= 3751) {
				ir = 0.15;
				deduzir = 350; 
			} else {
				if(salario > 3751 && salario <= 4664) {
					ir = 0.225;
					deduzir = 636;
				}else {
					System.out.println("Nao possui aliquota");
					ir = 0;
					deduzir = 0;
				}
				
			}
		}
		
		salario = (salario - (salario*ir)) - deduzir;
		System.out.println(salario);
	}
}
