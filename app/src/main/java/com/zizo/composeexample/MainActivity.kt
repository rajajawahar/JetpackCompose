package com.zizo.composeexample

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.zizo.composeexample.ui.theme.ComposeTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent {
      ComposeTheme {
        // A surface container using the 'background' color from the theme
        Greeting(name = "Raja Mohamed")
      }
    }
  }
}

@Composable
fun Greeting(name: String) {
  Text(
    text = "Hello $name!",
    fontSize = 30.sp
  )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
  ComposeTheme {
    Greeting("Android TextView")
  }
}