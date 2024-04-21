package com.example.composearticle_android

import android.graphics.Paint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composearticle_android.ui.theme.ComposeArticle_AndroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeArticle_AndroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    ComposeArticle()
                }
            }
        }
    }
}

@Composable
fun ComposeArticle() {
    ArticlePage(
        title = stringResource(R.string.title_text),
        second = stringResource(R.string.second_text),
        third = stringResource(R.string.third_text),
        imagePainter = painterResource(R.drawable.bg_compose_background)
    )
}

// Here we create a private function, which we incorporate our column in.
// This way we can set the values of title, second, third, and imagePainter
// somewhere else.
@Composable
private fun ArticlePage(
    title: String,
    second: String,
    third: String,
    imagePainter: Painter,
    modifier: Modifier = Modifier) {
    Column {
        Image ( painter = imagePainter, contentDescription = null)
        Text(
            text = title,
            fontSize = 24.sp,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp),
        )
        Text(
            text = second,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(start = 16.dp, end = 16.dp)
        )
        Text(
            text = third,
            textAlign = TextAlign.Justify,
            modifier = Modifier.padding(16.dp)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    ComposeArticle_AndroidTheme {
        ComposeArticle()
    }
}