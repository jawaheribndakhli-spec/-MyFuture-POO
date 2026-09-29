#exercice1:
n = int(input("Donner un nombre n entre 10 et 50 : "))

while not (10 <= n <= 50):
    print("Erreur : n doit être compris entre 10 et 50.")
    n = int(input("Donner un nombre n entre 10 et 50 : "))
mesures_for = []

print("\n--- Saisie avec boucle FOR ---")
for i in range(n):
    valeur = float(input(f"Mesure {i+1} (en dBm) : "))
    mesures_for.append(valeur)
moy_for = sum(mesures_for) / n
min_for = min(mesures_for)
max_for = max(mesures_for)

print("\nRésultats (boucle FOR) :")
print("Moyenne :", round(moy_for, 2))
print("Minimum :", min_for)
print("Maximum :", max_for)
mesures_while = []

print("\n--- Saisie avec boucle WHILE ---")
i = 0
while i < n:
    valeur = float(input(f"Mesure {i+1} (en dBm) : "))
    mesures_while.append(valeur)
    i += 1
moy_while = sum(mesures_while) / n
min_while = min(mesures_while)
max_while = max(mesures_while)

print("\nRésultats (boucle WHILE) :")
print("Moyenne :", round(moy_while, 2))
print("Minimum :", min_while)
print("Maximum :", max_while)
#exercice2:
h = int(input("Donner la hauteur de la pyramide : "))

while h <= 0:
    print("La hauteur doit être un entier positif.")
    h = int(input("Donner la hauteur de la pyramide : "))
for i in range(1, h + 1):
    espaces = " " * (h - i)
    etoiles = "*" * (2 * i - 1)
    print(espaces + etoiles)
#exercice3:
binaire = input("Donner un nombre binaire : ")
while any(bit not in "01" for bit in binaire):
    print("Erreur : La chaîne doit contenir uniquement 0 et 1.")
    binaire = input("Donner un nombre binaire : ")
decimal = 0
puissance = len(binaire) - 1

for bit in binaire:
    decimal += int(bit) * (2 ** puissance)
    puissance -= 1
print("Le nombre décimal équivalent est :", decimal)


