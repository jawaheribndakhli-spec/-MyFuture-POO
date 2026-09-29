#Exercice n°1:
#Qst1:
#math=float(input("entrez votre note en mathématique : "))
#informatique=float(input("entrz votre note en onformatique : "))
#Qst2:
#   print("bien:bon travail")
#elif 18 > moyenne >= 16:
 #   print("très bien: continuez a viser l'exellence! ")
#else:
#   print(" exellent ! ")
#Exercice n°2:
#Qst1:
octet= input("Entrez un octet (chaine binaire de 8 bits, ex: 10010011) : ")
#Qst2:
if len(octet ) != 8 or not all(bit in '01' for bit in octet):
    print("erreur : vous devez entre exactement 8 chiffres binaires(0 ou 1). ")
else:
    ch = octet.count('1')
#Qst3:
    if ch  % 2 == 0:
        ch = '0'
    else:
        ch = '1'
#Qst4:
        mot_final = octet + bit_parite
#Qst5:
        for i in range (len(oct)):
            if oct[i]=="1":
                s=s+int(oct[i])
if s%2==0:
    print(oct+'0')
else:
        print(oct+'1')
        
    
    
    
        