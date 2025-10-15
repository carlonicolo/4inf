class Libro:
    # Attributo di classe per contare tutti i libri creati
    contatore = 0
    
    def __init__(self, titolo, autore, pagine):
        self.__titolo = titolo
        self.__autore = autore
        self.__pagine = pagine
        self.__in_prestito = False
        
        # Incrementiamo il contatore di libri
        Libro.contatore += 1
    
    @property
    def titolo(self):
        return self.__titolo
    
    @property
    def autore(self):
        return self.__autore
    
    @property
    def pagine(self):
        return self.__pagine
    
    @property
    def in_prestito(self):
        return self.__in_prestito
    
    def presta(self):
        if self.__in_prestito:
            return False  # Già in prestito
        else:
            self.__in_prestito = True
            return True
    
    def restituisci(self):
        if not self.__in_prestito:
            return False  # Non era in prestito
        else:
            self.__in_prestito = False
            return True
    
    def __str__(self):
        stato = "in prestito" if self.__in_prestito else "disponibile"
        return f"'{self.__titolo}' di {self.__autore}, {self.__pagine} pagine, {stato}"
    
    @classmethod
    def get_conteggio_libri(cls):
        return cls.contatore
    
    
# Creazione di alcuni libri
libro1 = Libro("Il nome della rosa", "Umberto Eco", 536)
libro2 = Libro("1984", "George Orwell", 328)
libro3 = Libro("Il Piccolo Principe", "Antoine de Saint-Exupéry", 96)

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
