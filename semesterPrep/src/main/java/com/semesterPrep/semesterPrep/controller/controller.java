package com.semesterPrep.semesterPrep.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller 
public class controller {
    @GetMapping("/")
    public String home() {
        return "home";
    }
    @GetMapping("/btechfirstyear")
    public String btechfirst() {
        return "btechfirstyear";
    }
    @GetMapping("/btechsecondyear")
    public String btechsecond(){
        return "btechsecondyear";
    }
     @GetMapping("/btechthirdyear")
    public String btechthird(){
        return "btechthirdyear";
    }

      @GetMapping("/btechfourthyear")
    public String btechfourth(){
        return "btechfourthyear";
    }
      @GetMapping("/btechitfirstyear")
    public String btechitfirst(){
        return "btechitfirstyear";
    }

      @GetMapping("/btechitsecondyear")
    public String btechitsecond(){
        return "btechitsecondyear";
    }
    @GetMapping("/btechitthirdyear")
    public String btechitthird(){
        return "btechitthirdyear";
    }

      @GetMapping("/btechitfourthyear")
    public String btechitfourth(){
        return "btechitfourthyear";
    }

      @GetMapping("/ecefirstyear")
    public String btechecefirst(){
        return "ecefirstyear";
    }
      @GetMapping("/ecesecondyear")
    public String btechecesecond(){
        return "ecesecondyear";
    }

      @GetMapping("/ecethirdyear")
    public String btechecethird(){
        return "ecethirdyear";
    }
      @GetMapping("/ecefourthyear")
    public String btechecefourth(){
        return "ecefourthyear";
    }

       @GetMapping("/electricalfirstyear")
    public String eefirstyear(){
        return "electricalfirstyear";
    }
       @GetMapping("/electricalsecondyear")
    public String eesecondyear(){
        return "electricalsecondyear";
    }
       @GetMapping("/electricalthirdyear")
    public String eethirdyear(){
        return "electricalthirdyear";
    }

      @GetMapping("/electricalfourthyear")
    public String eefourthyear(){
        return "electricalfourthyear";
    }
    @GetMapping ("/btechfirstyearmath")
        public String firstyearmath(){
            return "btechfirstyearmath";
        }
         @GetMapping ("/btechfirstyearphy")
        public String firstyearphy(){
            return "btechfirstyearphy";
        }
         @GetMapping ("/btechfirstyearmath2")
        public String firstyearmath2(){
            return "btechfirstyearmath2";
        }
         @GetMapping ("/btechfirstyearelectrical")
        public String firstyearelectrical(){
            return "btechfirstyearelectrical";
        }
         @GetMapping ("/btechfirstyearchemistry")
        public String firstyearchemistry(){
            return "btechfirstyearchemistry";
        }
     @GetMapping ("/btechfirstyearcprogramming")
        public String firstyearcprogramming(){
            return "btechfirstyearcprogramming";
        }
       
         @GetMapping ("/btechfirstyearsoftskill")
        public String firstyearsoftskill(){
            return "btechfirstyearsoftskill";
        }
         @GetMapping ("/btechfirstyearevs")
        public String firstyearevs(){
            return "btechfirstyearevs";
        }
         @GetMapping ("/btechfirstyearmechanical")
        public String firstyearmechanical(){
            return "btechfirstyearmechanical";
        }
         @GetMapping ("/btechfirstyearelectronics")
        public String firstyearelectronics(){
            return "btechfirstyearelectronics";
        }
}
