package com.example.mylogin

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DateRange
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.mylogin.ui.theme.GreenMuda


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Dashboard(navController: NavController){
    Column (
        modifier = Modifier
            .background(color = Color.White,),


        horizontalAlignment = Alignment.Start,
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(
                    color = GreenMuda,
                    shape = RoundedCornerShape(bottomStart = 40.dp, bottomEnd = 40.dp)
                )
                .height(150.dp)
                .padding(start = 45.dp, bottom = 60.dp)


            ,
            verticalAlignment = Alignment.Bottom
        ) {
            Icon(
                imageVector = Icons.Default.AccountCircle ,
                tint = Color.White,
                modifier = Modifier.padding(start = 20.dp, end = 10.dp),
                contentDescription =null,
            )


            Text(
                text = "Halo ",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,



            )

            Text(
                text = " SAYID ZIYAD IBRAHIM",
                color = Color.White,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,


                )



        }
        Row {
            Card(
                onClick = { navController.navigate("Jadwal_Kuliah")/*TODO*/ },
                modifier = Modifier
                    .padding(20.dp)
                    .height(200.dp)
                    .width(155.dp)
                    .border(
                        width = 1.dp,
                        color = Color.Gray,
                        shape = RoundedCornerShape(10)
                    ),


            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
//                        .padding(
//                            top = 40.dp,
//                            bottom = 40.dp
//                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Box(
                        modifier = Modifier.fillMaxWidth().background(Color.White)
                    ){
                        Image(painter = painterResource(id = R.drawable.g), contentDescription = "login image",
                            modifier = Modifier
                                .fillMaxWidth()
                                .width(450.dp)
                                .height(100.dp)
                                .size(100.dp),

                            )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "Machiato",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        )
                    Text(text = "Rp. 50000",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        color = GreenMuda
                    )
                }

            }


            Card(
                onClick = { navController.navigate("Jadwal_Kuliah")/*TODO*/ },
                modifier = Modifier
                    .background(color = Color.White)
                .fillMaxWidth()
                    .padding(20.dp)
                    .height(200.dp)
                    .width(150.dp)
                .border(
                    width = 1.dp,
            color = Color.Gray,
            shape = RoundedCornerShape(10)
            ),


            )
            {
                Column(
                    modifier = Modifier
                        .fillMaxWidth(),
//                        .padding(
//                            top = 40.dp,
//                            bottom = 40.dp
//
//                        ),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {

                    Box(
                        modifier = Modifier.fillMaxWidth().background(Color.White)
                    ){
                        Image(painter = painterResource(id = R.drawable.f), contentDescription = "login image",
                            modifier = Modifier
                                .fillMaxWidth()
                                .width(450.dp)
                                .height(100.dp)
                                .size(100.dp),

                            )
                    }
    Spacer(modifier = Modifier.height(20.dp))

                    Text(text = "Americano",
                        fontWeight = FontWeight.Bold,
                        fontSize = 20.sp,
                        )

                    Text(text = "Rp. 50000",
                        fontWeight = FontWeight.Medium,
                        fontSize = 15.sp,
                        color = GreenMuda
                    )
                }
            }

//            Row {
//                Card(
//                    onClick = { navController.navigate("Jadwal_Kuliah")/*TODO*/ },
//                    modifier = Modifier
//                        .fillMaxWidth()
//                        .padding(20.dp)
//                        .height(200.dp)
//                        .width(150.dp)
//                        .background(color = GreenMuda,)
//
//
//                )
//                {
//                    Column(
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(
//                                top = 40.dp,
//                                bottom = 40.dp
//
//                            )
//                            .background(color = Color.White),
//                        horizontalAlignment = Alignment.CenterHorizontally
//                    ) {
//                        Image(painter = painterResource(id = R.drawable.f), contentDescription = "login image",
//                            modifier = Modifier
//                                .fillMaxWidth()
//                            .size(100.dp),
//                            )
//                        Text(text = "Jadwal Kuliah",
//                            fontWeight = FontWeight.Bold,
//                            fontSize = 20.sp,
//
//
//                            )
//                    }
//                }
//            }



        }

        
//    Spacer(modifier = Modifier.height(2.dp))

        Card(
            onClick = { navController.navigate("Promo")/*TODO*/ },
            modifier = Modifier.padding(20.dp)
        ) {
            Column(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        bottom = 20.dp
                    ),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image( painter = painterResource(id = R.drawable.e), contentDescription = "login image",
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(290.dp))
                Text(text = "Promo Hari ini!",
                    fontWeight = FontWeight.Bold,
                    fontSize = 20.sp,
                    


                    )
            }
        }


    }






}



//    Spacer(modifier = Modifier.height(25.dp))
//
//    Button(onClick = { navController.navigate("Login_Screen")/*TODO*/ }, colors = ButtonDefaults.buttonColors(
//        containerColor = Color.Blue
//    )) {
//        Text(text = "ke login")
//
//    }
//    Spacer(modifier = Modifier.height(10.dp))


@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun DashboardPreview() {
    val navController = rememberNavController()
    Dashboard(navController)
}