package com.example.appreparafacil_grupo8.ui

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.appreparafacil_grupo8.R
import com.example.appreparafacil_grupo8.ui.theme.AppReparaFacil_grupo8Theme


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {
    // Scaffold es una plantilla de diseño de Material Design.
    // Nos da una estructura base con TopBar, BottomBar, FAB, etc.
    Scaffold(
        topBar = {
            // TopAppBar es la barra de navegación superior.
            TopAppBar(
                title = { Text("ReparaFacil") },
                // (Punto 5) Usamos colores del MaterialTheme.
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = MaterialTheme.colorScheme.primaryContainer,
                    titleContentColor = MaterialTheme.colorScheme.primary
                )
            )
        }
    ) { innerPadding -> // 'innerPadding' es el espacio que el Scaffold reserva para el TopBar.

        // Column organiza sus elementos hijos verticalmente (uno debajo del otro).
        Column(
            modifier = Modifier
                .fillMaxSize() // Ocupa todo el espacio disponible.
                .padding(innerPadding) // Aplica el padding del Scaffold.
                .padding(16.dp), // Añade un padding propio de 16.dp en todos los lados.

            // (Punto 4) Agrega espaciado uniforme de 20.dp entre cada elemento hijo.
            verticalArrangement = Arrangement.spacedBy(20.dp),

            // (Punto 6) Centra todos los elementos hijos horizontalmente.
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Text(
                text = "¡Bienvenido!",
                style = MaterialTheme.typography.titleLarge // (Punto 5) Usa estilos de tipografía.
            )

            Button(onClick = { /* Acción futura al presionar */ }) {
                Text("Solicitar Servicio")
            }

            // (Punto 8) Agregamos un nuevo elemento visual.
            Text(
                text = "Técnicos de gasfitería, electricidad y más.",
                style = MaterialTheme.typography.bodyMedium // (Punto 5) Usa estilos de tipografía.
            )

            Image(
                painter = painterResource(id = R.drawable.logo), // Carga la imagen desde res/drawable
                contentDescription = "Logo de ReparaFacil",
                modifier = Modifier
                    .fillMaxWidth() // La imagen ocupa el ancho máximo.
                    .height(150.dp), // Altura fija.
                contentScale = ContentScale.Fit // Ajusta la imagen sin cortarla.
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    // (Punto 5) Envolvemos el Preview en nuestro tema 'ReparaFacilTheme'.
    AppReparaFacil_grupo8Theme {
        HomeScreen()
    }
}

