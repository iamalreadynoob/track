package gui;

import javax.swing.*;

public class CreateNew implements IScenes
{
	protected CreateNew()
	{
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
		Screen.appLabel = new JTextField();
		Screen.goMovies = new JButton();
		Screen.goShows = new JButton();
		Screen.goWatchlist = new JButton();
		Screen.goStats = new JButton();
		Screen.goSettings = new JButton();
	}

	@Override
	public void moviesScene()
	{
		Screen.moviesPrompt = new JTextField();
		Screen.movieName1 = new JTextField();
		Screen.movieName2 = new JTextField();
		Screen.movieName3 = new JTextField();
		Screen.movieName4 = new JTextField();
		Screen.movieName5 = new JTextField();
		Screen.movieName6 = new JTextField();
		Screen.movieName7 = new JTextField();
		Screen.movieName8 = new JTextField();
		Screen.movieName9 = new JTextField();
		Screen.movieName10 = new JTextField();
		Screen.searchMovieBar = new JTextField();
		Screen.openMovie1 = new JButton();
		Screen.openMovie2 = new JButton();
		Screen.openMovie3 = new JButton();
		Screen.openMovie4 = new JButton();
		Screen.openMovie5 = new JButton();
		Screen.openMovie6 = new JButton();
		Screen.openMovie7 = new JButton();
		Screen.openMovie8 = new JButton();
		Screen.openMovie9 = new JButton();
		Screen.openMovie10 = new JButton();
		Screen.deleteMovie1 = new JButton();
		Screen.deleteMovie2 = new JButton();
		Screen.deleteMovie3 = new JButton();
		Screen.deleteMovie4 = new JButton();
		Screen.deleteMovie5 = new JButton();
		Screen.deleteMovie6 = new JButton();
		Screen.deleteMovie7 = new JButton();
		Screen.deleteMovie8 = new JButton();
		Screen.deleteMovie9 = new JButton();
		Screen.deleteMovie10 = new JButton();
		Screen.quitMovies = new JButton();
		Screen.nextMoviePage = new JButton();
		Screen.prevMoviePage = new JButton();
		Screen.addMovie = new JButton();
		Screen.movieScores1 = new JComboBox();
		Screen.movieScores2 = new JComboBox();
		Screen.movieScores3 = new JComboBox();
		Screen.movieScores4 = new JComboBox();
		Screen.movieScores5 = new JComboBox();
		Screen.movieScores6 = new JComboBox();
		Screen.movieScores7 = new JComboBox();
		Screen.movieScores8 = new JComboBox();
		Screen.movieScores9 = new JComboBox();
		Screen.movieScores10 = new JComboBox();
	}

	@Override
	public void addMovieScene()
	{
		Screen.addMovieNamePrompt = new JTextField();
		Screen.addMovieDatePrompt = new JTextField();
		Screen.addMovieDirectorPrompt = new JTextField();
		Screen.addMovieLengthPrompt = new JTextField();
		Screen.addMovieScorePrompt = new JTextField();
		Screen.addMovieReviewPrompt = new JTextField();
		Screen.addMovieNameInput = new JTextField();
		Screen.addMovieDateInput = new JTextField();
		Screen.addMovieDirectorInput = new JTextField();
		Screen.addMovieLengthInput = new JTextField();
		Screen.addMovieReviewInput = new JTextArea();
		Screen.addMovieClear = new JButton();
		Screen.addMovieCancel = new JButton();
		Screen.addMovieSave = new JButton();
		Screen.addMovieScores = new JComboBox();
	}

	@Override
	public void movieInfoScene()
	{
		Screen.movieInfoName = new JTextField();
		Screen.movieInfoDate = new JTextField();
		Screen.movieInfoDirector = new JTextField();
		Screen.movieInfoLength = new JTextField();
		Screen.movieInfoReview = new JTextArea();
		Screen.movieInfoBack = new JButton();
		Screen.movieInfoEdit = new JButton();
		Screen.movieInfoScore = new JComboBox();
	}

	@Override
	public void showsScene()
	{
		Screen.showsPrompt = new JTextField();
		Screen.showsSearchBar = new JTextField();
		Screen.showsProgress1 = new JTextField();
		Screen.showsProgress2 = new JTextField();
		Screen.showsProgress3 = new JTextField();
		Screen.showsProgress4 = new JTextField();
		Screen.showsProgress5 = new JTextField();
		Screen.showsProgress6 = new JTextField();
		Screen.showsProgress7 = new JTextField();
		Screen.showsProgress8 = new JTextField();
		Screen.showsProgress9 = new JTextField();
		Screen.showsProgress10 = new JTextField();
		Screen.showsName1 = new JTextField();
		Screen.showsName2 = new JTextField();
		Screen.showsName3 = new JTextField();
		Screen.showsName4 = new JTextField();
		Screen.showsName5 = new JTextField();
		Screen.showsName6 = new JTextField();
		Screen.showsName7 = new JTextField();
		Screen.showsName8 = new JTextField();
		Screen.showsName9 = new JTextField();
		Screen.showsName10 = new JTextField();
		Screen.showsOpen1 = new JButton();
		Screen.showsOpen2 = new JButton();
		Screen.showsOpen3 = new JButton();
		Screen.showsOpen4 = new JButton();
		Screen.showsOpen5 = new JButton();
		Screen.showsOpen6 = new JButton();
		Screen.showsOpen7 = new JButton();
		Screen.showsOpen8 = new JButton();
		Screen.showsOpen9 = new JButton();
		Screen.showsOpen10 = new JButton();
		Screen.showsDelete1 = new JButton();
		Screen.showsDelete2 = new JButton();
		Screen.showsDelete3 = new JButton();
		Screen.showsDelete4 = new JButton();
		Screen.showsDelete5 = new JButton();
		Screen.showsDelete6 = new JButton();
		Screen.showsDelete7 = new JButton();
		Screen.showsDelete8 = new JButton();
		Screen.showsDelete9 = new JButton();
		Screen.showsDelete10 = new JButton();
		Screen.showsAdd = new JButton();
		Screen.showsNext = new JButton();
		Screen.showsPrevious = new JButton();
		Screen.quitShows = new JButton();
	}

	@Override
	public void addShowsScene()
	{
		Screen.addShowNamePrompt = new JTextField();
		Screen.addShowLengthPrompt = new JTextField();
		Screen.addShowScorePrompt = new JTextField();
		Screen.addShowSeasonsPrompt = new JTextField();
		Screen.addShowNameInput = new JTextField();
		Screen.addShowLengthInput = new JTextField();
		Screen.addShowScoreInput = new JTextField();
		Screen.addShowClear = new JButton();
		Screen.addShowCancel = new JButton();
		Screen.addShowSave = new JButton();
		Screen.addShowSeasonsInput = new JTextArea();
	}

	@Override
	public void showsInfoScene()
	{
		Screen.showsInfoName = new JTextField();
		Screen.showsInfoLength = new JTextField();
		Screen.showsInfoSeasons = new JTextArea();
		Screen.showsInfoBack = new JButton();
		Screen.showsInfoWatchEp = new JButton();
		Screen.showsInfoEdit = new JButton();
		Screen.showsInfoScores = new JComboBox();
		Screen.showsInfoSitu = new JComboBox();
	}

	@Override
	public void watchlistScene()
	{
		Screen.watchlistPrompt = new JTextField();
		Screen.watchlistName1 = new JTextField();
		Screen.watchlistName2 = new JTextField();
		Screen.watchlistName3 = new JTextField();
		Screen.watchlistName4 = new JTextField();
		Screen.watchlistName5 = new JTextField();
		Screen.watchlistName6 = new JTextField();
		Screen.watchlistName7 = new JTextField();
		Screen.watchlistName8 = new JTextField();
		Screen.watchlistName9 = new JTextField();
		Screen.watchlistName10 = new JTextField();
		Screen.watchlistType1 = new JTextField();
		Screen.watchlistType2 = new JTextField();
		Screen.watchlistType3 = new JTextField();
		Screen.watchlistType4 = new JTextField();
		Screen.watchlistType5 = new JTextField();
		Screen.watchlistType6 = new JTextField();
		Screen.watchlistType7 = new JTextField();
		Screen.watchlistType8 = new JTextField();
		Screen.watchlistType9 = new JTextField();
		Screen.watchlistType10 = new JTextField();
		Screen.watchlistSearchBar = new JTextField();
		Screen.watchlistAdd = new JButton();
		Screen.watchlistNext = new JButton();
		Screen.watchlistPrev = new JButton();
		Screen.watchlistStart1 = new JButton();
		Screen.watchlistStart2 = new JButton();
		Screen.watchlistStart3 = new JButton();
		Screen.watchlistStart4 = new JButton();
		Screen.watchlistStart5 = new JButton();
		Screen.watchlistStart6 = new JButton();
		Screen.watchlistStart7 = new JButton();
		Screen.watchlistStart8 = new JButton();
		Screen.watchlistStart9 = new JButton();
		Screen.watchlistStart10 = new JButton();
		Screen.watchlistDelete1 = new JButton();
		Screen.watchlistDelete2 = new JButton();
		Screen.watchlistDelete3 = new JButton();
		Screen.watchlistDelete4 = new JButton();
		Screen.watchlistDelete5 = new JButton();
		Screen.watchlistDelete6 = new JButton();
		Screen.watchlistDelete7 = new JButton();
		Screen.watchlistDelete8 = new JButton();
		Screen.watchlistDelete9 = new JButton();
		Screen.watchlistDelete10 = new JButton();
		Screen.quitWatchlist = new JButton();
	}

	@Override
	public void watchlistAddScene()
	{
		Screen.watchlistAddNamePrompt = new JTextField();
		Screen.watchlistAddTypePrompt = new JTextField();
		Screen.watchlistAddNameInput = new JTextField();
		Screen.watchlistAddClear = new JButton();
		Screen.watchlistAddSave = new JButton();
		Screen.watchlistAddCancel = new JButton();
		Screen.watchlistAddTypeSet = new JComboBox();
	}

	@Override
	public void statsScene()
	{
		Screen.statsPrompt = new JTextField();
		Screen.statsInfo = new JTextArea();
		Screen.quitStats = new JButton();
	}

	@Override
	public void settingsScene()
	{
		Screen.settingsPrompt = new JTextField();
		Screen.settingsLanguagePrompt = new JTextField();
		Screen.settingsThemePrompt = new JTextField();
		Screen.settingsDatePrompt = new JTextField();
		Screen.settingsHelp = new JButton();
		Screen.settingsImport = new JButton();
		Screen.settingsExport = new JButton();
		Screen.quitSettings = new JButton();
		Screen.settingsLanguageSet = new JComboBox();
		Screen.settingsThemeSet = new JComboBox();
		Screen.settingsDateSet = new JComboBox();
	}

	@Override
	public void helpScene()
	{
		Screen.helpPrompt = new JTextField();
		Screen.helpInfo = new JTextArea();
		Screen.helpNext = new JButton();
		Screen.helpPrev = new JButton();
		Screen.quitHelp = new JButton();
	}

}