package listpane;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

import com.oms.bean.Book;
import com.oms.bean.Media;

import controller.ADataPageController;
import controller.UserMediaPageController;
import singlepane.ADataSinglePane;

@SuppressWarnings("serial")
public class AdminMediaListPane extends ADataListPane<Media>{
	
	public AdminMediaListPane(ADataPageController<Media> controller) {
		this.controller = controller;
	}
	

	@Override
	public void decorateSinglePane(ADataSinglePane<Media> singlePane) {
		
		JButton button = new JButton("Edit");
		singlePane.addDataHandlingComponent(button);
		
		button.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				controller.createBookEditDialog((Book)singlePane.getData());
			}
		});
	}
}
