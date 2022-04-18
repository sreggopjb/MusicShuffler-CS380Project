// Author: Jimmy Battistoni

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.*;

public class songSection extends JFrame
{
    JList songsList;
    String[] songsName = {
        "Let it Happen",
        "Elephant",
        "Lost in Yesterday",
        "Borderline",
        "Mind Mischief"
    };

    // Testing interaction with color first
    Color[] listColorValues = {
        Color.BLACK,
        Color.BLUE,
        Color.GREEN,
        Color.YELLOW,
        Color.RED
    };
    
    // Container of the Songs information and tile
    Container songTile;
    public songSection()
    {
        super("songSectionTesting ");
        songTile = getContentPane();
        songTile.setLayout(new FlowLayout());
        songsList = new JList(songsName);
        songsList.setSelectedIndex(0);
        songsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        songTile.add(new JScrollPane(songsList));
        songsList.addListSelectionListener(new ListSelectionListener() 
        {
            public void valueChanged(ListSelectionEvent e)
            {
                // This is where the need to change the song will go right here
                // This is a test that shows that if the list item is selected than
                // the interaction with the item will work
                songTile.setBackground(listColorValues[songsList.getSelectedIndex()]);
            }
        });
        setSize(250, 250);
        setVisible(true);
    }

    public static void main(String[] args)
    {
        songSection test = new songSection();
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}