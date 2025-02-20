# Aplikasi Manajemen Kontak 📱

## Deskripsi Program 📝

Aplikasi Manajemen Kontak adalah sebuah program Java berbasis GUI yang memungkinkan pengguna untuk menyimpan dan mengelola informasi kontak. Aplikasi ini menggunakan database SQLite untuk menyimpan data secara lokal dan menyediakan fitur CRUD (Create, Read, Update, Delete) serta fitur ekspor/impor data ke format CSV.

## Fitur Utama 🔧

- **Manajemen Kontak Lengkap (CRUD)**:
  - Tambah kontak baru
  - Edit informasi kontak
  - Hapus kontak
  - Tampilkan semua kontak
- **Pencarian Kontak** berdasarkan nama atau nomor telepon
- **Kategorisasi Kontak** (Keluarga, Teman, Kerja)
- **Ekspor dan Impor Data** dalam format CSV
- **Validasi Input** untuk format nomor telepon

## Komponen GUI 🖥️

Komponen utama yang digunakan:

- **JTable**: Menampilkan daftar kontak
- **JTextField**: Input data kontak
- **JComboBox**: Pemilihan kategori
- **JButton**: Tombol aksi (Tambah, Edit, Hapus, dll)
- **JPanel**: Organisasi layout
- **JScrollPane**: Scroll untuk tabel

## Screenshot 📸

### Tambah Data

![Tambah Data](URL-to-screenshot)

Tampilan utama aplikasi dengan daftar kontak.

### Dialog Import/Export

![Dialog Import/Export](URL-to-screenshot)

Dialog untuk mengimpor atau mengekspor data.

## Fitur Detail 🔍

### 1. Manajemen Data

- **Tambah Kontak**:

  - Input nama
  - Input nomor telepon
  - Pilih kategori
  - Validasi otomatis

- **Edit Kontak**:

  - Klik data di tabel
  - Ubah informasi
  - Simpan perubahan

- **Hapus Kontak**:
  - Pilih kontak
  - Konfirmasi penghapusan

### 2. Pencarian

- **Pencarian real-time** berdasarkan nama atau nomor telepon
- Hasil ditampilkan di tabel

### 3. Export/Import

- **Export ke CSV**:

  - Pilih lokasi penyimpanan
  - Format data terstruktur

- **Import dari CSV**:
  - Pilih file sumber
  - Validasi format
  - Integrasi ke database

## Database Structure 💾

Tabel kontak:

```sql
CREATE TABLE kontak (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nama TEXT NOT NULL,
    nomor_telepon TEXT NOT NULL UNIQUE,
    kategori TEXT NOT NULL
);

## Penulis ✍️

- **Nama**: RENDY WIDIANSYAH
- **NPM**: 2210010549
- **Kelas**: 5B TI Reg BJB
```
