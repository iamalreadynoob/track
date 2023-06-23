package gui;

import javax.swing.*;
import java.util.ArrayList;

public class Combiner
{
    private ArrayList<JTextField> tempJTextField;
    private ArrayList<JButton> tempJButton;
    private ArrayList<JComboBox<String>> tempJComboBox;

    public enum Sections
    {
        MOVIE_NAMES, MOVIE_OPEN_BUTTONS, MOVIE_DELETE_BUTTONS, MOVIE_SCORES
    }

    public Combiner(Sections section)
    {
        if (section == Sections.MOVIE_NAMES)
        {
            tempJTextField = new ArrayList<>();

            tempJTextField.add(Screen.movieName1);
            tempJTextField.add(Screen.movieName2);
            tempJTextField.add(Screen.movieName3);
            tempJTextField.add(Screen.movieName4);
            tempJTextField.add(Screen.movieName5);
            tempJTextField.add(Screen.movieName6);
            tempJTextField.add(Screen.movieName7);
            tempJTextField.add(Screen.movieName8);
            tempJTextField.add(Screen.movieName9);
            tempJTextField.add(Screen.movieName10);
        }

        else if (section == Sections.MOVIE_OPEN_BUTTONS)
        {
            tempJButton = new ArrayList<>();

            tempJButton.add(Screen.openMovie1);
            tempJButton.add(Screen.openMovie2);
            tempJButton.add(Screen.openMovie3);
            tempJButton.add(Screen.openMovie4);
            tempJButton.add(Screen.openMovie5);
            tempJButton.add(Screen.openMovie6);
            tempJButton.add(Screen.openMovie7);
            tempJButton.add(Screen.openMovie8);
            tempJButton.add(Screen.openMovie9);
            tempJButton.add(Screen.openMovie10);
        }

        else if (section == Sections.MOVIE_DELETE_BUTTONS)
        {
            tempJButton = new ArrayList<>();

            tempJButton.add(Screen.deleteMovie1);
            tempJButton.add(Screen.deleteMovie2);
            tempJButton.add(Screen.deleteMovie3);
            tempJButton.add(Screen.deleteMovie4);
            tempJButton.add(Screen.deleteMovie5);
            tempJButton.add(Screen.deleteMovie6);
            tempJButton.add(Screen.deleteMovie7);
            tempJButton.add(Screen.deleteMovie8);
            tempJButton.add(Screen.deleteMovie9);
            tempJButton.add(Screen.deleteMovie10);
        }

        else if (section == Sections.MOVIE_SCORES)
        {
            tempJComboBox = new ArrayList<>();

            tempJComboBox.add(Screen.movieScores1);
            tempJComboBox.add(Screen.movieScores2);
            tempJComboBox.add(Screen.movieScores3);
            tempJComboBox.add(Screen.movieScores4);
            tempJComboBox.add(Screen.movieScores5);
            tempJComboBox.add(Screen.movieScores6);
            tempJComboBox.add(Screen.movieScores7);
            tempJComboBox.add(Screen.movieScores8);
            tempJComboBox.add(Screen.movieScores9);
            tempJComboBox.add(Screen.movieScores10);
        }
    }

    public ArrayList<JTextField> getJTextFieldSet() {return tempJTextField;}
    public ArrayList<JButton> getJButtonSet() {return tempJButton;}
    public ArrayList<JComboBox<String>> getJComboBoxSet() {return tempJComboBox;}

}
