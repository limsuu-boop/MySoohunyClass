package com.example.myapp01

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapp01.ui.theme.MySoohunyClassTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MySoohunyClassTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    CalculatorApp()
                }
            }
        }
    }
}

@Composable
fun CalculatorApp() {
    var num1 by remember { mutableStateOf("") }
    var num2 by remember { mutableStateOf("") }
    var result by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "간단한 계산기",
            style = MaterialTheme.typography.headlineSmall,
            textAlign = TextAlign.Center
        )

        OutlinedTextField(
            value = num1,
            onValueChange = { num1 = it },
            label = { Text("첫 번째 숫자") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        OutlinedTextField(
            value = num2,
            onValueChange = { num2 = it },
            label = { Text("두 번째 숫자") },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(onClick = { result = calculate(num1, num2, "+") }) { Text("+") }
            Button(onClick = { result = calculate(num1, num2, "-") }) { Text("-") }
            Button(onClick = { result = calculate(num1, num2, "*") }) { Text("×") }
            Button(onClick = { result = calculate(num1, num2, "/") }) { Text("÷") }
        }

        if (result.isNotEmpty()) {
            Text(
                text = "결과: $result",
                style = MaterialTheme.typography.titleMedium
            )
        }
    }
}

/** 계산 함수 */
fun calculate(a: String, b: String, op: String): String {
    val num1 = a.toDoubleOrNull()
    val num2 = b.toDoubleOrNull()

    if (num1 == null || num2 == null) return "숫자를 입력하세요"

    return when (op) {
        "+" -> (num1 + num2).toString()
        "-" -> (num1 - num2).toString()
        "*" -> (num1 * num2).toString()
        "/" -> if (num2 != 0.0) (num1 / num2).toString() else "0으로 나눌 수 없습니다"
        else -> ""
    }
}

/** ✅ 미리보기 */
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun CalculatorPreview() {
    MySoohunyClassTheme {
        CalculatorApp()
    }
}
