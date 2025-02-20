# Aplikasi Penghitung Umur 🕒

## Deskripsi Program 📝

Aplikasi Penghitung Umur adalah program Java yang memungkinkan pengguna untuk menghitung umur berdasarkan tanggal lahir yang dimasukkan. Aplikasi ini menggunakan antarmuka grafis pengguna (GUI) yang user-friendly dan memberikan informasi detail tentang usia serta ulang tahun berikutnya.

## Fitur Utama 🔧

- Penghitungan umur otomatis berdasarkan tanggal lahir yang dipilih.
- Menampilkan hasil dalam format tahun, bulan, dan hari.
- Kalkulasi hari ulang tahun berikutnya secara otomatis.
- Tampilan kalender interaktif untuk memilih tanggal.
- Interface yang mudah digunakan dengan tombol-tombol yang jelas.

## Komponen GUI 🖥️

Aplikasi ini menggunakan komponen GUI berikut:

- **JFrame**: Sebagai jendela utama aplikasi.
- **JDateChooser**: Untuk memilih tanggal lahir.
- **JTextField**: Menampilkan hasil perhitungan.
- **JTextArea**: Menampilkan informasi tambahan.
- **JButton**: Untuk tombol hitung dan keluar.
- **JPanel**: Untuk layout dan organisasi komponen.

## Screenshot 📸

Berikut adalah tampilan aplikasi Penghitung Umur:

### Tampilan Awal

![alt text](src/img/Latihan2Utama.png)

### Hasil Perhitungan

![Hasil Perhitungan](c:\Users\SSD TURBO_BC\Documents\NetBeansProjects\TugasPBO2\src\img\Latihan2U.png)

## Logika Program 🔄

1. **Input Tanggal**: Menggunakan JDateChooser untuk memilih tanggal lahir.
2. **Kalkulasi Umur**: Menghitung selisih antara tanggal lahir dan tanggal saat ini.
3. **Format Output**: Menampilkan hasil dalam format yang mudah dibaca.
4. **Thread Management**: Mengelola proses asynchronous untuk pengambilan data.

## Event Handling ⚙️

- **PropertyChangeListener**: Menangani perubahan pada pemilihan tanggal.
- **ActionListener**: Menangani klik pada tombol-tombol.
- **Thread Handling**: Mengelola proses background untuk perhitungan.

## Cara Menggunakan 📖

1. **Memilih Tanggal 📅**:

   - Klik pada kalender untuk memilih tanggal lahir.
   - Atau masukkan tanggal secara manual.

2. **Melihat Hasil 👀**:

   - Hasil perhitungan umur akan ditampilkan otomatis.
   - Informasi tentang ulang tahun berikutnya juga akan muncul.

3. **Keluar Aplikasi 🚪**:
   - Klik tombol **Keluar** untuk menutup aplikasi.

## Penulis ✍️

- **Nama**: RENDY WIDIANSYAH
- **NPM**: 2210010549
- **Kelas**: 5B TI Reg BJB

## Teknologi yang Digunakan 💻

- **Java**: Bahasa pemrograman utama.
- **Swing/AWT**: Untuk pembuatan GUI.
- **JCalendar**: Library untuk komponen kalender.
- **Java Time API**: Untuk kalkulasi waktu.
