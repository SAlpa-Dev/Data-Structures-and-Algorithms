class MedianFinder {
    PriorityQueue<Integer>maxHeap;
    PriorityQueue<Integer>minHeap;
    public MedianFinder() {
        maxHeap=new PriorityQueue(Collections.reverseOrder());
        minHeap=new PriorityQueue();
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else if(maxHeap.peek()>num) maxHeap.add(num);
        else minHeap.add(num);
        if((maxHeap.size()-minHeap.size())>1) minHeap.add(maxHeap.poll());
        if((minHeap.size()-maxHeap.size())>1) maxHeap.add(minHeap.poll());
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        else if(maxHeap.size()<minHeap.size()) return minHeap.peek();
        else return (maxHeap.peek()+minHeap.peek())/2.0;       
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */