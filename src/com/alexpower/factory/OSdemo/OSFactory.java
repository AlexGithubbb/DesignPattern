package com.alexpower.factory.OSdemo;

import com.alexpower.factory.OSdemo.os.Andriod;
import com.alexpower.factory.OSdemo.os.IOS;

public class OSFactory {
    public OSInterface getOSFactory(String secureOS) {
        if("secureOS".equals(secureOS)){
            return new IOS();
        }else if ("powerfulOS".equals(secureOS)){
            return new Andriod();
        }else {
            return null;
        }
    }
}
