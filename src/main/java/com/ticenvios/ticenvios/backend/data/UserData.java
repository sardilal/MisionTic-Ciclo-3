package com.ticenvios.ticenvios.backend.data;

import lombok.*;

import java.util.List;


@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserData {
    private int id_user;
    private String name_user;
    private String password_user;
    private List<RoleData> roles_user;
}
