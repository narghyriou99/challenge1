# Challenge 1

Το πρόγραμμα είναι γραμμένο σε JAVA

Στην αρχή αποθηκεύουμε σε ενα ArrayList τις επισκεψεις για ανεφοδιασμό. Το object εχει quantity και τιμή ανα λίτρο. Οι τιμές δημιουργούνται random.

Επειτα σε ενα αλλο array μεγέθους TOTAL_LITTER καταχωρούμε τις εκάστοτε τιμές ανα λίτρο.

Ξέρουμε οτι η μηχανή καταναλωνει καυσιμο με FIFO, οπότε στο τελος διατρεχουμε αναποδα το array αθροίζοντα τις αντιστοιχες τιμες/λιτρο. 


Εχω ορισει CURRENT_QUANTITY=40 και  TOTAL_VISITS=3.
Η μεταβλητή random_qnt παιρνει τιμές απο 1 έως και 50
Η μεταβλητή random_price παιρνει τιμές απο 1.80 έως και 2.30