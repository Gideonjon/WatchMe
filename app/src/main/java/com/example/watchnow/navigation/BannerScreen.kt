package com.example.watchnow.navigation

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavHostController
import com.example.watchnow.R

@Composable
fun BannerScreen(navController: NavHostController, modifier: Modifier) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = painterResource(
                id = R.drawable.banner_image
            ),
            contentDescription = "",
            modifier.fillMaxSize(), contentScale = ContentScale.Crop
        )
        Column (modifier.wrapContentHeight()
            .fillMaxSize()
            .align(Alignment.BottomCenter)
            .background(color = Color.White.copy(0.4f))){



        }


    }


}


