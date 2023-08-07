package juan.gutierrez.umpirecountindicator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    var strikes: Int = 0
    var balls: Int = 0
    var outs: Int = 0
    var innings: Int = 0
    lateinit var btnBalls: Button
    lateinit var btnStrikes: Button
    lateinit var btnOuts: Button
    lateinit var btnInnings: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnBalls = findViewById(R.id.btn_Balls)
        btnStrikes = findViewById(R.id.btn_strikes)
        btnOuts = findViewById(R.id.btn_outs)
        btnInnings = findViewById(R.id.btn_innings)

    }

    public fun click_reset(view: View){
        strikes = 0
        balls = 0
        outs = 0
        innings = 0

        btnBalls.setText("$balls")
        btnStrikes.setText("$strikes")
        btnOuts.setText("$outs")
        btnInnings.setText("$innings")
    }

    public fun click_balls(view: View){
        //Toast.makeText(this, "Click en balls", Toast.LENGTH_LONG).show()
        if(balls == 4){
            balls = 0
        }else {
            balls++
        }

        btnBalls.setText("$balls")
    }

    public fun click_strikes(view: View){
        //Toast.makeText(this, "Click en strikes", Toast.LENGTH_LONG).show()
        if(strikes == 3){
            strikes = 0
            click_outs(view)
        }else {
            strikes++
        }

        btnStrikes.setText("$strikes")
    }

    public fun click_outs(view: View){
        if(outs == 3){
            outs = 0
        }else {
            outs++
        }

        btnOuts.setText("$outs")
    }

    public fun click_innings(view: View){
        if(innings == 9){
            innings = 0
        } else {
            innings++
        }


        btnInnings.setText("$innings")
    }
}