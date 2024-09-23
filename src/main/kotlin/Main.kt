fun main() {
    val expenseTracker = ExpenseTracker()

    expenseTracker.recordExpense(100.0, "Food", "2023-10-01")
    expenseTracker.recordExpense(50.0, "Transport", "2023-10-02")
    expenseTracker.recordExpense(200.0, "Food", "2023-10-03")
    expenseTracker.recordExpense(75.0, "Entertainment", "2023-10-04")

    println("All Expenses:")
    expenseTracker.showAllExpenses()

    println("\nTotal Expenses by Category:")
    val totalsByCategory = expenseTracker.calculateTotalByCategory()
    for ((category, total) in totalsByCategory) {
        println("$category: $total")
    }
}