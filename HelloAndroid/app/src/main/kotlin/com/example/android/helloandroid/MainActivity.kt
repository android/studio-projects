/*
 * Copyright 2025 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.example.android.helloandroid

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.android.helloandroid.ui.theme.HelloAndroidTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HelloAndroidApp("Android")
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HelloAndroidApp(name: String, modifier: Modifier = Modifier) {
    HelloAndroidTheme {
        Scaffold(
            modifier = modifier,

            // Top App Bar

            topBar = {
                CenterAlignedTopAppBar(
                    title = { Text("Android") },
                    colors = TopAppBarDefaults.topAppBarColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                )
            }
        ) { innerPadding ->

            // App Content

            Column(
                modifier = Modifier.padding(innerPadding),
                verticalArrangement = Arrangement.spacedBy(8.dp),
            ) {
                Text(
                    text = "Hello $name !",
                    modifier = Modifier.padding(16.dp, 16.dp),
                    style = MaterialTheme.typography.bodyLarge
                )
                Button(
                    modifier = Modifier.padding(24.dp, 24.dp),
                    onClick = { /* Button clicked */ }) { Text("OK") }


                // TODO: Extend app UI with more Jetpack Compose UI elements here


            }
        }
    }
}


@Preview(showBackground = true, showSystemUi = false)
@Composable
fun HelloAndroidPreview() {
    HelloAndroidApp("Android")
}
