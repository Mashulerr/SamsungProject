package com.example.myproject1234.domain;

import com.google.gson.annotations.SerializedName;

public class News {

        @SerializedName("id")
        private int id;

        @SerializedName("title")
        private String title;

        @SerializedName("event_date_utc")
        private String eventDateUtc;

        @SerializedName("details")
        private String details;

        @SerializedName("flight_number")
        private Integer flightNumber;


        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getEventDateUtc() {
            return eventDateUtc;
        }

        public void setEventDateUtc(String eventDateUtc) {
            this.eventDateUtc = eventDateUtc;
        }

        public String getDetails() {
            return details;
        }

        public void setDetails(String details) {
            this.details = details;
        }

        public Integer getFlightNumber() {
            return flightNumber;
        }

        public void setFlightNumber(Integer flightNumber) {
            this.flightNumber = flightNumber;
        }

}
