class ExpenseTracker {
    private val expenseList = ArrayList<Expense>()

    fun recordExpense(expenseAmount: Double, expenseCategory: String, expenseDate: String) {
        val newExpense = Expense(expenseAmount, expenseCategory, expenseDate)
        expenseList.add(newExpense)
    }

    fun showAllExpenses() {
        for (expense in expenseList) {
            expense.displayExpense()
        }
    }

    fun calculateTotalByCategory(): Map<String, Double> {
        val categorySums = mutableMapOf<String, Double>()
        for (expense in expenseList) {
            val currentSum = categorySums.getOrDefault(expense.category, 0.0)
            categorySums[expense.category] = currentSum + expense.amount
        }
        return categorySums
    }
}