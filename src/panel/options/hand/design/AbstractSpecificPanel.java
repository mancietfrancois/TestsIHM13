/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.options.hand.design;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

import utils.CustomCheckBox;
import utils.CustomRadioButton;

/**
 * 
 * @author villarda
 */
public abstract class AbstractSpecificPanel extends JPanel {

	private static final String CANCEL_LABEL = "Annuler";
	private static final String APPLY_LABEL = "Appliquer";
	private static final String OK_LABEL = "OK";
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 400;
	private enum ComponentType {
		BUTTON, LABEL
	};

	public AbstractSpecificPanel(String title) {
		super();
		this.setLayout(new BorderLayout());

		add(new JLabel(title));
		JPanel controlPanel = new JPanel(
				new FlowLayout(FlowLayout.RIGHT, 5, 25));

		controlPanel.add(new JButton(OK_LABEL));
		controlPanel.add(new JButton(CANCEL_LABEL));
		controlPanel.add(new JButton(APPLY_LABEL));
		controlPanel.add(Box
				.createRigidArea(new Dimension(DEFAULT_WIDTH / 2, 0)));
		add(generateSpecificPanel(), BorderLayout.CENTER);

		add(controlPanel, BorderLayout.PAGE_END);

	}

	protected abstract JPanel generateSpecificPanel();

	@Override
	public Dimension getPreferredSize() {
		return new Dimension(DEFAULT_WIDTH, DEFAULT_HEIGHT);
	}

}
