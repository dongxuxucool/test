/**
 * 
 */
package net.cdred.common;

/**
 * @author Vanlin
 *
 */
public class SystemInfo {
	public native String getCPUID();	// cpu id
	public native String getNETMAC();	// net mac
	public native String getHDID();	// HD id
	public native String getHDNAME();	// HD name
	public native String getBIOSID();	// BIOS ID
}
