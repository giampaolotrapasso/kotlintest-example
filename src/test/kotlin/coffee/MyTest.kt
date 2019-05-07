package coffee

import io.kotlintest.matchers.haveLength
import io.kotlintest.should
import io.kotlintest.specs.StringSpec

class MyTests : StringSpec({
  "length should return size of string" {
     assert(false)
    "hello".length shouldBe 5
  }
  "startsWith should test for a prefix" {
    "world" should startWith("wor")
  }
})