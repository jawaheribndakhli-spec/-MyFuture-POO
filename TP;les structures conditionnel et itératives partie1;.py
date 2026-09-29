#exercice1:
math = float(input("Donner la note de mathématiques : "))
phys = float(input("Donner la note de physique : "))
info = float(input("Donner la note d'informatique : "))
moyenne = round((math + phys + info) / 3, 2)
print("Votre moyenne est :", moyenne)
if moyenne < 10:
    print("Insuffisant : Vous devez revoir vos cours.")
elif 10 <= moyenne < 12:
    print("Passable : Le minimum est atteint, Bon courage !")
elif 12 <= moyenne < 14:
    print("Assez bien : Tu es sur la bonne voie, continuez !")
elif 14 <= moyenne < 16:
    print("Bien : Bon travail.")
elif 16 <= moyenne < 18:
    print("Très bien : Continuez à viser l’excellence !")
else:
    print("Excellent !")
#exercice2:
octet = input("Entrer un octet (8 bits) : ")
while len(octet) != 8 or any(bit not in "01" for bit in octet):
    print("Erreur : Vous devez entrer exactement 8 bits (0 ou 1).")
    octet = input("Entrer un octet (8 bits) : ")
nb_bits_1 = octet.count("1")
if nb_bits_1 % 2 == 0:
    parite = "0"
else:
    parite = "1"
mot_final = octet + parite
print("Nombre de bits à 1 :", nb_bits_1)
print("Bit de parité ajouté :", parite)
print("Mot binaire final :", mot_final)
