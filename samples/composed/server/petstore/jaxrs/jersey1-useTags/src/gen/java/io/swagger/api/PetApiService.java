package io.swagger.api;

import io.swagger.api.*;
import io.swagger.model.*;

import com.sun.jersey.multipart.FormDataParam;

import io.swagger.model.Body1;
import io.swagger.model.Body2;
import io.swagger.model.InlineResponse200;
import io.swagger.model.InlineResponse2001;
import io.swagger.model.ModelApiResponse;
import io.swagger.model.Pet;

import java.util.Map;
import java.util.List;
import io.swagger.api.NotFoundException;

import java.io.InputStream;

import com.sun.jersey.core.header.FormDataContentDisposition;
import com.sun.jersey.multipart.FormDataParam;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.SecurityContext;
import javax.validation.constraints.*;
public abstract class PetApiService {
      public abstract Response addParrot(Body2 body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response addPet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response deletePet(Long petId,String apiKey,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response feedPet(Pet body,String token, @NotNull String petType, @NotNull String status,Long petId,,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByStatus( @NotNull List<String> status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response findPetsByTags( @NotNull List<String> tags,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getParrots(SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response getPetById(Long petId,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updateParrots(Body1 body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePet(Pet body,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response updatePetWithForm(Long petId,String name,String status,SecurityContext securityContext)
      throws NotFoundException;
      public abstract Response uploadFile(Long petId,Object body,SecurityContext securityContext)
      throws NotFoundException;
}
