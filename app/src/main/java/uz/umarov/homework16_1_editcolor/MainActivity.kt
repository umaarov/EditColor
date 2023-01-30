package uz.umarov.homework16_1_editcolor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import uz.umarov.homework16_1_editcolor.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val blankFragment = BlankFragment()
        val fragmentManager  = supportFragmentManager
        val transaction = fragmentManager.beginTransaction()

        transaction.add(R.id.myContainer, blankFragment)
        transaction.commit()
    }
}