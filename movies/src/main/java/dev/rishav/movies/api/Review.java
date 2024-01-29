package dev.rishav.movies.api;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "reviews")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Review {
    @Id
    private ObjectId id;
    private String body;

    // we explicitly create this constructor because id is auto generated hence while creating a review we will
    // have only field : body we use that field for a constructor
    public Review(String body) {
        this.body = body;
    }
}
