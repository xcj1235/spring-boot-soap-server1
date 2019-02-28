//
// このファイルは、JavaTM Architecture for XML Binding(JAXB) Reference Implementation、v2.2.11によって生成されました 
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>を参照してください 
// ソース・スキーマの再コンパイル時にこのファイルの変更は失われます。 
// 生成日: 2019.02.28 時間 11:51:37 PM JST 
//


package com.howtodoinjava.domainobject;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Student1 complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType name="Student1"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="name1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *         &lt;element name="standard1" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *         &lt;element name="address1" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Student1", propOrder = {
    "name1",
    "standard1",
    "address1"
})
public class Student1 {

    @XmlElement(required = true)
    protected String name1;
    protected int standard1;
    @XmlElement(required = true)
    protected String address1;

    /**
     * name1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName1() {
        return name1;
    }

    /**
     * name1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName1(String value) {
        this.name1 = value;
    }

    /**
     * standard1プロパティの値を取得します。
     * 
     */
    public int getStandard1() {
        return standard1;
    }

    /**
     * standard1プロパティの値を設定します。
     * 
     */
    public void setStandard1(int value) {
        this.standard1 = value;
    }

    /**
     * address1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddress1() {
        return address1;
    }

    /**
     * address1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddress1(String value) {
        this.address1 = value;
    }

}
