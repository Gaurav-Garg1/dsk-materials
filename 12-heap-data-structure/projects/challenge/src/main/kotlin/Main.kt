/*
 * Copyright (c) 2021 Razeware LLC
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * Notwithstanding the foregoing, you may not use, copy, modify, merge, publish,
 * distribute, sublicense, create a derivative work, and/or sell copies of the
 * Software in any work that is designed, intended, or marketed for pedagogical or
 * instructional purposes related to programming, coding, application development,
 * or information technology.  Permission for such use, copying, modification,
 * merger, publication, distribution, sublicensing, creation of derivative works,
 * or sale is expressly withheld.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

fun main() {
  val inverseComparator = Comparator<Int> { o1, o2 ->
    o2.compareTo(o1)
  }

  // 1
  val integers = arrayListOf(3, 10, 18, 5, 21, 100)
  val integersMinHeap = ComparatorHeapImpl.create(integers, inverseComparator)
  println(integersMinHeap.getNthSmallestT(3))

  // 3
  val heap = ComparatorHeapImpl.create(arrayListOf(21, 10, 18, 5, 3, 100, 1), inverseComparator)
  val heap2 = ComparatorHeapImpl.create(arrayListOf(8, 6, 20, 15, 12, 11), inverseComparator)
  heap.merge(heap2 as AbstractHeap<Int>)
  println((heap as AbstractHeap).elements)

  // 4
  val array = arrayListOf(21, 10, 18, 5, 3, 100, 1)
  val maxHeap = ComparableHeapImpl.create(array)
  val minHeap = ComparatorHeapImpl.create(array, inverseComparator)
  println(minHeap.isMinHeap())
  println(maxHeap.isMinHeap())
}