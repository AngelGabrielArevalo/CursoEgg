Algoritmo Ejercicio23
	Definir sueldobase, cobroporventa Como Real
	Definir cantventas,i, vendedores Como Entero
	i=0
	Escribir "Ingrese la cantidad de vendedores: "
	Leer vendedores
	Para i<-0 Hasta vendedores-1 Hacer
		Escribir "Ingrese el sueldo base, la cantidad de ventas realizadas y cuantó cobró por cada venta:"
		Leer sueldobase
		Leer cantventas
		Leer cobroporventa
		Escribir "Se debe pagtar por concepto de comisiones de las ventas realizadas un toral de: ", 0.1*cobroporventa*cantventas
		Escribir "Se deberá pagar como sueldo total: ", 0.1*cobroporventa*cantventas+sueldobase
	FinPara
FinAlgoritmo
