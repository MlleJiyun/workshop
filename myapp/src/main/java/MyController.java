import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;

@RestController
public class MyController {
    @Autowired
    Address address;
    @Autowired
    Employee employee;

    @GetMapping("/msg")
    public String getMyService() {
        address.setLocation("서울");
        employee.setName("Dennis");
        return employee.getAddress().getLocation();

    }
}