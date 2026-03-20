package pcn.diagram.util;

/**
 * 
 * @author Fco. Javier Pérez
 * Clase que almacena la cantidad de entidades creadas. 
 *
 */
public class EntityCount {

	static int count = 0;
	
	public static int getEntityCount() {
		count ++;
		return count;
	}
	
}
