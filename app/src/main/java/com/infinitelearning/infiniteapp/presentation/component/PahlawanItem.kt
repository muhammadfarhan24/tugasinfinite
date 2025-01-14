package com.infinitelearning.infiniteapp.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.infinitelearning.infiniteapp.R
import com.infinitelearning.infiniteapp.model.Pahlawan
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun CourseItem(
    pahlawan: Pahlawan,
    modifier: Modifier = Modifier,
) {
    Column(
        modifier = modifier.fillMaxWidth()
    ) {
        Image(
            painter = painterResource(id = pahlawan.photo),
            contentDescription = pahlawan.name,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = pahlawan.name,
            textAlign = TextAlign.Center,
            maxLines = 1,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = pahlawan.level,
            textAlign = TextAlign.Center,
            color = when (pahlawan.level) {
                "Beginner" -> Color.Red
                "Fundamental" -> Color.Yellow
                "Intermediate" -> Color.Green
                else -> MaterialTheme.colorScheme.primary
            },
            modifier = Modifier.fillMaxWidth()
        )
    }
}

@Preview
@Composable
private fun CourseItemPreview() {
    InfiniteAppTheme {
        CourseItem(
            pahlawan = Pahlawan(
                1,
                "Bung Tomo",
                "Pahlawan",
                R.drawable.bung_tomo
            )
        )
    }
}