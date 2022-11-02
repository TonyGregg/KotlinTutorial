package basics

class Button : Clickable, Focusable {
    override fun click() {
        println("Button got clicked")
    }

    override fun showOff() {
        super<Clickable>.showOff()
        super<Focusable>.showOff()

    }

}

fun main() {
    val button = Button();
    button.click()
    button.showOff()
    button.setFocus(true) // invoking default function
    button.setFocus(false)
}