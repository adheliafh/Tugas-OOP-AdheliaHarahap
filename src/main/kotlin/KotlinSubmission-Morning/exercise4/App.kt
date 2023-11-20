package id.infinitelearning.KotlinSubmission.exercise4

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini

fun main() {
        try {
            print("90: ")
            val userInput = readLine()
            val number = userInput?.toInt()

            if (number != null) {
                println("90: $number")
            } else {
                throw NumberFormatException("Input tidak valid. Masukkan angka.")
            }
        } catch (e: NumberFormatException) {
            println("Terjadi kesalahan: ${e.message}")
        } finally {
            println("Program selesai.")
        }
    }
