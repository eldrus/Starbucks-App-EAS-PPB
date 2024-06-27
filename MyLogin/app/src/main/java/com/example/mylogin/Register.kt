package com.example.mylogin

import com.example.mylogin.R

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.mylogin.ui.theme.GreenMuda

@Composable
fun Register(navController: NavController) {

    var email by remember {
        mutableStateOf("")
    }
    var username by remember {
        mutableStateOf("")
    }
    var password by remember {
        mutableStateOf("")
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.d), contentDescription = "login image",
            modifier = Modifier.size(290.dp)
        )

        Text(text = "Register", fontSize = 28.sp, fontWeight = FontWeight.Bold)

        Spacer(modifier = Modifier.height(4.dp))


        OutlinedTextField(value = email, onValueChange = {
            email = it
        }, label = {
            Text(text = "Username")
        })
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = username, onValueChange = {
            username = it
        }, label = {
            Text(text = "Username")
        })
        Spacer(modifier = Modifier.height(4.dp))

        OutlinedTextField(value = password, onValueChange = {
            password = it
        }, label = {
            Text(text = "Password")
        },
            visualTransformation = PasswordVisualTransformation()
        )
        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = { navController.navigate("Login_Screen")/*TODO*/ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 55.dp, end = 55.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = GreenMuda
            )
        ) {
            Text(text = "Register")

        }
        Spacer(
            modifier = Modifier.height(4.dp)
        )

//        TextButton(onClick = {navController.navigate("Register") /*TODO*/ }) {
//            Text(text = "Forgot Password?")
//
//        }
//        Spacer(modifier = Modifier.height(4.dp))
//
//        Text(text = "Or sign in with")
//
//        Image(painter = painterResource(id = R.drawable.b), contentDescription = "Google",
//            modifier = Modifier.size(60.dp
//            ))


    }

}



