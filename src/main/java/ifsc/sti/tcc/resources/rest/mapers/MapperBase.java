package ifsc.sti.tcc.resources.rest.mapers;

/**
 * Created by wilson.fernandes on 08/11/2017.
 */

public interface MapperBase<T, Z> {

    T transform(Z aObject);
    
}
