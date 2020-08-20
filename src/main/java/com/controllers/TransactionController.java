package com.controllers;


import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api")
public class TransactionController {

//    @Autowired
//    private ProcReq procReq;

    /**
     *
     * @param jsonStr
     * {
     *   "msg": "Привет",
     *   "lng": "ru",
     *   "coordinates": {
     *     "latitude": "54.35",
     *     "longitude": "52.52"
     *   }
     * }
     *
     * @return
     * * Формта возвращаемого значения
     *   {
     *   "txt": "Привет",
     *   "createdDt": "2020-06-10T10:15:30Z",
     *   "currentTemp": "28"
     * }
     *
     * @throws JsonProcessingException
     */
    @RequestMapping(value = "/data", method = RequestMethod.POST, produces = "application/json")

    public String getResult(@RequestParam("jsonStr") String jsonStr)  {

        String res = null;
//        try {
//            res = procReq.procJson(jsonStr);
//        } catch (Exception e) {
//            res = e.getMessage();
//        }

        return "{\"result\" : \"" + res + "\"}";
    }


}


