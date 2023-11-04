package com.example.quizapp

object constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTION: String = "total_question"
    const val CORRECT_ANSWERS: String = "correct_answer"

    fun getQuestions(): ArrayList<Question>{

         val questionList = ArrayList<Question>()

        val que1 = Question(1,
            "What country does this flag belong to?",
            R.drawable.argentina,
            "Australia",
            "Argentina",
            "Austria",
            "Armenia",
            2
        )
        questionList.add(que1)

        val que2 = Question(2,
            "What country does this flag belong to?",
            R.drawable.india,
            "Australia",
            "Argentina",
            "India",
            "Armenia",
            3
        )
        questionList.add(que2)

        val que3 = Question(3,
            "What country does this flag belong to?",
            R.drawable.australia,
            "Australia",
            "Argentina",
            "Austria",
            "Armenia",
            1
        )
        questionList.add(que3)

        val que4 = Question(4,
            "What country does this flag belong to?",
            R.drawable.us,
            "Australia",
            "US",
            "Austria",
            "Armenia",
            2
        )
        questionList.add(que4)

        val que5 = Question(5,
            "What country does this flag belong to?",
            R.drawable.belgium,
            "Australia",
            "Argentina",
            "Belguim",
            "Armenia",
            3
        )
        questionList.add(que5)

        return questionList
    }
}