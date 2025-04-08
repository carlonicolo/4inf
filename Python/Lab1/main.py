import libro as libro

# Creazione di alcuni libri
libro1 = libro("Il nome della rosa", "Umberto Eco", 536)
libro2 = libro("1984", "George Orwell", 328)
libro3 = libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", 96)

# Stampa delle informazioni
print(libro1)  # Usa il metodo __str__
print(f"Autore di 1984: {libro2.autore}")
print(f"Numero di pagine del Piccolo Principe: {libro3.pagine}")

# Test dei prestiti
print("\nOperazioni di prestito:")
if libro1.presta():
    print(f"{libro1.titolo} prestato con successo")
else:
    print(f"{libro1.titolo} già in prestito")

if libro1.presta():
    print(f"{libro1.titolo} prestato con successo")
else:
    print(f"{libro1.titolo} già in prestito")

if libro1.restituisci():
    print(f"{libro1.titolo} restituito con successo")
else:
    print(f"{libro1.titolo} non era in prestito")

# Statistiche
print(f"\nTotale libri creati: {Libro.get_conteggio_libri()}")