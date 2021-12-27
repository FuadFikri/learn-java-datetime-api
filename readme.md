# Java Date Time API

### Date
- deprecated
- tidak direkomendasikan lagi


### Calendar
- Memanipulasi tanggal dan waktu

### Timezone
- Direpresentasikan class TimeZone
- Ketika membuat object Calendar dan tidak menyebutkan timezone-nya maka akan menggunakan default timezone yang ada di sistem operasi
- Untuk menggunakan timezone tertentu bisa menggunakan TimeZone.getTimeZone("Zone ID)

### LocalDate
- java.time.LocalDate
- Representasi untuk tipe tanggal saja (tanpa waktu)
- Bersifat immutable

### LocalTime
- Representasi waktu tanpa tanggal
- Bersifat immutable
- Format standard HH:mm:ss.nano


