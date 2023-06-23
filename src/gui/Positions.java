package gui;

import java.awt.*;

public class Positions implements IScenes
{
	protected Positions()
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

		Screen.appLabel.setBounds(30, 50, 100, 30);
		Screen.appLabel.setBorder(null);
		Screen.appLabel.setText("track.");
		Screen.appLabel.setFont(new Font("arial", Font.BOLD, 25));
		Screen.appLabel.setEditable(false);

		Screen.goMovies.setBounds(25, 225, 300, 60);
		Screen.goMovies.setBorder(null);

		Screen.goShows.setBounds(350, 225, 300, 60);
		Screen.goShows.setBorder(null);

		Screen.goWatchlist.setBounds(675, 225, 300, 60);
		Screen.goWatchlist.setBorder(null);

		Screen.goStats.setBounds(175, 325, 300, 60);
		Screen.goStats.setBorder(null);

		Screen.goSettings.setBounds(500, 325, 300, 60);
		Screen.goSettings.setBorder(null);
	}

	@Override
	public void moviesScene()
	{

		Screen.moviesPrompt.setBounds(30, 50, 100, 30);
		Screen.moviesPrompt.setBorder(null);
		Screen.moviesPrompt.setFont(new Font("arial", Font.BOLD, 25));

		Screen.quitMovies.setBounds(770, 50, 200, 30);
		Screen.quitMovies.setBorder(null);

		Screen.addMovie.setBounds(30, 130, 100, 30);
		Screen.addMovie.setBorder(null);

		Screen.searchMovieBar.setBounds(350, 130, 300, 30);
		Screen.searchMovieBar.setBorder(null);

		Screen.movieName1.setBounds(30, 190, 300, 30);
		Screen.movieName1.setBorder(null);
		Screen.movieName1.setEditable(false);

		Screen.movieName2.setBounds(30, 230, 300, 30);
		Screen.movieName2.setBorder(null);
		Screen.movieName2.setEditable(false);

		Screen.movieName3.setBounds(30, 270, 300, 30);
		Screen.movieName3.setBorder(null);
		Screen.movieName3.setEditable(false);

		Screen.movieName4.setBounds(30, 310, 300, 30);
		Screen.movieName4.setBorder(null);
		Screen.movieName4.setEditable(false);

		Screen.movieName5.setBounds(30, 350, 300, 30);
		Screen.movieName5.setBorder(null);
		Screen.movieName5.setEditable(false);

		Screen.movieName6.setBounds(30, 390, 300, 30);
		Screen.movieName6.setBorder(null);
		Screen.movieName6.setEditable(false);

		Screen.movieName7.setBounds(30, 430, 300, 30);
		Screen.movieName7.setBorder(null);
		Screen.movieName7.setEditable(false);

		Screen.movieName8.setBounds(30, 470, 300, 30);
		Screen.movieName8.setBorder(null);
		Screen.movieName8.setEditable(false);

		Screen.movieName9.setBounds(30, 510, 300, 30);
		Screen.movieName9.setBorder(null);
		Screen.movieName9.setEditable(false);

		Screen.movieName10.setBounds(30, 550, 300, 30);
		Screen.movieName10.setBorder(null);
		Screen.movieName10.setEditable(false);

		Screen.openMovie1.setBounds(340, 190, 200, 30);
		Screen.openMovie1.setBorder(null);

		Screen.openMovie2.setBounds(340, 230, 200, 30);
		Screen.openMovie2.setBorder(null);

		Screen.openMovie3.setBounds(340, 270, 200, 30);
		Screen.openMovie3.setBorder(null);

		Screen.openMovie4.setBounds(340, 310, 200, 30);
		Screen.openMovie4.setBorder(null);

		Screen.openMovie5.setBounds(340, 350, 200, 30);
		Screen.openMovie5.setBorder(null);

		Screen.openMovie6.setBounds(340, 390, 200, 30);
		Screen.openMovie6.setBorder(null);

		Screen.openMovie7.setBounds(340, 430, 200, 30);
		Screen.openMovie7.setBorder(null);

		Screen.openMovie8.setBounds(340, 470, 200, 30);
		Screen.openMovie8.setBorder(null);

		Screen.openMovie9.setBounds(340, 510, 200, 30);
		Screen.openMovie9.setBorder(null);

		Screen.openMovie10.setBounds(340, 550, 200, 30);
		Screen.openMovie10.setBorder(null);

		Screen.deleteMovie1.setBounds(550, 190, 200, 30);
		Screen.deleteMovie1.setBorder(null);

		Screen.deleteMovie2.setBounds(550, 230, 200, 30);
		Screen.deleteMovie2.setBorder(null);

		Screen.deleteMovie3.setBounds(550, 270, 200, 30);
		Screen.deleteMovie3.setBorder(null);

		Screen.deleteMovie4.setBounds(550, 310, 200, 30);
		Screen.deleteMovie4.setBorder(null);

		Screen.deleteMovie5.setBounds(550, 350, 200, 30);
		Screen.deleteMovie5.setBorder(null);

		Screen.deleteMovie6.setBounds(550, 390, 200, 30);
		Screen.deleteMovie6.setBorder(null);

		Screen.deleteMovie7.setBounds(550, 430, 200, 30);
		Screen.deleteMovie7.setBorder(null);

		Screen.deleteMovie8.setBounds(550, 470, 200, 30);
		Screen.deleteMovie8.setBorder(null);

		Screen.deleteMovie9.setBounds(550, 510, 200, 30);
		Screen.deleteMovie9.setBorder(null);

		Screen.deleteMovie10.setBounds(550, 550, 200, 30);
		Screen.deleteMovie10.setBorder(null);

		Screen.movieScores1.setBounds(760, 190, 200, 30);
		Screen.movieScores1.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores1.addItem(Integer.toString(i+1));

		Screen.movieScores2.setBounds(760, 230, 200, 30);
		Screen.movieScores2.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores2.addItem(Integer.toString(i+1));

		Screen.movieScores3.setBounds(760, 270, 200, 30);
		Screen.movieScores3.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores3.addItem(Integer.toString(i+1));

		Screen.movieScores4.setBounds(760, 310, 200, 30);
		Screen.movieScores4.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores4.addItem(Integer.toString(i+1));

		Screen.movieScores5.setBounds(760, 350, 200, 30);
		Screen.movieScores5.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores5.addItem(Integer.toString(i+1));

		Screen.movieScores6.setBounds(760, 390, 200, 30);
		Screen.movieScores6.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores6.addItem(Integer.toString(i+1));

		Screen.movieScores7.setBounds(760, 430, 200, 30);
		Screen.movieScores7.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores7.addItem(Integer.toString(i+1));

		Screen.movieScores8.setBounds(760, 470, 200, 30);
		Screen.movieScores8.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores8.addItem(Integer.toString(i+1));

		Screen.movieScores9.setBounds(760, 510, 200, 30);
		Screen.movieScores9.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores9.addItem(Integer.toString(i+1));

		Screen.movieScores10.setBounds(760, 550, 200, 30);
		Screen.movieScores10.setBorder(null);
		for (int i = 0; i < 10; i++) Screen.movieScores10.addItem(Integer.toString(i+1));

		Screen.prevMoviePage.setBounds(380, 600, 100, 30);
		Screen.prevMoviePage.setBorder(null);
		Screen.prevMoviePage.setText("<");

		Screen.nextMoviePage.setBounds(490, 600, 100, 30);
		Screen.nextMoviePage.setBorder(null);
		Screen.nextMoviePage.setText(">");
	}

	@Override
	public void addMovieScene()
	{

		Screen.addMovieNamePrompt.setBounds(30, 50, 100, 30);
		Screen.addMovieNamePrompt.setEditable(false);
		Screen.addMovieNamePrompt.setBorder(null);

		Screen.addMovieNameInput.setBounds(140, 50, 500, 30);
		Screen.addMovieNameInput.setBorder(null);

		Screen.addMovieDatePrompt.setBounds(30, 100, 100, 30);
		Screen.addMovieDatePrompt.setBorder(null);
		Screen.addMovieDatePrompt.setEditable(false);

		Screen.addMovieDateInput.setBounds(140, 100, 100, 30);
		Screen.addMovieDateInput.setBorder(null);

		Screen.addMovieLengthPrompt.setBounds(530, 100, 100, 30);
		Screen.addMovieLengthPrompt.setBorder(null);
		Screen.addMovieLengthPrompt.setEditable(false);

		Screen.addMovieLengthInput.setBounds(640, 100, 200, 30);
		Screen.addMovieLengthInput.setBorder(null);

		Screen.addMovieScorePrompt.setBounds(30, 150, 100, 30);
		Screen.addMovieScorePrompt.setBorder(null);
		Screen.addMovieScorePrompt.setEditable(false);

		Screen.addMovieScores.setBounds(140, 150, 100, 30);
		Screen.addMovieScores.setBorder(null);

		Screen.addMovieDirectorPrompt.setBounds(530, 150, 100, 30);
		Screen.addMovieDirectorPrompt.setBorder(null);
		Screen.addMovieDirectorPrompt.setEditable(false);

		Screen.addMovieDirectorInput.setBounds(640, 150, 300, 30);
		Screen.addMovieDirectorInput.setBorder(null);

		Screen.addMovieReviewPrompt.setBounds(30, 200, 200, 30);
		Screen.addMovieReviewPrompt.setBorder(null);
		Screen.addMovieReviewPrompt.setEditable(false);

		Screen.addMovieReviewInput.setBounds(30, 250, 940, 320);
		Screen.addMovieReviewInput.setBorder(null);
		Screen.addMovieReviewInput.setLineWrap(true);
		Screen.addMovieReviewInput.setWrapStyleWord(true);

		Screen.addMovieClear.setBounds(30, 600, 100, 30);
		Screen.addMovieClear.setBorder(null);

		Screen.addMovieCancel.setBounds(430, 600, 100, 30);
		Screen.addMovieCancel.setBorder(null);

		Screen.addMovieSave.setBounds(830, 600, 100, 30);
		Screen.addMovieSave.setBorder(null);
	}

	@Override
	public void movieInfoScene()
	{



	}

	@Override
	public void showsScene()
	{

		Screen.showsPrompt.setBounds(30, 50, 100, 30);
		Screen.showsPrompt.setBorder(null);
		Screen.showsPrompt.setFont(new Font("arial", Font.BOLD, 25));

		Screen.quitShows.setBounds(770, 50, 200, 30);
		Screen.quitShows.setBorder(null);

		Screen.showsAdd.setBounds(30, 130, 100, 30);
		Screen.showsAdd.setBorder(null);

		Screen.showsSearchBar.setBounds(350, 130, 300, 30);
		Screen.showsSearchBar.setBorder(null);

		Screen.showsName1.setBounds(30, 190, 300, 30);
		Screen.showsName1.setBorder(null);
		Screen.showsName1.setEditable(false);

		Screen.showsName2.setBounds(30, 230, 300, 30);
		Screen.showsName2.setBorder(null);
		Screen.showsName2.setEditable(false);

		Screen.showsName3.setBounds(30, 270, 300, 30);
		Screen.showsName3.setBorder(null);
		Screen.showsName3.setEditable(false);

		Screen.showsName4.setBounds(30, 310, 300, 30);
		Screen.showsName4.setBorder(null);
		Screen.showsName4.setEditable(false);

		Screen.showsName5.setBounds(30, 350, 300, 30);
		Screen.showsName5.setBorder(null);
		Screen.showsName5.setEditable(false);

		Screen.showsName6.setBounds(30, 390, 300, 30);
		Screen.showsName6.setBorder(null);
		Screen.showsName6.setEditable(false);

		Screen.showsName7.setBounds(30, 430, 300, 30);
		Screen.showsName7.setBorder(null);
		Screen.showsName7.setEditable(false);

		Screen.showsName8.setBounds(30, 470, 300, 30);
		Screen.showsName8.setBorder(null);
		Screen.showsName8.setEditable(false);

		Screen.showsName9.setBounds(30, 510, 300, 30);
		Screen.showsName9.setBorder(null);
		Screen.showsName9.setEditable(false);

		Screen.showsName10.setBounds(30, 550, 300, 30);
		Screen.showsName10.setBorder(null);
		Screen.showsName10.setEditable(false);

		Screen.showsOpen1.setBounds(340, 190, 200, 30);
		Screen.showsOpen1.setBorder(null);

		Screen.showsOpen2.setBounds(340, 230, 200, 30);
		Screen.showsOpen2.setBorder(null);

		Screen.showsOpen3.setBounds(340, 270, 200, 30);
		Screen.showsOpen3.setBorder(null);

		Screen.showsOpen4.setBounds(340, 310, 200, 30);
		Screen.showsOpen4.setBorder(null);

		Screen.showsOpen5.setBounds(340, 350, 200, 30);
		Screen.showsOpen5.setBorder(null);

		Screen.showsOpen6.setBounds(340, 390, 200, 30);
		Screen.showsOpen6.setBorder(null);

		Screen.showsOpen7.setBounds(340, 430, 200, 30);
		Screen.showsOpen7.setBorder(null);

		Screen.showsOpen8.setBounds(340, 470, 200, 30);
		Screen.showsOpen8.setBorder(null);

		Screen.showsOpen9.setBounds(340, 510, 200, 30);
		Screen.showsOpen9.setBorder(null);

		Screen.showsOpen10.setBounds(340, 550, 200, 30);
		Screen.showsOpen10.setBorder(null);

		Screen.showsDelete1.setBounds(550, 190, 200, 30);
		Screen.showsDelete1.setBorder(null);

		Screen.showsDelete2.setBounds(550, 230, 200, 30);
		Screen.showsDelete2.setBorder(null);

		Screen.showsDelete3.setBounds(550, 270, 200, 30);
		Screen.showsDelete3.setBorder(null);

		Screen.showsDelete4.setBounds(550, 310, 200, 30);
		Screen.showsDelete4.setBorder(null);

		Screen.showsDelete5.setBounds(550, 350, 200, 30);
		Screen.showsDelete5.setBorder(null);

		Screen.showsDelete6.setBounds(550, 390, 200, 30);
		Screen.showsDelete6.setBorder(null);

		Screen.showsDelete7.setBounds(550, 430, 200, 30);
		Screen.showsDelete7.setBorder(null);

		Screen.showsDelete8.setBounds(550, 470, 200, 30);
		Screen.showsDelete8.setBorder(null);

		Screen.showsDelete9.setBounds(550, 510, 200, 30);
		Screen.showsDelete9.setBorder(null);

		Screen.showsDelete10.setBounds(550, 550, 200, 30);
		Screen.showsDelete10.setBorder(null);

		Screen.showsProgress1.setBounds(760, 190, 200, 30);
		Screen.showsProgress1.setBorder(null);
		Screen.showsProgress1.setEditable(false);

		Screen.showsProgress2.setBounds(760, 230, 200, 30);
		Screen.showsProgress2.setBorder(null);
		Screen.showsProgress2.setEditable(false);

		Screen.showsProgress3.setBounds(760, 270, 200, 30);
		Screen.showsProgress3.setBorder(null);
		Screen.showsProgress3.setEditable(false);

		Screen.showsProgress4.setBounds(760, 310, 200, 30);
		Screen.showsProgress4.setBorder(null);
		Screen.showsProgress4.setEditable(false);

		Screen.showsProgress5.setBounds(760, 350, 200, 30);
		Screen.showsProgress5.setBorder(null);
		Screen.showsProgress5.setEditable(false);

		Screen.showsProgress6.setBounds(760, 390, 200, 30);
		Screen.showsProgress6.setBorder(null);
		Screen.showsProgress6.setEditable(false);

		Screen.showsProgress7.setBounds(760, 430, 200, 30);
		Screen.showsProgress7.setBorder(null);
		Screen.showsProgress7.setEditable(false);

		Screen.showsProgress8.setBounds(760, 470, 200, 30);
		Screen.showsProgress8.setBorder(null);
		Screen.showsProgress8.setEditable(false);

		Screen.showsProgress9.setBounds(760, 510, 200, 30);
		Screen.showsProgress9.setBorder(null);
		Screen.showsProgress9.setEditable(false);

		Screen.showsProgress10.setBounds(760, 550, 200, 30);
		Screen.showsProgress10.setBorder(null);
		Screen.showsProgress10.setEditable(false);

		Screen.showsPrevious.setBounds(380, 600, 100, 30);
		Screen.showsPrevious.setBorder(null);
		Screen.showsPrevious.setText("<");

		Screen.showsNext.setBounds(490, 600, 100, 30);
		Screen.showsNext.setBorder(null);
		Screen.showsNext.setText(">");

	}

	@Override
	public void addShowsScene()
	{

		Screen.addShowNamePrompt.setBounds(30, 50, 100, 30);
		Screen.addShowNamePrompt.setEditable(false);
		Screen.addShowNamePrompt.setBorder(null);

		Screen.addShowNameInput.setBounds(140, 50, 500, 30);
		Screen.addShowNameInput.setBorder(null);

		Screen.addShowScorePrompt.setBounds(30, 100, 100, 30);
		Screen.addShowScorePrompt.setBorder(null);
		Screen.addShowScorePrompt.setEditable(false);

		Screen.addShowScoreInput.setBounds(140, 100, 100, 30);
		Screen.addShowScoreInput.setBorder(null);

		Screen.addShowLengthPrompt.setBounds(530, 100, 100, 30);
		Screen.addShowLengthPrompt.setBorder(null);
		Screen.addShowLengthPrompt.setEditable(false);

		Screen.addShowLengthInput.setBounds(640, 100, 200, 30);
		Screen.addShowLengthInput.setBorder(null);

		Screen.addShowSeasonsPrompt.setBounds(30, 200, 200, 30);
		Screen.addShowSeasonsPrompt.setBorder(null);
		Screen.addShowSeasonsPrompt.setEditable(false);

		Screen.addShowSeasonsInput.setBounds(30, 250, 940, 320);
		Screen.addShowSeasonsInput.setBorder(null);
		Screen.addShowSeasonsInput.setLineWrap(true);
		Screen.addShowSeasonsInput.setWrapStyleWord(true);

		Screen.addShowClear.setBounds(30, 600, 100, 30);
		Screen.addShowClear.setBorder(null);

		Screen.addShowCancel.setBounds(430, 600, 100, 30);
		Screen.addShowCancel.setBorder(null);

		Screen.addShowSave.setBounds(830, 600, 100, 30);
		Screen.addShowSave.setBorder(null);

	}

	@Override
	public void showsInfoScene()
	{



	}

	@Override
	public void watchlistScene()
	{

		Screen.watchlistPrompt.setBounds(30, 50, 300, 30);
		Screen.watchlistPrompt.setBorder(null);
		Screen.watchlistPrompt.setFont(new Font("arial", Font.BOLD, 25));
		Screen.watchlistPrompt.setEditable(false);

		Screen.quitWatchlist.setBounds(770, 50, 200, 30);
		Screen.quitWatchlist.setBorder(null);

		Screen.watchlistAdd.setBounds(30, 130, 100, 30);
		Screen.watchlistAdd.setBorder(null);

		Screen.watchlistSearchBar.setBounds(350, 130, 300, 30);
		Screen.watchlistSearchBar.setBorder(null);

		Screen.watchlistName1.setBounds(30, 190, 300, 30);
		Screen.watchlistName1.setBorder(null);
		Screen.watchlistName1.setEditable(false);

		Screen.watchlistName2.setBounds(30, 230, 300, 30);
		Screen.watchlistName2.setBorder(null);
		Screen.watchlistName2.setEditable(false);

		Screen.watchlistName3.setBounds(30, 270, 300, 30);
		Screen.watchlistName3.setBorder(null);
		Screen.watchlistName3.setEditable(false);

		Screen.watchlistName4.setBounds(30, 310, 300, 30);
		Screen.watchlistName4.setBorder(null);
		Screen.watchlistName4.setEditable(false);

		Screen.watchlistName5.setBounds(30, 350, 300, 30);
		Screen.watchlistName5.setBorder(null);
		Screen.watchlistName5.setEditable(false);

		Screen.watchlistName6.setBounds(30, 390, 300, 30);
		Screen.watchlistName6.setBorder(null);
		Screen.watchlistName6.setEditable(false);

		Screen.watchlistName7.setBounds(30, 430, 300, 30);
		Screen.watchlistName7.setBorder(null);
		Screen.watchlistName7.setEditable(false);

		Screen.watchlistName8.setBounds(30, 470, 300, 30);
		Screen.watchlistName8.setBorder(null);
		Screen.watchlistName8.setEditable(false);

		Screen.watchlistName9.setBounds(30, 510, 300, 30);
		Screen.watchlistName9.setBorder(null);
		Screen.watchlistName9.setEditable(false);

		Screen.watchlistName10.setBounds(30, 550, 300, 30);
		Screen.watchlistName10.setBorder(null);
		Screen.watchlistName10.setEditable(false);

		Screen.watchlistStart1.setBounds(340, 190, 200, 30);
		Screen.watchlistStart1.setBorder(null);

		Screen.watchlistStart2.setBounds(340, 230, 200, 30);
		Screen.watchlistStart2.setBorder(null);

		Screen.watchlistStart3.setBounds(340, 270, 200, 30);
		Screen.watchlistStart3.setBorder(null);

		Screen.watchlistStart4.setBounds(340, 310, 200, 30);
		Screen.watchlistStart4.setBorder(null);

		Screen.watchlistStart5.setBounds(340, 350, 200, 30);
		Screen.watchlistStart5.setBorder(null);

		Screen.watchlistStart6.setBounds(340, 390, 200, 30);
		Screen.watchlistStart6.setBorder(null);

		Screen.watchlistStart7.setBounds(340, 430, 200, 30);
		Screen.watchlistStart7.setBorder(null);

		Screen.watchlistStart8.setBounds(340, 470, 200, 30);
		Screen.watchlistStart8.setBorder(null);

		Screen.watchlistStart9.setBounds(340, 510, 200, 30);
		Screen.watchlistStart9.setBorder(null);

		Screen.watchlistStart10.setBounds(340, 550, 200, 30);
		Screen.watchlistStart10.setBorder(null);

		Screen.watchlistDelete1.setBounds(550, 190, 200, 30);
		Screen.watchlistDelete1.setBorder(null);

		Screen.watchlistDelete2.setBounds(550, 230, 200, 30);
		Screen.watchlistDelete2.setBorder(null);

		Screen.watchlistDelete3.setBounds(550, 270, 200, 30);
		Screen.watchlistDelete3.setBorder(null);

		Screen.watchlistDelete4.setBounds(550, 310, 200, 30);
		Screen.watchlistDelete4.setBorder(null);

		Screen.watchlistDelete5.setBounds(550, 350, 200, 30);
		Screen.watchlistDelete5.setBorder(null);

		Screen.watchlistDelete6.setBounds(550, 390, 200, 30);
		Screen.watchlistDelete6.setBorder(null);

		Screen.watchlistDelete7.setBounds(550, 430, 200, 30);
		Screen.watchlistDelete7.setBorder(null);

		Screen.watchlistDelete8.setBounds(550, 470, 200, 30);
		Screen.watchlistDelete8.setBorder(null);

		Screen.watchlistDelete9.setBounds(550, 510, 200, 30);
		Screen.watchlistDelete9.setBorder(null);

		Screen.watchlistDelete10.setBounds(550, 550, 200, 30);
		Screen.watchlistDelete10.setBorder(null);

		Screen.watchlistType1.setBounds(760, 190, 200, 30);
		Screen.watchlistType1.setBorder(null);
		Screen.watchlistType1.setEditable(false);

		Screen.watchlistType2.setBounds(760, 230, 200, 30);
		Screen.watchlistType2.setBorder(null);
		Screen.watchlistType2.setEditable(false);

		Screen.watchlistType3.setBounds(760, 270, 200, 30);
		Screen.watchlistType3.setBorder(null);
		Screen.watchlistType3.setEditable(false);

		Screen.watchlistType4.setBounds(760, 310, 200, 30);
		Screen.watchlistType4.setBorder(null);
		Screen.watchlistType4.setEditable(false);

		Screen.watchlistType5.setBounds(760, 350, 200, 30);
		Screen.watchlistType5.setBorder(null);
		Screen.watchlistType5.setEditable(false);

		Screen.watchlistType6.setBounds(760, 390, 200, 30);
		Screen.watchlistType6.setBorder(null);
		Screen.watchlistType6.setEditable(false);

		Screen.watchlistType7.setBounds(760, 430, 200, 30);
		Screen.watchlistType7.setBorder(null);
		Screen.watchlistType7.setEditable(false);

		Screen.watchlistType8.setBounds(760, 470, 200, 30);
		Screen.watchlistType8.setBorder(null);
		Screen.watchlistType8.setEditable(false);

		Screen.watchlistType9.setBounds(760, 510, 200, 30);
		Screen.watchlistType9.setBorder(null);
		Screen.watchlistType9.setEditable(false);

		Screen.watchlistType10.setBounds(760, 550, 200, 30);
		Screen.watchlistType10.setBorder(null);
		Screen.watchlistType10.setEditable(false);

		Screen.watchlistPrev.setBounds(380, 600, 100, 30);
		Screen.watchlistPrev.setBorder(null);
		Screen.watchlistPrev.setText("<");

		Screen.watchlistNext.setBounds(490, 600, 100, 30);
		Screen.watchlistNext.setBorder(null);
		Screen.watchlistNext.setText(">");

	}

	@Override
	public void watchlistAddScene()
	{

		Screen.watchlistAddNamePrompt.setBounds(300, 200, 100, 30);
		Screen.watchlistAddNamePrompt.setBorder(null);
		Screen.watchlistAddNamePrompt.setEditable(false);

		Screen.watchlistAddNameInput.setBounds(410, 200, 290, 30);
		Screen.watchlistAddNameInput.setBorder(null);

		Screen.watchlistAddTypePrompt.setBounds(300, 250, 100, 30);
		Screen.watchlistAddTypePrompt.setBorder(null);
		Screen.watchlistAddTypePrompt.setEditable(false);

		Screen.watchlistAddTypeSet.setBounds(410, 250, 290, 30);
		Screen.watchlistAddTypeSet.setBorder(null);

		Screen.watchlistAddClear.setBounds(30, 600, 100, 30);
		Screen.watchlistAddClear.setBorder(null);

		Screen.watchlistAddCancel.setBounds(430, 600, 100, 30);
		Screen.watchlistAddCancel.setBorder(null);

		Screen.watchlistAddSave.setBounds(830, 600, 100, 30);
		Screen.watchlistAddSave.setBorder(null);

	}

	@Override
	public void statsScene()
	{

		Screen.statsPrompt.setBounds(30, 50, 300, 30);
		Screen.statsPrompt.setBorder(null);
		Screen.statsPrompt.setFont(new Font("arial", Font.BOLD, 25));
		Screen.statsPrompt.setEditable(false);

		Screen.quitStats.setBounds(770, 50, 200, 30);
		Screen.quitStats.setBorder(null);

		Screen.statsInfo.setBounds(30, 100, 940, 550);
		Screen.statsInfo.setBorder(null);
		Screen.statsInfo.setLineWrap(true);
		Screen.statsInfo.setWrapStyleWord(true);
		Screen.statsInfo.setEditable(false);

	}

	@Override
	public void settingsScene()
	{

		Screen.settingsPrompt.setBounds(30, 50, 300, 30);
		Screen.settingsPrompt.setBorder(null);
		Screen.settingsPrompt.setFont(new Font("arial", Font.BOLD, 25));
		Screen.settingsPrompt.setEditable(false);

		Screen.quitSettings.setBounds(770, 50, 200, 30);
		Screen.quitSettings.setBorder(null);

		Screen.settingsLanguagePrompt.setBounds(30, 150, 200, 30);
		Screen.settingsLanguagePrompt.setBorder(null);
		Screen.settingsLanguagePrompt.setEditable(false);

		Screen.settingsLanguageSet.setBounds(530, 150, 200, 30);
		Screen.settingsLanguageSet.setBorder(null);

		Screen.settingsThemePrompt.setBounds(30, 200, 200, 30);
		Screen.settingsThemePrompt.setBorder(null);
		Screen.settingsThemePrompt.setEditable(false);

		Screen.settingsThemeSet.setBounds(530, 200, 200, 30);
		Screen.settingsThemeSet.setBorder(null);

		Screen.settingsDatePrompt.setBounds(30, 250, 200, 30);
		Screen.settingsDatePrompt.setBorder(null);
		Screen.settingsDatePrompt.setEditable(false);

		Screen.settingsDateSet.setBounds(530, 250, 200, 30);
		Screen.settingsDateSet.setBorder(null);

		Screen.settingsHelp.setBounds(30, 600, 100, 30);
		Screen.settingsHelp.setBorder(null);

		Screen.settingsImport.setBounds(430, 600, 100, 30);
		Screen.settingsImport.setBorder(null);

		Screen.settingsExport.setBounds(830, 600, 100, 30);
		Screen.settingsExport.setBorder(null);

	}

	@Override
	public void helpScene()
	{

		Screen.helpPrompt.setBounds(30, 50, 300, 30);
		Screen.helpPrompt.setBorder(null);
		Screen.helpPrompt.setFont(new Font("arial", Font.BOLD, 25));
		Screen.helpPrompt.setEditable(false);

		Screen.quitHelp.setBounds(770, 50, 200, 30);
		Screen.quitHelp.setBorder(null);

		Screen.helpInfo.setBounds(30, 100, 940, 350);
		Screen.helpInfo.setBorder(null);
		Screen.helpInfo.setLineWrap(true);
		Screen.helpInfo.setWrapStyleWord(true);
		Screen.helpInfo.setEditable(false);

		Screen.helpPrev.setBounds(380, 600, 100, 30);
		Screen.helpPrev.setBorder(null);
		Screen.helpPrev.setText("<");

		Screen.helpNext.setBounds(490, 600, 100, 30);
		Screen.helpNext.setBorder(null);
		Screen.helpNext.setText(">");

	}

}