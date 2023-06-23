package gui;

import fileReading.SavfReading;

import javax.swing.*;
import java.awt.*;

public class Theme implements IScenes
{

	private Color bgColor, textColor, objColor;

	protected Theme(JFrame frame)
	{
		colorize();
		frame.getContentPane().setBackground(bgColor);

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

		Screen.appLabel.setBackground(null);
		Screen.appLabel.setForeground(objColor);

		Screen.goMovies.setBackground(objColor);
		Screen.goMovies.setForeground(textColor);

		Screen.goShows.setBackground(objColor);
		Screen.goShows.setForeground(textColor);

		Screen.goWatchlist.setBackground(objColor);
		Screen.goWatchlist.setForeground(textColor);

		Screen.goStats.setBackground(objColor);
		Screen.goStats.setForeground(textColor);

		Screen.goSettings.setBackground(objColor);
		Screen.goSettings.setForeground(textColor);

	}

	@Override
	public void moviesScene()
	{

		Screen.moviesPrompt.setBackground(null);
		Screen.moviesPrompt.setForeground(objColor);

		Screen.movieName1.setBackground(null);
		Screen.movieName1.setForeground(objColor);

		Screen.movieName2.setBackground(null);
		Screen.movieName2.setForeground(objColor);

		Screen.movieName3.setBackground(null);
		Screen.movieName3.setForeground(objColor);

		Screen.movieName4.setBackground(null);
		Screen.movieName4.setForeground(objColor);

		Screen.movieName5.setBackground(null);
		Screen.movieName5.setForeground(objColor);

		Screen.movieName6.setBackground(null);
		Screen.movieName6.setForeground(objColor);

		Screen.movieName7.setBackground(null);
		Screen.movieName7.setForeground(objColor);

		Screen.movieName8.setBackground(null);
		Screen.movieName8.setForeground(objColor);

		Screen.movieName9.setBackground(null);
		Screen.movieName9.setForeground(objColor);

		Screen.movieName10.setBackground(null);
		Screen.movieName10.setForeground(objColor);

		Screen.searchMovieBar.setBackground(objColor);
		Screen.searchMovieBar.setForeground(textColor);

		Screen.openMovie1.setBackground(objColor);
		Screen.openMovie1.setForeground(textColor);

		Screen.openMovie2.setBackground(objColor);
		Screen.openMovie2.setForeground(textColor);

		Screen.openMovie3.setBackground(objColor);
		Screen.openMovie3.setForeground(textColor);

		Screen.openMovie4.setBackground(objColor);
		Screen.openMovie4.setForeground(textColor);

		Screen.openMovie5.setBackground(objColor);
		Screen.openMovie5.setForeground(textColor);

		Screen.openMovie6.setBackground(objColor);
		Screen.openMovie6.setForeground(textColor);

		Screen.openMovie7.setBackground(objColor);
		Screen.openMovie7.setForeground(textColor);

		Screen.openMovie8.setBackground(objColor);
		Screen.openMovie8.setForeground(textColor);

		Screen.openMovie9.setBackground(objColor);
		Screen.openMovie9.setForeground(textColor);

		Screen.openMovie10.setBackground(objColor);
		Screen.openMovie10.setForeground(textColor);

		Screen.deleteMovie1.setBackground(objColor);
		Screen.deleteMovie1.setForeground(textColor);

		Screen.deleteMovie2.setBackground(objColor);
		Screen.deleteMovie2.setForeground(textColor);

		Screen.deleteMovie3.setBackground(objColor);
		Screen.deleteMovie3.setForeground(textColor);

		Screen.deleteMovie4.setBackground(objColor);
		Screen.deleteMovie4.setForeground(textColor);

		Screen.deleteMovie5.setBackground(objColor);
		Screen.deleteMovie5.setForeground(textColor);

		Screen.deleteMovie6.setBackground(objColor);
		Screen.deleteMovie6.setForeground(textColor);

		Screen.deleteMovie7.setBackground(objColor);
		Screen.deleteMovie7.setForeground(textColor);

		Screen.deleteMovie8.setBackground(objColor);
		Screen.deleteMovie8.setForeground(textColor);

		Screen.deleteMovie9.setBackground(objColor);
		Screen.deleteMovie9.setForeground(textColor);

		Screen.deleteMovie10.setBackground(objColor);
		Screen.deleteMovie10.setForeground(textColor);

		Screen.quitMovies.setBackground(objColor);
		Screen.quitMovies.setForeground(textColor);

		Screen.nextMoviePage.setBackground(objColor);
		Screen.nextMoviePage.setForeground(textColor);

		Screen.prevMoviePage.setBackground(objColor);
		Screen.prevMoviePage.setForeground(textColor);

		Screen.addMovie.setBackground(objColor);
		Screen.addMovie.setForeground(textColor);

		Screen.movieScores1.setBackground(objColor);
		Screen.movieScores1.setForeground(textColor);

		Screen.movieScores2.setBackground(objColor);
		Screen.movieScores2.setForeground(textColor);

		Screen.movieScores3.setBackground(objColor);
		Screen.movieScores3.setForeground(textColor);

		Screen.movieScores4.setBackground(objColor);
		Screen.movieScores4.setForeground(textColor);

		Screen.movieScores5.setBackground(objColor);
		Screen.movieScores5.setForeground(textColor);

		Screen.movieScores6.setBackground(objColor);
		Screen.movieScores6.setForeground(textColor);

		Screen.movieScores7.setBackground(objColor);
		Screen.movieScores7.setForeground(textColor);

		Screen.movieScores8.setBackground(objColor);
		Screen.movieScores8.setForeground(textColor);

		Screen.movieScores9.setBackground(objColor);
		Screen.movieScores9.setForeground(textColor);

		Screen.movieScores10.setBackground(objColor);
		Screen.movieScores10.setForeground(textColor);
	}

	@Override
	public void addMovieScene()
	{
		Screen.addMovieNamePrompt.setBackground(null);
		Screen.addMovieNamePrompt.setForeground(objColor);

		Screen.addMovieDatePrompt.setBackground(null);
		Screen.addMovieDatePrompt.setForeground(objColor);

		Screen.addMovieDirectorPrompt.setBackground(null);
		Screen.addMovieDirectorPrompt.setForeground(objColor);

		Screen.addMovieLengthPrompt.setBackground(null);
		Screen.addMovieLengthPrompt.setForeground(objColor);

		Screen.addMovieScorePrompt.setBackground(null);
		Screen.addMovieScorePrompt.setForeground(objColor);

		Screen.addMovieReviewPrompt.setBackground(null);
		Screen.addMovieReviewPrompt.setForeground(objColor);

		Screen.addMovieNameInput.setBackground(objColor);
		Screen.addMovieNameInput.setForeground(textColor);

		Screen.addMovieDateInput.setBackground(objColor);
		Screen.addMovieDateInput.setForeground(textColor);

		Screen.addMovieDirectorInput.setBackground(objColor);
		Screen.addMovieDirectorInput.setForeground(textColor);

		Screen.addMovieLengthInput.setBackground(objColor);
		Screen.addMovieLengthInput.setForeground(textColor);

		Screen.addMovieReviewInput.setBackground(objColor);
		Screen.addMovieReviewInput.setForeground(textColor);

		Screen.addMovieScores.setBackground(objColor);
		Screen.addMovieScores.setForeground(textColor);

		Screen.addMovieClear.setBackground(objColor);
		Screen.addMovieClear.setForeground(textColor);

		Screen.addMovieCancel.setBackground(objColor);
		Screen.addMovieCancel.setForeground(textColor);

		Screen.addMovieSave.setBackground(objColor);
		Screen.addMovieSave.setForeground(textColor);

	}

	@Override
	public void movieInfoScene()
	{



	}

	@Override
	public void showsScene()
	{

		Screen.showsPrompt.setBackground(null);
		Screen.showsPrompt.setForeground(objColor);

		Screen.showsName1.setBackground(null);
		Screen.showsName1.setForeground(objColor);

		Screen.showsName2.setBackground(null);
		Screen.showsName2.setForeground(objColor);

		Screen.showsName3.setBackground(null);
		Screen.showsName3.setForeground(objColor);

		Screen.showsName4.setBackground(null);
		Screen.showsName4.setForeground(objColor);

		Screen.showsName5.setBackground(null);
		Screen.showsName5.setForeground(objColor);

		Screen.showsName6.setBackground(null);
		Screen.showsName6.setForeground(objColor);

		Screen.showsName7.setBackground(null);
		Screen.showsName7.setForeground(objColor);

		Screen.showsName8.setBackground(null);
		Screen.showsName8.setForeground(objColor);

		Screen.showsName9.setBackground(null);
		Screen.showsName9.setForeground(objColor);

		Screen.showsName10.setBackground(null);
		Screen.showsName10.setForeground(objColor);

		Screen.showsSearchBar.setBackground(objColor);
		Screen.showsSearchBar.setForeground(textColor);

		Screen.showsOpen1.setBackground(objColor);
		Screen.showsOpen1.setForeground(textColor);

		Screen.showsOpen2.setBackground(objColor);
		Screen.showsOpen2.setForeground(textColor);

		Screen.showsOpen3.setBackground(objColor);
		Screen.showsOpen3.setForeground(textColor);

		Screen.showsOpen4.setBackground(objColor);
		Screen.showsOpen4.setForeground(textColor);

		Screen.showsOpen5.setBackground(objColor);
		Screen.showsOpen5.setForeground(textColor);

		Screen.showsOpen6.setBackground(objColor);
		Screen.showsOpen6.setForeground(textColor);

		Screen.showsOpen7.setBackground(objColor);
		Screen.showsOpen7.setForeground(textColor);

		Screen.showsOpen8.setBackground(objColor);
		Screen.showsOpen8.setForeground(textColor);

		Screen.showsOpen9.setBackground(objColor);
		Screen.showsOpen9.setForeground(textColor);

		Screen.showsOpen10.setBackground(objColor);
		Screen.showsOpen10.setForeground(textColor);

		Screen.showsDelete1.setBackground(objColor);
		Screen.showsDelete1.setForeground(textColor);

		Screen.showsDelete2.setBackground(objColor);
		Screen.showsDelete2.setForeground(textColor);

		Screen.showsDelete3.setBackground(objColor);
		Screen.showsDelete3.setForeground(textColor);

		Screen.showsDelete4.setBackground(objColor);
		Screen.showsDelete4.setForeground(textColor);

		Screen.showsDelete5.setBackground(objColor);
		Screen.showsDelete5.setForeground(textColor);

		Screen.showsDelete6.setBackground(objColor);
		Screen.showsDelete6.setForeground(textColor);

		Screen.showsDelete7.setBackground(objColor);
		Screen.showsDelete7.setForeground(textColor);

		Screen.showsDelete8.setBackground(objColor);
		Screen.showsDelete8.setForeground(textColor);

		Screen.showsDelete9.setBackground(objColor);
		Screen.showsDelete9.setForeground(textColor);

		Screen.showsDelete10.setBackground(objColor);
		Screen.showsDelete10.setForeground(textColor);

		Screen.quitShows.setBackground(objColor);
		Screen.quitShows.setForeground(textColor);

		Screen.showsNext.setBackground(objColor);
		Screen.showsNext.setForeground(textColor);

		Screen.showsPrevious.setBackground(objColor);
		Screen.showsPrevious.setForeground(textColor);

		Screen.showsAdd.setBackground(objColor);
		Screen.showsAdd.setForeground(textColor);

		Screen.showsProgress1.setBackground(objColor);
		Screen.showsProgress1.setForeground(textColor);

		Screen.showsProgress2.setBackground(objColor);
		Screen.showsProgress2.setForeground(textColor);

		Screen.showsProgress3.setBackground(objColor);
		Screen.showsProgress3.setForeground(textColor);

		Screen.showsProgress4.setBackground(objColor);
		Screen.showsProgress4.setForeground(textColor);

		Screen.showsProgress5.setBackground(objColor);
		Screen.showsProgress5.setForeground(textColor);

		Screen.showsProgress6.setBackground(objColor);
		Screen.showsProgress6.setForeground(textColor);

		Screen.showsProgress7.setBackground(objColor);
		Screen.showsProgress7.setForeground(textColor);

		Screen.showsProgress8.setBackground(objColor);
		Screen.showsProgress8.setForeground(textColor);

		Screen.showsProgress9.setBackground(objColor);
		Screen.showsProgress9.setForeground(textColor);

		Screen.showsProgress10.setBackground(objColor);
		Screen.showsProgress10.setForeground(textColor);

	}

	@Override
	public void addShowsScene()
	{

		Screen.addShowNamePrompt.setBackground(null);
		Screen.addShowNamePrompt.setForeground(objColor);

		Screen.addShowLengthPrompt.setBackground(null);
		Screen.addShowLengthPrompt.setForeground(objColor);

		Screen.addShowScorePrompt.setBackground(null);
		Screen.addShowScorePrompt.setForeground(objColor);

		Screen.addShowSeasonsPrompt.setBackground(null);
		Screen.addShowSeasonsPrompt.setForeground(objColor);

		Screen.addShowNameInput.setBackground(objColor);
		Screen.addShowNameInput.setForeground(textColor);

		Screen.addShowLengthInput.setBackground(objColor);
		Screen.addShowLengthInput.setForeground(textColor);

		Screen.addShowScoreInput.setBackground(objColor);
		Screen.addShowScoreInput.setForeground(textColor);

		Screen.addShowSeasonsInput.setBackground(objColor);
		Screen.addShowSeasonsInput.setForeground(textColor);

		Screen.addShowClear.setBackground(objColor);
		Screen.addShowClear.setForeground(textColor);

		Screen.addShowCancel.setBackground(objColor);
		Screen.addShowCancel.setForeground(textColor);

		Screen.addShowSave.setBackground(objColor);
		Screen.addShowSave.setForeground(textColor);

	}

	@Override
	public void showsInfoScene()
	{



	}

	@Override
	public void watchlistScene()
	{

		Screen.watchlistPrompt.setBackground(null);
		Screen.watchlistPrompt.setForeground(objColor);

		Screen.watchlistName1.setBackground(null);
		Screen.watchlistName1.setForeground(objColor);

		Screen.watchlistName2.setBackground(null);
		Screen.watchlistName2.setForeground(objColor);

		Screen.watchlistName3.setBackground(null);
		Screen.watchlistName3.setForeground(objColor);

		Screen.watchlistName4.setBackground(null);
		Screen.watchlistName4.setForeground(objColor);

		Screen.watchlistName5.setBackground(null);
		Screen.watchlistName5.setForeground(objColor);

		Screen.watchlistName6.setBackground(null);
		Screen.watchlistName6.setForeground(objColor);

		Screen.watchlistName7.setBackground(null);
		Screen.watchlistName7.setForeground(objColor);

		Screen.watchlistName8.setBackground(null);
		Screen.watchlistName8.setForeground(objColor);

		Screen.watchlistName9.setBackground(null);
		Screen.watchlistName9.setForeground(objColor);

		Screen.watchlistName10.setBackground(null);
		Screen.watchlistName10.setForeground(objColor);

		Screen.watchlistType1.setBackground(objColor);
		Screen.watchlistType1.setForeground(textColor);

		Screen.watchlistType2.setBackground(objColor);
		Screen.watchlistType2.setForeground(textColor);

		Screen.watchlistType3.setBackground(objColor);
		Screen.watchlistType3.setForeground(textColor);

		Screen.watchlistType4.setBackground(objColor);
		Screen.watchlistType4.setForeground(textColor);

		Screen.watchlistType5.setBackground(objColor);
		Screen.watchlistType5.setForeground(textColor);

		Screen.watchlistType6.setBackground(objColor);
		Screen.watchlistType6.setForeground(textColor);

		Screen.watchlistType7.setBackground(objColor);
		Screen.watchlistType7.setForeground(textColor);

		Screen.watchlistType8.setBackground(objColor);
		Screen.watchlistType8.setForeground(textColor);

		Screen.watchlistType9.setBackground(objColor);
		Screen.watchlistType9.setForeground(textColor);

		Screen.watchlistType10.setBackground(objColor);
		Screen.watchlistType10.setForeground(textColor);

		Screen.watchlistSearchBar.setBackground(objColor);
		Screen.watchlistSearchBar.setForeground(textColor);

		Screen.watchlistAdd.setBackground(objColor);
		Screen.watchlistAdd.setForeground(textColor);

		Screen.watchlistNext.setBackground(objColor);
		Screen.watchlistNext.setForeground(textColor);

		Screen.watchlistPrev.setBackground(objColor);
		Screen.watchlistPrev.setForeground(textColor);

		Screen.quitWatchlist.setBackground(objColor);
		Screen.quitWatchlist.setForeground(textColor);

		Screen.watchlistStart1.setBackground(objColor);
		Screen.watchlistStart1.setForeground(textColor);

		Screen.watchlistStart2.setBackground(objColor);
		Screen.watchlistStart2.setForeground(textColor);

		Screen.watchlistStart3.setBackground(objColor);
		Screen.watchlistStart3.setForeground(textColor);

		Screen.watchlistStart4.setBackground(objColor);
		Screen.watchlistStart4.setForeground(textColor);

		Screen.watchlistStart5.setBackground(objColor);
		Screen.watchlistStart5.setForeground(textColor);

		Screen.watchlistStart6.setBackground(objColor);
		Screen.watchlistStart6.setForeground(textColor);

		Screen.watchlistStart7.setBackground(objColor);
		Screen.watchlistStart7.setForeground(textColor);

		Screen.watchlistStart8.setBackground(objColor);
		Screen.watchlistStart8.setForeground(textColor);

		Screen.watchlistStart9.setBackground(objColor);
		Screen.watchlistStart9.setForeground(textColor);

		Screen.watchlistStart10.setBackground(objColor);
		Screen.watchlistStart10.setForeground(textColor);

		Screen.watchlistDelete1.setBackground(objColor);
		Screen.watchlistDelete1.setForeground(textColor);

		Screen.watchlistDelete2.setBackground(objColor);
		Screen.watchlistDelete2.setForeground(textColor);

		Screen.watchlistDelete3.setBackground(objColor);
		Screen.watchlistDelete3.setForeground(textColor);

		Screen.watchlistDelete4.setBackground(objColor);
		Screen.watchlistDelete4.setForeground(textColor);

		Screen.watchlistDelete5.setBackground(objColor);
		Screen.watchlistDelete5.setForeground(textColor);

		Screen.watchlistDelete6.setBackground(objColor);
		Screen.watchlistDelete6.setForeground(textColor);

		Screen.watchlistDelete7.setBackground(objColor);
		Screen.watchlistDelete7.setForeground(textColor);

		Screen.watchlistDelete8.setBackground(objColor);
		Screen.watchlistDelete8.setForeground(textColor);

		Screen.watchlistDelete9.setBackground(objColor);
		Screen.watchlistDelete9.setForeground(textColor);

		Screen.watchlistDelete10.setBackground(objColor);
		Screen.watchlistDelete10.setForeground(textColor);

	}

	@Override
	public void watchlistAddScene()
	{

		Screen.watchlistAddNamePrompt.setBackground(null);
		Screen.watchlistAddNamePrompt.setForeground(objColor);

		Screen.watchlistAddTypePrompt.setBackground(null);
		Screen.watchlistAddTypePrompt.setForeground(objColor);

		Screen.watchlistAddNameInput.setBackground(objColor);
		Screen.watchlistAddNameInput.setForeground(textColor);

		Screen.watchlistAddTypeSet.setBackground(objColor);
		Screen.watchlistAddTypeSet.setForeground(textColor);

		Screen.watchlistAddSave.setBackground(objColor);
		Screen.watchlistAddSave.setForeground(textColor);

		Screen.watchlistAddCancel.setBackground(objColor);
		Screen.watchlistAddCancel.setForeground(textColor);

	}

	@Override
	public void statsScene()
	{

		Screen.statsPrompt.setBackground(null);
		Screen.statsPrompt.setForeground(objColor);

		Screen.statsInfo.setBackground(objColor);
		Screen.statsInfo.setForeground(textColor);

		Screen.quitStats.setBackground(objColor);
		Screen.quitStats.setForeground(textColor);

	}

	@Override
	public void settingsScene()
	{

		Screen.settingsPrompt.setBackground(null);
		Screen.settingsPrompt.setForeground(objColor);

		Screen.settingsLanguagePrompt.setBackground(null);
		Screen.settingsLanguagePrompt.setForeground(objColor);

		Screen.settingsThemePrompt.setBackground(null);
		Screen.settingsThemePrompt.setForeground(objColor);

		Screen.settingsDatePrompt.setBackground(null);
		Screen.settingsDatePrompt.setForeground(objColor);

		Screen.settingsHelp.setBackground(objColor);
		Screen.settingsHelp.setForeground(textColor);

		Screen.settingsImport.setBackground(objColor);
		Screen.settingsImport.setForeground(textColor);

		Screen.settingsExport.setBackground(objColor);
		Screen.settingsExport.setForeground(textColor);

		Screen.quitSettings.setBackground(objColor);
		Screen.quitSettings.setForeground(textColor);

		Screen.settingsLanguageSet.setBackground(objColor);
		Screen.settingsLanguageSet.setForeground(textColor);

		Screen.settingsThemeSet.setBackground(objColor);
		Screen.settingsThemeSet.setForeground(textColor);

		Screen.settingsDateSet.setBackground(objColor);
		Screen.settingsDateSet.setForeground(textColor);

	}

	@Override
	public void helpScene()
	{

		Screen.helpPrompt.setBackground(null);
		Screen.helpPrompt.setForeground(objColor);

		Screen.helpPrompt.setBackground(objColor);
		Screen.helpPrompt.setForeground(textColor);

		Screen.quitHelp.setBackground(objColor);
		Screen.quitHelp.setForeground(textColor);

		Screen.helpNext.setBackground(objColor);
		Screen.helpNext.setForeground(textColor);

		Screen.helpPrev.setBackground(objColor);
		Screen.helpPrev.setForeground(textColor);

	}

	private void colorize()
	{

		SavfReading reading = new SavfReading();
		reading.scan("res/settings.savf");

		String code = reading.getValue("theme");

		if (code.equals("0"))
		{
			bgColor = Color.BLACK;
			objColor = Color.RED.darker();
			textColor = Color.BLACK;
		}
		else if (code.equals("1"))
		{
			bgColor = Color.WHITE;
			objColor = Color.BLACK;
			textColor = Color.WHITE;
		}

	}

}