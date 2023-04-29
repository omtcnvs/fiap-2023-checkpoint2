package br.com.fiap.checkpoint2.api.models;

import jakarta.persistence.*;
import lombok.*;

import static org.apache.commons.lang3.builder.ToStringBuilder.reflectionToString;

@Getter
@Setter
@Entity
@Table(name = "clientes")
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "codigo")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codigo_cliente", nullable = false)
    private String codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "inscricao_federal")
    private String inscricaoFederal;

    @Column(name = "cep")
    private String cep;

    @Override
    public String toString() {
        return reflectionToString(this);
    }
}
