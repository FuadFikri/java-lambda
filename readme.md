

# Java Lambda
    fitur baru yang keluar pada java 8
    anonymous class

### Syarat Lambda
    - interface
    - memiliki 1 method abstract
    - ditambahkan annotation @FunctionalInterface di interfacenya
    - minimal menggunakan java 8


### java.util.function
    berisi banyak functional interface yang bisa digunakan untuk membuat lambda
    beberapa yang sering digunakan adalah
#### Consumer
    It represents a function which takes in one argument and produces a result. However these kind of functions don’t return any value.
    
    - accept : This method accepts one value and performs the operation on the given argument
    - andThen : menerima parameter operation setelah menjalankan consumer 

#### Function
    - Function<Request,Response>

#### Predicate
    - return boolean

#### Supplier
    - Tidak memerlukan parameter
    - return result

