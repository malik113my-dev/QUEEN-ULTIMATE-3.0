package com.queen.assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.queen.assistant.data.model.FeatureCatalog
import com.queen.assistant.ui.theme.QueenTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            QueenTheme {
                QueenDashboard()
            }
        }
    }
}

@Composable
fun QueenDashboard() {
    val mainFeatures = FeatureCatalog.all.take(10)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFF050817)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Column {
                    Text(
                        "QUEEN",
                        color = Color(0xFF00D9FF),
                        fontSize = 27.sp,
                        fontWeight = FontWeight.Black
                    )
                    Text(
                        "ULTIMATE 3.0 • PERSONAL AI",
                        color = Color.LightGray,
                        fontSize = 10.sp
                    )
                }
                Text("⚙", fontSize = 26.sp, color = Color.White)
            }

            Spacer(Modifier.height(20.dp))

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(
                                Color(0xFF21105A),
                                Color(0xFF092D56),
                                Color(0xFF4A145D)
                            )
                        ),
                        RoundedCornerShape(24.dp)
                    ),
                contentAlignment = Alignment.Center
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Text("👩🏻‍🚀", fontSize = 76.sp)
                    Text(
                        "QUEEN AI",
                        color = Color(0xFF00E5FF),
                        fontSize = 22.sp,
                        fontWeight = FontWeight.Bold
                    )
                    Text(
                        "Personal AI Assistant",
                        color = Color.White,
                        fontSize = 12.sp
                    )
                    Text(
                        "Female avatar integration pending",
                        color = Color.LightGray,
                        fontSize = 10.sp
                    )
                }
            }

            Spacer(Modifier.height(16.dp))

            Text(
                "Hello Malik!",
                color = Color.White,
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold
            )

            Text(
                "I'm QUEEN. Your personal AI assistant.",
                color = Color.LightGray,
                fontSize = 13.sp
            )

            Spacer(Modifier.height(18.dp))

            Text(
                "MAIN MODULES",
                color = Color(0xFF00D9FF),
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(10.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(10.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp)
            ) {
                items(mainFeatures) { feature ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(92.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Color(0xFF111A32)
                        ),
                        shape = RoundedCornerShape(16.dp)
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(12.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                feature.name,
                                color = Color(0xFF00D9FF),
                                fontWeight = FontWeight.Bold,
                                fontSize = 13.sp
                            )
                            Spacer(Modifier.height(5.dp))
                            Text(
                                feature.description,
                                color = Color.LightGray,
                                fontSize = 10.sp
                            )
                        }
                    }
                }
            }

            Text(
                "36 FEATURE AREAS PLANNED • PHASE 1",
                color = Color(0xFF00D9FF),
                fontSize = 9.sp,
                modifier = Modifier.align(Alignment.CenterHorizontally)
            )
        }
    }
}
