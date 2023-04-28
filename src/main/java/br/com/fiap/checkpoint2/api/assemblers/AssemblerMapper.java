package br.com.fiap.checkpoint2.api.assemblers;

public interface AssemblerMapper<RESOURCE, MODEL> {
    RESOURCE toResource(MODEL model);

    MODEL toModel(RESOURCE resource);
}
