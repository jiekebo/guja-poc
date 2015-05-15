package info.jiekebo.dao;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import net.sf.mardao.core.CursorPage;
import net.sf.mardao.core.filter.Filter;
import net.sf.mardao.core.geo.DLocation;
import net.sf.mardao.dao.AbstractDao;
import net.sf.mardao.dao.Supplier;
import info.jiekebo.domain.DBook;


/**
 * The DBook domain-object specific finders and methods go in this POJO.
 * 
 * Generated on 2015-05-15T10:01:47.611+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class GeneratedDBookDaoImpl
  extends AbstractDao<DBook, java.lang.String> {

  public GeneratedDBookDaoImpl(Supplier<Object, Object, Object, Object> supplier) {
    super(new DBookMapper(supplier), supplier);
  }

// ----------------------- Caching -------------------------------------


// ----------------------- field finders -------------------------------
  /**
   * query-by method for field Author
   * @param Author the specified attribute
   * @return an Iterable of DBooks for the specified Author
   */
  public Iterable<DBook> queryByAuthor(java.lang.String Author) {
    return queryByField(null, DBookMapper.Field.AUTHOR.getFieldName(), Author);
  }

  /**
   * query-by method for field ISBN
   * @param ISBN the specified attribute
   * @return an Iterable of DBooks for the specified ISBN
   */
  public Iterable<DBook> queryByISBN(java.lang.String ISBN) {
    return queryByField(null, DBookMapper.Field.ISBN.getFieldName(), ISBN);
  }

  /**
   * query-by method for field Title
   * @param Title the specified attribute
   * @return an Iterable of DBooks for the specified Title
   */
  public Iterable<DBook> queryByTitle(java.lang.String Title) {
    return queryByField(null, DBookMapper.Field.TITLE.getFieldName(), Title);
  }

  /**
   * query-by method for field pages
   * @param pages the specified attribute
   * @return an Iterable of DBooks for the specified pages
   */
  public Iterable<DBook> queryByPages(java.lang.Integer pages) {
    return queryByField(null, DBookMapper.Field.PAGES.getFieldName(), pages);
  }


// ----------------------- DBook builder -------------------------------

  public static DBookMapper.Builder newBuilder() {
    return DBookMapper.newBuilder();
  }

}
