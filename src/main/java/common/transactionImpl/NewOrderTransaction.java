package common.transactionImpl;

import common.Transaction;

import java.sql.Connection;
import java.util.List;

/**
 * @Package common.transactionImpl
 * @Author Zhang Yang
 * @Version V1.0
 * @Date 1/10/22 4:12 PM
 */
public class NewOrderTransaction extends Transaction {
    int W_ID;
    int D_ID;
    int C_ID;
    List<Integer> items;
    List<Integer> supplierWarehouses;
    List<Integer> quantities;

    @Override
    protected void actuallyExecute(Connection conn) {
        // 具体处理逻辑
    }

    public int getW_ID() {
        return W_ID;
    }

    public void setW_ID(int w_ID) {
        W_ID = w_ID;
    }

    public int getD_ID() {
        return D_ID;
    }

    public void setD_ID(int d_ID) {
        D_ID = d_ID;
    }

    public int getC_ID() {
        return C_ID;
    }

    public void setC_ID(int c_ID) {
        C_ID = c_ID;
    }

    public List<Integer> getSupplierWarehouses() {
        return supplierWarehouses;
    }

    public void setSupplierWarehouses(List<Integer> supplierWarehouses) {
        this.supplierWarehouses = supplierWarehouses;
    }

    public List<Integer> getQuantities() {
        return quantities;
    }

    public void setQuantities(List<Integer> quantities) {
        this.quantities = quantities;
    }

    public List<Integer> getItems() {
        return items;
    }

    public void setItems(List<Integer> items) {
        this.items = items;
    }

    @Override
    public String toString() {
        return "NewOrderTransaction{" +
                "W_ID=" + W_ID +
                ", D_ID=" + D_ID +
                ", C_ID=" + C_ID +
                ", items=" + items +
                ", supplierWarehouses=" + supplierWarehouses +
                ", quantities=" + quantities +
                "}\n";
    }
}
