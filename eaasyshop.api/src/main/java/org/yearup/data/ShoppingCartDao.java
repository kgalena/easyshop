package org.yearup.data;

import org.yearup.models.ShoppingCart;

public interface ShoppingCartDao
{
    ShoppingCart getByUserId(int userId);

    ShoppingCart getCart(int userId);

    ShoppingCart addProduct(int userId, int productId);

    ShoppingCart updateProduct(int userId, int productId, int quantity);

    ShoppingCart deleteProduct(int userId);
    // add additional method signatures here
}
