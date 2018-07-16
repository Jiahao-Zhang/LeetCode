package pers.jiahao.leetcode.array;

public class NO641MyCircularDeque {
	int[] array = null;
    int size = 0;
    int tail = 0;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    public NO641MyCircularDeque(int k) {
        array = new int[k];
        size = k;
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    public boolean insertFront(int value) {
        if(tail>=size){
            return false;
        }
        for(int i = tail;i>0;i--){
            array[i] = array[i-1];
        }
        array[0] = value;
        tail++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    public boolean insertLast(int value) {
        if(tail>=size){
            return false;
        }
        array[tail] = value;
        tail++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    public boolean deleteFront() {
        if(tail==0){
            return false;
        }
        for(int i = 0;i<tail-1;i++){
            array[i] = array[i+1];
        }
        tail--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    public boolean deleteLast() {
        if(tail==0){
            return false;
        }
        tail--;
        return true;
    }
    
    /** Get the front item from the deque. */
    public int getFront() {
        if(tail==0){
            return -1;
        }
        return array[0];
        
    }
    
    /** Get the last item from the deque. */
    public int getRear() {
        if(tail==0){
            return -1;
        }
        return array[tail-1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    public boolean isEmpty() {
        if(tail==0){
            return true;
        }
        return false;
    }
    
    /** Checks whether the circular deque is full or not. */
    public boolean isFull() {
        if(tail==size){
            return true;
        }
        return false;
    }

}
