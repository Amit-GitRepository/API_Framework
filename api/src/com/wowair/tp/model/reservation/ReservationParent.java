
package com.wowair.tp.model.reservation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "locale",
    "orders",
    "administrationFee",
    "bookingDate",
    "confirmationNumber",
    "currency",
    "sessionId",
    "paymentDue",
    "status",
    "reservationBalance",
    "totalAmount",
    "totalPaid",
    "flights",
    "passengers",
    "payments"
})
public class ReservationParent {

    @JsonProperty("locale")
    private String locale;
    @JsonProperty("orders")
    private List<Order> orders = null;
    @JsonProperty("administrationFee")
    private Integer administrationFee;
    @JsonProperty("bookingDate")
    private String bookingDate;
    @JsonProperty("confirmationNumber")
    private String confirmationNumber;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("sessionId")
    private String sessionId;
    @JsonProperty("paymentDue")
    private String paymentDue;
    @JsonProperty("status")
    private String status;
    @JsonProperty("reservationBalance")
    private Double reservationBalance;
    @JsonProperty("totalAmount")
    private Double totalAmount;
    @JsonProperty("totalPaid")
    private Integer totalPaid;
    @JsonProperty("flights")
    private List<Flight> flights = null;
    @JsonProperty("passengers")
    private List<Passenger> passengers = null;
    @JsonProperty("payments")
    private List<Object> payments = null;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("locale")
    public String getLocale() {
        return locale;
    }

    @JsonProperty("locale")
    public void setLocale(String locale) {
        this.locale = locale;
    }

    @JsonProperty("orders")
    public List<Order> getOrders() {
        return orders;
    }

    @JsonProperty("orders")
    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    @JsonProperty("administrationFee")
    public Integer getAdministrationFee() {
        return administrationFee;
    }

    @JsonProperty("administrationFee")
    public void setAdministrationFee(Integer administrationFee) {
        this.administrationFee = administrationFee;
    }

    @JsonProperty("bookingDate")
    public String getBookingDate() {
        return bookingDate;
    }

    @JsonProperty("bookingDate")
    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    @JsonProperty("confirmationNumber")
    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    @JsonProperty("confirmationNumber")
    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    @JsonProperty("currency")
    public String getCurrency() {
        return currency;
    }

    @JsonProperty("currency")
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @JsonProperty("sessionId")
    public String getSessionId() {
        return sessionId;
    }

    @JsonProperty("sessionId")
    public void setSessionId(String sessionId) {
        this.sessionId = sessionId;
    }

    @JsonProperty("paymentDue")
    public String getPaymentDue() {
        return paymentDue;
    }

    @JsonProperty("paymentDue")
    public void setPaymentDue(String paymentDue) {
        this.paymentDue = paymentDue;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("reservationBalance")
    public Double getReservationBalance() {
        return reservationBalance;
    }

    @JsonProperty("reservationBalance")
    public void setReservationBalance(Double reservationBalance) {
        this.reservationBalance = reservationBalance;
    }

    @JsonProperty("totalAmount")
    public Double getTotalAmount() {
        return totalAmount;
    }

    @JsonProperty("totalAmount")
    public void setTotalAmount(Double totalAmount) {
        this.totalAmount = totalAmount;
    }

    @JsonProperty("totalPaid")
    public Integer getTotalPaid() {
        return totalPaid;
    }

    @JsonProperty("totalPaid")
    public void setTotalPaid(Integer totalPaid) {
        this.totalPaid = totalPaid;
    }

    @JsonProperty("flights")
    public List<Flight> getFlights() {
        return flights;
    }

    @JsonProperty("flights")
    public void setFlights(List<Flight> flights) {
        this.flights = flights;
    }

    @JsonProperty("passengers")
    public List<Passenger> getPassengers() {
        return passengers;
    }

    @JsonProperty("passengers")
    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }

    @JsonProperty("payments")
    public List<Object> getPayments() {
        return payments;
    }

    @JsonProperty("payments")
    public void setPayments(List<Object> payments) {
        this.payments = payments;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
