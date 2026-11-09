# Queue Assignment

Implementasi lima assignment dari materi Queue, tanpa library Java (tanpa `import java.util.*`).

1. `Queue.java` - queue menggunakan singly linked list.
2. `DoublyLinkedListQueue.java` - queue menggunakan doubly linked list.
3. `PalindromeChecker.java` - cek palindrome memakai stack + queue.
4. `CircularArrayQueue.java` - queue menggunakan circular array (kapasitas tetap).
5. `PriorityQueue.java` - priority queue berbasis linked list terurut.

File pendukung:

- `Stack.java` - stack linked list untuk pengecekan palindrome.
- `Main.java` - menjalankan demo kelima assignment.

## Compile & run

```bash
javac Main.java
java Main
```

Atau jalankan masing-masing:

```bash
java Queue.java
java DoublyLinkedListQueue.java
java PalindromeChecker.java
java CircularArrayQueue.java
java PriorityQueue.java
```

## Catatan

- Pada `PriorityQueue`, angka prioritas lebih besar berarti dilayani lebih dulu.
  Elemen dengan prioritas sama dilayani sesuai urutan masuk (FIFO).
- `PalindromeChecker` mengabaikan spasi, tanda baca, dan membedakan huruf besar/kecil
  (case-insensitive).
