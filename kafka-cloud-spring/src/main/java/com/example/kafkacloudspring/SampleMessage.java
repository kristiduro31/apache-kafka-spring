package com.example.kafkacloudspring;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;

@Getter
public class SampleMessage {

    private final Integer id;
    private final String message;
    @JsonCreator
    public SampleMessage(@JsonProperty("id") Integer id,
                         @JsonProperty("message") String message) {
        this.id = id;
        this.message = message;
    }
    @Override
    public String toString() {
        return "SampleMessage{id=" + this.id + ", message='" + this.message + "'}";
    }

}
