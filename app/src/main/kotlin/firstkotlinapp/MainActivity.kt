package firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.milen_000.firstkotlinapp.R
import kotlinx.android.synthetic.main.activity_main.*
import org.osmdroid.tileprovider.tilesource.TileSourceFactory

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        myTextView.setText("Hello World")
        mapview.setTileSource(TileSourceFactory.MAPNIK)
    }
}
