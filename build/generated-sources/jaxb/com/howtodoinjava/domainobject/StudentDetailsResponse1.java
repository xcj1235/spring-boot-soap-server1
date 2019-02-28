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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex typeのJavaクラス。
 * 
 * <p>次のスキーマ・フラグメントは、このクラス内に含まれる予期されるコンテンツを指定します。
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Student1" type="{http://www.howtodoinjava.com/domainobject}Student1"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "student1"
})
@XmlRootElement(name = "StudentDetailsResponse1")
public class StudentDetailsResponse1 {

    @XmlElement(name = "Student1", required = true)
    protected Student1 student1;

    /**
     * student1プロパティの値を取得します。
     * 
     * @return
     *     possible object is
     *     {@link Student1 }
     *     
     */
    public Student1 getStudent1() {
        return student1;
    }

    /**
     * student1プロパティの値を設定します。
     * 
     * @param value
     *     allowed object is
     *     {@link Student1 }
     *     
     */
    public void setStudent1(Student1 value) {
        this.student1 = value;
    }

}
