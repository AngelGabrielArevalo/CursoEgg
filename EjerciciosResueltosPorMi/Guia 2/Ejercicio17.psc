Algoritmo Ejercicio17
	Definir clave Como Caracter
	Definir intentos Como Entero
	intentos=0
	Escribir "Ingrese la clave:"
	Hacer
		Leer clave
		Si (clave=="eureka") Entonces
			intentos=5
		SiNo
			intentos=intentos+1
		FinSi
	Mientras Que intentos<3
	Si intentos==5 Entonces
		Escribir "Se ha ingresado al sistema correctamente."
	SiNo
		Escribir "Se han agotado los intentos (3)"
	FinSi
	
FinAlgoritmo
