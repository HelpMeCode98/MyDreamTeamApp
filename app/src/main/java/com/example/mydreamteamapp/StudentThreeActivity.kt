package com.example.mydreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mydreamteamapp.ui.theme.MyDreamTeamAppTheme

@Composable
fun StudentThree(name: String, description: String) {

    val name = "Acala, John Bryan V."
    val description = "I am a 3rd year student currently studying in Pamantasan ng Cabuyao and taking " +
            "a Bachelor of Science in Information Technology"

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        val imageId = R.drawable.profile_pic

        Image(
            painter = painterResource(id = imageId),
            contentDescription = "Profile Image",
            modifier = Modifier.height(158.dp)
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = name,
            fontSize = 28.sp,
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.height(12.dp))

        Text(
            text = description,
            fontSize = 16.sp,
        )
    }
}