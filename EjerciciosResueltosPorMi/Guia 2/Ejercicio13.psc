Algoritmo Ejercicio13
	Definir defec, sdefec Como Entero
	Escribir "Ingrese la cantidad de tornillos defectuosos:"
	Leer defec
	Escribir "Ingrese la cantidad de tornillos sin defectos:"
	Leer sdefec
	Si defec<200 Y sdefec>10000 Entonces
		Escribir "El grado de eficiencia es: 8"
	SiNo
		Si defec>=200 Y sdefec<=10000 Entonces
			Escribir "El grado de eficiencia es: 5"
		SiNo
			Si defec<200 Y sdefec<=10000 Entonces
				Escribir "El grado de eficiencia es: 6"
			SiNo
				Si defec>=200 Y sdefec>10000 Entonces
					Escribir "El grado de eficiencia es: 7"
				FinSi
			FinSi
		FinSi
	FinSi
FinAlgoritmo
