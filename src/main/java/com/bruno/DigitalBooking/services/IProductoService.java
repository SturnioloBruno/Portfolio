package com.bruno.DigitalBooking.services;

import com.bruno.DigitalBooking.models.Producto;
import com.bruno.DigitalBooking.shared.GenericServiceAPI;

public interface IProductoService extends GenericServiceAPI<Producto,Long> {
    //solo tiene los CRUD que extiende del GenericService
}
