import androidx.compose.ui.window.ComposeUIViewController
import com.corbett.yaca.App
import platform.UIKit.UIViewController

fun MainViewController(): UIViewController = ComposeUIViewController { App() }
