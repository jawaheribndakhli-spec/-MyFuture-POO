#exercice1: 
 def est_premier(n):
    if n <= 1:
        return False
    for i in range(2, int(n**0.5) + 1):
        if n % i == 0:
            return False
    return True
nombre = int(input("Entrez un nombre : "))

if est_premier(nombre):
    print(nombre, "est un nombre premier.")
else:
    print(nombre, "n'est pas un nombre premier.")
#exercice2:
def Somme_arith(n):
    return n * (n + 1) // 2
n = int(input("Entrez un nombre : "))
print("La somme arithmétique est :", Somme_arith(n))
#exercice3:
def Somme(a, b):
    return a + b

def Soustraction(a, b):
    return a - b

def Multiplication(a, b):
    return a * b

def Division(a, b):
    if b == 0:
        return "Erreur : division par zéro"
    return a / b
print("=== Calculatrice ===")
print("1. Somme")
print("2. Soustraction")
print("3. Multiplication")
print("4. Division")

choix = int(input("Choisissez une opération : "))

a = float(input("Entrez le premier nombre : "))
b = float(input("Entrez le deuxième nombre : "))

if choix == 1:
    print("Résultat =", Somme(a, b))
elif choix == 2:
    print("Résultat =", Soustraction(a, b))
elif choix == 3:
    print("Résultat =", Multiplication(a, b))
elif choix == 4:
    print("Résultat =", Division(a, b))
else:
    print("Choix invalide.")
