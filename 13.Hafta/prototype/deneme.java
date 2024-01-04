package prototype;

import java.io.Serializable;

import org.apache.commons.lang3.SerializationUtils;

public class deneme implements Serializable{
	
	public deneme  clone() {
		return (deneme) SerializationUtils.clone(this);
	} 

}
