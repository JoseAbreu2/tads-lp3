package br.edu.ifsp.orderflow.events;

import java.time.Instant;

/**
 * Representa um fato, algo que aconteceu no dmínio como
 * PedidoCriado, PagamentoAprovado e etc. Quem publica um
 * evento não sabe, e nem precisa saber, quem vai consumí-lo.
 * **/

public interface IDomainEvent {
    Instant ocorridoEm();
}
