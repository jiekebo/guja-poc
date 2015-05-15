package info.jiekebo.api;

import com.google.appengine.api.files.FileServicePb;
import com.google.common.net.MediaType;
import com.google.inject.Inject;
import com.wadpam.guja.crud.CrudResource;
import com.wadpam.guja.web.JsonCharacterEncodingResponseFilter;
import info.jiekebo.dao.DBookDaoBean;
import info.jiekebo.domain.DBook;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.mail.internet.ContentType;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("api/book")
@Produces(JsonCharacterEncodingResponseFilter.APPLICATION_JSON_UTF8)
@Consumes(JsonCharacterEncodingResponseFilter.APPLICATION_JSON_UTF8)
@PermitAll
public class BookResource extends CrudResource<DBook, String, DBookDaoBean> {

    @Inject
    public BookResource(DBookDaoBean dao) {
        super(dao);
    }

}
