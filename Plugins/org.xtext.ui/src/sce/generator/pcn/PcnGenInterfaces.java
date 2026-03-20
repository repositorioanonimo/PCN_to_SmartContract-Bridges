package sce.generator.pcn;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

public class PcnGenInterfaces {
	/** 
	 *	Interface to warn when resource is not found in the file
	 */	 
    public void noFileWarningMessage() {
        JOptionPane optionPane = new JOptionPane(
    			"Error generating PCN model.\n"+
        		"This file doesn't contain a valid smart contract.", 	    	       
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                UIManager.getIcon("OptionPane.warningIcon")
        );	
        
        JDialog dialog = optionPane.createDialog("Error");
        
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/PcnModelFile.gif"));
    	dialog.setIconImage(icon.getImage());
    	
    	dialog.setVisible(true);
    }
}