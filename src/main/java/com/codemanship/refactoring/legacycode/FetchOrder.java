package com.codemanship.refactoring.legacycode;

import java.io.IOException;

public interface FetchOrder {
    Order fetchOrder(int orderId) throws IOException, InterruptedException;
}
