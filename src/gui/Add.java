package gui;

import javax.swing.*;

public class Add implements IScenes
{
	private JFrame frame;

	protected Add(JFrame frame)
	{
		this.frame = frame;
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
		frame.add(Screen.appLabel);
		frame.add(Screen.goMovies);
		frame.add(Screen.goShows);
		frame.add(Screen.goWatchlist);
		frame.add(Screen.goStats);
		frame.add(Screen.goSettings);
	}

	@Override
	public void moviesScene()
	{
		frame.add(Screen.moviesPrompt);
		frame.add(Screen.movieName1);
		frame.add(Screen.movieName2);
		frame.add(Screen.movieName3);
		frame.add(Screen.movieName4);
		frame.add(Screen.movieName5);
		frame.add(Screen.movieName6);
		frame.add(Screen.movieName7);
		frame.add(Screen.movieName8);
		frame.add(Screen.movieName9);
		frame.add(Screen.movieName10);
		frame.add(Screen.searchMovieBar);
		frame.add(Screen.openMovie1);
		frame.add(Screen.openMovie2);
		frame.add(Screen.openMovie3);
		frame.add(Screen.openMovie4);
		frame.add(Screen.openMovie5);
		frame.add(Screen.openMovie6);
		frame.add(Screen.openMovie7);
		frame.add(Screen.openMovie8);
		frame.add(Screen.openMovie9);
		frame.add(Screen.openMovie10);
		frame.add(Screen.deleteMovie1);
		frame.add(Screen.deleteMovie2);
		frame.add(Screen.deleteMovie3);
		frame.add(Screen.deleteMovie4);
		frame.add(Screen.deleteMovie5);
		frame.add(Screen.deleteMovie6);
		frame.add(Screen.deleteMovie7);
		frame.add(Screen.deleteMovie8);
		frame.add(Screen.deleteMovie9);
		frame.add(Screen.deleteMovie10);
		frame.add(Screen.quitMovies);
		frame.add(Screen.nextMoviePage);
		frame.add(Screen.prevMoviePage);
		frame.add(Screen.addMovie);
		frame.add(Screen.movieScores1);
		frame.add(Screen.movieScores2);
		frame.add(Screen.movieScores3);
		frame.add(Screen.movieScores4);
		frame.add(Screen.movieScores5);
		frame.add(Screen.movieScores6);
		frame.add(Screen.movieScores7);
		frame.add(Screen.movieScores8);
		frame.add(Screen.movieScores9);
		frame.add(Screen.movieScores10);
	}

	@Override
	public void addMovieScene()
	{
		frame.add(Screen.addMovieNamePrompt);
		frame.add(Screen.addMovieDatePrompt);
		frame.add(Screen.addMovieDirectorPrompt);
		frame.add(Screen.addMovieLengthPrompt);
		frame.add(Screen.addMovieScorePrompt);
		frame.add(Screen.addMovieReviewPrompt);
		frame.add(Screen.addMovieNameInput);
		frame.add(Screen.addMovieDateInput);
		frame.add(Screen.addMovieDirectorInput);
		frame.add(Screen.addMovieLengthInput);
		frame.add(Screen.addMovieReviewInput);
		frame.add(Screen.addMovieClear);
		frame.add(Screen.addMovieCancel);
		frame.add(Screen.addMovieSave);
		frame.add(Screen.addMovieScores);
	}

	@Override
	public void movieInfoScene()
	{
		frame.add(Screen.movieInfoName);
		frame.add(Screen.movieInfoDate);
		frame.add(Screen.movieInfoDirector);
		frame.add(Screen.movieInfoLength);
		frame.add(Screen.movieInfoReview);
		frame.add(Screen.movieInfoBack);
		frame.add(Screen.movieInfoEdit);
		frame.add(Screen.movieInfoScore);
	}

	@Override
	public void showsScene()
	{
		frame.add(Screen.showsPrompt);
		frame.add(Screen.showsSearchBar);
		frame.add(Screen.showsProgress1);
		frame.add(Screen.showsProgress2);
		frame.add(Screen.showsProgress3);
		frame.add(Screen.showsProgress4);
		frame.add(Screen.showsProgress5);
		frame.add(Screen.showsProgress6);
		frame.add(Screen.showsProgress7);
		frame.add(Screen.showsProgress8);
		frame.add(Screen.showsProgress9);
		frame.add(Screen.showsProgress10);
		frame.add(Screen.showsName1);
		frame.add(Screen.showsName2);
		frame.add(Screen.showsName3);
		frame.add(Screen.showsName4);
		frame.add(Screen.showsName5);
		frame.add(Screen.showsName6);
		frame.add(Screen.showsName7);
		frame.add(Screen.showsName8);
		frame.add(Screen.showsName9);
		frame.add(Screen.showsName10);
		frame.add(Screen.showsOpen1);
		frame.add(Screen.showsOpen2);
		frame.add(Screen.showsOpen3);
		frame.add(Screen.showsOpen4);
		frame.add(Screen.showsOpen5);
		frame.add(Screen.showsOpen6);
		frame.add(Screen.showsOpen7);
		frame.add(Screen.showsOpen8);
		frame.add(Screen.showsOpen9);
		frame.add(Screen.showsOpen10);
		frame.add(Screen.showsDelete1);
		frame.add(Screen.showsDelete2);
		frame.add(Screen.showsDelete3);
		frame.add(Screen.showsDelete4);
		frame.add(Screen.showsDelete5);
		frame.add(Screen.showsDelete6);
		frame.add(Screen.showsDelete7);
		frame.add(Screen.showsDelete8);
		frame.add(Screen.showsDelete9);
		frame.add(Screen.showsDelete10);
		frame.add(Screen.showsAdd);
		frame.add(Screen.showsNext);
		frame.add(Screen.showsPrevious);
		frame.add(Screen.quitShows);
	}

	@Override
	public void addShowsScene()
	{
		frame.add(Screen.addShowNamePrompt);
		frame.add(Screen.addShowLengthPrompt);
		frame.add(Screen.addShowScorePrompt);
		frame.add(Screen.addShowSeasonsPrompt);
		frame.add(Screen.addShowNameInput);
		frame.add(Screen.addShowLengthInput);
		frame.add(Screen.addShowScoreInput);
		frame.add(Screen.addShowClear);
		frame.add(Screen.addShowCancel);
		frame.add(Screen.addShowSave);
		frame.add(Screen.addShowSeasonsInput);
	}

	@Override
	public void showsInfoScene()
	{
		frame.add(Screen.showsInfoName);
		frame.add(Screen.showsInfoLength);
		frame.add(Screen.showsInfoSeasons);
		frame.add(Screen.showsInfoBack);
		frame.add(Screen.showsInfoWatchEp);
		frame.add(Screen.showsInfoEdit);
		frame.add(Screen.showsInfoScores);
		frame.add(Screen.showsInfoSitu);
	}

	@Override
	public void watchlistScene()
	{
		frame.add(Screen.watchlistPrompt);
		frame.add(Screen.watchlistName1);
		frame.add(Screen.watchlistName2);
		frame.add(Screen.watchlistName3);
		frame.add(Screen.watchlistName4);
		frame.add(Screen.watchlistName5);
		frame.add(Screen.watchlistName6);
		frame.add(Screen.watchlistName7);
		frame.add(Screen.watchlistName8);
		frame.add(Screen.watchlistName9);
		frame.add(Screen.watchlistName10);
		frame.add(Screen.watchlistType1);
		frame.add(Screen.watchlistType2);
		frame.add(Screen.watchlistType3);
		frame.add(Screen.watchlistType4);
		frame.add(Screen.watchlistType5);
		frame.add(Screen.watchlistType6);
		frame.add(Screen.watchlistType7);
		frame.add(Screen.watchlistType8);
		frame.add(Screen.watchlistType9);
		frame.add(Screen.watchlistType10);
		frame.add(Screen.watchlistSearchBar);
		frame.add(Screen.watchlistAdd);
		frame.add(Screen.watchlistNext);
		frame.add(Screen.watchlistPrev);
		frame.add(Screen.watchlistStart1);
		frame.add(Screen.watchlistStart2);
		frame.add(Screen.watchlistStart3);
		frame.add(Screen.watchlistStart4);
		frame.add(Screen.watchlistStart5);
		frame.add(Screen.watchlistStart6);
		frame.add(Screen.watchlistStart7);
		frame.add(Screen.watchlistStart8);
		frame.add(Screen.watchlistStart9);
		frame.add(Screen.watchlistStart10);
		frame.add(Screen.watchlistDelete1);
		frame.add(Screen.watchlistDelete2);
		frame.add(Screen.watchlistDelete3);
		frame.add(Screen.watchlistDelete4);
		frame.add(Screen.watchlistDelete5);
		frame.add(Screen.watchlistDelete6);
		frame.add(Screen.watchlistDelete7);
		frame.add(Screen.watchlistDelete8);
		frame.add(Screen.watchlistDelete9);
		frame.add(Screen.watchlistDelete10);
		frame.add(Screen.quitWatchlist);
	}

	@Override
	public void watchlistAddScene()
	{
		frame.add(Screen.watchlistAddNamePrompt);
		frame.add(Screen.watchlistAddTypePrompt);
		frame.add(Screen.watchlistAddNameInput);
		frame.add(Screen.watchlistAddClear);
		frame.add(Screen.watchlistAddSave);
		frame.add(Screen.watchlistAddCancel);
		frame.add(Screen.watchlistAddTypeSet);
	}

	@Override
	public void statsScene()
	{
		frame.add(Screen.statsPrompt);
		frame.add(Screen.statsInfo);
		frame.add(Screen.quitStats);
	}

	@Override
	public void settingsScene()
	{
		frame.add(Screen.settingsPrompt);
		frame.add(Screen.settingsLanguagePrompt);
		frame.add(Screen.settingsThemePrompt);
		frame.add(Screen.settingsDatePrompt);
		frame.add(Screen.settingsHelp);
		frame.add(Screen.settingsImport);
		frame.add(Screen.settingsExport);
		frame.add(Screen.quitSettings);
		frame.add(Screen.settingsLanguageSet);
		frame.add(Screen.settingsThemeSet);
		frame.add(Screen.settingsDateSet);
	}

	@Override
	public void helpScene()
	{
		frame.add(Screen.helpPrompt);
		frame.add(Screen.helpInfo);
		frame.add(Screen.helpNext);
		frame.add(Screen.helpPrev);
		frame.add(Screen.quitHelp);
	}

}