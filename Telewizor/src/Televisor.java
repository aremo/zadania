public class Televisor {

    boolean isOn = false;

        void turnOn()
    {
        isOn = true;
    }

    void turnOff()
    {
        isOn = false;
    }

    void displayStatus()
    {
        String showTelevisorStatus;
        if(isOn)
        {
            showTelevisorStatus= "on";
        }
        else{
            showTelevisorStatus= "off";
        }
        System.out.println("Televisor is "+showTelevisorStatus);
    }
}