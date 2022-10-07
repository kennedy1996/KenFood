package com.kenfood

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.kenfood.ui.theme.KenFoodTheme
import com.kenfood.ui.theme.Purple200
import com.kenfood.ui.theme.Purple500
import com.kenfood.ui.theme.Teal200

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            KenFoodTheme {
                Surface {
                    ProductItem()
                }
            }
        }
    }
}
@Preview
@Composable
fun ProductItem () {
    Column(
        Modifier.height(250.dp)
            .width(200.dp)
    ) {
        Box(modifier = Modifier
            .height(50.dp)
            .background(brush = Brush.horizontalGradient(colors = listOf(
                Purple500, Teal200
            )))
            .fillMaxWidth())
        Image(painter = painterResource(
            id = R.drawable.ic_launcher_background),
            contentDescription = "image",
        Modifier.size(80.dp)
            .offset(y = ((-35).dp))
                .clip(shape = CircleShape)
            .align(CenterHorizontally)

        )
        Text(text = "Text 1")
        Text(text = "Text 2")
    }
}

