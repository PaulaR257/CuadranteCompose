package com.example.cuadrantedecompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.cuadrantedecompose.ui.theme.CuadranteDeComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CuadranteDeComposeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    TextsInCorners()
                }
            }
        }
    }
}


@Composable
fun TextTop() {
    Row ()
    {
        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFFEADDFF))
                .padding(16.dp)

        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(425.dp)

            ) {
                Text(
                    text = "Text composable",
                    fontWeight = FontWeight.Bold,
                    textAlign= TextAlign.Center,
                    //Hay que poner esto porque si no no ocupa todo el ancho
                    //y entonces no me lo centra como yo quiero
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp)

                )


                Text(
                    text = "Displays text and follows the recommended Material Design guidelines.",
                    textAlign = TextAlign.Justify

                )
            }
        }
        Column(
            modifier = Modifier
                .weight(1f)
                .background(Color(0xFFD0BCFF))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center, //Centra el texto verticalmente
                modifier = Modifier
                    .fillMaxWidth()
                    .height(425.dp)


            ) {
                Text(
                    text = "Image composable",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 16.dp, bottom = 16.dp)

                )

                Text(
                    text = "Creates a composable that lays out and draws a given Painter class object.",
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Composable
fun TextBottom() {
    Row()
    {
        Column(
            modifier = Modifier.weight(1f)
                .background(Color(0xFFB69DF8))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(425.dp)


            ) {
                Text(
                    text = "Row composable ",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)

                )

                Text(
                    text = "A layout composable that places its children in a horizontal sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }
        Column(
            modifier = Modifier.weight(1f)
                .background(Color(0xFFF6EDFF))
                .padding(16.dp)
        ) {
            Column(
                verticalArrangement = Arrangement.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .height(425.dp)


            ) {
                Text(
                    text = "Column composable",
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth().padding(top = 16.dp, bottom = 16.dp)
                )

                Text(
                    text = "A layout composable that places its children in a vertical sequence.",
                    textAlign = TextAlign.Justify
                )
            }
        }
    }
}

@Composable
fun TextsInCorners(){
    Column ()
    {
        TextTop()
        TextBottom()
    }
}


@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    CuadranteDeComposeTheme {
        TextsInCorners()

    }
}