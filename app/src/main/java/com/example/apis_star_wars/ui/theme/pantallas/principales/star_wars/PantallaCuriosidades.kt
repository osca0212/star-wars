//package com.example.apis_star_wars.pantallas
package  com.example.apis_star_wars.ui.theme.pantallas.principales.star_wars

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.apis_star_wars.ui.theme.VerdeStarWars
import com.example.apis_star_wars.ui.theme.MoradoStarWars
import androidx.compose.foundation.lazy.items

data class Curiosidad(val titulo: String, val descripcion: String)

val listaCuriosidades = listOf(
    Curiosidad("Sabías que...", "Yoda fue interpretado por una marioneta y luego por CGI."),
    Curiosidad("Lenguaje secreto", "El idioma Huttese se inspiró en el quechua, un idioma indígena de Sudamérica."),
    Curiosidad("No era Vader", "David Prowse, quien interpretó a Darth Vader físicamente, no era quien hacía la voz."),
    Curiosidad("Skywalker Fail", "Luke originalmente se iba a llamar Luke Starkiller."),
    Curiosidad("El sonido del sable", "Fue creado mezclando el zumbido de un proyector y un micrófono roto.")
)

@Composable
fun PantallaCuriosidades() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Text(
            text = "Curiosidades de Star Wars",
            color = VerdeStarWars,
            style = MaterialTheme.typography.headlineMedium,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn {
            items(listaCuriosidades) { curiosidad ->
                Card(
                    colors = CardDefaults.cardColors(containerColor = MoradoStarWars),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 8.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {
                    Column(
                        modifier = Modifier.padding(16.dp)
                    ) {
                        Text(
                            text = curiosidad.titulo,
                            color = VerdeStarWars,
                            fontWeight = FontWeight.Bold,
                            fontSize = 18.sp
                        )
                        Spacer(modifier = Modifier.height(4.dp))
                        Text(
                            text = curiosidad.descripcion,
                            color = MaterialTheme.colorScheme.onPrimary
                        )
                    }
                }
            }
        }
    }
}
