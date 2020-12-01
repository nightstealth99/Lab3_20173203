package singlepane;

import javax.swing.JLabel;

import com.oms.bean.Book;
import com.oms.bean.Media;
import com.oms.bean.PhysicalMedia;

@SuppressWarnings("serial")
public class BookSinglePane extends PhysicalMediaSinglePane {
	private JLabel publisher;
	private JLabel publishDate;
	private JLabel authors;
	private JLabel numPages;
	private JLabel language;
	public BookSinglePane() {
		super();
	}
	
	public BookSinglePane(Media media) {
		this();
		this.t = media;

		displayData();
	}
	@Override
	public void buildControls() {
		super.buildControls();

		int row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publisher = new JLabel();
		add(publisher, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		publishDate = new JLabel();
		add(publishDate, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		authors = new JLabel();
		add(authors, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		numPages = new JLabel();
		add(numPages, c);
		
		row = getLastRowIndex();
		c.gridx = 0;
		c.gridy = row;
		language = new JLabel();
		add(language, c);
	}
	
	@Override
	public void displayData() {
		super.displayData();
		
		if (t instanceof Book) {
			Book pbook = (Book) t;			
			publisher.setText("Publisher: " + pbook.getPublisher());
			publishDate.setText("Publication Date: " + pbook.getPublicationDate());
			authors.setText("Authors: " + pbook.getAuthors());
			numPages.setText("Number Of Pages: " + pbook.getNumberOfPages());
			language.setText("Language: " + pbook.getLanguage());
		}
	}
	
	
}
