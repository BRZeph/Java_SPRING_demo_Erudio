package brzeph.spring.java_spring_demo_erudio.controllers;

import brzeph.spring.java_spring_demo_erudio.exceptions.UnsupportedMathOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/math")
public class MathController {

    // http://localhost:8080/math/sum/3/5
    @RequestMapping("/sum/{n1}/{n2}")
    public Double sum(
            @PathVariable("n1")
            String n1, // passando como 'String' para forçar tratativa.
            @PathVariable("n2")
            String n2
    ) throws IllegalArgumentException {
        if (!isNumeric(n1) || !isNumeric(n2)) throw new UnsupportedMathOperation("Not a numeric value");
        return convertToDouble(n1) + convertToDouble(n2);
    }

    // http://localhost:8080/math/subtraction/3/5
    @RequestMapping("/subtraction/{n1}/{n2}")
    public Double subtraction(
            @PathVariable("n1")
            String n1, // passando como 'String' para forçar tratativa.
            @PathVariable("n2")
            String n2
    ) throws IllegalArgumentException {
        if (!isNumeric(n1) || !isNumeric(n2)) throw new UnsupportedMathOperation("Not a numeric value");
        return convertToDouble(n1) - convertToDouble(n2);
    }

    // http://localhost:8080/math/multiplication/3/5
    @RequestMapping("/multiplication/{n1}/{n2}")
    public Double multiplication(
            @PathVariable("n1")
            String n1, // passando como 'String' para forçar tratativa.
            @PathVariable("n2")
            String n2
    ) throws IllegalArgumentException {
        if (!isNumeric(n1) || !isNumeric(n2)) throw new UnsupportedMathOperation("Not a numeric value");
        return convertToDouble(n1) * convertToDouble(n2);
    }

    // http://localhost:8080/math/division/3/5
    @RequestMapping("/division/{n1}/{n2}")
    public Double division(
            @PathVariable("n1")
            String n1, // passando como 'String' para forçar tratativa.
            @PathVariable("n2")
            String n2
    ) throws IllegalArgumentException {
        if (!isNumeric(n1) || !isNumeric(n2)) throw new UnsupportedMathOperation("Not a numeric value");
        return convertToDouble(n1) / convertToDouble(n2);
    }





    private Double convertToDouble(String strNum) throws IllegalArgumentException {
        if (strNum == null || strNum.isEmpty()) throw new UnsupportedMathOperation("Not a numeric value");
        String num = strNum.replace(",", "."); // R$ 5,00 ~> 5.00
        return Double.parseDouble(num);
    }

    private boolean isNumeric(String strNum) {
        if (strNum == null || strNum.isEmpty()) return false;
        String num = strNum.replace(",", ".");
        return num.matches("[-+]?[0-9]*\\.?[0-9]+");
    }
}
