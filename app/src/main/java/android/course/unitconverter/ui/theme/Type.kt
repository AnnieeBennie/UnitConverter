package android.course.unitconverter.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

// Set of Material typography styles to start with
val Typography = Typography(
    titleLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)
val LightTitleTextStyle = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontSize = 36.sp,
    color = Color.DarkGray
)
val LightresultTextStyle = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontSize = 24.sp,
    color = Color.DarkGray
)

val DarkTitleTextStyle = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontSize = 36.sp,
    color = Color.LightGray
)
val DarkresultTextStyle = TextStyle(
    fontFamily = FontFamily.SansSerif,
    fontSize = 24.sp,
    color = Color.LightGray
)