Algoritmo Extra10
	Definir kg, precio Como Real
	Escribir "Ingrese los kg. de manzana que desea comprar:"
	Leer kg
	Escribir "Ingrese el precio por kg. de manzana:"
	Leer precio
	Si kg<=2 Entonces
		Escribir "Deberá pagar: $", kg*precio
	SiNo
		Si kg<=5 Entonces
			Escribir "Deberá pagar: $", kg*precio*0.9
		SiNo
			Si kg<=10 Entonces
				Escribir "Deberá pagar: $", kg*precio*0.85
			SiNo
				Escribir "Deberá pagar: $", kg*precio*0.8
			FinSi
		FinSi
	FinSi
FinAlgoritmo
