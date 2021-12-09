package com.seop.customdialog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

        }
    }
}

@Composable
fun CustomDialog() {
    Surface(
        color = Color.White,
        shape = RoundedCornerShape(4.dp)
    ) {
        Column {
            Text(
                text = "타이틀",
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 48.dp, end = 48.dp, top = 22.5.dp, bottom = 21.5.dp),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black
            )

            Divider(
                color = Color.Gray,
                thickness = 0.5.dp,
                modifier = Modifier
                    .padding(start = 20.dp, end = 20.dp)
            )

            Content()

            Surface(
                color = Color.Blue,
                modifier = Modifier
            ) {
                Text(
                    text = "수정하기",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 20.dp, end = 20.dp, top = 17.dp, bottom = 17.dp),
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center,
                    color = Color.White
                )
            }
        }
    }
}

@Composable
fun Content() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 20.dp, end = 20.dp, top = 20.dp, bottom = 20.dp)
    ) {
        Text(
            text = "상단 Sub Text 입니다.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(bottom = 12.dp),
            fontSize = 12.sp,
            color = Color.Gray
        )

        Text(
            text = "입력 Text 입니다.입력 Text 입니다.입력 Text 입니다.입력 Text 입니다.입력 Text 입니다.",
            modifier = Modifier
                .fillMaxWidth()
        )

        Text(
            text = "하단 Sub Text 입니다.",
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 12.dp),
            fontSize = 12.sp,
            color = Color.Gray
        )
    }
}



// Preview
@Preview
@Composable
fun CustomDialogPreview() {
    MaterialTheme {
        CustomDialog()
    }
}

@Preview
@Composable
fun ContentPreview() {
    MaterialTheme {
        Content()
    }
}