package com.library.app

// Book inventory model
data class Book(
    val bookId: String = "",
    val title: String = "",
    val author: String = "",
    val isbn: String = "",
    val category: String = "",
    val totalCopies: Int = 0,
    val availableCopies: Int = 0
)

// Student model
data class Student(
    val admissionNumber: String = "",
    val name: String = "",
    val className: String = "",
    val stream: String = ""
)

// Issue / Borrowing model
data class Issue(
    val issueId: String = "",
    val bookId: String = "",
    val admissionNumber: String = "",
    val issueDate: String = "",
    val dueDate: String = "",
    val status: String = "ISSUED" // ISSUED | RETURNED
)
