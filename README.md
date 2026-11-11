# Counter Compose — Praktikum PPPB Pertemuan 11

Aplikasi Counter Android menggunakan Kotlin dan Jetpack Compose. Project ini menerapkan materi Layout (Column, Row, Box), Modifier, State, ViewModel, State Hoisting, dan SharedPreferences.

## Fitur
- Tambah, kurangi, dan reset angka counter.
- Angka diperbarui secara otomatis melalui Compose State dan recomposition.
- ViewModel mengelola state serta logika counter.
- SharedPreferences menyimpan nilai sehingga tetap tersedia setelah aplikasi ditutup dan dibuka kembali.
- UI dibuat dengan Jetpack Compose dan Material 3.

## Menjalankan project
1. Ekstrak folder project.
2. Buka folder `PPPB_Pertemuan11-master` melalui Android Studio.
3. Tunggu Gradle Sync selesai.
4. Jalankan aplikasi menggunakan emulator atau perangkat Android (minimum Android 7.0 / API 24).

## Struktur kode utama
- `MainActivity.kt` — entry point dan konfigurasi Compose.
- `CounterScreen.kt` — UI, Column/Row/Box, tombol, display, dan Preview.
- `CounterViewModel.kt` — pengelolaan state serta penyimpanan SharedPreferences.

## Skenario pengujian
1. Tekan TAMBAH beberapa kali; angka harus bertambah.
2. Tekan KURANG; angka harus berkurang.
3. Tekan RESET; angka kembali menjadi 0.
4. Naikkan angka, tutup aplikasi sepenuhnya, lalu buka kembali; nilai terakhir harus tetap tampil.
5. Putar orientasi emulator; nilai counter harus tetap terjaga.

## Teknologi
Kotlin, Jetpack Compose, Material 3, Android ViewModel, SharedPreferences.
