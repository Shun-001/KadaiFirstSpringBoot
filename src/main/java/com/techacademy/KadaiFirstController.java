package com.techacademy;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KadaiFirstController {

    @GetMapping("/")
    public String index() {
        return "Hello SpringBoot!";
    }

    // 仕様1
    @GetMapping("/dayofweek/{val1}")
    public String dispDayOfWeek(@PathVariable String val1) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
        LocalDate date = LocalDate.parse(val1, formatter);
        String dayOfWeek = date.getDayOfWeek().toString();
        return "実行結果：" +dayOfWeek;
    }

    // 以下仕様2
    @GetMapping("/plus/{val2}/{val3}")
    public String calcPlus(@PathVariable int val2, @PathVariable int val3) {
        int res = 0;
        res = val2 + val3;
        return "実行結果：" + res;
    }

    @GetMapping("/minus/{val4}/{val5}")
    public String calcMinus(@PathVariable int val4, @PathVariable int val5) {
        int res = 0;
        res = val4 - val5;
        return "実行結果：" + res;
    }

    @GetMapping("/times/{val6}/{val7}")
    public String calcTimes(@PathVariable int val6, @PathVariable int val7) {
        int res = 0;
        res = val6 * val7;
        return "実行結果：" + res;
    }

    @GetMapping("/divide/{val8}/{val9}")
    public String calcDivide(@PathVariable int val8, @PathVariable int val9) {
        int res = 0;
        res = val8 / val9;
        return "実行結果：" + res;
    }

}
