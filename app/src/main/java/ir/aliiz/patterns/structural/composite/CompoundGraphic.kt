package ir.aliiz.patterns.structural.composite

class CompoundGraphic : Graphic {
    private val graphics: MutableList<Graphic> = mutableListOf()

    fun add(graphic: Graphic) {
        graphics.add(graphic)
    }

    fun remove(graphic: Graphic) {
        graphics.remove(graphic)
    }

    override fun move(x: Int, y: Int) {
        graphics.forEach {
            it.move(x, y)
        }
    }

    override fun draw() {
        graphics.forEach {
            it.draw()
        }
    }
}