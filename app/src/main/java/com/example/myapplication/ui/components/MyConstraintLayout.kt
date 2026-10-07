import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout

@Preview(showBackground = true)
@Composable
fun MyConstraintLayout() {
    ConstraintLayout(
        modifier = Modifier.fillMaxSize()
    ) {
        // Creamos referencias para los elementos
        val (titulo, subtitulo) = createRefs()

        Text(
            text = "Soy un título",
            fontSize = 24.sp,
            modifier = Modifier
                .constrainAs(titulo) {
                top.linkTo(parent.top, margin = 16.dp)
                start.linkTo(parent.start, margin = 16.dp)}
                .background(Color.Magenta))
        Text(
            text = "Soy un subtítulo rechulón",
            fontSize = 16.sp,
            modifier = Modifier.constrainAs(subtitulo) {
                top.linkTo(titulo.bottom)
                start.linkTo(titulo.end)}
                .background(Color.Cyan)
        )
    }
}