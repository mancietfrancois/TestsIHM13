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

	private JButton cancel, ok, apply;
	private static final String CANCEL_LABEL = "Annuler";
	private static final String APPLY_LABEL = "Appliquer";
	private static final String OK_LABEL = "OK";
	private static final int DEFAULT_WIDTH = 400;
	private static final int DEFAULT_HEIGHT = 400;
	private static final int DEFAULT_CHAR_SIZE_BUTTON = 12;
	private static final int DEFAULT_CHAR_SIZE_TITLE = 12;
	private enum ComponentType {
		BUTTON, LABEL
	};

	public AbstractSpecificPanel(String title) {
		super();
		this.setLayout(new BorderLayout());

		add(prepareComponent(title, ComponentType.LABEL, DEFAULT_CHAR_SIZE_TITLE),
				BorderLayout.PAGE_START);
		JPanel controlPanel = new JPanel(
				new FlowLayout(FlowLayout.RIGHT, 5, 25));
		controlPanel.add(new CustomCheckBox());
		controlPanel.add(new JCheckBox());
		controlPanel.add(new CustomRadioButton());
		controlPanel.add(prepareComponent(OK_LABEL, ComponentType.BUTTON, DEFAULT_CHAR_SIZE_BUTTON));
		controlPanel.add(prepareComponent(CANCEL_LABEL, ComponentType.BUTTON, DEFAULT_CHAR_SIZE_BUTTON));
		controlPanel.add(prepareComponent(APPLY_LABEL, ComponentType.BUTTON, DEFAULT_CHAR_SIZE_BUTTON));
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

	protected JComponent prepareComponent(String text, ComponentType mode, int size) {
		JComponent jComponent = null;
		switch (mode) {
		case BUTTON:
			jComponent = new JButton(text);
			break;
		case LABEL:
			jComponent = new JLabel(text);

			break;
		default:
			break;
		}
//		jComponent.setFont(new Font("Myriad Pro", Font.PLAIN, size));
		return jComponent;

	}

}
