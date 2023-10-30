class QuickSort:
  def sortArray(self, arr):
    self.arr = arr
    self.quick_sort(0, len(arr) - 1)
    return self.arr

  def quick_sort(self, lo, hi):
    if hi <= lo:
      return
    p = self.partition(lo, hi)
    self.quick_sort(lo, p-1)
    self.quick_sort(p+1, hi)

  def partition(self, lo, hi):
    pivot = self.arr[lo]
    i, j = lo + 1, hi
    while True:
      while i < hi and self.arr[i] < pivot:
        i += 1
      while self.arr[j] > pivot:
        j -= 1
      if i >= j:
        break
      self.arr[i], self.arr[j] = self.arr[j], self.arr[i]
    self.arr[lo], self.arr[j] = self.arr[j], self.arr[lo] 
    return j
      
    
  

print(QuickSort().sortArray([3, 1, 4, 1, 5, 9, 2, 6, 5, 4]))