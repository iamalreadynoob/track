package gui;

import fileReading.DataReading;
import fileReading.SavfReading;

import java.util.ArrayList;

public class AppText implements IScenes
{
	private ArrayList<String> script;
	protected AppText()
	{
		DataReading reading = new DataReading();
		reading.scan("res/script.csv");
		SavfReading savfReading = new SavfReading();
		savfReading.scan("res/settings.savf");

		script = reading.getColumn(reading.getHeaders().get(Integer.parseInt(savfReading.getValue("lang"))));

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

		Screen.goMovies.setText(script.get(17));
		Screen.goShows.setText(script.get(26));
		Screen.goWatchlist.setText(script.get(32));
		Screen.goStats.setText(script.get(28));
		Screen.goSettings.setText(script.get(25));

	}

	@Override
	public void moviesScene()
	{
		Screen.moviesPrompt.setText(script.get(17));
		Screen.searchMovieBar.setText(script.get(24));
		Screen.openMovie1.setText(script.get(19));
		Screen.openMovie2.setText(script.get(19));
		Screen.openMovie3.setText(script.get(19));
		Screen.openMovie4.setText(script.get(19));
		Screen.openMovie5.setText(script.get(19));
		Screen.openMovie6.setText(script.get(19));
		Screen.openMovie7.setText(script.get(19));
		Screen.openMovie8.setText(script.get(19));
		Screen.openMovie9.setText(script.get(19));
		Screen.openMovie10.setText(script.get(19));
		Screen.deleteMovie1.setText(script.get(7));
		Screen.deleteMovie2.setText(script.get(7));
		Screen.deleteMovie3.setText(script.get(7));
		Screen.deleteMovie4.setText(script.get(7));
		Screen.deleteMovie5.setText(script.get(7));
		Screen.deleteMovie6.setText(script.get(7));
		Screen.deleteMovie7.setText(script.get(7));
		Screen.deleteMovie8.setText(script.get(7));
		Screen.deleteMovie9.setText(script.get(7));
		Screen.deleteMovie10.setText(script.get(7));
		Screen.quitMovies.setText(script.get(1));
		Screen.addMovie.setText(script.get(0));

	}

	@Override
	public void addMovieScene()
	{

		Screen.addMovieNamePrompt.setText(script.get(18));
		Screen.addMovieDatePrompt.setText(script.get(5));
		Screen.addMovieDirectorPrompt.setText(script.get(8));
		Screen.addMovieLengthPrompt.setText(script.get(15));
		Screen.addMovieScorePrompt.setText(script.get(23));
		Screen.addMovieReviewPrompt.setText(script.get(20));
		Screen.addMovieClear.setText(script.get(3));
		Screen.addMovieCancel.setText(script.get(2));
		Screen.addMovieSave.setText(script.get(21));

	}

	@Override
	public void movieInfoScene()
	{



	}

	@Override
	public void showsScene()
	{

		Screen.showsPrompt.setText(script.get(26));
		Screen.showsSearchBar.setText(script.get(24));
		Screen.showsOpen1.setText(script.get(19));
		Screen.showsOpen2.setText(script.get(19));
		Screen.showsOpen3.setText(script.get(19));
		Screen.showsOpen4.setText(script.get(19));
		Screen.showsOpen5.setText(script.get(19));
		Screen.showsOpen6.setText(script.get(19));
		Screen.showsOpen7.setText(script.get(19));
		Screen.showsOpen8.setText(script.get(19));
		Screen.showsOpen9.setText(script.get(19));
		Screen.showsOpen10.setText(script.get(19));
		Screen.showsDelete1.setText(script.get(7));
		Screen.showsDelete2.setText(script.get(7));
		Screen.showsDelete3.setText(script.get(7));
		Screen.showsDelete4.setText(script.get(7));
		Screen.showsDelete5.setText(script.get(7));
		Screen.showsDelete6.setText(script.get(7));
		Screen.showsDelete7.setText(script.get(7));
		Screen.showsDelete8.setText(script.get(7));
		Screen.showsDelete9.setText(script.get(7));
		Screen.showsDelete10.setText(script.get(7));
		Screen.showsAdd.setText(script.get(0));
		Screen.quitShows.setText(script.get(1));

	}

	@Override
	public void addShowsScene()
	{

		Screen.addShowNamePrompt.setText(script.get(18));
		Screen.addShowLengthPrompt.setText(script.get(15));
		Screen.addShowScorePrompt.setText(script.get(23));
		Screen.addShowSeasonsPrompt.setText(script.get(22));
		Screen.addShowClear.setText(script.get(3));
		Screen.addShowCancel.setText(script.get(2));
		Screen.addShowSave.setText(script.get(21));

	}

	@Override
	public void showsInfoScene()
	{



	}

	@Override
	public void watchlistScene()
	{

		Screen.watchlistPrompt.setText(script.get(32));
		Screen.watchlistSearchBar.setText(script.get(24));
		Screen.watchlistAdd.setText(script.get(0));
		Screen.quitWatchlist.setText(script.get(1));
		Screen.watchlistStart1.setText(script.get(27));
		Screen.watchlistStart2.setText(script.get(27));
		Screen.watchlistStart3.setText(script.get(27));
		Screen.watchlistStart4.setText(script.get(27));
		Screen.watchlistStart5.setText(script.get(27));
		Screen.watchlistStart6.setText(script.get(27));
		Screen.watchlistStart7.setText(script.get(27));
		Screen.watchlistStart8.setText(script.get(27));
		Screen.watchlistStart9.setText(script.get(27));
		Screen.watchlistStart10.setText(script.get(27));
		Screen.watchlistDelete1.setText(script.get(7));
		Screen.watchlistDelete2.setText(script.get(7));
		Screen.watchlistDelete3.setText(script.get(7));
		Screen.watchlistDelete4.setText(script.get(7));
		Screen.watchlistDelete5.setText(script.get(7));
		Screen.watchlistDelete6.setText(script.get(7));
		Screen.watchlistDelete7.setText(script.get(7));
		Screen.watchlistDelete8.setText(script.get(7));
		Screen.watchlistDelete9.setText(script.get(7));
		Screen.watchlistDelete10.setText(script.get(7));

	}

	@Override
	public void watchlistAddScene()
	{

		Screen.watchlistAddNamePrompt.setText(script.get(18));
		Screen.watchlistAddTypePrompt.setText(script.get(30));
		Screen.watchlistAddClear.setText(script.get(3));
		Screen.watchlistAddCancel.setText(script.get(2));
		Screen.watchlistAddSave.setText(script.get(21));

	}

	@Override
	public void statsScene()
	{

		Screen.statsPrompt.setText(script.get(28));
		Screen.quitStats.setText(script.get(1));

	}

	@Override
	public void settingsScene()
	{

		Screen.settingsPrompt.setText(script.get(25));
		Screen.settingsLanguagePrompt.setText(script.get(14));
		Screen.settingsThemePrompt.setText(script.get(29));
		Screen.settingsDatePrompt.setText(script.get(5));
		Screen.settingsHelp.setText(script.get(12));
		Screen.settingsImport.setText(script.get(13));
		Screen.settingsExport.setText(script.get(11));
		Screen.quitSettings.setText(script.get(1));

	}

	@Override
	public void helpScene()
	{

		Screen.helpPrompt.setText(script.get(12));
		Screen.quitHelp.setText(script.get(1));

	}

}