package com.example.programacaoweb06032025;

import jakarta.persistence.*;

import javax.xml.crypto.Data;
import java.util.Date;

@Entity
@Table(name="events")
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column (name = "event_name")
    private String eventName;

    @Column (name = "event_date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date eventDate;
    private Date eventTime;
}
