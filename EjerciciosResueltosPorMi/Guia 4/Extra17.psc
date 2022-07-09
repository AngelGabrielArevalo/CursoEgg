Algoritmo Extra16
	Definir mat Como Caracter
	Dimension mat(6, 7)
	cargarmatriz(mat, 6, 7)
	mostrarmatriz(mat, 6, 7)	
FinAlgoritmo

SubProceso cargarmatriz(mat, n, m)
	Definir i, j Como Entero
	mat(0,0)="               "
	mat(0,1)="Norte"
	mat(0,2)="Este"
	mat(0,3)="Oeste"
	mat(0,4)="Sur"
	mat(0,5)="Centro"
	mat(0,6)="Total de ventas"
	mat(1,0)="Representante 1"
	mat(2,0)="Representante 2"
	mat(3,0)="Representante 3"
	mat(4,0)="Representante 4"
	mat(5,0)="Total por zonas"
	Para i<-1 Hasta n-2 Hacer
		Escribir "Ingrese la cantidad de ventas del ", mat(i,0), " en las zonas NORTE, ESTE, OESTE, SUR Y CENTRO:"
		Para j<-1 Hasta m-2 Hacer
			Leer mat(i,j)
			Si j==1 Entonces
				mat(i, m-1)=mat(i,j)
			SiNo
				mat(i, m-1)=ConvertirATexto(ConvertirANumero(mat(i, m-1))+ConvertirANumero(mat(i,j)))
			FinSi
			Si i==1 Entonces
				mat(n-1, j)=mat(i,j)
			SiNo
				mat(n-1, j)=ConvertirATexto(ConvertirANumero(mat(n-1, j))+ConvertirANumero(mat(i,j)))
			FinSi
		FinPara
	FinPara
	Para i<-1 Hasta n-2 Hacer
		Si i==1 Entonces
			mat(n-1,m-1)=mat(i,m-1)
		SiNo
			mat(n-1,m-1)=ConvertirATexto(ConvertirANumero(mat(n-1,m-1))+ConvertirANumero(mat(i,m-1)))
		FinSi
	FinPara
FinSubProceso

SubProceso mostrarmatriz(mat, n, m)
	Definir i, j,k Como Entero
	Definir espaciado Como Caracter
	espaciado=""
	Para i<-0 Hasta n-1 Hacer
		Para j<-0 Hasta m-1 Hacer
			Si i==0 Entonces
				Escribir Sin Saltar mat(i,j),"   "
			FinSi
			Si j==0 Y i>0 Entonces
				Escribir Sin Saltarmat(i,j),"   "
			FinSi
			Si i>0 Y j>0 Entonces
				espaciado=""
				Segun j Hacer
					1: 
						Para k<-0 Hasta 7-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					2:
						Para k<-0 Hasta 6-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					3:
						Para k<-0 Hasta 7-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					4: 
						Para k<-0 Hasta 5-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					5:
						Para k<-0 Hasta 8-Longitud(mat(i,j)) Hacer
							espaciado=Concatenar(espaciado, " ")
						FinPara
						Escribir Sin Saltar mat(i, j),espaciado
						espaciado=""
					6:
						Escribir Sin Saltar mat(i, j)
				FinSegun
			FinSi
		FinPara
		Escribir ""
	FinPara
FinSubProceso
	
