package com.visualdx.codechallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import codechallenge.R
import codechallenge.databinding.ActivityMainBinding
import com.visualdx.codechallenge.fragments.AccountFragment
import com.visualdx.codechallenge.fragments.HomeFragment
import com.visualdx.codechallenge.fragments.NotificationsFragment

class MainActivity : AppCompatActivity() {

    private val home = HomeFragment()
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        handleFragments(home)

        binding.navBar.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.home ->
                    handleFragments(HomeFragment())
                R.id.account ->
                    handleFragments(AccountFragment())
                R.id.notification ->
                    handleFragments(NotificationsFragment())
            }
            true
        }
    }

    fun handleFragments(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.myContainer, fragment)
            transaction.commit()
        }
    }

}