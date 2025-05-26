// com.utils/MessageUtils.java
package com.utils;
public class ex_34_JavaModules {
    public static String getMessage() {
        return "Hello from utils!";
    }
}

// com.utils/module-info.java
module com.utils {
    exports com.utils;
}

// com.greetings/HelloApp.java
package com.greetings;
import com.utils.MessageUtils;

public class HelloApp {
    public static void main(String[] args) {
        System.out.println(MessageUtils.getMessage());
    }
}

// com.greetings/module-info.java
module com.greetings {
    requires com.utils;
}

