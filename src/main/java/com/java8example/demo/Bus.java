package com.java8example.demo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
import java.util.Objects;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Bus {
   private int id;
   private String busType;
   private  int startingRate;
   private String travelDistance;

   private double starRating;
   private  List<String> contact;

    @Override
    public String toString() {
        return "Bus{" +
                "id=" + id +
                ", busType='" + busType + '\'' +
                ", startingRate=" + startingRate +
                ", travelDistance='" + travelDistance + '\'' +
                ",starRating='" + starRating +'\''+
                ", contact=" + contact +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bus)) return false;
        Bus bus = (Bus) o;
        return getId() == bus.getId() && getStartingRate() == bus.getStartingRate() && Objects.equals(getBusType(), bus.getBusType()) && Objects.equals(getTravelDistance(), bus.getTravelDistance()) && getStarRating() == bus.getStarRating() && Objects.equals(getContact(), bus.getContact());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getBusType(), getStartingRate(), getTravelDistance(),getStarRating(), getContact());
    }
}
