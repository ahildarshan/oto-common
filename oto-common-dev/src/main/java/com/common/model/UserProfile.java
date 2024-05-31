package com.common.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {
    private String emailId;
    private String profileName;
    private String profileRole;
    private List<String> profilePermissions;
    private List<String> salesOrgs;

    
}
