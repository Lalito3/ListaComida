package com.example.listacomida
import com.example.listacomida.Data.DataSource
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.listacomida.Model.Platillo

@Composable
fun MenuCard(platillo: Platillo, modifier: Modifier = Modifier){
    Card(modifier = Modifier) {
        Row(modifier= Modifier.padding(18.dp)
            .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceAround){
            Image(
                painter = painterResource(id = platillo.drawableResId),
                contentDescription = stringResource(id = platillo.stringResourceId),
                modifier = Modifier
                    .size(150.dp).clip(CircleShape),
                contentScale = ContentScale.Crop
            )
            Column(modifier=modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                /*horizontalAlignment = Alignment.CenterHorizontally*/) {
                Text(
                    text = LocalContext.current.getString(platillo.stringResourceId),
                    fontWeight = FontWeight.Bold,
                    /*fontSize = 16.sp,*/
                    modifier = Modifier,
                    style = MaterialTheme.typography.headlineMedium
                )
                Text(
                    text="$${platillo.precio}",
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier= Modifier
                )
                Text(
                    text=platillo.oferta,
                    color= Color.Red,
                    fontWeight = FontWeight.Bold,
                    fontSize = 16.sp,
                    modifier= Modifier
                )
            }
        }
    }
}


@Composable
fun MenuCardList( platillos: List<Platillo>, modifier: Modifier = Modifier ){
    LazyColumn (modifier = modifier ){
        items( platillos){
                platillo -> MenuCard(
            platillo = platillo,
            modifier = Modifier.padding(10.dp)
        )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun MenuCard_Preview(){
    val dataSource = DataSource()
    val platillos = dataSource.loadPlatillos()

    MenuCard(platillo = platillos[0] )

}