package com.sandbox;

import io.quarkus.security.Authenticated;
import jakarta.annotation.security.RolesAllowed;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import io.quarkus.security.identity.SecurityIdentity;
import jakarta.inject.Inject;

@Path("/secured")
@Produces(MediaType.TEXT_PLAIN)
public class SecuredResource {

    @Inject SecurityIdentity identity;

    @GET
    @Authenticated
    @Path("/me")
    public String me() {
        return "Hello " + identity.getPrincipal().getName();
    }

    @GET
    @Path("/user")
    @RolesAllowed("user")
    public String userOnly() {
        return "Only users with role 'user' can see this.";
    }
}