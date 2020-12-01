package controller;

import com.oms.bean.Book;

import api.MediaApi;

public class BookManageController implements IDataManageController<Book>{

	@Override
	public void create(Book t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void read(Book t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Book t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Book t) {
		MediaApi api = new MediaApi();
		api.updateBook(t);
	}

}
