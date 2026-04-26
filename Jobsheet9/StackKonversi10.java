package Jobsheet9;

public class StackKonversi10 {
    int[] tumpukanBiner;
    int top;
    int size;

    public StackKonversi10() {
        this.size = 32;
        tumpukanBiner = new int[size];
        top = -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void push(int data) {
        if (!isFull()) {
            top++;
            tumpukanBiner[top] = data;
        } else {
            System.out.println("Stack Penuh");
        }
    }

    public int pop() {
        if (!isEmpty()) {
            int data = tumpukanBiner[top];
            top--;
            return data;
        } else {
            System.out.println("Stack Kosong");
            return -1;
        }
    }
}
