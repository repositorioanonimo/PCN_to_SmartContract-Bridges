package pcn.generator.sce;

import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.SwingConstants;
import org.eclipse.emf.common.util.EList;
import pcn.PCNProcessEntity;
import pcn.PCNProcessStepWithTags;
import pcn.PCNWaitStep;

public class SceGenInterfaces {
	/** 
	 *	Interface to warn when resource is not found in the file
	 */	 
    public void noResourceWarningMessage() {
        JOptionPane optionPane = new JOptionPane(
    			"Error generating smart contract.\n"
    			+ "This file doesnt't contain a valid PCN model", 	    	       
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                UIManager.getIcon("OptionPane.warningIcon")
        );	
        
        JDialog dialog = optionPane.createDialog("Error");
        
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
    	dialog.setIconImage(icon.getImage());
    	
    	dialog.setVisible(true);
    }
    
	/** 
	 *	Interface to warn when Reference elements are detected in the PCN diagram
	 */	 
    public void referenceWarningMessage() {
        JOptionPane optionPane = new JOptionPane(
    			"References has been found in the diagram.\n"+
	            "Due to incompatibility, the generation will not continue.\n" +
	            "Replace the References with Dependencies and try again.", 	    	       
                JOptionPane.WARNING_MESSAGE,
                JOptionPane.DEFAULT_OPTION,
                UIManager.getIcon("OptionPane.warningIcon")
        );	
        
        JDialog dialog = optionPane.createDialog("Warning about References");
        
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
    	dialog.setIconImage(icon.getImage());
    	
    	dialog.setVisible(true);
    }
    
	/** 
	 *	Interface to introduce the addresses of the entities
	 *	@param entities is the list of entities
	 *	@return the list of addresses introduced
	 */	 
    public ArrayList<String> askEntityAddresses(EList<PCNProcessEntity> entities) {
        JFrame frame = new JFrame("Entity address");
        frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        frame.setLocationRelativeTo(null);

        ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
        frame.setIconImage(icon.getImage());

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        JLabel text = new JLabel("Introduce the address of the Entities:");
        panel.add(text);

        ArrayList<JTextField> textFields = new ArrayList<>();
        ArrayList<JLabel> errorLabels = new ArrayList<>();
        ArrayList<String> addresses = new ArrayList<>();

        for (PCNProcessEntity entity : entities) {
            JLabel label = new JLabel("Entity " + entity.getOrder() + ": " + entity.getName());
            panel.add(label);

            JTextField textField = new JTextField(25);
            textFields.add(textField);
            panel.add(textField);

            JLabel errorLabel = new JLabel();
            errorLabel.setForeground(Color.RED);
            errorLabel.setVisible(false);
            errorLabels.add(errorLabel);
            panel.add(errorLabel);
        }

        JButton submitButton = new JButton("Accept");
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Pattern pattern = Pattern.compile("0x[0-9a-fA-F]{40}");
                boolean allValid = true;
                int i = 0;
                for (JTextField textField : textFields) {
                    String address = textField.getText();
                    JLabel errorLabel = errorLabels.get(i);
                    if (!pattern.matcher(address).matches()) {
                        textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                        errorLabel.setText("Invalid address.");
                        errorLabel.setVisible(true);
                        allValid = false;
                    } else {
                        textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                        errorLabel.setVisible(false);
                        addresses.add(address);
                    }
                    i++;
                }
                frame.pack();
                if (allValid) {
                    frame.dispose();
                } else {
                    addresses.clear();
                }
            }
        });
        panel.add(submitButton);

        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new BoxLayout(toolBar, BoxLayout.X_AXIS));
        toolBar.add(Box.createHorizontalGlue());
        toolBar.setFloatable(false);

        JButton helpButton = new JButton("?");
        helpButton.setFocusable(false);
        helpButton.setPreferredSize(new Dimension(40, 25));
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "A valid address follows the format '0x' followed by 40 hexadecimal characters.\n"
                        + "Example of valid address: 0xcd2a3d9f938e13cd947ec05abc7fe734df8dd826",
                        "Help",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        toolBar.add(helpButton);      
        
        frame.addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		int response = JOptionPane.showConfirmDialog(frame,
        			"Are you sure you want to exit?\nAll addresses will be setted with default value (0x0...0).",
        			"Confirm exit", 
        			JOptionPane.YES_NO_OPTION);
        		if (response == JOptionPane.YES_OPTION) {
        			addresses.clear();	
        			for (@SuppressWarnings("unused") PCNProcessEntity entity : entities) {
        				addresses.add("0x0000000000000000000000000000000000000000");
        			}
        			frame.dispose();
        		} 
        	}
        	
        });
        
        frame.setLayout(new BorderLayout());
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setResizable(false);;
        frame.setVisible(true);

        while (frame.isDisplayable()) {}

        return addresses;
    }
    
	/** 
	 *	Interface to introduce the delay time of a Delayed Dependency
	 *	@param source is the source step of the Delayed Dependency
	 *	@param target is the target step of the Delayed Dependency
	 *	@return the delay time introduced
	 */	 
    public int askDependencyDelay(PCNProcessStepWithTags source, PCNProcessStepWithTags target) {
    	String stepImgPath1 = "";
		switch (source.eClass().getName()) {
			case "PCNStandardStep": {
				stepImgPath1 = "/images/SolidityGenerator/Standard.png";
				break;
			}
			case "PCNDoAndWaitStep": {
				stepImgPath1 = "/images/SolidityGenerator/DoAndWait.png";
				break;
			}
			case "PCNInnovationStep": {
				stepImgPath1 = "/images/SolidityGenerator/Innovation.png";	
				break;
			}
			case "PCNOutsourcedStep": {
				stepImgPath1 = "/images/SolidityGenerator/Outsourced.png";
				break;
			}	
			case "PCNWaitStep": {
				stepImgPath1 = "/images/SolidityGenerator/Wait.png";
				break;
			}
			case "PCNDecisionStep": {				
				stepImgPath1 = "/images/SolidityGenerator/Decision.png";
				break;
			}
		}
		
    	String stepImgPath2 = "";
		switch (target.eClass().getName()) {
			case "PCNStandardStep": {
				stepImgPath2 = "/images/SolidityGenerator/Standard.png";
				break;
			}
			case "PCNDoAndWaitStep": {
				stepImgPath2 = "/images/SolidityGenerator/DoAndWait.png";
				break;
			}
			case "PCNInnovationStep": {
				stepImgPath2 = "/images/SolidityGenerator/Innovation.png";
				break;
			}
			case "PCNOutsourcedStep": {
				stepImgPath2 = "/images/SolidityGenerator/Outsourced.png";
				break;
			}	
			case "PCNWaitStep": {
				stepImgPath2 = "/images/SolidityGenerator/Wait.png";	
				break;
			}
			case "PCNDecisionStep": {				
				stepImgPath2 = "/images/SolidityGenerator/Decision.png";
				break;
			}
		}		
    	
    	JFrame frame = new JFrame("Delayed Dependency");
    	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
    	frame.setIconImage(icon.getImage());
        	
    	JPanel panel = new JPanel();
    	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      	 	   	
      	JPanel stepsPanel = new JPanel();
      	stepsPanel.setLayout(new BoxLayout(stepsPanel, BoxLayout.X_AXIS));
      	stepsPanel.setAlignmentX(Component.LEFT_ALIGNMENT); 
      	
      	JPanel step1Panel = new JPanel();
      	step1Panel.setLayout(new BoxLayout(step1Panel, BoxLayout.Y_AXIS));
      	step1Panel.setAlignmentX(Component.LEFT_ALIGNMENT);
      	
      	JPanel step2Panel = new JPanel();
      	step2Panel.setLayout(new BoxLayout(step2Panel, BoxLayout.Y_AXIS));
      	step2Panel.setAlignmentX(Component.LEFT_ALIGNMENT);   	
      	
      	PCNProcessEntity entity1 = (PCNProcessEntity) source.eContainer();
    	JLabel entityLabel1 = new JLabel("Entity " + entity1.getOrder() + ": " + entity1.getName());
    	entityLabel1.setHorizontalTextPosition(SwingConstants.CENTER);
		entityLabel1.setHorizontalAlignment(SwingConstants.CENTER);
		entityLabel1.setAlignmentX(Component.LEFT_ALIGNMENT);  
		
     	Image img1 = new ImageIcon(getClass().getResource(stepImgPath1)).getImage();
        String action1 = source.getAction();
    	@SuppressWarnings("serial")
		JPanel stepImg1 = new JPanel() {
    		@Override
        	public Dimension getPreferredSize() {
            	return new Dimension(img1.getWidth(null), img1.getHeight(null));
        	}

    		@Override
        	public void paintComponent(Graphics g) {
            	super.paintComponent(g);
            	int width = img1.getWidth(null);
            	int height = img1.getHeight(null);
            	g.drawImage(img1, 0, 0, null);
            	
            	Font smallFont = new Font("Arial", Font.PLAIN, 10);
                g.setFont(smallFont);

            	FontMetrics metrics = g.getFontMetrics();
            	int textX = (width - metrics.stringWidth(action1)) / 2;
            	int textY = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
           	 	g.drawString(action1, textX, textY);
        	}	
    	};	
    	stepImg1.setAlignmentX(Component.LEFT_ALIGNMENT);
    	step1Panel.add(entityLabel1);
    	step1Panel.add(stepImg1);
    	stepsPanel.add(step1Panel);	
    	
    	ImageIcon imgDependency = new ImageIcon(getClass().getResource("/images/SolidityGenerator/DelayedDependency.png"));
		JLabel dependencyImg = new JLabel();
		dependencyImg.setIcon(imgDependency);
		dependencyImg.setAlignmentX(Component.LEFT_ALIGNMENT);
		stepsPanel.add(dependencyImg);
    	
		PCNProcessEntity entity2 = (PCNProcessEntity) target.eContainer();
    	JLabel entityLabel2 = new JLabel("Entity " + entity2.getOrder() + ": "+entity2.getName());
    	entityLabel2.setHorizontalTextPosition(SwingConstants.CENTER);
		entityLabel2.setHorizontalAlignment(SwingConstants.CENTER);
		entityLabel2.setAlignmentX(Component.LEFT_ALIGNMENT);    	    		
		
     	Image img2 = new ImageIcon(getClass().getResource(stepImgPath2)).getImage();
        String action2 = target.getAction();
    	@SuppressWarnings("serial")
		JPanel stepImg2 = new JPanel() {
        	@Override 
        	public Dimension getPreferredSize() {
            	return new Dimension(img2.getWidth(null), img2.getHeight(null));
        	}

        	@Override 
        	public void paintComponent(Graphics g) {
            	super.paintComponent(g);
            	int width = img2.getWidth(null);
            	int height = img2.getHeight(null);
            	g.drawImage(img2, 0, 0, null);
            	
            	Font smallFont = new Font("Arial", Font.PLAIN, 10);
                g.setFont(smallFont);

                FontMetrics metrics = g.getFontMetrics();
            	int textX = (width - metrics.stringWidth(action2)) / 2;
            	int textY = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
           	 	g.drawString(action2, textX, textY);
        	}	
    	};	
    	stepImg2.setAlignmentX(Component.LEFT_ALIGNMENT);
    	step2Panel.add(entityLabel2);
    	step2Panel.add(stepImg2);	    		
		stepsPanel.add(step2Panel);
			
		panel.add(stepsPanel);		   	
				
		JLabel text = new JLabel("Introduce the waiting time for this dependency (in secs):");
		text.setAlignmentX(Component.LEFT_ALIGNMENT);
    	panel.add(text);
    	
    	JTextField textField = new JTextField(10);
    	textField.setAlignmentX(Component.LEFT_ALIGNMENT);
		panel.add(textField);
			
		JLabel errorLabel = new JLabel();			
		errorLabel.setForeground(Color.RED);
		errorLabel.setAlignmentX(Component.LEFT_ALIGNMENT);
        errorLabel.setVisible(false);                    
		panel.add(errorLabel);
		
		ArrayList<String> delayTime = new ArrayList<String>();

		JButton submitButton = new JButton("Accept");	
		submitButton.setAlignmentX(Component.LEFT_ALIGNMENT);	
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Pattern pattern = Pattern.compile("^\\d+$");
				String time = textField.getText();				
				if (!pattern.matcher(time).matches()) {
					textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                       errorLabel.setText("Invalid time.");
                       errorLabel.setVisible(true); 
                       frame.pack();    
				} else {
					textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                    errorLabel.setVisible(false);
					delayTime.add(time);
					frame.dispose();	
				}							
			}
		});
		panel.add(submitButton);	
		
        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new BoxLayout(toolBar, BoxLayout.X_AXIS));
        toolBar.add(Box.createHorizontalGlue());
        toolBar.setFloatable(false);

        JButton helpButton = new JButton("?");
        helpButton.setFocusable(false);
        helpButton.setPreferredSize(new Dimension(40, 25));
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "A valid time is just an integer considered as seconds.\n"
                        + "Example for 5 min time (300 s): 300",
                        "Help",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        toolBar.add(helpButton);
    	
        frame.addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		int response = JOptionPane.showConfirmDialog(frame,
        			"Are you sure you want to exit?\nThe waiting time will be setted with default value (10 secs).",
        			"Confirm exit", 
        			JOptionPane.YES_NO_OPTION);
        		if (response == JOptionPane.YES_OPTION) { 
        			delayTime.clear();      			      			
        			delayTime.add("10");    			
        			frame.dispose();
        		} 
        	}      	
        });   
        
        frame.setLayout(new BorderLayout());
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
		
		while(frame.isDisplayable()) {}
    	
    	return (int)Integer.parseInt(delayTime.get(0));
    }

	/** 
	 *	Interface to introduce the waiting time of a Wait step or DoAndWait step
	 *	@param step is the Wait step or DoAndWait step that performs the wait
	 *	@return the waiting time introduced
	 */	 
    public int askWaitingTime(PCNProcessStepWithTags step) {    	
    	JFrame frame = new JFrame("Wait Step");
    	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
    	frame.setIconImage(icon.getImage());
        	
    	JPanel panel = new JPanel();
    	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
      	 	   	
      	JPanel stepPanel = new JPanel();
      	stepPanel.setLayout(new BoxLayout(stepPanel, BoxLayout.Y_AXIS));     	
      	
      	PCNProcessEntity entity = (PCNProcessEntity) step.eContainer();
    	JLabel entityLabel = new JLabel("Entity " + entity.getOrder() + ": " + entity.getName());		
		
    	Image img;
    	if (step instanceof PCNWaitStep) {
    		img = new ImageIcon(getClass().getResource("/images/SolidityGenerator/Wait.png")).getImage();
    	}
    	else {
    		img = new ImageIcon(getClass().getResource("/images/SolidityGenerator/DoAndWait.png")).getImage();
    	}
        String action = step.getAction();
        @SuppressWarnings("serial")
		JPanel stepImg = new JPanel() {
        	@Override 
        	public Dimension getPreferredSize() {
            	return new Dimension(img.getWidth(null), img.getHeight(null));
        	}

    		@Override 
        	public void paintComponent(Graphics g) {
            	super.paintComponent(g);
            	int width = img .getWidth(null);
            	int height = img .getHeight(null);
            	g.drawImage(img , 0, 0, null);
            	
            	Font smallFont = new Font("Arial", Font.PLAIN, 10);
                g.setFont(smallFont);

            	FontMetrics metrics = g.getFontMetrics();
            	int textX = (width - metrics.stringWidth(action)) / 2;
            	int textY = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
           	 	g.drawString(action, textX, textY);
        	}	
    	};	
    	stepPanel.add(entityLabel);
    	stepPanel.add(stepImg);	    		
		panel.add(stepPanel);    	
		
		if (step.getDelayTimeTags() != null) {
			JLabel tagText = new JLabel("Delay Time Tag found: "+ step.getDelayTimeTags().getDelayTime() + ". Consider use it. ");
			tagText.setForeground(Color.decode("#FFA500"));
    		panel.add(tagText);	
		}
		
		JLabel text = new JLabel("Introduce the waiting time for this step (in secs):");
    	panel.add(text);
    	
    	JTextField textField = new JTextField(10);
		panel.add(textField);
			
		JLabel errorLabel = new JLabel();			
		errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false);                   
		panel.add(errorLabel);
		
		ArrayList<String> delayTime = new ArrayList<String>();

		JButton submitButton = new JButton("Accept");		
		submitButton.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Pattern pattern = Pattern.compile("^\\d+$");
				String time = textField.getText();				
				if (!pattern.matcher(time).matches()) {
					textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                       errorLabel.setText("Invalid time.");
                       errorLabel.setVisible(true); 
                       frame.pack();    
				} else {
					textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                    errorLabel.setVisible(false);
					delayTime.add(time);
					frame.dispose();	
				}							
			}
		});
		panel.add(submitButton);	
		
        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new BoxLayout(toolBar, BoxLayout.X_AXIS));
        toolBar.add(Box.createHorizontalGlue());
        toolBar.setFloatable(false);

        JButton helpButton = new JButton("?");
        helpButton.setFocusable(false);
        helpButton.setPreferredSize(new Dimension(40, 25));
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "A valid time is just an integer considered as seconds.\n"
                        + "Example for 5 min time (300 s): 300",
                        "Help",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        toolBar.add(helpButton);
    	
        frame.addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		int response = JOptionPane.showConfirmDialog(frame,
        			"Are you sure you want to exit?\nThe waiting time will be setted with default value (10 secs).",
        			"Confirm exit", 
        			JOptionPane.YES_NO_OPTION);
        		if (response == JOptionPane.YES_OPTION) { 
        			delayTime.clear();      			      			
        			delayTime.add("10");     			
        			frame.dispose();
        		} 
        	}      	
        });  
        
        frame.setLayout(new BorderLayout());
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
		
		while(frame.isDisplayable()) {}    	

    	return (int)Integer.parseInt(delayTime.get(0));
    }

	/** 
	 *	Interface to introduce the outsource address in a Ousourced step
	 *	@param step is the step performed by the outsource
	 *	@return the outsource address
	 */	
    public String askOutsourceAddress(PCNProcessStepWithTags step) { 
    	JFrame frame = new JFrame("Outsourced Step");
    	frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
    	frame.setLocationRelativeTo(null);
    	
    	ImageIcon icon = new ImageIcon(getClass().getResource("/images/SolidityGenerator/solidity.png"));
    	frame.setIconImage(icon.getImage());
        	
    	JPanel panel = new JPanel();
    	panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    	
    	JPanel stepPanel = new JPanel();
      	stepPanel.setLayout(new BoxLayout(stepPanel, BoxLayout.Y_AXIS));
      	
      	PCNProcessEntity entity = (PCNProcessEntity) step.eContainer();
    	JLabel entityLabel = new JLabel("Entity " + entity.getOrder() + ": " + entity.getName());
		
     	Image img = new ImageIcon(getClass().getResource("/images/SolidityGenerator/Outsourced.png")).getImage();
        String action = step.getAction();
        @SuppressWarnings("serial")
    	JPanel stepImg = new JPanel() {
        	@Override 
        	public Dimension getPreferredSize() {
            	return new Dimension(img.getWidth(null), img.getHeight(null));
        	}

    		@Override
        	public void paintComponent(Graphics g) {
            	super.paintComponent(g);
            	int width = img .getWidth(null);
            	int height = img .getHeight(null);
            	g.drawImage(img , 0, 0, null);
            	
            	Font smallFont = new Font("Arial", Font.PLAIN, 10);
                g.setFont(smallFont);

            	FontMetrics metrics = g.getFontMetrics();
            	int textX = (width - metrics.stringWidth(action)) / 2;
            	int textY = ((height - metrics.getHeight()) / 2) + metrics.getAscent();
           	 	g.drawString(action, textX, textY);
        	}	
    	};	
    	stepPanel.add(entityLabel);
    	stepPanel.add(stepImg);	    		
		panel.add(stepPanel);
		
		JLabel intro = new JLabel("Introduce the Outsource address:");
    	panel.add(intro);
    	
    	JTextField textField = new JTextField(25);
		panel.add(textField);
			
		JLabel errorLabel = new JLabel();			
		errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false);                    
		panel.add(errorLabel);
		
		ArrayList<String> outsourceAddress = new ArrayList<String>();

		JButton submitButton = new JButton("Accept");		
		submitButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Pattern pattern = Pattern.compile("0x[0-9a-fA-F]{40}");
				String address = textField.getText();					
				if (!pattern.matcher(address).matches()) {
					textField.setBorder(BorderFactory.createLineBorder(Color.RED));
                       errorLabel.setText("Invalid address");
                       errorLabel.setVisible(true); 
                       frame.pack();    
				} else {
					textField.setBorder(BorderFactory.createLineBorder(Color.GRAY));
                    errorLabel.setVisible(false);
                    outsourceAddress.add(address);
					frame.dispose();						
				}				
			}
		});
		panel.add(submitButton);	
		
        JToolBar toolBar = new JToolBar();
        toolBar.setLayout(new BoxLayout(toolBar, BoxLayout.X_AXIS));
        toolBar.add(Box.createHorizontalGlue());
        toolBar.setFloatable(false);

        JButton helpButton = new JButton("?");
        helpButton.setFocusable(false);
        helpButton.setPreferredSize(new Dimension(40, 25));
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(
                        frame,
                        "A valid address follows the format '0x' followed by 40 hexadecimal characters.\n"
                        + "Example of valid address: 0xcd2a3d9f938e13cd947ec05abc7fe734df8dd826",
                        "Help",
                        JOptionPane.INFORMATION_MESSAGE
                );
            }
        });
        toolBar.add(helpButton);
    	
        frame.addWindowListener(new WindowAdapter() {
        	@Override
        	public void windowClosing(WindowEvent e) {
        		int response = JOptionPane.showConfirmDialog(frame,
        			"Are you sure you want to exit?\nThe address will be setted with default value (0x0...0).",
        			"Confirm exit", 
        			JOptionPane.YES_NO_OPTION);
        		if (response == JOptionPane.YES_OPTION) {       			      			
        			outsourceAddress.add("0x0000000000000000000000000000000000000000");     			
        			frame.dispose();
        		} 
        	}
        	
        }); 
        
        frame.setLayout(new BorderLayout());
        frame.add(toolBar, BorderLayout.NORTH);
        frame.add(panel, BorderLayout.CENTER);

        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
		
		while(frame.isDisplayable()) {}    	
	
    	return outsourceAddress.get(0);
    }
}