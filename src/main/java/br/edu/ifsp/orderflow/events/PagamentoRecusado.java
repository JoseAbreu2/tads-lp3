package br.edu.ifsp.orderflow.events;

import java.time.Instant;

public record PagamentoRecusado(
        String id,
        String motivo,
        Instant ocorridoEm
) implements IDomainEvent {
}
