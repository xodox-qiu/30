package trpl.nim234311040.a30

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import trpl.nim234311040.a30.ui.theme._30Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            _30Theme {
                TipsAppScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TipsAppScreen() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "30 Days of Tips App",
                        style = TextStyle(
                            fontSize = 24.sp,
                            fontWeight = FontWeight.Bold,
                            fontFamily = FontFamily.SansSerif,
                            color = Color.Black
                        )
                    )
                }
            )
        }
    ) { padding ->
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        colors = listOf(
                            Color(0xFF4CAF50),
                            Color(0xFF1B5E20)
                        )
                    )
                )
                .padding(padding)
        ) {
            TipsList(tips)
        }
    }
}



@Composable
fun TipsList(tips: List<Description>) {
    LazyColumn(
        modifier = Modifier.padding(16.dp)
    ) {
        items(tips) { tip ->
            TipCard(tip)
        }
    }
}

@Composable
fun TipCard(tip: Description) {
    var isExpanded by remember { mutableStateOf(false) }
    Card(
        modifier = Modifier
            .padding(8.dp)
            .fillMaxWidth()
            .clickable { isExpanded = !isExpanded },
        elevation = CardDefaults.cardElevation(8.dp)
    ) {
        Column(modifier = Modifier.padding(16.dp)) {
            Text(text = stringResource(id = tip.title), style = MaterialTheme.typography.titleMedium)
            Image(
                painter = painterResource(id = tip.imageResourceId),
                contentDescription = null,
                modifier = Modifier
                    .height(150.dp)
                    .fillMaxWidth()
            )
            if (isExpanded) {
                Text(
                    text = stringResource(id = tip.description),
                    style = MaterialTheme.typography.bodyMedium,
                    modifier = Modifier.padding(top = 8.dp)
                )
            }
        }
    }
}




@Preview(showBackground = true)
@Composable
fun TipsAppScreenPreview() {
    _30Theme {
        TipsAppScreen()
    }
}