
import org.w3c.dom.Node
import kotlinx.browser.document
import kotlinx.browser.window

fun main() {
    window.onload = { document.body?.sayHello() }
}

fun Node.sayHello() {
    this.textContent = "Hello"
}