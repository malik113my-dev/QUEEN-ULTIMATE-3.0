
package com.queen.assistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.queen.assistant.data.model.FeatureCatalog
import com.queen.assistant.ui.theme.QueenTheme

private val Background = Color(0xFF050714)
private val Cyan = Color(0xFF00D9FF)
private val Purple = Color(0xFF9B5CFF)
private val Pink = Color(0xFFFF4DB8)
private val Panel = Color(0xFF11172D)

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
    val features = FeatureCatalog.all.take(10)

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Background
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    Brush.verticalGradient(
                        listOf(
                            Color(0xFF10102B),
                            Background,
                            Color(0xFF090D20)
                        )
                    )
                )
                .padding(horizontal = 16.dp)
        ) {
            Spacer(Modifier.height(12.dp))

            HeaderSection()

            Spacer(Modifier.height(18.dp))

            AvatarHero()

            Spacer(Modifier.height(18.dp))

            Text(
                "Welcome back, Malik",
                color = Color.White,
                fontSize = 23.sp,
                fontWeight = FontWeight.Bold
            )

            Spacer(Modifier.height(5.dp))

            Text(
                "Your personal AI companion is ready.",
                color = Color.LightGray,
                fontSize = 13.sp
            )

            Spacer(Modifier.height(16.dp))

            VoiceButton()

            Spacer(Modifier.height(20.dp))

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    "YOUR AI MODULES",
                    color = Cyan,
                    fontSize = 13.sp,
                    fontWeight = FontWeight.ExtraBold
                )

                Text(
                    "36 MODULES",
                    color = Purple,
                    fontSize = 10.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Spacer(Modifier.height(12.dp))

            LazyVerticalGrid(
                columns = GridCells.Fixed(2),
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.spacedBy(11.dp),
                horizontalArrangement = Arrangement.spacedBy(11.dp)
            ) {
                items(features) { feature ->
                    Card(
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(105.dp)
                            .border(
                                1.dp,
                                Brush.linearGradient(
                                    listOf(
                                        Cyan.copy(alpha = 0.55f),
                                        Purple.copy(alpha = 0.35f)
                                    )
                                ),
                                RoundedCornerShape(18.dp)
                            ),
                        shape = RoundedCornerShape(18.dp),
                        colors = CardDefaults.cardColors(
                            containerColor = Panel.copy(alpha = 0.96f)
                        )
                    ) {
                        Column(
                            modifier = Modifier
                                .fillMaxSize()
                                .padding(12.dp),
                            verticalArrangement = Arrangement.Center
                        ) {
                            Text(
                                feature.name,
                                color = Cyan,
                                fontSize = 13.sp,
                                fontWeight = FontWeight.Bold,
                                maxLines = 2
                            )

                            Spacer(Modifier.height(7.dp))

                            Text(
                                feature.description,
                                color = Color.LightGray,
                                fontSize = 10.sp,
                                lineHeight = 14.sp,
                                maxLines = 3
                            )
                        }
                    }
                }
            }

            Spacer(Modifier.height(8.dp))

            BottomNavigationBar()

            Spacer(Modifier.height(8.dp))

            Text(
                "QUEEN ULTIMATE 3.0  •  PHASE 1",
                modifier = Modifier.fillMaxWidth(),
                color = Cyan.copy(alpha = 0.75f),
                fontSize = 9.sp,
                textAlign = TextAlign.Center
            )

            Spacer(Modifier.height(8.dp))
        }
    }
}

@Composable
private fun HeaderSection() {
    Row(
        modifier = Modifier.fillMaxWidth(),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            Text(
                "QUEEN",
                color = Cyan,
                fontSize = 29.sp,
                fontWeight = FontWeight.Black
            )

            Text(
                "ULTIMATE 3.0  •  PERSONAL AI",
                color = Color.LightGray,
                fontSize = 9.sp,
                letterSpacing = 1.sp
            )
        }

        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .background(
                    Color(0xFF14243A),
                    CircleShape
                )
                .padding(horizontal = 11.dp, vertical = 8.dp)
        ) {
            Box(
                modifier = Modifier
                    .size(7.dp)
                    .background(Color(0xFF35F59A), CircleShape)
            )

            Spacer(Modifier.width(6.dp))

            Text(
                "READY",
                color = Color(0xFF35F59A),
                fontSize = 10.sp,
                fontWeight = FontWeight.Bold
            )
        }
    }
}

@Composable
private fun AvatarHero() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(225.dp)
            .background(
                Brush.linearGradient(
                    listOf(
                        Color(0xFF261052),
                        Color(0xFF102B59),
                        Color(0xFF40134F)
                    )
                ),
                RoundedCornerShape(26.dp)
            )
            .border(
                1.dp,
                Purple.copy(alpha = 0.65f),
                RoundedCornerShape(26.dp)
            )
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .size(112.dp)
                    .background(
                        Brush.linearGradient(
                            listOf(Purple, Cyan, Pink)
                        ),
                        CircleShape
                    )
                    .padding(3.dp)
                    .background(
                        Color(0xFF11152D),
                        CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(
                    "Q",
                    color = Cyan,
                    fontSize = 66.sp,
                    fontWeight = FontWeight.Black
                )
            }

            Spacer(Modifier.height(10.dp))

            Text(
                "QUEEN AI",
                color = Color.White,
                fontSize = 23.sp,
                fontWeight = FontWeight.Black,
                letterSpacing = 3.sp
            )

            Text(
                "YOUR PERSONAL AI ASSISTANT",
                color = Cyan,
                fontSize = 9.sp,
                letterSpacing = 1.5.sp
            )

            Spacer(Modifier.height(7.dp))

            Text(
                "3D FEMALE AVATAR ASSET: NEXT INTEGRATION",
                color = Color.LightGray,
                fontSize = 8.sp
            )
        }
    }
}

@Composable
private fun VoiceButton() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Brush.horizontalGradient(
                    listOf(
                        Color(0xFF172C58),
                        Color(0xFF35175C)
                    )
                ),
                RoundedCornerShape(18.dp)
            )
            .border(
                1.dp,
                Cyan.copy(alpha = 0.5f),
                RoundedCornerShape(18.dp)
            )
            .padding(14.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Box(
            modifier = Modifier
                .size(45.dp)
                .background(Cyan.copy(alpha = 0.15f), CircleShape),
            contentAlignment = Alignment.Center
        ) {
            Text("🎙", fontSize = 23.sp)
        }

        Spacer(Modifier.width(12.dp))

        Column {
            Text(
                "TALK TO QUEEN",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 13.sp
            )
            Text(
                "Voice assistant integration is coming",
                color = Color.LightGray,
                fontSize = 10.sp
            )
        }

        Spacer(Modifier.weight(1f))

        Text(
            "›",
            color = Cyan,
            fontSize = 30.sp
        )
    }
}

@Composable
private fun BottomNavigationBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .background(
                Color(0xFF11172D),
                RoundedCornerShape(18.dp)
            )
            .padding(vertical = 12.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        NavigationItem("⌂", "Home", true)
        NavigationItem("▦", "Dashboard", false)
        NavigationItem("♡", "Favorites", false)
        NavigationItem("◷", "History", false)
        NavigationItem("●", "Profile", false)
    }
}

@Composable
private fun NavigationItem(
    symbol: String,
    label: String,
    selected: Boolean
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            symbol,
            color = if (selected) Cyan else Color.LightGray,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )

        Text(
            label,
            color = if (selected) Cyan else Color.LightGray,
            fontSize = 9.sp
        )
    }
}
