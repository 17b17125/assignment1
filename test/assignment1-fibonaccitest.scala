package prg1.assignment1

import org.scalatest._
import FIB._

class FIBTest extends FunSuite with Matchers {
   test("FIB tests") {
     fib_itr(0) should equal (fib_rec(0))
     fib_matrix(0) should equal (fib_itr(0))
     fib_polynomial(0) should equal (fib_matrix(0))

     fib_itr(2) should equal (fib_rec(2))
     fib_itr(10) should equal (fib_rec(10))
     fib_matrix(10) should equal (fib_itr(10))
     fib_matrix(20) should equal (fib_itr(20))
     fib_polynomial(20) should equal (fib_matrix(20))
     fib_polynomial(30) should equal (fib_matrix(30))
     fib_polynomial(50) should equal (fib_matrix(50))
     fib_polynomial(100) should equal (fib_matrix(100))
     fib_polynomial(1000) should equal (fib_matrix(1000))
   }

}
