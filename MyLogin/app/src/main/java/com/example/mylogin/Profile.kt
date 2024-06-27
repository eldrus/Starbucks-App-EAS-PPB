package com.example.mylogin

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController


@Composable
fun Profile(navController: NavController) {
    Column(
        modifier = Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(color = Color.White),
        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(33, 100, 230))
                .height(92.dp)
                .padding(start = 45.dp, bottom = 20.dp),
            verticalAlignment = Alignment.Bottom
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle,
                tint = Color.White,
                modifier = Modifier.padding(end = 10.dp),
                contentDescription = null,
            )
            Text(
                text = "Profil Mahasiswa",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,


                )




        }
        Box(
                modifier = Modifier

                    .fillMaxWidth()
                    .padding(top = 6.dp
                    ),


        contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(id = R.drawable.foto),
                contentDescription = "login image",
                contentScale = ContentScale.Crop,

                modifier = Modifier
                    .size(100.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape)
                    .fillMaxWidth()
                    .padding(bottom = 2.dp)

                ,

            )

    }
        ProfileList(day = "Nama" , subject ="SAYID ZIYAD IBRAHIM ALAYDRUS" )
        ProfileList(day = "NRP" , subject ="5025201147" )
        ProfileList(day = "Tahun Masuk" , subject ="2020" )
        ProfileList(day = "Sattus Mahasiswa" , subject ="AKTIF" )
        ProfileList(day = "Alamat" , subject ="JL. KEPUTIH NO. 37" )




    }


}


@Composable
fun ProfileList(
    day: String,
    subject: String,


) {
    Column (

    ) {


        Column(
            modifier = Modifier.padding(start = 20.dp, top = 20.dp, end = 32.dp)
        ) {
            Text(
                text = day,
                fontSize = 20.sp,
                color = Color.Gray ,
                modifier = Modifier
                    .padding(bottom = 12.dp),

            )

            Row(
                modifier = Modifier
                    .drawBehind {
                        val borderSize = 2.dp.toPx()
                        drawLine(
                            color = Color.Gray,
                            start = Offset(0f, size.height),
                            end = Offset(size.width, size.height),
                            strokeWidth = borderSize
                        )
                    }
            ) {
                Text(
                    text = subject,
                    fontSize = 22.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier
                        .padding(bottom = 10.dp,)
                )
                Spacer(modifier = Modifier.weight(1f))
            }
        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun ProfilePreview(navController: NavController) {
//    Profile(navController: NavController)
//}