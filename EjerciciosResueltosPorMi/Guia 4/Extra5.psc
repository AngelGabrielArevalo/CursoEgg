Algoritmo Extra5
	Definir vec, frase, carac Como Caracter
	Definir i, pos, posvacio Como Entero
	Definir puedodesplazar Como Logico
	Dimension vec(20)
	Escribir "Ingrese una frase: (la longitud de la frase debe ser menor o igual a 20)"
	Leer frase
	i=0
	Para i=0 Hasta 19 Hacer
		vec(i)=""
	FinPara
	i=0
	Para i<-0 Hasta Longitud(frase)-1 Hacer
		vec(i)=Subcadena(frase, i, i)
	FinPara
	Escribir "Ingrese un caracter y una posición:"
	Leer carac
	Leer pos
	i=0
	Si vec(pos)=="" Entonces
		vec(pos)=carac
		Para i=0 Hasta 19 Hacer
			Escribir Sin Saltar vec(i)," "
		FinPara
	Sino 
		i=pos
		Hacer
			Si vec(i)=="" Entonces
				puedodesplazar=Verdadero
				posvacio=i
			SiNo
				puedodesplazar=Falso
			FinSi
			i=i+1
		Mientras Que i<20 Y puedodesplazar==Falso
		Si puedodesplazar Entonces
			i=pos
			Para i<-pos Hasta posvacio-1 Hacer
				vec(posvacio-i+pos)=vec(posvacio-i-1+pos)
			FinPara
			vec(pos)=carac
			i=0
			Para i=0 Hasta 19 Hacer
				Escribir Sin Saltar vec(i)," "
			FinPara
		SiNo
			Escribir "No se puede ingresar un caracter en esa posición"
		FinSi
	FinSi
	Escribir ""
FinAlgoritmo