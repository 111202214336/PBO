public class main {
    TextBasedDatabase database = new TextBasedDatabase();
    Scanner scanner = new Scanner(System.in);

    while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data");
            System.out.println("2. Perbarui data");
            System.out.println("3. Hapus data");
            System.out.println("4. Tampilkan data");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Mengonsumsi karakter newline

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan data yang akan ditambahkan: ");
                    String newData = scanner.nextLine();
                    database.insertData(newData);
                    break;
                case 2:
                    System.out.print("Masukkan indeks data yang akan diperbarui: ");
                    int indeksUpdate = scanner.nextInt();
                    scanner.nextLine(); // Mengonsumsi karakter newline
                    System.out.print("Masukkan data baru: ");
                    String dataBaru = scanner.nextLine();
                    database.updateData(indeksUpdate, dataBaru);
                    break;
                case 3:
                    System.out.print("Masukkan indeks data yang akan dihapus: ");
                    int indeksHapus = scanner.nextInt();
                    database.deleteData(indeksHapus);
                    break;
                case 4:
                    database.showData();
                    break;
                case 5:
                    System.out.println("Keluar dari program.");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Masukkan angka dari 1 hingga 5.");
            }
        }
    }
