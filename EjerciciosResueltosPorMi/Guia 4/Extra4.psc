Algoritmo Extra4
	Definir vec, deficientes, regulares, buenos, excelentes,i Como Entero
	deficientes=0
	regulares=0
	buenos=0
	excelentes=0
	Dimension vec(100)
	i=0
	Para i<-0 Hasta 99 Hacer
		vec(i)=Aleatorio(0,20)
		Si vec(i)<6 Entonces
			deficientes=deficientes+1
		SiNo
			Si vec(i)<11 Entonces
				regulares=regulares+1
			SiNo
				Si vec(i)<16 Entonces
					buenos=buenos+1
				SiNo
					excelentes=excelentes+1
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir "La cantidad de alumnos deficientes es ", deficientes
	Escribir "La cantidad de alumnos regulares es ", regulares
	Escribir "La cantidad de alumnos buenos es ", buenos
	Escribir "La cantidad de alumnos excelentes es ", excelentes
FinAlgoritmo

