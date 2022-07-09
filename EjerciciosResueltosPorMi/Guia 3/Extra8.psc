Algoritmo Extra8
	Escribir TRUNC(5335/1000)
FinAlgoritmo

Funcion cumplecapi <- capicua(n)
	Definir cumplecapi Como Logico
	Definir aux1, aux2, cant, i Como Entero
	aux1=n
	cant=0
	i=0
	aux2=1
	Hacer
		cant=cant+1
		aux1=TRUNC(aux/10)
	Mientras Que aux1>0
	Para i<-0 Hasta cant-1 Hacer
		aux2=aux2*10
	FinPara
	aux1=n
	i=0
	Si n>=10 Entonces
		Para i<-0 Hasta cant-1 Hacer
			
		FinPara
	SiNo
		
	FinSi
FinFuncion
	