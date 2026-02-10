package android.course.unitconverter

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import android.course.unitconverter.ui.theme.UnitConverterTheme
import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import kotlin.math.exp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UnitConverterTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UnitConverter()
                }
            }
        }
    }
}

@Composable
fun UnitConverter(){
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        //where all the ui elements will be stacked below each other
        Text("Unit Converter")
        Spacer(modifier = Modifier.size(16.dp))
        OutlinedTextField(value = "", onValueChange = {
            //here goes what changes when the value changes})
        })
        Spacer(modifier = Modifier.size(16.dp))
        Row {
        //where all the ui elements will be stacked next to each other
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Millimeters>")},
                        onClick = {}
                    )

                }

            }
            Spacer(modifier = Modifier.width(16.dp))
            Box {
                Button(onClick = {}) {
                    Text("Select")
                    Icon(Icons.Default.ArrowDropDown,
                        contentDescription = "Arrow Down")
                }
                DropdownMenu(expanded = false, onDismissRequest = {}) {
                    DropdownMenuItem(
                        text = {Text("Centimeters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Meters")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Feet")},
                        onClick = {}
                    )
                    DropdownMenuItem(
                        text = {Text("Millimeters>")},
                        onClick = {}
                    )

                }

            }
        }
        Spacer(modifier = Modifier.size(16.dp))
        Text("Result:")
    }

}


@Preview(showBackground = true)
@Composable
fun UnitConverterPreview(){
    UnitConverter()
}