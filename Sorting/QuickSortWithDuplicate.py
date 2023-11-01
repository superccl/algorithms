class QuickSort:
  def sortArray(self, arr):
    self.arr = arr
    self.quick_sort(0, len(arr) - 1)
    return self.arr

  def quick_sort(self, lo, hi):
    if hi <= lo:
      return
    lt, i, gt = lo, lo + 1, hi
    while i <= gt:
      if self.arr[i] < self.arr[lt]:
        self.arr[i], self.arr[lt] = self.arr[lt], self.arr[i]
        i += 1
        lt += 1
      elif self.arr[i] == self.arr[lt]:
        i += 1
      else:
        self.arr[i], self.arr[gt] = self.arr[gt], self.arr[i]
        gt -= 1
    self.quick_sort(lo, lt - 1)
    self.quick_sort(gt + 1, hi)
      
    
  

print(QuickSort().sortArray([3, 1, 4, 1, 5, 9, 2, 6, 5, 4]))