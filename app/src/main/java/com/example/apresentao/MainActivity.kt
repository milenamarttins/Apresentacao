package com.example.apresentao

import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apresentao.ui.theme.ApresentaçãoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ApresentaçãoTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CartaoVisita("")
                    Rodape()
                }
            }
        }
    }
}

@Composable
fun CartaoVisita(name: String, modifier: Modifier = Modifier ) {
    val ImagemFundo = painterResource(id = R.drawable.imagem1 )

    Image(painter =ImagemFundo ,
        contentDescription = null,
        contentScale = ContentScale.Crop
    )

    Column (
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
        val Imagem2= painterResource(id = R.drawable.download)

        Image(painter = Imagem2 ,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(200.dp)
                .padding(top = 28.dp)
                .clip(CircleShape)
        )

        Text(
            text = "Milena Martins",
            textAlign = TextAlign.Center,
            modifier = Modifier
                .width(500.dp)
                .padding(45.dp),
            color = Color.White,
            fontWeight = FontWeight.Bold,
            fontSize = 37.sp,

        )
    }

    Column(
        modifier= Modifier
            .fillMaxHeight()
            .padding(10.dp),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.Start
    ){

    }
}

@Composable
fun Rodape( ) {
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ApresentaçãoTheme {
        CartaoVisita("")
    }
}