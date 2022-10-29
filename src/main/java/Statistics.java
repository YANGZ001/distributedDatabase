import common.TransactionType;

import java.util.ArrayList;

/**
 * @Package PACKAGE_NAME
 * @Author Zhang Yang
 * @Version V1.0
 * @Date 23/10/22 11:31 AM
 */
public class Statistics {
    private TransactionType transactionType; // type of the transaction
    private long timeSum; // sum of execution time of all transactions of this type
    private long cnt; // number of executed transactions of this type
    private long max; // maximum execution time of executed transactions of this type
    private long min; // minimum execution time of executed transactions of this type
    private long avg; // avg execution time of executed transactions of this type
    private long med;
    private long per_95;
    private long per_99;
    private ArrayList<Long> time_lst = new ArrayList<Long>();

    public Statistics(TransactionType transactionType) {
        this.transactionType = transactionType;
        min = Long.MAX_VALUE;
        max = 0;
    }

    public void addNewData(long executionTime) {
        cnt++;
        timeSum += executionTime;
        max = Math.max(max, executionTime);
        min = Math.min(min, executionTime);
        avg = timeSum / cnt;
        time_lst.add(executionTime);
    }

    public long getAvg() {
        return avg;
    }

    public TransactionType getTransactionType() {
        return transactionType;
    }

    public long getTimeSum() {
        return timeSum;
    }

    public long getCnt() {
        return cnt;
    }

    public long getMax() {
        return max;
    }

    public long getMin() {
        return min;
    }

    @Override
    public String toString() {
        return "Statistics{" +
                transactionType +
                ", timeSum=" + timeSum +
                ", cnt=" + cnt +
                ", min=" + min +
                ", avg=" + avg +
                ", max=" + max +
                '}';
    }
}
