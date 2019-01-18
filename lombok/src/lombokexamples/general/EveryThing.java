package lombokexamples.general;

import lombok.*;
import lombok.extern.java.Log;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Log
@Getter
@Setter
@RequiredArgsConstructor
@EqualsAndHashCode(of = {"number", "text"})
@ToString(exclude = "strList")
public class EveryThing {
  private final int number;
  private final String text;
  private boolean flag;
  private List<String> strList;

  public List<String> getStrList() {
    if (strList == null) {
      strList = new ArrayList<>(128);
    }
    return Collections.unmodifiableList(strList);
  }
}