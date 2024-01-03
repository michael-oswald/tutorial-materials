import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

class PriorityQueueExample {

    public static void main(String[] args) {
        Queue<Order> priorityQueue = new PriorityQueue<>(Comparator.comparing(order -> order.orderTime));

        priorityQueue.add(new Order("01","salad", System.nanoTime()));
        priorityQueue.add(new Order("02","fries", System.nanoTime()));
        priorityQueue.add(new Order("03","pizza", System.nanoTime()));

        //rush order:
        priorityQueue.add(new Order("04","shake", 1L));

        priorityQueue.add(new Order("05","salad", System.nanoTime()));
        priorityQueue.add(new Order("06","salad", System.nanoTime()));

        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.poll());
        }
    }


    private static class Order {

        public String orderId;
        public String orderDetails;
        public long orderTime;

        public Order(String orderId, String orderDetails, long orderTime) {
            this.orderId = orderId;
            this.orderDetails = orderDetails;
            this.orderTime = orderTime;
        }

        @Override
        public String toString() {
            return "Order{" +
                    "orderId='" + orderId + '\'' +
                    ", orderDetails='" + orderDetails + '\'' +
                    ", priority=" + orderTime +
                    '}';
        }
    }
}