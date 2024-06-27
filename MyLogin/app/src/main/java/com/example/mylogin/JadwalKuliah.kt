package com.example.mylogin

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController


@Composable
fun JadwalKuliah(navController: NavController){

    Column (
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
                .padding(start = 45.dp, bottom = 20.dp)

            ,
            verticalAlignment = Alignment.Bottom
            ) {
            Icon(
                imageVector = Icons.Default.DateRange ,
                tint = Color.White,
                modifier = Modifier.padding(end = 10.dp),
                contentDescription =null,
            )
            Text(
                text = "Jadwal Kuliah",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,


            )


        }
        ScheduleList(day = "senin", subject = "evolusi perangkat lunak" , time ="10.00-12.00" )
        ScheduleList(day = "Selasa", subject = "Perancangan perangkat lunak" , time = "13.00-14.00")
        ScheduleList(day = "Rabu", subject = "Perancangan perangkat lunak" , time = "13.00-14.00" )
        ScheduleList(day = "Kamis", subject = "Teori Graf" , time = "13.00-15.00" )







    }






}

@Composable
fun ScheduleList(
    day: String,
    subject: String,
    time: String

) {
    Row (
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
            .padding(bottom = 20.dp, top = 20.dp)
    ) {
        Box(
            modifier = Modifier
                .weight(1f)
                .padding(end = 10.dp),
            contentAlignment = Alignment.CenterEnd
        ) {
            Icon(
                imageVector = Icons.Default.PlayArrow ,
                contentDescription =null,
            )
        }

        Column(
            modifier = Modifier.weight(4f)
        ) {
            Text(
                text = day,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = subject,
                fontSize = 16.sp
            )
            Text(
                text = time,
                fontSize = 16.sp
            )
        }
    }
}

//@Preview(
//    showBackground = true,
//    showSystemUi = true
//)
//@Composable
//fun JadwalKuliahPreview() {
//    JadwalKuliah()
//}
