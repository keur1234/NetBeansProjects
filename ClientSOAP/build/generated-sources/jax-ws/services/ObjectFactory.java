
package services;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the services package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AllbutnoMember_QNAME = new QName("http://services/", "AllbutnoMember");
    private final static QName _AllbutnoMemberResponse_QNAME = new QName("http://services/", "AllbutnoMemberResponse");
    private final static QName _Covidcase_QNAME = new QName("http://services/", "covidcase");
    private final static QName _Hello_QNAME = new QName("http://services/", "hello");
    private final static QName _HelloResponse_QNAME = new QName("http://services/", "helloResponse");
    private final static QName _Persist_QNAME = new QName("http://services/", "persist");
    private final static QName _PersistResponse_QNAME = new QName("http://services/", "persistResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: services
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AllbutnoMember }
     * 
     */
    public AllbutnoMember createAllbutnoMember() {
        return new AllbutnoMember();
    }

    /**
     * Create an instance of {@link AllbutnoMemberResponse }
     * 
     */
    public AllbutnoMemberResponse createAllbutnoMemberResponse() {
        return new AllbutnoMemberResponse();
    }

    /**
     * Create an instance of {@link Covidcase }
     * 
     */
    public Covidcase createCovidcase() {
        return new Covidcase();
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link Persist }
     * 
     */
    public Persist createPersist() {
        return new Persist();
    }

    /**
     * Create an instance of {@link PersistResponse }
     * 
     */
    public PersistResponse createPersistResponse() {
        return new PersistResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllbutnoMember }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllbutnoMember }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "AllbutnoMember")
    public JAXBElement<AllbutnoMember> createAllbutnoMember(AllbutnoMember value) {
        return new JAXBElement<AllbutnoMember>(_AllbutnoMember_QNAME, AllbutnoMember.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AllbutnoMemberResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link AllbutnoMemberResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "AllbutnoMemberResponse")
    public JAXBElement<AllbutnoMemberResponse> createAllbutnoMemberResponse(AllbutnoMemberResponse value) {
        return new JAXBElement<AllbutnoMemberResponse>(_AllbutnoMemberResponse_QNAME, AllbutnoMemberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Covidcase }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Covidcase }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "covidcase")
    public JAXBElement<Covidcase> createCovidcase(Covidcase value) {
        return new JAXBElement<Covidcase>(_Covidcase_QNAME, Covidcase.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Persist }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "persist")
    public JAXBElement<Persist> createPersist(Persist value) {
        return new JAXBElement<Persist>(_Persist_QNAME, Persist.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link PersistResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://services/", name = "persistResponse")
    public JAXBElement<PersistResponse> createPersistResponse(PersistResponse value) {
        return new JAXBElement<PersistResponse>(_PersistResponse_QNAME, PersistResponse.class, null, value);
    }

}
