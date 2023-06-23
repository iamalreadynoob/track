package gui;

import database.DatabaseIO;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.*;

public class Buttons implements IScenes
{
	private JFrame frame;
	private int page;
	private DatabaseIO db;

	protected Buttons(JFrame frame)
	{
		this.frame = frame;
		db = new DatabaseIO();
		page = 0;

		main();
		moviesScene();
		addMovieScene();
		movieInfoScene();
		showsScene();
		addShowsScene();
		showsInfoScene();
		watchlistScene();
		watchlistAddScene();
		statsScene();
		settingsScene();
		helpScene();
	}

	@Override
	public void main()
	{
		Screen.goMovies.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).main();
				new Visibility(true).moviesScene();

				db.loadData("res/usr/moviedb.csv", page);
				db.fillData(new Combiner(Combiner.Sections.MOVIE_NAMES).getJTextFieldSet(),
						new Combiner(Combiner.Sections.MOVIE_OPEN_BUTTONS).getJButtonSet(),
						new Combiner(Combiner.Sections.MOVIE_DELETE_BUTTONS).getJButtonSet(),
						new Combiner(Combiner.Sections.MOVIE_SCORES).getJComboBoxSet());
			}
		});

		Screen.goShows.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).main();
				new Visibility(true).showsScene();
			}
		});

		Screen.goWatchlist.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).main();
				new Visibility(true).watchlistScene();
			}
		});

		Screen.goStats.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).main();
				new Visibility(true).statsScene();
			}
		});

		Screen.goSettings.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).main();
				new Visibility(true).settingsScene();
			}
		});

	}

	@Override
	public void moviesScene()
	{
		Screen.openMovie1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.openMovie10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.deleteMovie10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.quitMovies.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).moviesScene();
				new Visibility(true).main();
				db.reset();
				page = 0;
			}
		});

		Screen.nextMoviePage.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{

				if (page + 1 < db.getPageSize())
				{
					page++;

					db.setPage(page);
					db.fillData(new Combiner(Combiner.Sections.MOVIE_NAMES).getJTextFieldSet(),
							new Combiner(Combiner.Sections.MOVIE_OPEN_BUTTONS).getJButtonSet(),
							new Combiner(Combiner.Sections.MOVIE_DELETE_BUTTONS).getJButtonSet(),
							new Combiner(Combiner.Sections.MOVIE_SCORES).getJComboBoxSet());
				}

			}
		});

		Screen.prevMoviePage.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				if (page != 0)
				{
					page--;

					db.setPage(page);
					db.fillData(new Combiner(Combiner.Sections.MOVIE_NAMES).getJTextFieldSet(),
							new Combiner(Combiner.Sections.MOVIE_OPEN_BUTTONS).getJButtonSet(),
							new Combiner(Combiner.Sections.MOVIE_DELETE_BUTTONS).getJButtonSet(),
							new Combiner(Combiner.Sections.MOVIE_SCORES).getJComboBoxSet());
				}


			}
		});

		Screen.addMovie.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).moviesScene();
				new Visibility(true).addMovieScene();
			}
		});

	}

	@Override
	public void addMovieScene()
	{
		Screen.addMovieClear.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.addMovieCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.addMovieSave.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void movieInfoScene()
	{
		Screen.movieInfoBack.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.movieInfoEdit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void showsScene()
	{
		Screen.showsOpen1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsOpen10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsDelete10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsAdd.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).showsScene();
				new Visibility(true).addShowsScene();
			}
		});

		Screen.showsNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsPrevious.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.quitShows.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void addShowsScene()
	{
		Screen.addShowClear.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.addShowCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.addShowSave.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void showsInfoScene()
	{
		Screen.showsInfoBack.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsInfoWatchEp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.showsInfoEdit.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void watchlistScene()
	{
		Screen.watchlistAdd.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).watchlistScene();
				new Visibility(true).watchlistAddScene();
			}
		});

		Screen.watchlistNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistPrev.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistStart10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete1.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete2.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete3.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete4.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete5.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete6.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete7.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete8.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete9.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistDelete10.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.quitWatchlist.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void watchlistAddScene()
	{
		Screen.watchlistAddClear.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistAddSave.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.watchlistAddCancel.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void statsScene()
	{
		Screen.quitStats.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void settingsScene()
	{
		Screen.settingsHelp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{
				new Visibility(false).settingsScene();
				new Visibility(true).helpScene();
			}
		});

		Screen.settingsImport.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.settingsExport.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.quitSettings.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

	@Override
	public void helpScene()
	{
		Screen.helpNext.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.helpPrev.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

		Screen.quitHelp.addActionListener(new ActionListener()
		{
			@Override
			public void actionPerformed(ActionEvent actionEvent)
			{


			}
		});

	}

}