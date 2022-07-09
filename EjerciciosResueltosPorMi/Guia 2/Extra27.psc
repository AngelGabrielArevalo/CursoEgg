Algoritmo Extra27
	Definir fac1, fac2, fac3, fac4, fac5, i, j Como Entero
	i=0
	j=0
	fac1=1
	fac2=1
	fac3=1
	fac4=1
	fac5=1
	Para i<-0 Hasta 4 Hacer
		Para j<-0 Hasta i Hacer
			Segun i Hacer
				0:
					fac1=fac1*(j+1)
				1:
					fac2=fac2*(j+1)
				2:
					fac3=fac3*(j+1)
				3:
					fac4=fac4*(j+1)
				4:
					fac5=fac5*(j+1)
			FinSegun
		FinPara
		j=0
	FinPara
	Escribir "1!=",fac1
	Escribir "2!=1*2=", fac2
	Escribir "3!=1*2*3=", fac3
	Escribir "4!=1*2*3*4=", fac4
	Escribir "5!=1*2*3*4*5=", fac5
FinAlgoritmo
