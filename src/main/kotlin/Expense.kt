data class Expense(val amount: Double, val category: String, val date: String) {
    fun displayExpense() {
        println("Amount: \$amount, Category: \$category, Date: \$date")
    }
}