Algoritmo Ejercicio10
	Definir frase Como Caracter
	Escribir "Ingrese una frase: "
	Leer frase
	Si  Subcadena(frase, 0, 0)==Subcadena(FRASE, Longitud(frase)-1, Longitud(frase)-1) Entonces
		Escribir "CORRECTO"
	SiNo
		Escribir "INCORRECTO"
	FinSi
FinAlgoritmo
