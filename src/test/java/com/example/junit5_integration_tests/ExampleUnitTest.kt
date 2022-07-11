package java.com.example.junit5_integration_tests

import com.example.androidtestatp.eccSegGrad
import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*

class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)
    }

    @Test
    fun eccSegGradTest(){
        var res = eccSegGrad(1.0,-5.0,6.0)
        Assert.assertArrayEquals(res, arrayOf(3.0, 2.0))
        Assert.assertArrayEquals(res, arrayOf(3.0, 2.0))
        res = eccSegGrad(2.0,-7.0,3.0)
        Assert.assertArrayEquals(res, arrayOf(3.0, 0.5))
        res = eccSegGrad(-1.0,4.0,-4.0)
        Assert.assertArrayEquals(res, arrayOf(2.0, 2.0))
        res = eccSegGrad(7.0,21.0,-28.0)
        Assert.assertArrayEquals(res, arrayOf(1.0, -4.0))
        res = eccSegGrad(0.0, 1.0, 1.0)
        Assert.assertArrayEquals(res, arrayOfNulls<Double>(2))
        res = eccSegGrad(2.0, 4.0, 3.0)
        Assert.assertArrayEquals(res, arrayOfNulls<Double>(2))
    }
}