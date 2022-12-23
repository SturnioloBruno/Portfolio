package com.bruno.DigitalBooking.repositories;

import com.bruno.DigitalBooking.models.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto,Long> {
}
