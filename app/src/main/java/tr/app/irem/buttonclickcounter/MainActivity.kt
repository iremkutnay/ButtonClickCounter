package tr.app.irem.buttonclickcounter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // defined button, text, reset button and counter
        val buttonClick = findViewById(R.id.button) as Button
        val myTextView = findViewById(R.id.counterText) as TextView
        val buttonReset = findViewById(R.id.resetbutton) as Button
        var counter = 0

        // set on-click listener
        buttonClick.setOnClickListener {
            // in the next line, increases the value by 1 each time when the button is clicked.
            counter = counter + 1
            // the next line makes the counter appear on the screen
            myTextView.text = counter.toString()
        }
        buttonReset.setOnClickListener{
            // in the next line, it will set the counter 0 when the reset button is clicked.
            counter = 0
            // the next line makes the counter appear on the screen
            myTextView.text = counter.toString()
        }

    }
}