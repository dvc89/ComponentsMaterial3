package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.myapplication.ui.components.MyRadioButton
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    //topBar = {MyAppBar()}
                ) { innerPadding ->
                    MyRadioButton(
                        Modifier
                            .padding(innerPadding)
                    )
                }
                //NavigationWrapper()
                /*MyModalDrawer{
                    Scaffold(
                        topBar = {MyAppBar()},
                        bottomBar = { MyNavBar() },
                        modifier = Modifier.fillMaxSize()) { innerPadding ->
                        MyDropdown(Modifier.padding(innerPadding))
                    }
                }*/

            }
        }
    }
}
