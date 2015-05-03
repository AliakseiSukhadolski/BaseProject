package com.danco.d3.model.base;

/**
 * This class should be extended by each model entity
 *
 */
public abstract class AbstractBaseEntity implements BaseEntity{

	private static final String ID = " id = ";

	@Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || ! (object instanceof AbstractBaseEntity)){
        	return false;
        }
        
        if ( ! object.getClass().equals(this.getClass())){
        	return false;
        }
        
        Long id = getId();
        AbstractBaseEntity that = (AbstractBaseEntity) object;
        
        if(id == null) return false;
        
        if (id != null ? !id.equals(that.getId()) : that.getId() != null) return false;

        return true;
    }
	

    /* (non-Javadoc)
     * @see java.lang.Object#hashCode()
     */
    @Override
    public int hashCode() {
    	Long id = getId();
        return id != null ? id.hashCode() : 0;
    }

    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder(getClass().getName());
        sb.append(ID).append(getId());
        return sb.toString();
    }
}
