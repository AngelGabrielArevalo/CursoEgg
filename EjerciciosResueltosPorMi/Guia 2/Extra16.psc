Algoritmo Extra16
	Definir alumno Como Caracter
	Definir nota1, nota2, nota3 Como Real
	Hacer
		Escribir "Ingrese el nombre del alumno:"
		Leer alumno
		Si Longitud(alumno)>0 Entonces
			Escribir "Ingrese nota de la parte práctica:"
			Leer  nota1
			Escribir "Ingrese nota de la parte de problemas:"
			Leer  nota2
			Escribir "Ingrese nota de la parte teorica:"
			Leer  nota3
			Escribir "El alumno ", alumno, " obtuvo una nota final de ", nota1*0.1+nota2*0.5+nota3*0.4
		FinSi
	Mientras Que Longitud(alumno)>0
FinAlgoritmo
