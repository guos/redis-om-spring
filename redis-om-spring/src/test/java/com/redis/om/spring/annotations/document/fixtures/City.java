package com.redis.om.spring.annotations.document.fixtures;

import com.redis.om.spring.annotations.Document;
import lombok.Data;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Reference;

@Data
@RequiredArgsConstructor(staticName = "of")
@Document("city")
public class City {
  @Id
  @NonNull
  private String id;

  @Reference
  @NonNull
  private State state;
}
