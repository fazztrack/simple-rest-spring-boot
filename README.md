# Simple REST Spring Boot
- Jalankan database PostgreSQL dan buatlah database dengan nama **library_db**
- Jalankan project dengan perintah `./mvnw spring-boot:run`
- Daftar endpoint API yang terdapat dalam project ini:
  - Add book - Post - `http://localhost:8000/v1/api/books`
  - Get all book - Get - `http://localhost:8000/v1/api/books`
  - Get book by id - Get - `http://localhost:8000/v1/api/books/{id}`
  - Update book by id - Put - `http://localhost:8000/v1/api/books/{id}`
  - Delete book by id - Delete - `http://localhost:8000/v1/api/books/{id}`
- Bentuk Request Book JSON
    ```
    {
      "judul": "Judul Buku",
      "pengarang": "Pengarang Buku",
      "penerbit": "Penerbit Buku",
      "isbn": "123",
      "tahunTerbit": "2000"
    }
    ```