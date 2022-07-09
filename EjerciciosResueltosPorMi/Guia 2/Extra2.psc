Algoritmo Extra2
	Definir mes Como Caracter
	Definir importe Como Real
	Escribir "Ingrese mes y importe total de la compra:"
	Leer mes
	Leer importe
	Si mes=="octubre" O mes=="noviembre" Entonces
		Escribir "El monto que se debe descontar al cliente es de: ", importe*0.1
	SiNo
		Escribir "El monto que se debe descontar al cliente es de: 0"
	FinSi
FinAlgoritmo
