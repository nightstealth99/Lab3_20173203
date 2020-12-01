package controller;

import java.util.List;
import java.util.Map;

import javax.swing.JDialog;

import com.oms.bean.Book;
import com.oms.bean.Media;

import api.MediaApi;
import cart.CartController;
import search.BookSearchPane;
import search.MediaSearchPane;
import singlepane.BookSinglePane;
import singlepane.MediaSinglePane;

public class UserBookPageController extends UserMediaPageController{
	public UserBookPageController() {
		super();
	}
	public UserBookPageController(CartController cartController) {
		super(cartController);
	}
	@Override
	public List<? extends Media> search(Map<String, String> searchParams) {
		return new MediaApi().getBooks(searchParams);
	}
	@Override
	public MediaSinglePane createSinglePane() {
		return new BookSinglePane();
	}
	@Override
	public MediaSearchPane createSearchPane() {
		return new BookSearchPane();
	}
	@Override
	public JDialog createBookEditDialog(Book book) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
