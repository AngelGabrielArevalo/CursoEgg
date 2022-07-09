Algoritmo Ejercicio5
	Definir opcionmenu, let Como Caracter
	Definir veca, vecb, vecc, n, i Como Entero
	Hacer 
		Escribir "Ingrese la opcion que desee (a-f):"
		Leer opcionmenu
		Segun opcionmenu Hacer
			"a":
				Escribir "Ingrese la dimensión del vector A:"
				Leer n
				Dimension veca(n)
				Dimension vecb(n)
				Dimension vecc(n)
				i=0
				Para i<-0 Hasta n-1 Hacer
					veca(i)=Aleatorio(-100, 100)
				FinPara
			"b":
				i=0
				Para i<-0 Hasta n-1 Hacer
					vecb(i)=Aleatorio(-100, 100)
				FinPara
			"c":
				i=0
				Para i<-0 Hasta n-1 Hacer
					vecc(i)=veca(i)+vecb(i)
				FinPara
			"d":
				i=0
				Para i<-0 Hasta n-1 Hacer
					vecc(i)=vecb(i)-veca(i)
				FinPara
			"e":
				Escribir "Ingrese que vector desea ver:"
				Leer let
				Segun let Hacer
					"A":
						i=0
						Para i<-0 Hasta n-1 Hacer
							Escribir Sin Saltar veca(i)," "
						FinPara
					"B":
						i=0
						Para i<-0 Hasta n-1 Hacer
							Escribir Sin Saltar vecb(i)," "
						FinPara
					"C":
						i=0
						Para i<-0 Hasta n-1 Hacer
							Escribir Sin Saltar vecc(i)," "
						FinPara
				FinSegun
				Escribir ""
		FinSegun
	Mientras Que opcionmenu<>"f"
	Escribir ""
FinAlgoritmo
