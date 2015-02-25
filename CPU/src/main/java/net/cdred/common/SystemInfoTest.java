/**
 * 
 */
package net.cdred.common;

/**
 * @author Vanlin
 *
 */
public class SystemInfoTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
//		System.loadLibrary("SystemInfo");
		System.loadLibrary("Project2");
		
		SystemInfo systemInfo = new SystemInfo();
		
		System.out.println("CPUID:" + systemInfo.getCPUID());
		System.out.println("HDID:" + systemInfo.getHDID());
		System.out.println("HDNAME:" + systemInfo.getHDNAME());
		System.out.println("NETMAC:" + systemInfo.getNETMAC());
		System.out.println("BIOSID:" + systemInfo.getBIOSID());
	}

}
