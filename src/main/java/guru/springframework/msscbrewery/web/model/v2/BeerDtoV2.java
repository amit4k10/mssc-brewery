package guru.springframework.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

import javax.validation.constraints.NotNull;

/**
 * Created by jt on 2019-04-23.
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDtoV2 {
    private UUID id;
    
    @NotNull
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
