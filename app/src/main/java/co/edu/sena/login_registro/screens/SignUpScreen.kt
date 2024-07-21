package co.edu.sena.login_registro.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import co.edu.sena.login_registro.R
import co.edu.sena.login_registro.components.NormalTextComponent
import co.edu.sena.login_registro.components.HeadingTextComponent

@Composable
fun SignUpScreen() {

    Surface(
        color = Color.White,
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(28.dp)
    ) {
        Column (modifier = Modifier.fillMaxSize() ) {
            NormalTextComponent(value = stringResource(id = R.string.hello))
            HeadingTextComponent( value= stringResource(id = R.string.Create_account))
        }

    }
}

@Preview
@Composable
fun DefaultPreviewSignUpScreen() {

    SignUpScreen()

}
