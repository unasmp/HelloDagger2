package org.una.hellodagger2.de

interface Pet {

    fun getName(): String
}

class Dog : Pet {

    companion object {
        const val NAME = "WanWan"
    }

    override fun getName(): String {
        return NAME
    }
}

class Cat : Pet {

    companion object {
        const val NAME = "Nyaaan"
    }

    override fun getName(): String {
        return NAME
    }
}