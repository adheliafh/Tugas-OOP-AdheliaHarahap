package id.infinitelearning.KotlinSubmission.exercise1

    /**
    Latihan 1
    Lengkapi fungsi myProfile di bawah ini dengan membuat variabel dengan ketentuan dibawah ini:
    - Variable bertipe data string yang menyimpan nilai nama depan Anda.
    - Variable bertipe data string yang menyimpan nilai nama belakang Anda.
    - Variable bertipe data number yang menyimpan nilai umur Anda.
    - Variable bertipe data boolean yang menyimpan nilai status Anda (single atau tidak)
    Dan Cetak setiap variabel ke layar saat variable myProfile di panggil
     */
    fun myProfile() {
        val firstName: String = "Adhelia Febriasari"
        val lastName: String = "Harahap"
        var age: Int = 20
        var status: Boolean = true
        println("Nama saya : $firstName $lastName")
        println("Umur saya : $age tahun")
        println("status ${if (status) "Single" else "Tidak Single"}")
    }


    /**
     *  Latihan 2
     *  Lengkapi fungsi di bawah ini agar dapat mencetak nilai dari parameter-parameter yang ada dengan fungsi println
     */
    fun groupDetail(groupId: String, groupMember: List<Any>, session: String): String {
        val groupId = "Fifty-One"
        val groupMember = listOf("Widya", "Aqil", "Adel", "Afidz", "Aryanto", "Wulan", "Icang", "Dimas", "Rifqi", "Sultan")
        val session = "Morning"
        println("graoup Id = $groupId")
        println("group member = $groupMember")
        println("sesi = $session")
        return "Detail Group"
    }


    /**
     * Latihan 3
     * Buat variable yang berisi daftar anggota group kamu,
     * Kemudian akses item yang berisi nama Anda dari variable tersebut, lalu jadikan nilai kembalian untuk fungsi myTeam ini
     *
     */
    fun myTeam(member: List<String>): String {
        return member[0]
    }


    /**
     * Latihan 4
     * Lengkapi dan perbaiki isi fungsi totalMember() ini dengan rumus:
     *
     *      total mentor + jumlah anggota group
     *
     */
    fun totalMember(member: List<String>): Int {
        val mentor = listOf("kak budi prayoga", "kak anisyah")
        println("mentor = $mentor")

        return mentor.size + member.size
    }

    fun main() {
        val anggotaTeam = listOf<String>(
            "Widya Indah Sari Siregar",
            "Annisa Ramadhani",
            "Wulan Annur",
            "Adhelia Febriasari Harahap",
            "Afidz Bangun Prastyo",
            "Aryanto",
            "Muhamad Aqil Aziz",
            "Dimas Wahyu Mubarak",
            "Rifqi Genta Buana",
            "Sultan Syekh Nuhly Rifa"
        )

        myProfile()

        val myTeam = myTeam(anggotaTeam)
        println("My team is: $anggotaTeam")

        val totalMember = totalMember(anggotaTeam)
        println("Total Member group : $totalMember")


    /**
         *  Latihan 5
         *  Ubah nilai argumen-argumen dari fungsi groupDetail di bawah ini sesuai dengan data group kamu
         *
         */
        groupDetail("Fifty-One", anggotaTeam, "Morning")
    }
