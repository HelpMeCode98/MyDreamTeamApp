package com.example.mydreamteamapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.mydreamteamapp.ui.theme.MyDreamTeamAppTheme

class StudentTwoActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyDreamTeamAppTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    StudentInfo(
                        name = "Angel Mae Aljecera",
                        bio = "Testing Page Number Two",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun StudentInfo(name: String, bio: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            painter = painterResource(id = R.drawable.student_two),
            contentDescription = "student_two",
            modifier = Modifier
                .size(200.dp)
                .padding(bottom = 16.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Text(
            text = "Name: $name",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            style = MaterialTheme.typography.headlineMedium
        )
        Text(
            text = "Bio: $bio",
            fontSize = 18.sp,
            modifier = Modifier.padding(top = 8.dp),
            style = MaterialTheme.typography.bodyLarge
        )
    }
}

@Preview(showBackground = true)
@Composable
fun StudentTwoPreview() {
    MyDreamTeamAppTheme {
        StudentInfo(
            name = "Angel Mae Aljecera",
            bio = "Testing Page Number Two"
        )
    }
}