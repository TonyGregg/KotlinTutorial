class Basics {

    fun main() {
        var answer: Int
        answer = 42

        //Even though the var keyword allows a variable to change its value, its type is fixed.
        // For example, this code doesn’t compile:
//        answer = "somethingelse"
        answer = 50

        // val is fixed, just like final in java
        val n = 50;
        // below code won't combile
//        n = 60;
    }
    /**
     * The function declaration starts with the fun keyword, followed by the function name: max,
     * in this case. It’s followed by the parameter list in parentheses.
     *
     * The return type comes after the parameter list, separated from it by a colon.
     */
    fun max(a: Int, b: Int): Int {
        return if (a > b) a else b
        /**
         * Statements and expressions
        In Kotlin, if is an expression, not a statement. The difference between a statement and an
        expression is that an expression has a value, which can be used as part of another expression,
        whereas a statement is always a top-level element in its enclosing block and doesn’t have its own value.
        In Java, all control structures are statements.
        In Kotlin, most control structures, except for the loops (for, do, and do/while) are expressions.
        The ability to combine control structures with other expressions lets you express many
        common patterns concisely.
         */
    }

    /**
     * You can simplify the previous function even further. Because its body consists of a single expression,
     * you can use that expression as the entire body of the function, removing the curly braces
     * and the return statement:

     */
    fun max2(a: Int, b: Int): Int = if (a > b) a else b




}