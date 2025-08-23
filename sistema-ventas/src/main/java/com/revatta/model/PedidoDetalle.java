package com.revatta.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "pedido_detalles")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PedidoDetalle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "pedido_id", nullable = false)
    private Pedido pedido;

    @ManyToOne
    @JoinColumn(name = "producto_id", nullable = false)
    private Producto producto;

    private Integer cantidad;
    private Double precioUnitario;
}
