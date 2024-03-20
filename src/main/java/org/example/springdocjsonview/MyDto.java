package org.example.springdocjsonview;

import com.fasterxml.jackson.annotation.JsonView;

public class MyDto extends ParentDto {

    @JsonView(JsonViews.MyView.class)
    private String viewField;

    public String getViewField() {
        return viewField;
    }

    public void setViewField(String viewField) {
        this.viewField = viewField;
    }
}
