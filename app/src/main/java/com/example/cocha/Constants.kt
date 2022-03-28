package com.example.cocha

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answers"

    fun getQuestions(): ArrayList<Question>{
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What does the following code print?",
            R.drawable.kotlinduas,
            "True",
            "False",
            "Does not compile",
            "Nothing, but throws NullPointerException",
            2
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What is the type of arr in the following code?",
            R.drawable.kotlintigas,
            "Int[]",
            "Array<Int>",
            "int[]",
            "IntArray",
            2
        )
        questionsList.add(que2)


        val que3 = Question(
            3,
            "What is the difference between a and b?",
            R.drawable.kotlinempats,
            "b is final and cannot be changed",
            "a is volatile as in Java",
            "b can never become null",
            "a is final and cannot be changed",
            3
        )
        questionsList.add(que3)



        val que4 = Question(
            4,
            "What does the following code print?",
            R.drawable.kotlinlimas,
            "True",
            "Unit",
            "[1,2,3,4]",
            "Nothing",
            1
        )
        questionsList.add(que4)


        val que5 = Question(
            5,
            "Which is true for the following simple class declaration?",
            R.drawable.kotlinenams,
            "It can extended by other class",
            "It is package-private",
            "It has a private property name",
            "It is public",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "Which is the output of the following code?",
            R.drawable.kotlinsatus,
            "It does not compile, as listOf is not known",
            "[5, 6, 7]",
            "[1, 2, 3, 4]",
            "It does not compile as List has no add method",
            4
        )
        questionsList.add(que6)



        val que7 = Question(
            7,
            "What will be the output?",
            R.drawable.satus,
            "1 2 3 4 5 6 7 8 9 10",
            "1 2 3 4 5 6 7 8 9",
            "1 2 3 4 5",
            "Error syntax",
            2
        )
        questionsList.add(que7)



        val que8 = Question(
            8,
            "What will be the output?",
            R.drawable.duas,
            "2",
            "3",
            "4",
            "1",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What will be the output?",
            R.drawable.tigas,
            "1",
            "2",
            "1 2",
            "Error",
            1
        )
        questionsList.add(que9)



        val que10= Question(
            10,
            "What will be the output?",
            R.drawable.empats,
            "Agatha",
            "Sugi",
            "John",
            "Putri",
            2
        )
        questionsList.add(que10)


        val que11= Question(
            11,
            "What gets printed?",
            R.drawable.limas,
            "11",
            "22",
            "33",
            "37",
            4
        )
        questionsList.add(que11)

        val que12= Question(
            12,
            "What will be the output?",
            R.drawable.pythonduapuluh,
            "[1, 3]",
            "[3, 2]",
            "[1, 2]",
            "[3, 1, 2]",
            2
        )
        questionsList.add(que12)

        val que13= Question(
            13,
            "What will be the output?",
            R.drawable.pythonsembilanbelas,
            "4",
            "49",
            "245",
            "Error",
            1
        )
        questionsList.add(que13)

        val que14= Question(
            14,
            "What will be the output?",
            R.drawable.pythondelapanbelas,
            "[0, 7, 4, 1, 8, 5, 2, 9, 6]",
            "[0, 1, 2, 7, 8, 9, 4, 5, 6]",
            "[(0, 1, 2), (7, 8, 9), (4, 5, 6)",
            "Error",
            2
        )
        questionsList.add(que14)

        val que15= Question(
            15,
            "What will be the output?",
            R.drawable.pythontujuhbelas,
            "3.4",
            "3.2",
            "No Output",
            "Error",
            1
        )
        questionsList.add(que15)



        val que16= Question(
            16,
            "What will be the output?",
            R.drawable.pythonenambelas,
            "0",
            "1",
            "2",
            "None of these",
            2
        )
        questionsList.add(que16)



        val que17= Question(
            17,
            "What will be the output?",
            R.drawable.pythonlimabelas,
            "0",
            "1",
            "63",
            "Error",
            3
        )
        questionsList.add(que17)



        val que18= Question(
            18,
            "What will be the output?",
            R.drawable.pythonempatbelas,
            "(1, 2, 3, 4, 5)",
            "((1, 2, 3), 4, 5)",
            "(1, 2, 3), 4, 5",
            "Error",
            2
        )
        questionsList.add(que18)



        val que19= Question(
            19,
            "What will be the output?",
            R.drawable.pythontigabelas,
            "12 34 34",
            "1 2 4",
            "1 3 4",
            "Error",
            3
        )
        questionsList.add(que19)


        val que20= Question(
            20,
            "What will be the output?",
            R.drawable.pythonduabelas,
            "h h h h h h",
            "o o o o o o",
            "p y t h o n",
            "Error",
            3
        )
        questionsList.add(que20)


        val que21= Question(
            21,
            "What will be the output?",
            R.drawable.pythonsebelas,
            "[5, 1, 4, 3, 2]",
            "[2, 5, 4, 3, 2]",
            "[5, 2, 4, 3, 2]",
            "[5, 4, 1, 3, 2]",
            3
        )
        questionsList.add(que21)


        val que22= Question(
            22,
            "What will be the output?",
            R.drawable.pythonsepuluh,
            "p y t h o n",
            "y y y y y...",
            "python python...",
            "None",
            2
        )
        questionsList.add(que22)


        val que23= Question(
            23,
            "What will be the output?",
            R.drawable.pythonsembilan,
            "(2, 4, 6)",
            "(1, 2, 3, 1, 2, 3)",
            "None",
            "Error",
            2
        )
        questionsList.add(que23)


        val que24= Question(
            24,
            "What will be the output?",
            R.drawable.pythondelapan,
            "True",
            "False",
            "None",
            "Error",
            2
        )
        questionsList.add(que24)



        val que25= Question(
            25,
            "What will be the output?",
            R.drawable.pythontujuh,
            "[3.1, '2', 4]",
            "[3.1, 4, '2']",
            "['2', 3.1, 4]",
            "Error",
            4
        )
        questionsList.add(que25)



        val que26= Question(
            26,
            "What will be the output?",
            R.drawable.pythonenam,
            "{1:2}",
            "{1:2, 3:4}",
            "{1:2, 5:6}",
            "Error",
            3
        )
        questionsList.add(que26)



        val que27= Question(
            27,
            "What will be the output?",
            R.drawable.pythonlima,
            "41",
            "42",
            "60",
            "Error",
            2
        )
        questionsList.add(que27)



        val que28= Question(
            28,
            "What will be the output?",
            R.drawable.pythonempat,
            "[4, 8]",
            "[4, 8, 16]",
            "16",
            "8",
            3
        )
        questionsList.add(que28)


        val que29= Question(
            29,
            "What will be the output?",
            R.drawable.pythontiga,
            "v1=P, v2=['Y','T','H']",
            "v1=[P], v2=['Y','T']",
            "v1=P, v2=['Y','T']",
            "Error",
            3
        )
        questionsList.add(que29)


        val que30= Question(
            30,
            "What will be the output?",
            R.drawable.pythondua,
            "[5,4,3,2,1]",
            "[5,4,3,2,1 (5,4,3,2,1)]",
            "[5,4,3,2,1,5,4,3,2,1]",
            "Error",
            3
        )
        questionsList.add(que30)


        return questionsList
    }
}