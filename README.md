# Dokumentasi JobSeeker

## Job Seeker (object)

### Atribut
- **Username**: Nama pengguna job seeker
- **Password**: Kata sandi untuk akun job seeker
- **Nama**: Nama lengkap job seeker
- **Alamat**: Alamat tempat tinggal job seeker
- **Email**: Alamat email job seeker
- **No Hp**: Nomor telepon job seeker

### Method
- **Registrasi**: Mendaftar akun job seeker
- **Update Profile**: Memperbarui profil job seeker
- **Regist Campaign**: Mendaftar dalam sebuah kampanye
- **Melihat Campaign**: Melihat daftar kampanye

## Company (object)

### Atribut
- **Username**: Nama pengguna perusahaan
- **Password**: Kata sandi untuk akun perusahaan
- **Name**: Nama perusahaan
- **Email**: Alamat email perusahaan
- **Deskripsi**: Deskripsi perusahaan

### Method
- **Regist**: Mendaftar akun perusahaan
- **Update Profile**: Memperbarui profil perusahaan
- **Melihat Campaign yang telah dibuat**: Melihat daftar kampanye yang telah dibuat perusahaan
- **Melihat pendaftar Campaign**: Melihat daftar job seeker yang mendaftar dalam kampanye
- **Membuat Campaign**: Membuat kampanye baru
- **Update Campaign**: Memperbarui kampanye

## Campaign (object)

### Atribut
- **Name**: Nama kampanye
- **Id_Comp**: ID perusahaan yang membuat kampanye
- **Deskripsi**: Deskripsi kampanye
- **Location**: Lokasi kerja kampanye
- **Sallary**: Gaji yang ditawarkan
- **Hour**: Jam kerja

### Method
