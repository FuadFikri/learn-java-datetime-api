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

### LocalDateTime
- Gabungan LocalDate dan LocalTime
- Representasi tanggal dan waktu
- Bersifat immutable


### Year
- Tipe data tahun
- default format `yyyy`

### YearMonth
- Tipe data tahun dan bulan
- default format `yyyy-MM`
- 
### MonthDay
- Tipe data  bulan dan hari
- default format `--MM-dd`

### ZoneId
- Representasi zone id


### ZoneOffset
- Representasi timezone dengan offset dari time zone UTC atau GMT
- Misalnya +07:00 atau -02:00
- turunan dari class ZoneId
