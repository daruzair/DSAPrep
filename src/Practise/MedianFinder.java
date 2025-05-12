package Practise;

import java.util.ArrayList;
import java.util.List;

public class MedianFinder {
    public static void main(String[] args) {
        MedianFinder obj = new MedianFinder();
         obj.addNum(6);
         obj.findMedian();
        obj.addNum(10);
        obj.findMedian();
    }
    List<Integer> list;
    public MedianFinder() {
        list = new ArrayList<>();
    }

    public void addNum(int num) {
        
        list.add(num);
    }

    public double findMedian() {
        int size = list.size();
        if(size == 1){
            return (double)list.get(0);
        }
        int half = size/2;
        if(size % 2 == 0){
            int a = list.get(half);
            int b = list.get(half-1);
            double r = (double)(a+b) / 2;
            return r;
        }
        return (double)list.get(half);
    }

}
