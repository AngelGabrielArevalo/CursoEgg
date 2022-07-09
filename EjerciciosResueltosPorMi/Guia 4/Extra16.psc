Algoritmo Extra16
	Definir mat Como Caracter
	Definir n, cantproduc Como Entero
	Escribir "Ingrese la cantidad de productos que deseea analizar:"
	Leer cantproduc
	n=cantproduc+3
	Dimension mat(n, 7)
	cargarmatriz(mat, n, 7)
	mostrarmatriz(mat, n, 7)
	
	
FinAlgoritmo

SubProceso cargarmatriz(mat, n, m)
	Definir i, j, mayor, mayortotal, posmayortotal, diamayortotal Como Entero
	Definir dia Como Caracter
	i=1
	j=0
	mat(0,0)="                 "
	mat(0,1)="Lunes"
	mat(0,2)="Martes"
	mat(0,3)="Miércoles"
	mat(0,4)="Jueves"
	mat(0,5)="Viernes"
	mat(0,6)="Total producto"
	Escribir "Ingrese los productos que desea analizar:"
	Para i<-1 Hasta n-3 Hacer
		Leer mat(i,0)
	FinPara
	mat(n-2,0)="Total semana"
	mat(n-1,0)="Producto más vendido"
	i=1
	j=1
	Para i<-1 Hasta n-3 Hacer
		Para j<-1 Hasta m-2 Hacer
			Escribir "Ingrese la cantidad de ", mat(i, 0), " que se vendó el dia ", mat(0,j),":"
			Leer mat(i,j)
			Si j==1 Entonces
				mat(i, m-1)=mat(i,j)
			SiNo
				mat(i, m-1)=ConvertirATexto(ConvertirANumero(mat(i, m-1))+ConvertirANumero(mat(i,j)))
			FinSi
		FinPara
	FinPara
	i=1
	j=1
	mayortotal=ConvertirANumero(mat(1,1))
	posmayortotal=1
	diamayortotal=1
	Para j<-1 Hasta m-2 Hacer
		Para i<-1 Hasta n-3 Hacer
			Si i==1 Entonces
				mat(n-2, j)=mat(i,j)
				mat(n-1,j)=mat(i,0)
				mayor=ConvertirANumero(mat(i,j))
				Si mayor>mayortotal Entonces
					mayortotal=mayor
					posmayortotal=i
					diamayortotal=j
				FinSi
			SiNo
				mat(n-2, j)=ConvertirATexto(ConvertirANumero(mat(n-2, j)) + ConvertirANumero(mat(i,j)))
				Si mayor<ConvertirANumero(mat(i,j)) Entonces
					mayor=ConvertirANumero(mat(i,j))
					mat(n-1,j)=mat(i,0)
				FinSi
				Si mayor>mayortotal Entonces
					mayortotal=mayor
					posmayortotal=i
					diamayortotal=j
				FinSi
			FinSi
		FinPara
		i=0
		dia="("
		dia=Concatenar(dia, ConvertirATexto(mayor))
		dia=Concatenar(dia, ")")
		mat(n-1,j)=Concatenar(mat(n-1,j), dia)
	FinPara
	Para i<-1 Hasta n-3 Hacer
		Si i==1 Entonces
			mat(n-2,m-1)=mat(i,m-1)
		SiNo
			mat(n-2,m-1)=ConvertirATexto(ConvertirANumero(mat(n-2,m-1))+ConvertirANumero(mat(i,m-1)))
		FinSi
	FinPara
	mat(n-1,m-1)=Concatenar(Concatenar(Concatenar(Concatenar(mat(posmayortotal,0)," -> "),mat(0, diamayortotal))," -> "), ConvertirATexto(mayortotal))
	
FinSubProceso

SubProceso mostrarmatriz(mat, n, m)
	Definir i, j,k Como Entero
	Definir espaciado Como Caracter
	espaciado=""
	i=0
	j=0
	k=0
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			Si i>0 Y j>0 Entonces
				espaciado=""
				Segun j Hacer
					1: 
						Para k<-0 Hasta 12-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					2:
						Para k<-0 Hasta 13-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					3:
						Para k<-0 Hasta 16-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					4: 
						Para k<-0 Hasta 13-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					5:
						Para k<-0 Hasta 14-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					6:
						Escribir Sin Saltar mat(i, j)
				FinSegun
			SiNo
				Si i==0 Y j>0 Entonces
					Escribir Sin Saltar mat(i, j),"        "
				SiNo
					espaciado="  "
					Si j==0 Y i<n-1 Entonces
						Para k<-0 Hasta 19-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado="  "
					SiNo
						Si j==0 Y i==n-1 Entonces
							Escribir Sin Saltar mat(i, j),espaciado
						FinSi
					FinSi
				FinSi
			FinSi
			

		FinPara
		Escribir ""
		j=0
	FinPara
FinSubProceso
	