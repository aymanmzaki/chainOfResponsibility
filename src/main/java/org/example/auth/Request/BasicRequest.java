package org.example.auth.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zaki
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BasicRequest implements  Request{

    private String userName;
    private String password;

}
