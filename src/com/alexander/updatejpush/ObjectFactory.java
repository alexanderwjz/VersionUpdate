
package com.alexander.updatejpush;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.alexander.updatejpush package. 
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

    private final static QName _PushAllNotice_QNAME = new QName("http://service.alexanderwjz.com/", "pushAllNotice");
    private final static QName _PushAsAliasUdMResponse_QNAME = new QName("http://service.alexanderwjz.com/", "pushAsAliasUdMResponse");
    private final static QName _PushAllNoticeResponse_QNAME = new QName("http://service.alexanderwjz.com/", "pushAllNoticeResponse");
    private final static QName _PushAsAliasUdM_QNAME = new QName("http://service.alexanderwjz.com/", "pushAsAliasUdM");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.alexander.updatejpush
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PushAsAliasUdM }
     * 
     */
    public PushAsAliasUdM createPushAsAliasUdM() {
        return new PushAsAliasUdM();
    }

    /**
     * Create an instance of {@link PushAsAliasUdMResponse }
     * 
     */
    public PushAsAliasUdMResponse createPushAsAliasUdMResponse() {
        return new PushAsAliasUdMResponse();
    }

    /**
     * Create an instance of {@link PushAllNoticeResponse }
     * 
     */
    public PushAllNoticeResponse createPushAllNoticeResponse() {
        return new PushAllNoticeResponse();
    }

    /**
     * Create an instance of {@link PushAllNotice }
     * 
     */
    public PushAllNotice createPushAllNotice() {
        return new PushAllNotice();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushAllNotice }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "pushAllNotice")
    public JAXBElement<PushAllNotice> createPushAllNotice(PushAllNotice value) {
        return new JAXBElement<PushAllNotice>(_PushAllNotice_QNAME, PushAllNotice.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushAsAliasUdMResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "pushAsAliasUdMResponse")
    public JAXBElement<PushAsAliasUdMResponse> createPushAsAliasUdMResponse(PushAsAliasUdMResponse value) {
        return new JAXBElement<PushAsAliasUdMResponse>(_PushAsAliasUdMResponse_QNAME, PushAsAliasUdMResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushAllNoticeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "pushAllNoticeResponse")
    public JAXBElement<PushAllNoticeResponse> createPushAllNoticeResponse(PushAllNoticeResponse value) {
        return new JAXBElement<PushAllNoticeResponse>(_PushAllNoticeResponse_QNAME, PushAllNoticeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PushAsAliasUdM }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.alexanderwjz.com/", name = "pushAsAliasUdM")
    public JAXBElement<PushAsAliasUdM> createPushAsAliasUdM(PushAsAliasUdM value) {
        return new JAXBElement<PushAsAliasUdM>(_PushAsAliasUdM_QNAME, PushAsAliasUdM.class, null, value);
    }

}
