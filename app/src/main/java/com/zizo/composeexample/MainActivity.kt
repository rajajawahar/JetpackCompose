package com.zizo.composeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.zizo.composeexample.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeTheme {
        Greeting(name = "Raja Mohamed")
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(
    text = "Hello $name!",
    fontSize = 30.sp,
    fontWeight = FontWeight.Bold,
    textAlign = TextAlign.Center,
    modifier = Modifier
      .background(color = Color.Yellow)
      .border(5.dp, color = Color.Black)
      .alpha(0.5f)
      .padding(10.dp)
      .fillMaxHeight()
      .fillMaxWidth()

  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeTheme {
    Greeting("Android TextView")
  }
}