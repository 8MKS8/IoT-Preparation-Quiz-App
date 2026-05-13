# 📱 Quiz App — Native Android (Kotlin)

A reusable, dark-themed quiz app built with Kotlin + Material Design.

---

## 🚀 Getting Started

### Requirements
- Android Studio (Hedgehog 2023.1.1 or newer)
- Android SDK 34
- Minimum device/emulator: Android 7.0 (API 24)

### Steps
1. Open Android Studio → **File → Open** → select this `QuizApp` folder
2. Wait for Gradle sync to finish
3. Hit ▶️ **Run** — choose your emulator or physical device
4. Done!

---

## ➕ How to Add a New Quiz

Open `app/src/main/java/com/quizapp/data/QuizRepository.kt`

1. **Create a new Quiz object:**

```kotlin
private val myNewQuiz = Quiz(
    id = "unique_quiz_id",           // must be unique
    title = "My Quiz Title",
    description = "Week X – Topic",
    subject = "CS1234",
    questions = listOf(
        Question(
            id = 1,
            questionText = "What is ...?",
            options = listOf("Option A", "Option B", "Option C", "Option D"),
            correctAnswerIndex = 1,   // 0-based index (0=A, 1=B, 2=C, 3=D)
            explanation = "Because..."
        ),
        // add more questions...
    )
)
```

2. **Add it to the master list:**

```kotlin
val allQuizzes: List<Quiz> = listOf(
    distributedSystemsQuiz,
    myNewQuiz          // ← add here
)
```

3. The new quiz appears automatically on the home screen. ✅

---

## 📁 Project Structure

```
QuizApp/
├── app/src/main/java/com/quizapp/
│   ├── model/
│   │   ├── Question.kt         ← data class for a single question
│   │   └── Quiz.kt             ← data class for a full quiz
│   ├── data/
│   │   └── QuizRepository.kt   ← ADD YOUR QUIZZES HERE
│   ├── adapter/
│   │   └── QuizAdapter.kt      ← RecyclerView adapter for quiz list
│   └── ui/
│       ├── HomeActivity.kt     ← landing screen
│       ├── QuizListActivity.kt ← list of available quizzes
│       ├── QuizActivity.kt     ← quiz-taking screen
│       ├── QuizViewModel.kt    ← state management
│       └── ResultActivity.kt   ← score screen
└── app/src/main/res/
    ├── layout/                 ← XML layouts for each screen
    ├── values/                 ← colors, strings, themes
    └── drawable/               ← progress bar, explanation background
```

---

## 🎨 Features
- Dark theme with blue/purple accent colors
- Progress bar per question
- Instant answer feedback (green = correct, red = wrong)
- Explanation shown after each answer
- Score screen with percentage + feedback message
- Retake or go home from results screen
- Easily extensible — add unlimited quizzes

---

## 📚 Included Quizzes
- **Distributed Systems** — CS6006 Week 2 (15 questions)
