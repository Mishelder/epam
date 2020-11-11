package edu.epam.seconds_06.service;

import edu.epam.seconds_06.entity.Second;
import edu.epam.seconds_06.entity.Time;

import java.util.Objects;

public class SecondService {

   public Time calculateTime(Second second){
       if(Objects.isNull(second))
           throw new NullPointerException("Second is null");

       long fullSec = second.getSecond();
       long hour = fullSec/3600;
       long minute = (fullSec-hour*3600)/60;
       long sec = (fullSec-(minute*60+hour*3600));

       return new Time(hour,minute,sec);
   }
}
