package gimble.project2.kot6

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Toast
import androidx.fragment.app.Fragment

import gimble.project2.kot6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        initialSetup()
    }

    private fun initialSetup(){
        fragReplacer(HomeFrag())
        binding.bottomNav.setOnItemSelectedListener {
                item ->
            when (item.itemId) {
                R.id.homeNav -> {home()}
                R.id.eggsNav -> {egg()}
                R.id.statsNav -> {stats()}
                else -> false
            }

        }


    }


    //overridden methods
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_mainactivity, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
       // return super.onOptionsItemSelected(item)
        return when (item.itemId) {
            R.id.settingOpt -> settings()
            R.id.shareOpt -> sharer()

            else -> return super.onOptionsItemSelected(item)
    }}



    // methods completely created by me
    private fun settings() : Boolean{
        val i = Intent(this,SettingsActivity::class.java)
        startActivity(i)
        return true
    }
    private fun sharer(): Boolean {

        val i = Intent().apply {

        }
        return true
    }
    private fun fragReplacer(frag:Fragment){
        val fragManager = supportFragmentManager
        val fragTransaction = fragManager.beginTransaction()
        fragTransaction.replace(R.id.container,frag)
        fragTransaction.commit()

    }

    //diff frags
    private fun stats(): Boolean{
       fragReplacer(StatsFrag())
        return true
    }

    private fun egg() : Boolean{
       fragReplacer(EggsFrag())
        //supportFragmentManager.commit{}

        return true
    }

    private fun home() : Boolean{
        fragReplacer(HomeFrag())
        return true
    }



}