package info.jiekebo.dao;

import java.util.Collection;
import java.util.Date;
import java.nio.ByteBuffer;

import net.sf.mardao.dao.Mapper;
import net.sf.mardao.dao.Supplier;
import net.sf.mardao.domain.AbstractEntityBuilder;
import info.jiekebo.domain.DBook;

/**
 * The DBook domain-object specific mapping methods go here.
 *
 * Generated on 2015-05-15T10:01:47.611+0200.
 * @author mardao DAO generator (net.sf.mardao.plugin.ProcessDomainMojo)
 */
public class DBookMapper
  implements Mapper<DBook, String> {

  private final Supplier supplier;

  public enum Field {
    ID("id"),
    AUTHOR("Author"),
    ISBN("ISBN"),
    TITLE("Title"),
    PAGES("pages");

    private final String fieldName;

    Field(String fieldName) {
      this.fieldName = fieldName;
    }

    public String getFieldName() {
      return fieldName;
    }
  }

  public DBookMapper(Supplier supplier) {
    this.supplier = supplier;
  }

  @Override
  public String fromKey(Object key) {
    return supplier.toStringKey(key);
  }

  @Override
  public DBook fromReadValue(Object value) {
    final DBook entity = new DBook();

    // set primary key:
    final Object key = supplier.getKey(value, Field.ID.getFieldName());
    entity.setId(supplier.toStringKey(key));

    // set all fields:
    entity.setAuthor(supplier.getString(value, Field.AUTHOR.getFieldName()));
    entity.setISBN(supplier.getString(value, Field.ISBN.getFieldName()));
    entity.setTitle(supplier.getString(value, Field.TITLE.getFieldName()));
    entity.setPages(supplier.getInteger(value, Field.PAGES.getFieldName()));
    return entity;
  }

  @Override
  public String getCreatedByColumnName() {
    return null;
  }

  @Override
  public String getCreatedDateColumnName() {
    return null;
  }

  @Override
  public String getUpdatedByColumnName() {
    return null;
  }

  @Override
  public String getUpdatedDateColumnName() {
    return null;
  }

  @Override
  public String getId(DBook entity) {
    return entity != null ? entity.getId() : null;
  }

  @Override
  public Object getParentKey(DBook entity) {
    return null;
  }

  @Override
  public void setParentKey(DBook entity, Object parentKey) {
    // this entity has no parent
  }

  @Override
  public void updateEntityPostWrite(DBook entity, Object key, Object value) {
    entity.setId(supplier.toStringKey(key));
}

@Override
  public String getKind() {
    return DBook.class.getSimpleName();
  }

  @Override
  public Object toKey(Object parentKey, String id) {
    return supplier.toKey(parentKey, getKind(), id);
  }

  @Override
  public Object toWriteValue(DBook entity) {
    final String id = getId(entity);
    final Object parentKey = getParentKey(entity);
    final Object value = supplier.createWriteValue(parentKey, getKind(), id);

    // set all fields:
    supplier.setString(value, Field.AUTHOR.getFieldName(), entity.getAuthor());
    supplier.setString(value, Field.ISBN.getFieldName(), entity.getISBN());
    supplier.setString(value, Field.TITLE.getFieldName(), entity.getTitle());
    supplier.setInteger(value, Field.PAGES.getFieldName(), entity.getPages());
    return value;
  }

  public static Builder newBuilder() {
    return new Builder();
  }

  public static class Builder extends AbstractEntityBuilder<DBook> {

    protected Builder() {
      super(new DBook());
    }

    public Builder id(String id) {
      entity.setId(id);
      return this;
    }

    public Builder Author(String Author) {
      entity.setAuthor(Author);
      return this;
    }

    public Builder ISBN(String ISBN) {
      entity.setISBN(ISBN);
      return this;
    }

    public Builder Title(String Title) {
      entity.setTitle(Title);
      return this;
    }

    public Builder pages(Integer pages) {
      entity.setPages(pages);
      return this;
    }

  }
}
