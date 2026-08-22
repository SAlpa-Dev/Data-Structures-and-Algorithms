# 📝 898. Transpose Matrix (LeetCode)

🔗 [Problem Link](https://leetcode.com/problems/transpose-matrix/)

![Difficulty](https://img.shields.io/badge/Difficulty-Easy-brightgreen) ![Language](https://img.shields.io/badge/Language-Java-blue)

### 💡 Tags
Array, Matrix, Simulation

### 🚀 Performance
- **Runtime:** 1 ms
- **Memory:** 46.8 MB

---

### 📜 Problem Description

Given a 2D integer array  `matrix` , return  *the  **transpose**  of*   `matrix` .

The  **transpose**  of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

![image](https://assets.leetcode.com/uploads/2021/02/10/hint_transpose.png)

**Example 1:**

```
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

```

**Example 2:**

```
Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]

```

**Constraints:**

	
- `m == matrix.length`
	
- `n == matrix[i].length`
	
- `1 <= m, n <= 1000`
	
- `1 <= m * n <= 105`
	
- `-109 <= matrix[i][j] <= 109`