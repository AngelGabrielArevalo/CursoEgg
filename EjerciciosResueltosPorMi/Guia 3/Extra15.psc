Algoritmo Extra15
	Definir frase Como Caracter
	Escribir "Ingrese una frase:"
	Leer frase
	vocalrepetida(frase)
FinAlgoritmo

SubProceso vocalrepetida(frase)
	Definir i, ca, ce, ci, co, cu Como Entero
	Definir aux Como Caracter
	aux=""
	ca=0
	ce=0
	ci=0
	co=0
	cu=0
	i=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		Segun Subcadena(frase, i, i) Hacer
			"a":
				ca=ca+1
				Si ca<2 Entonces
					aux=Concatenar(aux, Subcadena(frase, i, i))
				FinSi
			"e":
				ce=ce+1
				Si ce<2 Entonces
					aux=Concatenar(aux, Subcadena(frase, i, i))
				FinSi
			"i":
				ci=ci+1
				Si ci<2 Entonces
					aux=Concatenar(aux, Subcadena(frase, i, i))
				FinSi
			"o":
				co=co+1
				Si co<2 Entonces
					aux=Concatenar(aux, Subcadena(frase, i, i))
				FinSi
			"u":
				cu=cu+1
				Si cu<2 Entonces
					aux=Concatenar(aux, Subcadena(frase, i, i))
				FinSi
			De Otro Modo:
				aux=Concatenar(aux, Subcadena(frase, i, i))
		FinSegun
	FinPara
	Escribir aux
FinSubProceso
	