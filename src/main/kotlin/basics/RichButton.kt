package basics

/**
 * open means the class is open and others can inherit from it.
 *
 *  Kotlin visibility modifiers
Modifier

Class member

Top-level declaration

public (default)	Visible everywhere	Visible everywhere
internal	Visible in a module	Visible in a module
protected	Visible in subclasses	--
private	Visible in a class	Visible in a file
 */

open class RichButton : Clickable{
    fun disable() { // this function is final; can't override in subclass

    }
    open fun animate() { // this function is open, subclass can override it

    }
    override fun click() { // This function overrides an open function and is open as well.
        TODO("Not yet implemented")
    }
}