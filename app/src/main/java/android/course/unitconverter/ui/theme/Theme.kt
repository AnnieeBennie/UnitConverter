package android.course.unitconverter.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color



private val DarkColorScheme = darkColorScheme(
    primary = Greenprime,
    secondary = Lightgreen,
    tertiary = Green,
    surface = Color(0xFF47614C),
    background = Color(0xFF2D3B30)
)

private val LightColorScheme = lightColorScheme(
    primary = Green40,
    secondary = GreenGrey40,
    tertiary = Yellow40,
    surface = Color(0xFFECF6E0),
    background = Color(0xFFD9EEBF)
)

@Composable
fun UnitConverterTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),

    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme
    val typography = if (darkTheme) {
        Typography.copy(
            titleLarge = DarkTitleTextStyle,
            bodyLarge = DarkresultTextStyle
        )
    } else {
        Typography.copy(
            titleLarge = LightTitleTextStyle,
            bodyLarge = LightresultTextStyle
        )
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = typography,
        content = content
    )
}