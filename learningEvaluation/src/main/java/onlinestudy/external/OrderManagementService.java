
package onlinestudy.external;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Date;

@FeignClient(name="orderManagement", url="http://localhost:8080", fallback=OrderManagementServiceFallback.class)
public interface OrderManagementService {
    @RequestMapping(method= RequestMethod.PATCH, path="/orderManagements")
    public boolean registerEvaluation(@RequestParam("orderNo") String orderNo,
    @RequestParam("score") String score);
}

