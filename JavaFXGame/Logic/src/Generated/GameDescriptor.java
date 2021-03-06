
package Generated;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GameType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="Basic"/>
 *               &lt;enumeration value="Advance"/>
 *               &lt;enumeration value="AdvanceDynamic"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Board">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}integer"/>
 *                   &lt;element name="Structure">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;choice>
 *                             &lt;element name="Range">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Squares">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Square" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                                               &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                               &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                               &lt;attribute name="color" use="required">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                                     &lt;minInclusive value="0"/>
 *                                                     &lt;maxInclusive value="6"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Marker">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                               &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/choice>
 *                           &lt;attribute name="type" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Random"/>
 *                                 &lt;enumeration value="Explicit"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Players" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Player" maxOccurs="6" minOccurs="3">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;all>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Type">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Human"/>
 *                                   &lt;enumeration value="Computer"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                             &lt;element name="Color">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                                   &lt;minInclusive value="1"/>
 *                                   &lt;maxInclusive value="6"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/all>
 *                           &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DynamicPlayers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="gameTitle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="totalPlayers" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
 *                       &lt;minInclusive value="3"/>
 *                       &lt;maxInclusive value="6"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "gameType",
    "board",
    "players",
    "dynamicPlayers"
})
@XmlRootElement(name = "GameDescriptor")
public class GameDescriptor {

    @XmlElement(name = "GameType", required = true)
    protected String gameType;
    @XmlElement(name = "Board", required = true)
    protected GameDescriptor.Board board;
    @XmlElement(name = "Players")
    protected GameDescriptor.Players players;
    @XmlElement(name = "DynamicPlayers")
    protected GameDescriptor.DynamicPlayers dynamicPlayers;

    /**
     * Gets the value of the gameType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGameType() {
        return gameType;
    }

    /**
     * Sets the value of the gameType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGameType(String value) {
        this.gameType = value;
    }

    /**
     * Gets the value of the board property.
     * 
     * @return
     *     possible object is
     *     {@link GameDescriptor.Board }
     *     
     */
    public GameDescriptor.Board getBoard() {
        return board;
    }

    /**
     * Sets the value of the board property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameDescriptor.Board }
     *     
     */
    public void setBoard(GameDescriptor.Board value) {
        this.board = value;
    }

    /**
     * Gets the value of the players property.
     * 
     * @return
     *     possible object is
     *     {@link GameDescriptor.Players }
     *     
     */
    public GameDescriptor.Players getPlayers() {
        return players;
    }

    /**
     * Sets the value of the players property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameDescriptor.Players }
     *     
     */
    public void setPlayers(GameDescriptor.Players value) {
        this.players = value;
    }

    /**
     * Gets the value of the dynamicPlayers property.
     * 
     * @return
     *     possible object is
     *     {@link GameDescriptor.DynamicPlayers }
     *     
     */
    public GameDescriptor.DynamicPlayers getDynamicPlayers() {
        return dynamicPlayers;
    }

    /**
     * Sets the value of the dynamicPlayers property.
     * 
     * @param value
     *     allowed object is
     *     {@link GameDescriptor.DynamicPlayers }
     *     
     */
    public void setDynamicPlayers(GameDescriptor.DynamicPlayers value) {
        this.dynamicPlayers = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Size" type="{http://www.w3.org/2001/XMLSchema}integer"/>
     *         &lt;element name="Structure">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;choice>
     *                   &lt;element name="Range">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Squares">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Square" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                                     &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="color" use="required">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                                           &lt;minInclusive value="0"/>
     *                                           &lt;maxInclusive value="6"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Marker">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                     &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/choice>
     *                 &lt;attribute name="type" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Random"/>
     *                       &lt;enumeration value="Explicit"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "size",
        "structure"
    })
    public static class Board {

        @XmlElement(name = "Size", required = true)
        protected BigInteger size;
        @XmlElement(name = "Structure", required = true)
        protected GameDescriptor.Board.Structure structure;

        /**
         * Gets the value of the size property.
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSize() {
            return size;
        }

        /**
         * Sets the value of the size property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSize(BigInteger value) {
            this.size = value;
        }

        /**
         * Gets the value of the structure property.
         * 
         * @return
         *     possible object is
         *     {@link GameDescriptor.Board.Structure }
         *     
         */
        public GameDescriptor.Board.Structure getStructure() {
            return structure;
        }

        /**
         * Sets the value of the structure property.
         * 
         * @param value
         *     allowed object is
         *     {@link GameDescriptor.Board.Structure }
         *     
         */
        public void setStructure(GameDescriptor.Board.Structure value) {
            this.structure = value;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;choice>
         *         &lt;element name="Range">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Squares">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Square" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *                           &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="color" use="required">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *                                 &lt;minInclusive value="0"/>
         *                                 &lt;maxInclusive value="6"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Marker">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                           &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/choice>
         *       &lt;attribute name="type" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Random"/>
         *             &lt;enumeration value="Explicit"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "range",
            "squares"
        })
        public static class Structure {

            @XmlElement(name = "Range")
            protected GameDescriptor.Board.Structure.Range range;
            @XmlElement(name = "Squares")
            protected GameDescriptor.Board.Structure.Squares squares;
            @XmlAttribute(name = "type", required = true)
            protected String type;

            /**
             * Gets the value of the range property.
             * 
             * @return
             *     possible object is
             *     {@link GameDescriptor.Board.Structure.Range }
             *     
             */
            public GameDescriptor.Board.Structure.Range getRange() {
                return range;
            }

            /**
             * Sets the value of the range property.
             * 
             * @param value
             *     allowed object is
             *     {@link GameDescriptor.Board.Structure.Range }
             *     
             */
            public void setRange(GameDescriptor.Board.Structure.Range value) {
                this.range = value;
            }

            /**
             * Gets the value of the squares property.
             * 
             * @return
             *     possible object is
             *     {@link GameDescriptor.Board.Structure.Squares }
             *     
             */
            public GameDescriptor.Board.Structure.Squares getSquares() {
                return squares;
            }

            /**
             * Sets the value of the squares property.
             * 
             * @param value
             *     allowed object is
             *     {@link GameDescriptor.Board.Structure.Squares }
             *     
             */
            public void setSquares(GameDescriptor.Board.Structure.Squares value) {
                this.squares = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="from" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="to" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Range {

                @XmlAttribute(name = "from", required = true)
                protected int from;
                @XmlAttribute(name = "to", required = true)
                protected int to;

                /**
                 * Gets the value of the from property.
                 * 
                 */
                public int getFrom() {
                    return from;
                }

                /**
                 * Sets the value of the from property.
                 * 
                 */
                public void setFrom(int value) {
                    this.from = value;
                }

                /**
                 * Gets the value of the to property.
                 * 
                 */
                public int getTo() {
                    return to;
                }

                /**
                 * Sets the value of the to property.
                 * 
                 */
                public void setTo(int value) {
                    this.to = value;
                }

            }


            /**
             * <p>Java class for anonymous complex type.
             * 
             * <p>The following schema fragment specifies the expected content contained within this class.
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Square" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
             *                 &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="color" use="required">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
             *                       &lt;minInclusive value="0"/>
             *                       &lt;maxInclusive value="6"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Marker">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                 &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "square",
                "marker"
            })
            public static class Squares {

                @XmlElement(name = "Square", required = true)
                protected List<GameDescriptor.Board.Structure.Squares.Square> square;
                @XmlElement(name = "Marker", required = true)
                protected GameDescriptor.Board.Structure.Squares.Marker marker;

                /**
                 * Gets the value of the square property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the square property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSquare().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link GameDescriptor.Board.Structure.Squares.Square }
                 * 
                 * 
                 */
                public List<GameDescriptor.Board.Structure.Squares.Square> getSquare() {
                    if (square == null) {
                        square = new ArrayList<GameDescriptor.Board.Structure.Squares.Square>();
                    }
                    return this.square;
                }

                /**
                 * Gets the value of the marker property.
                 * 
                 * @return
                 *     possible object is
                 *     {@link GameDescriptor.Board.Structure.Squares.Marker }
                 *     
                 */
                public GameDescriptor.Board.Structure.Squares.Marker getMarker() {
                    return marker;
                }

                /**
                 * Sets the value of the marker property.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link GameDescriptor.Board.Structure.Squares.Marker }
                 *     
                 */
                public void setMarker(GameDescriptor.Board.Structure.Squares.Marker value) {
                    this.marker = value;
                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Marker {

                    @XmlAttribute(name = "row", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger row;
                    @XmlAttribute(name = "column", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger column;

                    /**
                     * Gets the value of the row property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRow() {
                        return row;
                    }

                    /**
                     * Sets the value of the row property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRow(BigInteger value) {
                        this.row = value;
                    }

                    /**
                     * Gets the value of the column property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getColumn() {
                        return column;
                    }

                    /**
                     * Sets the value of the column property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setColumn(BigInteger value) {
                        this.column = value;
                    }

                }


                /**
                 * <p>Java class for anonymous complex type.
                 * 
                 * <p>The following schema fragment specifies the expected content contained within this class.
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
                 *       &lt;attribute name="row" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="column" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *       &lt;attribute name="color" use="required">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
                 *             &lt;minInclusive value="0"/>
                 *             &lt;maxInclusive value="6"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
                 *     &lt;/extension>
                 *   &lt;/simpleContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "value"
                })
                public static class Square {

                    @XmlValue
                    protected BigInteger value;
                    @XmlAttribute(name = "row", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger row;
                    @XmlAttribute(name = "column", required = true)
                    @XmlSchemaType(name = "positiveInteger")
                    protected BigInteger column;
                    @XmlAttribute(name = "color", required = true)
                    protected int color;

                    /**
                     * Gets the value of the value property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getValue() {
                        return value;
                    }

                    /**
                     * Sets the value of the value property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setValue(BigInteger value) {
                        this.value = value;
                    }

                    /**
                     * Gets the value of the row property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRow() {
                        return row;
                    }

                    /**
                     * Sets the value of the row property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRow(BigInteger value) {
                        this.row = value;
                    }

                    /**
                     * Gets the value of the column property.
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getColumn() {
                        return column;
                    }

                    /**
                     * Sets the value of the column property.
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setColumn(BigInteger value) {
                        this.column = value;
                    }

                    /**
                     * Gets the value of the color property.
                     * 
                     */
                    public int getColor() {
                        return color;
                    }

                    /**
                     * Sets the value of the color property.
                     * 
                     */
                    public void setColor(int value) {
                        this.color = value;
                    }

                }

            }

        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="gameTitle" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="totalPlayers" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}positiveInteger">
     *             &lt;minInclusive value="3"/>
     *             &lt;maxInclusive value="6"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class DynamicPlayers {

        @XmlAttribute(name = "gameTitle", required = true)
        protected String gameTitle;
        @XmlAttribute(name = "totalPlayers", required = true)
        protected int totalPlayers;

        /**
         * Gets the value of the gameTitle property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGameTitle() {
            return gameTitle;
        }

        /**
         * Sets the value of the gameTitle property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGameTitle(String value) {
            this.gameTitle = value;
        }

        /**
         * Gets the value of the totalPlayers property.
         * 
         */
        public int getTotalPlayers() {
            return totalPlayers;
        }

        /**
         * Sets the value of the totalPlayers property.
         * 
         */
        public void setTotalPlayers(int value) {
            this.totalPlayers = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Player" maxOccurs="6" minOccurs="3">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;all>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Type">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;enumeration value="Human"/>
     *                         &lt;enumeration value="Computer"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                   &lt;element name="Color">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *                         &lt;minInclusive value="1"/>
     *                         &lt;maxInclusive value="6"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/all>
     *                 &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "player"
    })
    public static class Players {

        @XmlElement(name = "Player", required = true)
        protected List<GameDescriptor.Players.Player> player;

        /**
         * Gets the value of the player property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the player property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlayer().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GameDescriptor.Players.Player }
         * 
         * 
         */
        public List<GameDescriptor.Players.Player> getPlayer() {
            if (player == null) {
                player = new ArrayList<GameDescriptor.Players.Player>();
            }
            return this.player;
        }


        /**
         * <p>Java class for anonymous complex type.
         * 
         * <p>The following schema fragment specifies the expected content contained within this class.
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;all>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Type">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *               &lt;enumeration value="Human"/>
         *               &lt;enumeration value="Computer"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *         &lt;element name="Color">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
         *               &lt;minInclusive value="1"/>
         *               &lt;maxInclusive value="6"/>
         *             &lt;/restriction>
         *           &lt;/simpleType>
         *         &lt;/element>
         *       &lt;/all>
         *       &lt;attribute name="id" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {

        })
        public static class Player {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Type", required = true)
            protected String type;
            @XmlElement(name = "Color")
            protected int color;
            @XmlAttribute(name = "id", required = true)
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger id;

            /**
             * Gets the value of the name property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * Sets the value of the name property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * Gets the value of the type property.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * Sets the value of the type property.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

            /**
             * Gets the value of the color property.
             * 
             */
            public int getColor() {
                return color;
            }

            /**
             * Sets the value of the color property.
             * 
             */
            public void setColor(int value) {
                this.color = value;
            }

            /**
             * Gets the value of the id property.
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getId() {
                return id;
            }

            /**
             * Sets the value of the id property.
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setId(BigInteger value) {
                this.id = value;
            }

        }

    }

}
