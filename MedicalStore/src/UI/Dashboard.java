package UI;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Insets;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class Dashboard extends JPanel {
	
	private static final long serialVersionUID = 1L;

	JLabel lbHeading,lbDescription;
	
	JPanel headingPanel, descriptionPanel;
	
	Frame parentFrame;
	Dashboard(Frame parentFrame){
		this.parentFrame = parentFrame;
		this.setLayout(new BorderLayout());
		
		// Create a dash board
		lbHeading = new JLabel("Welcome to VIIT MEDICAL");
		lbHeading.setFont(new Font("Arial", Font.BOLD, 30));
		lbHeading.setBorder(new EmptyBorder(new Insets(40, 0, 20, 0)));
		lbHeading.setForeground(Color.WHITE);
		JPanel temp = new JPanel();
		temp.add(lbHeading);
		
		// Create a temporary panel with FlowLayout to center the label
        JPanel temp1 = new JPanel();
        temp1.setBackground(new Color(0, 102, 204)); // Set background color
        temp1.add(lbHeading);

        this.add(temp1, BorderLayout.CENTER);
		
		JPanel headingPanel = new JPanel(new BorderLayout());
        headingPanel.add(lbHeading, BorderLayout.CENTER);
        headingPanel.setBackground(new Color(0, 102, 204)); // Set background color
        this.add(headingPanel, BorderLayout.NORTH);
		headingPanel = new JPanel(new BorderLayout());
		headingPanel.add(temp1, BorderLayout.CENTER);
		this.add(headingPanel, BorderLayout.CENTER);
		
		lbDescription = new JLabel("<html>"
                + "<p style='font-size:16px;'>This comprehensive Medical Store Management System empowers you to efficiently handle various aspects of your medical inventory and store operations.</p>"
                + "<br>"
                + "<p style='font-size:14px;'>Key Features:</p>"
                + "<ul style='font-size:14px;'>"
                + "<li><strong>Inventory Management:</strong> Keep track of medicines, stock levels, and expiration dates.</li>"
                + "<li><strong>Supplier Information:</strong> Easily manage and update supplier details.</li>"
                + "<li><strong>Transaction Tracking:</strong> Monitor sales, purchases, and returns in real-time.</li>"
                + "<li><strong>Reporting and Analytics:</strong> Generate insightful reports for better decision-making.</li>"
                + "<li><strong>User-Friendly Interface:</strong> Intuitive design for a seamless user experience.</li>"
                + "</ul>"
                + "<br>"
                + "<p style='font-size:16px;'>Get started by exploring the menu on the top. If you have any questions, refer to the documentation or contact our support team.</p>"
                + "<br>"
                + "<p style='font-size:14px;'><strong>Contact Information:</strong></p>"
                + "<ul style='font-size:14px;'>"
                + "<li>Email: info@medicalstoremanagement.com</li>"
                + "<li>Phone: (+91) 1234567890 </li>"
                + "</ul>"
                + "</html>");
        lbDescription.setFont(new Font("Arial", Font.PLAIN, 16));
        lbDescription.setBorder(new EmptyBorder(new Insets(20, 20, 20, 20)));
        descriptionPanel = new JPanel(new BorderLayout());
        descriptionPanel.add(lbDescription, BorderLayout.CENTER);
        descriptionPanel.setBackground(Color.WHITE);
        this.add(descriptionPanel, BorderLayout.CENTER);
	}
	
}
