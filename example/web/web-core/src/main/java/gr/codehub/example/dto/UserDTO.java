package gr.codehub.example.dto;

import io.swagger.annotations.ApiModelProperty;

public class UserDTO {
    @ApiModelProperty(notes = "The name of the user")
    private String name;

    public UserDTO(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
