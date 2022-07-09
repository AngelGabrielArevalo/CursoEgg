Algoritmo Extra17
	Definir frase Como Caracter
	Escribir "Ingrese una frase:"
	Leer frase
	Escribir invertircadena(frase, Longitud(frase))
	
FinAlgoritmo

SubProceso invert <- invertircadena(frase, long)
	Definir invert Como Caracter
	Si long==1 Entonces
		invert=Subcadena(frase, long-1, long-1)
	SiNo
		invert=Concatenar(Subcadena(frase, long-1, long-1), invertircadena(frase, long-1))
	FinSi
	
	
FinSubProceso
	