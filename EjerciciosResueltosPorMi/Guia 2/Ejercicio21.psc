Algoritmo Ejercicio21
	Definir estudiantes, i, cantdesaprob Como Entero
	Definir promediorepob, porcintegrador, mayorexpo, estudiparcial, nota1, nota2, nota3, notafinal Como Real
	Escribir "Ingrese la cantidad de estudiantes:"
	Leer estudiantes
	promediorepob=0
	cantdesaprob=0
	porcintegrador=0
	estudiparcial=0
	i=0
	Para i<-0 Hasta estudiantes-1 Hacer
		Escribir "Ingrese la nota de trabajo práctico, la nota de la exposición y la nota del parcial:"
		Leer nota1
		Leer nota2
		Leer nota3
		notafinal=0.35*nota1+0.25*nota2+0.4*nota3
		Si notafinal<6.5 Entonces
			promediorepob=promediorepob+notafinal
			cantdesaprob=cantdesaprob+1
		FinSi
		Si nota1>7.5 Entonces
			porcintegrador=porcintegrador+1
		FinSi
		Si i==0 Entonces
			mayorexpo=nota2
		SiNo
			Si nota2>mayorexpo Entonces
				mayorexpo=nota2
			FinSi
		FinSi
		Si nota3>=4 Y nota3<=7.5 Entonces
			estudiparcial=estudiparcial+1
		FinSi
	FinPara
	Escribir "La nota promedio final de los estudiantes que reprobaron el curso es: ", promediorepob/cantdesaprob
	Escribir "El porcentaje de alumnos que tienen una nota de integrador mayor a 7.5 es: ", (porcintegrador*100)/estudiantes,"%"
	Escribir "La mayor nota obtenida en las exposiciones es: ", mayorexpo
	Escribir "El total de estudiantes que obtuvieron en el Parcial entre 4.0 y 7.5 es: ", estudiparcial
FinAlgoritmo
