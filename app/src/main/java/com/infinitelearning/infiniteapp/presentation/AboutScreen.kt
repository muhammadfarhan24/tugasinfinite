package com.infinitelearning.infiniteapp.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.infinitelearning.infiniteapp.data.DummyData
import com.infinitelearning.infiniteapp.model.About
import com.infinitelearning.infiniteapp.ui.theme.InfiniteAppTheme

@Composable
fun AboutScreen(
    modifier: Modifier = Modifier,
    galleries: List<About> = DummyData.infiniteAbout
) {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.Start,
        modifier = modifier.padding(16.dp)
    ) {
        AsyncImage(
            model = ImageRequest.Builder(LocalContext.current)
                .data(data = galleries[0].photo)
                .build(),
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(height = 250.dp, width = 170.dp)
                .clip(RoundedCornerShape(16.dp)),
            contentDescription = "Poster Movie"
        )
        Spacer(modifier = Modifier.width(16.dp))
        Column(modifier = Modifier.padding(4.dp)) {
            Text(
                text = galleries[0].name,
                fontSize = 25.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "(Asal Perguruan Tinggi:${galleries[0].asal})",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Prodi : ${galleries[0].prodi}",
                style = MaterialTheme.typography.titleSmall,
            )
            Text(
                text = "Kontak: ${galleries[0].kontak}",
                style = MaterialTheme.typography.titleSmall,
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
private fun AboutScreenPreview() {
    InfiniteAppTheme {
        AboutScreen(galleries = DummyData.infiniteAbout)
    }
}