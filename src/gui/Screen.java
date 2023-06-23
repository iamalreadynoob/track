package gui;

import javax.swing.*;

public class Screen extends JFrame
{
	//main screen
	protected static JTextField appLabel;
	protected static JButton goMovies, goShows, goWatchlist, goStats, goSettings;

	//moviesScene screen
	protected static JTextField moviesPrompt, movieName1, movieName2, movieName3, movieName4, movieName5, movieName6, movieName7, movieName8, movieName9, movieName10, searchMovieBar;
	protected static JButton openMovie1, openMovie2, openMovie3, openMovie4, openMovie5, openMovie6, openMovie7, openMovie8, openMovie9, openMovie10, deleteMovie1, deleteMovie2, deleteMovie3, deleteMovie4, deleteMovie5, deleteMovie6, deleteMovie7, deleteMovie8, deleteMovie9, deleteMovie10, quitMovies, nextMoviePage, prevMoviePage, addMovie;
	protected static JComboBox movieScores1, movieScores2, movieScores3, movieScores4, movieScores5, movieScores6, movieScores7, movieScores8, movieScores9, movieScores10;

	//addMovieScene screen
	protected static JTextField addMovieNamePrompt, addMovieDatePrompt, addMovieDirectorPrompt, addMovieLengthPrompt, addMovieScorePrompt, addMovieReviewPrompt, addMovieNameInput, addMovieDateInput, addMovieDirectorInput, addMovieLengthInput;
	protected static JTextArea addMovieReviewInput;
	protected static JButton addMovieClear, addMovieCancel, addMovieSave;
	protected static JComboBox addMovieScores;

	//movieInfoScene screen
	protected static JTextField movieInfoName, movieInfoDate, movieInfoDirector, movieInfoLength;
	protected static JTextArea movieInfoReview;
	protected static JButton movieInfoBack, movieInfoEdit;
	protected static JComboBox movieInfoScore;

	//showsScene screen
	protected static JTextField showsPrompt, showsSearchBar, showsProgress1, showsProgress2, showsProgress3, showsProgress4, showsProgress5, showsProgress6, showsProgress7, showsProgress8, showsProgress9, showsProgress10, showsName1, showsName2, showsName3, showsName4, showsName5, showsName6, showsName7, showsName8, showsName9, showsName10;
	protected static JButton showsOpen1, showsOpen2, showsOpen3, showsOpen4, showsOpen5, showsOpen6, showsOpen7, showsOpen8, showsOpen9, showsOpen10, showsDelete1, showsDelete2, showsDelete3, showsDelete4, showsDelete5, showsDelete6, showsDelete7, showsDelete8, showsDelete9, showsDelete10, showsAdd, showsNext, showsPrevious, quitShows;

	//addShowsScene screen
	protected static JTextField addShowNamePrompt, addShowLengthPrompt, addShowScorePrompt, addShowSeasonsPrompt, addShowNameInput, addShowLengthInput, addShowScoreInput;
	protected static JButton addShowClear, addShowCancel, addShowSave;
	protected static JTextArea addShowSeasonsInput;

	//showsInfoScene screen
	protected static JTextField showsInfoName, showsInfoLength;
	protected static JTextArea showsInfoSeasons;
	protected static JButton showsInfoBack, showsInfoWatchEp, showsInfoEdit;
	protected static JComboBox showsInfoScores, showsInfoSitu;

	//watchlistScene screen
	protected static JTextField watchlistPrompt, watchlistName1, watchlistName2, watchlistName3, watchlistName4, watchlistName5, watchlistName6, watchlistName7, watchlistName8, watchlistName9, watchlistName10, watchlistType1, watchlistType2, watchlistType3, watchlistType4, watchlistType5, watchlistType6, watchlistType7, watchlistType8, watchlistType9, watchlistType10, watchlistSearchBar;
	protected static JButton watchlistAdd, watchlistNext, watchlistPrev, watchlistStart1, watchlistStart2, watchlistStart3, watchlistStart4, watchlistStart5, watchlistStart6, watchlistStart7, watchlistStart8, watchlistStart9, watchlistStart10, watchlistDelete1, watchlistDelete2, watchlistDelete3, watchlistDelete4, watchlistDelete5, watchlistDelete6, watchlistDelete7, watchlistDelete8, watchlistDelete9, watchlistDelete10, quitWatchlist;

	//watchlistAddScene screen
	protected static JTextField watchlistAddNamePrompt, watchlistAddTypePrompt, watchlistAddNameInput;
	protected static JButton watchlistAddClear, watchlistAddSave, watchlistAddCancel;
	protected static JComboBox watchlistAddTypeSet;

	//statsScene screen
	protected static JTextField statsPrompt;
	protected static JTextArea statsInfo;
	protected static JButton quitStats;

	//settingsScene screen
	protected static JTextField settingsPrompt, settingsLanguagePrompt, settingsThemePrompt, settingsDatePrompt;
	protected static JButton settingsHelp, settingsImport, settingsExport, quitSettings;
	protected static JComboBox settingsLanguageSet, settingsThemeSet, settingsDateSet;

	//helpScene screen
	protected static JTextField helpPrompt;
	protected static JTextArea helpInfo;
	protected static JButton helpNext, helpPrev, quitHelp;

	public Screen()
	{
		this.setLayout(null);
		this.setTitle("track");
		this.setSize(1000, 700);

		new CreateNew();
		new Add(this);
		new Visibility(false).launch();
		new Visibility(true).main();
		new AppText();
		new Theme(this);
		new Positions();
		new Buttons(this);

		this.setResizable(false);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}