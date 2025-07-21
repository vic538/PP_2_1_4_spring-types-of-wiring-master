package koschei.models;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("rabbit4Bean")
public class Rabbit4 {
    @Autowired
    @Qualifier("duck5Bean")
    private Duck5 duck5;


    @Override
    public String toString() {
        return ", в зайце утка " + duck5.toString();
    }
}
