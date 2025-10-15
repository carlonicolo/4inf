# libro.py

import threading

# Classe Libro che rappresenta un libro
class Libro:
    def __init__(self, titolo, autore, anno):
        self.titolo = titolo
        self.autore = autore
        self.anno = anno

    def __str__(self):
        return f"{self.titolo} - {self.autore} ({self.anno})"


# Classe ArchivioLibri che gestisce l'archivio di libri
class ArchivioLibri:
    def __init__(self):
        self.libri = []

    # Aggiungi un libro all'archivio
    def aggiungi_libro(self, libro):
        self.libri.append(libro)

    # Leggi i libri da un file
    def leggi_libri_da_file(self, filename):
        try:
            with open(filename, "r") as file:
                for line in file:
                    titolo, autore, anno = line.strip().split(" - ")
                    self.libri.append(Libro(titolo, autore, anno))
            print("Libri letti dal file con successo.")
        except FileNotFoundError:
            print("Il file non esiste. Creerò un nuovo archivio.")

    # Scrivi i libri su un file
    def scrivi_libri_su_file(self, filename):
        with open(filename, "w") as file:
            for libro in self.libri:
                file.write(f"{libro.titolo} - {libro.autore} - {libro.anno}\n")
        print("Libri scritti su file con successo.")

    # Visualizza i libri
    def visualizza_libri(self):
        if not self.libri:
            print("L'archivio è vuoto.")
        for libro in self.libri:
            print(libro)


# Funzione per eseguire la lettura dei libri in un thread
def leggi_file_thread(archivio, filename):
    archivio.leggi_libri_da_file(filename)

# Funzione per eseguire la scrittura dei libri in un thread
def scrivi_file_thread(archivio, filename):
    archivio.scrivi_libri_su_file(filename)
