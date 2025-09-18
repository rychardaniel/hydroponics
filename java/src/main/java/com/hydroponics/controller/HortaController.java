package com.hydroponics.controller;

import com.hydroponics.model.Horta;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;

import java.util.List;

@Path("/horta/")
public class HortaController {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Horta> getHorta() {
        return Horta.listAll();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Horta getHortaById(@PathParam("id") int id) {
        Horta horta = Horta.findById(id);

        if (horta == null) {
            throw new jakarta.ws.rs.NotFoundException("Horta com id " + id + " não encontrada.");
        }

        return horta;
    }
}