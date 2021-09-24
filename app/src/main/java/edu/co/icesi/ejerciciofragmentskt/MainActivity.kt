package edu.co.icesi.ejerciciofragmentskt

import android.graphics.Color
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import edu.co.icesi.ejerciciofragmentskt.databinding.ActivityMainBinding
import edu.co.icesi.ejerciciofragmentskt.fragments.ConfigFragment
import edu.co.icesi.ejerciciofragmentskt.fragments.ContentFragment
import edu.co.icesi.ejerciciofragmentskt.fragments.HomeFragment

class MainActivity : AppCompatActivity() {

    //Fragments
    private lateinit var homeFragment: HomeFragment
    private lateinit var contentFragment: ContentFragment
    private lateinit var configFragment: ConfigFragment

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        homeFragment = HomeFragment.newInstance()
        contentFragment = ContentFragment.newInstance()
        configFragment = ConfigFragment.newInstance()

        //Configurar la barra superior
        binding.toolbar.setTitleTextColor(Color.WHITE)
        setSupportActionBar(binding.toolbar)

        //Acción del bottom nav bar
        binding.navigator.setOnItemSelectedListener { menuItem->
            if(menuItem.itemId == R.id.home){
                showFragment(homeFragment)
            }else if(menuItem.itemId == R.id.content) {
                showFragment(contentFragment)
            }else  if(menuItem.itemId == R.id.config) {
                showFragment(configFragment)
            }
            true
        }

        //Inicialmente mostrar la homeFragment
        showFragment(homeFragment)
    }

    fun showFragment(fragment: Fragment) {
        val manager = supportFragmentManager
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.container, fragment)
        transaction.commit()
    }
}