
import net.sf.jasperreports.engine.JRDefaultScriptlet;
import net.sf.jasperreports.engine.JRScriptletException;

import java.text.SimpleDateFormat;
import java.util.Date;

public class parseParam extends JRDefaultScriptlet{
	
	String timeStamp = new SimpleDateFormat("MM.dd.yyyy.HH.mm.ss").format(new Date());
	Integer valueFromParam = 0;

	
	public void afterReportInit() throws JRScriptletException
	{
		valueFromParam = (Integer) this.getParameterValue("orderID");
	}

    public String Info() throws JRScriptletException
    {
        String info = timeStamp + " Order ID: "+ valueFromParam;
        
        return info;
    }	
	

}
