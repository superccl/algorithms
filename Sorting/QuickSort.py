class QuickSort:
  def sortArray(self, arr):
    self.arr = arr
    self.quick_sort(0, len(arr) - 1)

  def quick_sort(self, lo, hi):
    p = self.partition(lo, hi)
    self.quick_sort(lo, p-1)
    self.quick_sort(p+1, hi)

  def partition(self, lo, hi):
    pivot = self.arr[lo]
    i, j = lo+1, hi
    while True:
      print(lo, hi, self.arr)
      while i <= j and self.arr[i] < pivot:
        i += 1
      while i <= j and self.arr[j] >= pivot:
        j -= 1
      print(i, j)
      if i <= j:
        self.arr[i], self.arr[j] = self.arr[j], self.arr[i]
      else:
        break
    self.arr[lo], self.arr[j] = self.arr[j], self.arr[lo]
    return j
  

print(QuickSort().sortArray([2, 3, 1, 4]))