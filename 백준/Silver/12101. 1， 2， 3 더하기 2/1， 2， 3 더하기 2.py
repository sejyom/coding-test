from itertools import *
import sys

def find_combinations(i):
    result = []
    if n <= 3 and i == 1:
        result.append([n])
        return result
    elif i == 1:
        return []
    for p in product([1, 2, 3], repeat=i):
        if sum(p) > n:
            continue
        if sum(p) == n:
            result.append(p)

    return result + find_combinations(i - 1)


n, m = map(int, sys.stdin.readline().rstrip().split())
comb = find_combinations(n)

res = []

for item in comb:
    item_permutations = set(permutations(item))
    res.extend(item_permutations)

res = sorted(set(res))

try:
    print('+'.join(str(num) for num in res[m-1]))
except:
    print(-1)