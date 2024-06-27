package com.example.mylogin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.internal.composableLambda
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.ui.theme.MyLoginTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(navController = navController, startDestination = "Login_Screen") {
                composable("Login_Screen"){
                    LoginScreen(navController)
                }
                composable("Dashboard"){
                    Dashboard(navController)
                }
                composable("Profile"){
                    Profile(navController)
                }
                composable("Jadwal_Kuliah"){
                    JadwalKuliah(navController)
                }
                composable("Register"){
                    Register(navController)
                }
                composable("Promo"){
                    Promo(navController)
                }
            }


        }
    }
}



