package com.abstractfactory.properties;

import com.abstracfactory.interfaces.Cam;

public class KursunGecirmezCam implements Cam{
	@Override
	public void CamUret() {
		System.out.println("Kur�un ge�irmez cam �retildi! ");	
	}
}
