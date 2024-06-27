package com.example.mylogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController


@Composable
fun Promo(navController: NavController, modifier: Modifier=Modifier){
    Column {
        Card(modifier = modifier) {

            Image(painter = painterResource(id = R.drawable.e),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(194.dp),
                contentScale = ContentScale.Crop,
            )
    }
        Spacer(modifier = Modifier.height(4.dp))

        Text(text = "Monday Buy 1 Get 1",
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp,
        )
        Spacer(modifier = Modifier.
            padding(2.dp)
            .height(4.dp))

        Text(text = "Dapatkan PROMO BUY 1 GET 1 HANYA HARI INI! pembelian dapat dilakukan di gerai Starbucks manapun menggunakan segala " +
                "jenis metode pembayaran",

            fontSize = 14.sp,
        )





    }



}

@Preview(
    showSystemUi = true,
    showBackground = true
)
@Composable
fun PromoPreview() {
    val navController = rememberNavController()
    Promo(navController,modifier = Modifier)
}