/*  -------------------------------------------------------
 *  onlineBashScripts.java
 *  -------------------------------------------------------
 *  Author:  Matthew Ferlaino
 *  Email:   composite.computing@gmail.com
 *  Date:	 Oct 9, 2018
 *  ------------------------------------------------------- */

// Imports
import java.io.*;

public class onlineBashScripts extends bashScripts {
	public static void writeCCleanerBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install C-Cleaner");
		out.newLine();
		out.append("echo \"Installing C-Cleaner...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/4.CCleaner.dmg\" -mountpoint \"/Volumes/CCleaner\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/CCleaner/CCleaner.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/CCleaner\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done C-Cleaner installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeChromeBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Google Chrome");
		out.newLine();
		out.append("echo \"Installing Google Chrome Browser...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/16.GoogleChrome.dmg\" -mountpoint \"/Volumes/GoogleChrome\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/GoogleChrome/Google Chrome.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/GoogleChrome\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Google Chrome installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeEclipseBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Eclipse IDE");
		out.newLine();
		out.append("echo \"Installing Eclipse IDE...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/5.Eclipse.dmg\" -mountpoint \"/Volumes/Eclipse\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Eclipse/Eclipse.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Eclipse\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Eclipse IDE installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeFirefoxBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Firefox Browser");
		out.newLine();
		out.append("echo \"Installing Firefox Browser...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/6.Firefox.dmg\" -mountpoint \"/Volumes/Firefox\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Firefox/Firefox.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Firefox\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Firefox installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeFrostwireBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Frostwire");
		out.newLine();
		out.append("echo \"Installing Frostwire...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/7.Frostwire-6.6.6.dmg\" -mountpoint \"/Volumes/Frostwire\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Frostwire/FrostWire.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Frostwire\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Frostwire installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeMalwarebytesBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Malwarebytes");
		out.newLine();
		out.append("echo \"Installing Malwarebytes...\"");
		out.newLine();
		out.append("sudo -S installer -pkg \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/12.Malwarebytes.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Malwarebytes installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeGoogleEarthBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Google Earth");
		out.newLine();
		out.append("echo \"Installing Google Earth...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/8.GoogleEarth.dmg\" -mountpoint \"/Volumes/GoogleEarth\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo installer -package \"/Volumes/GoogleEarth/Install Google Earth Pro 7.3.1.4507.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/GoogleEarth\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Google Earth installaion...");
		out.newLine();
		out.newLine();
		out.close();	
	}
	public static void writeadobeFlashBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Adobe Flash");
		out.newLine();
		out.append("echo \"Installing Adobe Flash Player...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/9.Adobe Flash.dmg\" -mountpoint \"/Volumes/AdobeFlash\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/AdobeFlash/Install Adobe Pepper Flash Player.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/AdobeFlash\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Adobe Flash installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeadobeReaderBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Adobe Reader");
		out.newLine();
		out.append("echo \"Installing Adobe Acrobat Reader...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/2.Adobe Acrobat.dmg\" -mountpoint \"/Volumes/AdobeAcrobat\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo installer -package /Volumes/AdobeAcrobat/AcroRdrDC_1800920044_MUI.pkg -target / > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/AdobeAcrobat\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Adobe Reader installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}	
	public static void writeTorBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Tor");
		out.newLine();
		out.append("echo \"Installing Tor...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/14.Tor.dmg\" -mountpoint \"/Volumes/Tor\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Tor/Tor Browser.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Tor\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Tor installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writePythonBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Python");
		out.newLine();
		out.append("echo \"Installing Python Language Library...\"");
		out.newLine();
		out.append("sudo -S installer -pkg \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/13.Python.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Python installaion...");
		out.newLine();
		out.newLine();
		out.close();	
	}
	public static void writeVLCBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install VLC Media Player");
		out.newLine();
		out.append("echo \"Installing VLC Media Player...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/15.VLC.dmg\" -mountpoint \"/Volumes/VLC\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/VLC/VLC.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/VLC\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done VLC installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writekomodoEditBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Komodo Edit");
		out.newLine();
		out.append("echo \"Installing Komodo Edit...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/11.Komodo.dmg\" -mountpoint \"/Volumes/Komodo\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Komodo/Komodo Edit 11.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Komodo\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Komodo Edit installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writebitdefenderBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Bitdefender Antivirus");
		out.newLine();
		out.append("echo \"Installing Bitdefender Antivirus...\"");
		out.newLine();
		out.append("sudo -S installer -pkg \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/3.Bitdefender.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Bitdefender installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	public static void writeipVanishBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install IPVanish VPN");
		out.newLine();
		out.append("echo \"Installing IPVanish VPN...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/10.IPVanish.dmg\" -mountpoint \"/Volumes/IPVanish\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/IPVanish/IPVanish VPN.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/IPVanish\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done IPVanish VPN installaion...");
		out.newLine();
		out.newLine();
		out.close();
	}
	
    public static void writeSilverlightBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Silverlight");
		out.newLine();
		out.append("echo \"Installing Microsoft Silverlight...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/19.Silverlight.dmg\" -mountpoint \"/Volumes/Silverlight\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo -S installer -pkg \"/Volumes/Silverlight/silverlight.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Silverlight\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Microsoft Silverlight installaion...");
		out.newLine();
		out.newLine();
		out.close();
    }
    
    public static void writeVNCBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Tight VNC Viewer/Server");
		out.newLine();
		out.append("echo \"Installing TightVNC...\"");
		out.newLine();
		out.append("sudo -S installer -pkg \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/22.VNCServer.pkg\" -target / > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/13.VNCViewer.dmg\" -mountpoint \"/Volumes/VNC\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/VNC/VNC Viewer.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/VNC\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done TightVNC Viewer/Server Installation...");
		out.newLine();
		out.newLine();
		out.close();
    }
    
    public static void writeAtomBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Atom ");
		out.newLine();
		out.append("echo \"Installing Atom...\"");
		out.newLine();
		out.append("sudo cp -Rlp \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/24.Atom.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Atom Installation...");
		out.newLine();
		out.newLine();
		out.close();
    }
    
    public static void writeSublimeBashOnline(String path) throws FileNotFoundException, IOException {
		BufferedWriter out = new BufferedWriter(new FileWriter(path, true));
		out.append("# Install Sublime");
		out.newLine();
		out.append("echo \"Installing Sublime...\"");
		out.newLine();
		out.append("sudo hdiutil attach -quiet \"$( cd \"$( dirname \"${BASH_SOURCE[0]}\" )\" && pwd )/MInstallers/25.Sublime.dmg\" -mountpoint \"/Volumes/Subl\" > /dev/null 2>&1");
		out.newLine();
		out.append("sudo cp -RLp \"/Volumes/Subl/Sublime Text.app\" /Applications > /dev/null 2>&1");
		out.newLine();
		out.append("sudo hdiutil detach -quiet \"/Volumes/Subl\" > /dev/null 2>&1");
		out.newLine();
		out.append("echo Done Sublime Installation...");
		out.newLine();
		out.newLine();
		out.close();
    }
}
