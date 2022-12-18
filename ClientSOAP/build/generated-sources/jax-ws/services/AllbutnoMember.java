
package services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AllbutnoMember complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AllbutnoMember"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="findbyyear" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllbutnoMember", propOrder = {
    "findbyyear"
})
public class AllbutnoMember {

    protected int findbyyear;

    /**
     * Gets the value of the findbyyear property.
     * 
     */
    public int getFindbyyear() {
        return findbyyear;
    }

    /**
     * Sets the value of the findbyyear property.
     * 
     */
    public void setFindbyyear(int value) {
        this.findbyyear = value;
    }

}
