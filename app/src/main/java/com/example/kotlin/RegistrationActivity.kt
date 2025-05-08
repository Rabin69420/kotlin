package com.example.kotlin

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldColors
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.kotlin.ui.theme.KotlinTheme

class RegistrationActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Scaffold { padding ->
                RegistrationBody(padding)
            }
        }
    }
}

@Composable
fun RegistrationBody(paddingValues: PaddingValues){
    var firstname by remember { mutableStateOf("") }
    var lastname by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var country by remember { mutableStateOf("") }
    var dob by remember { mutableStateOf("") }

    Column (modifier = Modifier.fillMaxSize().background(color = Color.White),
        horizontalAlignment = Alignment.CenterHorizontally) {

        Spacer(modifier = Modifier.height(15.dp))
        Row (verticalAlignment = Alignment.CenterVertically) {
            Text("Register")
        }

        Spacer(modifier = Modifier.height(30.dp))

        Row (modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween) {
            Row (verticalAlignment = Alignment.CenterVertically){
                OutlinedTextField(
                    value = firstname,
                    onValueChange = {
                        firstname = it
                    },
                    modifier = Modifier.width(160.dp),
                    placeholder = {
                        Text(text = "firstname")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                        focusedIndicatorColor = Color.Green,
                        unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                        unfocusedIndicatorColor = Color.Blue
                    ),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text,
                    )
                )


            }
            Row (verticalAlignment = Alignment.CenterVertically) {
                OutlinedTextField(
                    value = lastname,
                    onValueChange = {
                        lastname = it
                    },
                    modifier = Modifier.width(160.dp),
                    placeholder = {
                        Text(text = "lastname")
                    },
                    colors = TextFieldDefaults.colors(
                        focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                        focusedIndicatorColor = Color.Green,
                        unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                        unfocusedIndicatorColor = Color.Blue
                    ),
                    shape = RoundedCornerShape(12.dp),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Text
                    )
                )
            }

        }

        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ){
            OutlinedTextField(
                value = email,
                onValueChange = {
                    email = it
                },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Enter email")
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    focusedIndicatorColor = Color.Green,
                    unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    unfocusedIndicatorColor = Color.Blue
                ),
                shape = RoundedCornerShape(12.dp),
                prefix = {
                    Icon(Icons.Default.Email, contentDescription = null)
                },
                keyboardOptions = KeyboardOptions(
                    keyboardType = KeyboardType.Email
                )
            )
        }
        Spacer(modifier = Modifier.height(30.dp))

        Row (
            modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            OutlinedTextField(
                value = country,
                onValueChange = {
                    country = it
                },
                modifier = Modifier.fillMaxWidth(),
                placeholder = {
                    Text(text = "Select Country")
                },
                colors = TextFieldDefaults.colors(
                    focusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    focusedIndicatorColor = Color.Green,
                    unfocusedContainerColor = Color.Gray.copy(alpha = 0.2f),
                    unfocusedIndicatorColor = Color.Blue
                ),
                shape = RoundedCornerShape(12.dp),
                suffix = {
                    Icon(Icons.Default.ArrowDropDown, contentDescription = null)
                }

            )
        }

        Row (
            modifier = Modifier.padding(horizontal = 12.dp).fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {

        }
    }


}

@Preview(showBackground = true)
@Composable
fun PreviewRegistration() {
    RegistrationBody(paddingValues = PaddingValues(0.dp))
}