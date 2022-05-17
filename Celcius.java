
package conversisuhu;

/**
 *
 * @author Dwi Lestari
 */
public class Celcius {
    double toFarenheit(){
        // F = (C x 1.8)+32 
        return (ConversiSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
     //Ré = C × 0,8
    return (ConversiSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
     //K = C + 273,15
    return (ConversiSuhu.SuhuAwal+273.15);
   }
    
}
