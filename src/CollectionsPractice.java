import java.util.*;

public class CollectionsPractice {
    public static void main(String[] args) {

        // ===== LATIHAN 1: Perbedaan Array vs ArrayList =====
        System.out.println("=== LATIHAN 1: ARRAY vs ARRAYLIST ===");
        // Array (ukuran tetap)
        String[] arrayNama = new String[3];
        arrayNama[0] = "Andi";
        arrayNama[1] = "Budi";
        arrayNama[2] = "Cici";

        // ArrayList (ukuran dinamis)
        ArrayList<String> listNama = new ArrayList<>();
        listNama.add("Andi");
        listNama.add("Budi");
        listNama.add("Cici");
        listNama.add("Doni"); // bisa tambah lebih dari 3

        System.out.println("Array: " + Arrays.toString(arrayNama));
        System.out.println("ArrayList: " + listNama);

        // ===== LATIHAN 2: Generics Dasar =====
        System.out.println("\n=== LATIHAN 2: GENERICS ===");
        // Tanpa generics (raw type) -> tidak type-safe
        ArrayList rawList = new ArrayList();
        rawList.add("Teks");
        rawList.add(123); // campur tipe
        System.out.println("Raw ArrayList: " + rawList);

        // Dengan generics
        ArrayList<String> stringList = new ArrayList<>();
        stringList.add("Satu");
        stringList.add("Dua");

        ArrayList<Double> doubleList = new ArrayList<>();
        doubleList.add(3.14);
        doubleList.add(2.71);

        System.out.println("ArrayList<String>: " + stringList);
        System.out.println("ArrayList<Double>: " + doubleList);

        // ===== LATIHAN 3: CREATE (Tambah Data) =====
        System.out.println("\n=== LATIHAN 3: CREATE ===");
        ArrayList<String> buah = new ArrayList<>();
        buah.add("Apel");
        buah.add("Jeruk");
        buah.add("Mangga");
        System.out.println("Setelah tambah: " + buah);

        // ===== LATIHAN 4: READ (Baca Data) =====
        System.out.println("\n=== LATIHAN 4: READ ===");
        System.out.println("Elemen index 1: " + buah.get(1));
        System.out.println("Apakah ada Mangga? " + buah.contains("Mangga"));
        System.out.println("Index Jeruk: " + buah.indexOf("Jeruk"));
        System.out.println("Jumlah elemen: " + buah.size());

        // ===== LATIHAN 5: UPDATE (Ubah Data) =====
        System.out.println("\n=== LATIHAN 5: UPDATE ===");
        buah.set(1, "Pisang");
        System.out.println("Setelah update index 1: " + buah);

        // ===== LATIHAN 6: DELETE (Hapus Data) =====
        System.out.println("\n=== LATIHAN 6: DELETE ===");
        buah.remove("Apel");
        System.out.println("Setelah hapus Apel: " + buah);
        buah.clear();
        System.out.println("Setelah clear: " + buah + " | isEmpty? " + buah.isEmpty());

        // ===== LATIHAN 7: Iterasi ArrayList =====
        System.out.println("\n=== LATIHAN 7: ITERASI ===");
        ArrayList<String> hewan = new ArrayList<>(Arrays.asList("Kucing", "Anjing", "Kelinci"));

        // For loop biasa
        for (int i = 0; i < hewan.size(); i++) {
            System.out.println("Index " + i + ": " + hewan.get(i));
        }

        // Enhanced for loop
        for (String h : hewan) {
            System.out.println("For-each: " + h);
        }

        // While loop
        int idx = 0;
        while (idx < hewan.size()) {
            System.out.println("While: " + hewan.get(idx));
            idx++;
        }

        // Iterator
        Iterator<String> iterator = hewan.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterator: " + iterator.next());
        }

        // ===== LATIHAN 8: ArrayList dengan Data Kompleks =====
        System.out.println("\n=== LATIHAN 8: DATA KOMPLEKS ===");
        ArrayList<String[]> mahasiswa = new ArrayList<>();
        mahasiswa.add(new String[]{"Andi", "123", "Informatika"});
        mahasiswa.add(new String[]{"Budi", "124", "Sistem Informasi"});

        for (String[] m : mahasiswa) {
            System.out.println("Nama: " + m[0] + ", NIM: " + m[1] + ", Jurusan: " + m[2]);
        }

        // ===== LATIHAN 9: Utility Collections =====
        System.out.println("\n=== LATIHAN 9: COLLECTIONS UTILITY ===");
        ArrayList<Integer> angka = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 9));
        System.out.println("Asli: " + angka);

        Collections.sort(angka);
        System.out.println("Sort: " + angka);

        Collections.reverse(angka);
        System.out.println("Reverse: " + angka);

        Collections.shuffle(angka);
        System.out.println("Shuffle: " + angka);

        System.out.println("Max: " + Collections.max(angka));
        System.out.println("Min: " + Collections.min(angka));
        System.out.println("Frequency 3: " + Collections.frequency(angka, 3));

        // ===== LATIHAN 10: Searching & Sorting =====
        System.out.println("\n=== LATIHAN 10: SEARCHING & SORTING ===");
        ArrayList<String> buah2 = new ArrayList<>(Arrays.asList("Mangga", "Apel", "Jeruk", "Pisang"));
        Collections.sort(buah2);
        System.out.println("Sorted: " + buah2);

        int pos = Collections.binarySearch(buah2, "Jeruk");
        System.out.println("Binary search Jeruk: index " + pos);

        boolean ketemu = false;
        for (int i = 0; i < buah2.size(); i++) {
            if (buah2.get(i).equals("Mangga")) {
                System.out.println("Linear search Mangga di index " + i);
                ketemu = true;
                break;
            }
        }
        if (!ketemu) System.out.println("Mangga tidak ditemukan");

        // ===== LATIHAN 11: ArrayList 2D =====
        System.out.println("\n=== LATIHAN 11: ARRAYLIST 2D ===");
        ArrayList<ArrayList<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            ArrayList<Integer> row = new ArrayList<>();
            for (int j = 0; j < 3; j++) {
                row.add(i + j);
            }
            matrix.add(row);
        }
        System.out.println("Matrix 2D: " + matrix);

        // ===== LATIHAN 12: Skenario Nyata (Perpustakaan) =====
        System.out.println("\n=== LATIHAN 12: PERPUSTAKAAN ===");
        ArrayList<String[]> buku = new ArrayList<>();
        buku.add(new String[]{"Pemrograman Java", "Andi", "2020", "tersedia"});
        buku.add(new String[]{"Basis Data", "Budi", "2019", "tersedia"});

        pinjamBuku(buku, "Basis Data");
        kembalikanBuku(buku, "Basis Data");
        cariBuku(buku, "Java");

        System.out.println("Daftar Buku:");
        for (String[] b : buku) {
            System.out.println(Arrays.toString(b));
        }

        // ===== LATIHAN 13: Sistem Nilai Mahasiswa Dinamis =====
        System.out.println("\n=== LATIHAN 13: SISTEM NILAI MAHASISWA DINAMIS ===");
        ArrayList<String> namaMhs = new ArrayList<>();
        ArrayList<ArrayList<Integer>> nilaiMhs = new ArrayList<>();

        // Tambah mahasiswa 1
        namaMhs.add("Andi");
        ArrayList<Integer> nilaiAndi = new ArrayList<>();
        Collections.addAll(nilaiAndi, 80, 90, 75);
        nilaiMhs.add(nilaiAndi);

        // Tambah mahasiswa 2
        namaMhs.add("Budi");
        ArrayList<Integer> nilaiBudi = new ArrayList<>();
        Collections.addAll(nilaiBudi, 85, 70, 95);
        nilaiMhs.add(nilaiBudi);

        // Print nilai
        for (int k = 0; k < namaMhs.size(); k++) {
            System.out.println(namaMhs.get(k) + " : " + nilaiMhs.get(k) +
                    " | Rata-rata = " + hitungRataRata(nilaiMhs.get(k)));
        }

        // ===== LATIHAN 14: Performance Comparison =====
        System.out.println("\n=== LATIHAN 14: PERFORMANCE COMPARISON ===");
        int n = 1000000;

        // Array biasa
        long startArray = System.currentTimeMillis();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        long endArray = System.currentTimeMillis();
        System.out.println("Array waktu: " + (endArray - startArray) + " ms");

        // ArrayList
        long startList = System.currentTimeMillis();
        ArrayList<Integer> arrList = new ArrayList<>();
        for (int i = 0; i < n; i++) arrList.add(i);
        long endList = System.currentTimeMillis();
        System.out.println("ArrayList waktu: " + (endList - startList) + " ms");
    }

    // ===== Helper Methods =====
    public static void pinjamBuku(ArrayList<String[]> buku, String judul) {
        for (String[] b : buku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("tersedia")) {
                b[3] = "dipinjam";
                System.out.println(judul + " berhasil dipinjam.");
                return;
            }
        }
        System.out.println(judul + " tidak tersedia.");
    }

    public static void kembalikanBuku(ArrayList<String[]> buku, String judul) {
        for (String[] b : buku) {
            if (b[0].equalsIgnoreCase(judul) && b[3].equals("dipinjam")) {
                b[3] = "tersedia";
                System.out.println(judul + " berhasil dikembalikan.");
                return;
            }
        }
        System.out.println(judul + " tidak ditemukan.");
    }

    public static void cariBuku(ArrayList<String[]> buku, String keyword) {
        System.out.println("Hasil pencarian \"" + keyword + "\":");
        for (String[] b : buku) {
            if (b[0].toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(Arrays.toString(b));
            }
        }
    }

    public static double hitungRataRata(ArrayList<Integer> values) {
        if (values.isEmpty()) return 0;
        int sum = 0;
        for (int v : values) sum += v;
        return (double) sum / values.size();
    }
}
