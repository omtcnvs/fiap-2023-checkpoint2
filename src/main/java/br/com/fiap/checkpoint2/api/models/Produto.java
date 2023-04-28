package br.com.fiap.checkpoint2.api.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;

@Entity
@Table(name = "produtos")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@EqualsAndHashCode(of = "codigo")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "codigo_produto")
    private String codigo;

    @Column(name = "nome")
    private String nome;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "data_validade")
    private Date dataValidade;

    @Column(name = "data_garantia")
    private Date dataGarantia;

    @Column(name = "em_estoque")
    private Boolean emEstoque;

}
