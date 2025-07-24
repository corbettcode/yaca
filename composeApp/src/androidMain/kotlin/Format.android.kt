import androidx.compose.ui.text.intl.Locale
import kotlinx.datetime.DayOfWeek
import kotlinx.datetime.Month

actual fun Month.getDisplayName(
	short: Boolean,
	locale: Locale
): String {
	return ""
}

actual fun DayOfWeek.getDisplayName(
	narrow: Boolean,
	locale: Locale
): String {
	return ""
}