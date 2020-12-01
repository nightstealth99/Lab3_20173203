package admin;

import javax.swing.JPanel;

import cart.CartController;
import controller.AdminBookPageController;
import controller.UserBookPageController;

public class OMSAdminController {
	private CartController cartController;
	
	public OMSAdminController() {
		cartController = new CartController();
	}
		
	public JPanel getBookPage() {
		AdminBookPageController controller = new AdminBookPageController();
		return controller.getDataPagePane();
	}
}
