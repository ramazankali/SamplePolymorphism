package vehicles;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class SampleRunnable {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException {
        Vehicle suv01=new SUV(
                VehicleType.SUV
                ,"Toyota"
                ,"Highlander"
                ,"1992"
                ,"FGH444555FDFD5555FD7"
                ,"FHDKHF4589523641255"
        );

        Class class01=suv01.getClass();
        Arrays
                .stream(class01.getMethods())
                .filter(method->method.getName().contains("get"))
                .forEach(method-> {
                            try {
                                 method.invoke(suv01);
                            } catch (Exception e) {
                                e.printStackTrace();
                            }

                        }
                    );
        System.out.println(suv01.toString());

        ;



    }
}
