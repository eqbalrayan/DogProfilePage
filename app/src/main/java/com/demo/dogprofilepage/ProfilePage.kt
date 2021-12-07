package com.demo.dogprofilepage

import android.graphics.drawable.shapes.Shape
import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.nio.file.attribute.AclEntry

@Composable
fun ProfiePage(){

   Card(elevation = 6.dp, modifier = Modifier
       .fillMaxSize()
       .padding(top = 100.dp, bottom = 100.dp, start = 16.dp, end = 16.dp)
       .border(width = 2.dp, color = Color.Black, shape = RoundedCornerShape(30.dp))) {
       Column(horizontalAlignment = Alignment.CenterHorizontally,
           verticalArrangement = Arrangement.Center
           ,
           modifier = Modifier.verticalScroll(rememberScrollState())){

           Image(painter = painterResource(id = R.drawable.doggibabu),
               contentDescription = "Doggibabu",
               modifier = Modifier
                   .size(250.dp)
                   .clip(CircleShape)
                   .border(
                       width = 2.dp,
                       color = Color.Red,
                       shape = CircleShape
                   ),

               )
           Text(text = "Siberian Haski",
               fontWeight = FontWeight.Bold,
               fontSize = 20.sp)
           Text(text = "Germany")
           Row(horizontalArrangement = Arrangement.SpaceEvenly,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(16.dp)){


               ProfileStats(count = "150", title ="Followers" )
               ProfileStats(count = "100", title ="Following" )
               ProfileStats(count = "80", title ="Post" )

           }
           Row(horizontalArrangement = Arrangement.SpaceEvenly,
               modifier = Modifier
                   .fillMaxWidth()
                   .padding(16.dp)){

               Button(onClick = { /*TODO*/ }) {

                   Text(text = "Follow User")
               }
               Button(onClick = { /*TODO*/ }) {

                   Text(text = "Direct Message")

               }
           }

       }

   }
}
@Composable
fun ProfileStats(count:String,title:String){

    Column(horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = count, fontWeight = FontWeight.Bold)
        Text(text = title)


    }

}
@Preview(showBackground = true)
@Composable
fun ProfilePagePreview(){

    ProfiePage()
}