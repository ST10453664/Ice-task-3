package za.ac.iie.icetask4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MultiplicationTable : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_multiplication_table)

        // get the table number from bundle
        val bundle: Bundle? = intent.extras
        val tableString: String? = bundle?.getString("tableNumber")

        //convert the table to an integer
        val tableNumber = tableString.toInt()

        // display the heading so we can see the value in action
        val multiplicationTable = findViewById<TextView>(R.id.multiplicationTableTextView)
        multiplicationTable.text = "$tableNumber x table"

        // start with the heading and add two new lines
        var tableDisplay: String = "$tableNumber x table\n\n"

        // loop 10 times and keep adding to the string

        // set the string onto the display
        multiplicationTable.text = tableDisplay

        // convert the table number to an integer that is non-nullable
        val tableNumber = tableString!!.toInt()

        // declare the control variable
        var counter = 1
        while (counter <= 10) { // check the control variable
            val answer = tableNumber * counter
            tableDisplay += "$tableNumber x $counter = ${answer}\n"
            counter++           //update the control variable

            // declare the control variable
            var counter = 1
            while (counter <= 10) { // check the control variable
                // skip 3
                if (counter == 3) {
                    counter++
                    continue
                }
                val answer = tableNumber * counter
                tableDisplay += "$tableNumber x $counter = ${answer}\n"
                counter++           // update the control variable
            }
        }