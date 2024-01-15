items = [3, 5, 8, 1, 2, 4, 7, 6, 0, 3, 5, 3, 7, 9, 2, 4, 5]

# Goal: find top 3

class PriorityQueue:
  def __init__(self, pq, N=3):
    self.pq = pq
    self.N = N
    self.result = []
  
  def isEmpty(self):
    return self.N == 0

  def insert(self, key):
    self.N += 1
    self.pq[self.N] = key
    self.swim(self.N)

  def delMax(self):
    max = self.pq[1]
    N -= 1
    self.exchange(1, N)
    self.sink(1)
    self.pq[self.N+1] = None
    return max

  def swim(self, k):
    while k > 1 and self.pq[k // 2] < self.pq[k]:
      self.exchange(k // 2, k)
      k = k // 2

  def sink(self, k):
    while 2 * k <= self.N:
      j = 2 * k
      if j < self.N and self.less(j, j+1):
        j += 1
      if (self.less(k, j) == False):
        break
      self.exchange(k, j)
      k = j

  def less(self, i, j):
    return self.pq[i] < self.pq[j]
  
  def exchange(self, i, j):
    self.pq[i], self.pq[j] = self.pq[j], self.pq[i]
