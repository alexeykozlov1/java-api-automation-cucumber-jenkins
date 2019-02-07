package com.api.project.cucumber;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonInclude(JsonInclude.Include.NON_NULL)


public class RuntimeData {

    private String dynamicHeader;

    private String russianDollVariable;

    private static RuntimeData runtimeData = new RuntimeData();

    public static RuntimeData getInstance() {
        return runtimeData;
    }

    private RuntimeData() {
    }
}
