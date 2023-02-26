package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.lang.reflect.Array;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CoverageArea {

    private String type;
    private Array coordinates;
}
