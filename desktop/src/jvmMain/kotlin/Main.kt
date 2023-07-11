
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import com.camachoyury.ekkomerce.App


fun main() = application {
    Window(onCloseRequest = ::exitApplication) {
        App()
    }
}