package firstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import org.osmdroid.api.IMapController
import org.osmdroid.tileprovider.tilesource.TileSourceFactory
import org.osmdroid.util.GeoPoint

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
     //   myTextView.setText("Hello World")
        mapview.setTileSource(TileSourceFactory.MAPNIK)
        mapview.setBuiltInZoomControls(true)
        mapview.setMultiTouchControls(true)

        var mapController : IMapController = mapview.getController()
        mapController.setZoom(9)
        val startPoint : GeoPoint = GeoPoint(48.8583, 2.2944)
        mapController.setCenter(startPoint)
    }
}
