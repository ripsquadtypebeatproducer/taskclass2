import kotlin.math.abs

class Point(val x: Double, val y: Double) {
    fun distanceTo(point2: Point) {

    }
}

class Triangle(private val a: Point, private val b: Point, private val c: Point) {

    fun isPointInside(point: Point): Boolean {

        val areaABC = 0.5 * abs(a.x * (b.y - c.y) + b.x * (c.y - a.y) + c.x * (a.y - b.y))
        val areaPBC = 0.5 * abs(point.x * (b.y - c.y) + b.x * (c.y - point.y) + c.x * (point.y - b.y))
        val areaPCA = 0.5 * abs(point.x * (c.y - a.y) + c.x * (a.y - point.y) + a.x * (point.y - c.y))
        val areaPAB = 0.5 * abs(point.x * (a.y - b.y) + a.x * (b.y - point.y) + b.x * (point.y - a.y))

        return areaPBC + areaPCA + areaPAB == areaABC
    }
}
fun main() {


    println("Задача 2: Расстояние между точками")
    print("Введите координаты первой точки (x1, y1): ")
    val x1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val y1 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val point1 = Point(x1, y1)

    print("Введите координаты второй точки (x2, y2): ")
    val x2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val y2 = readlnOrNull()?.toDoubleOrNull() ?: 0.0
    val point2 = Point(x2, y2)

    val distance = point1.distanceTo(point2)
    println("Расстояние между точками: $distance")
    println()}