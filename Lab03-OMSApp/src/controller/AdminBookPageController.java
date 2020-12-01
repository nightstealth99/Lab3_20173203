package controller;

import java.util.List;
import java.util.Map;

import javax.swing.JDialog;

import com.oms.bean.Book;
import com.oms.bean.Media;

import api.MediaApi;
import cart.CartController;
import editdialog.BookEditDialog;
import listpane.ADataListPane;
import listpane.AdminMediaListPane;
import listpane.UserMediaListPane;
import search.BookSearchPane;
import search.MediaSearchPane;
import singlepane.BookSinglePane;
import singlepane.MediaSinglePane;

public class AdminBookPageController extends AdminMediaPageController{
	public IDataManageController editController;
	public AdminBookPageController() {
		super();
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
	public JDialog createBookEditDialog(Book book) {
		return new BookEditDialog(book, (IDataManageController)new BookManageController());
	}
	@Override
	public ADataListPane<Media> createListPane() {
		return new AdminMediaListPane(this);
	}
}
