from libro import ArchivioLibri, Libro, leggi_file_thread, scrivi_file_thread
import threading

def main():
    archivio = ArchivioLibri()
    filename = "archivio_libri.txt"

    # Thread per leggere i libri dal file
    thread_letura = threading.Thread(target=leggi_file_thread, args=(archivio, filename))
    thread_letura.start()

    # Esegui operazioni con l'utente mentre il thread di lettura è in esecuzione
    while True:
        print("\nOperazioni disponibili:")
        print("1. Aggiungi libro")
        print("2. Visualizza libri")
        print("3. Esci e salva")

        scelta = input("Scegli un'opzione (1/2/3): ")

        if scelta == '1':
            titolo = input("Inserisci il titolo del libro: ")
            autore = input("Inserisci l'autore del libro: ")
            anno = input("Inserisci l'anno di pubblicazione: ")
            libro = Libro(titolo, autore, anno)
            archivio.aggiungi_libro(libro)

        elif scelta == '2':
            archivio.visualizza_libri()

        elif scelta == '3':
            # Avvia il thread di scrittura mentre si esce
            thread_scrittura = threading.Thread(target=scrivi_file_thread, args=(archivio, filename))
            thread_scrittura.start()
            # Aspetta che il thread di scrittura finisca prima di uscire
            thread_scrittura.join()
            print("Programma terminato. I dati sono stati salvati.")
            break

        else:
            print("Scelta non valida.")

    # Aspetta che il thread di lettura finisca
    thread_letura.join()

if __name__ == "__main__":
    main()
