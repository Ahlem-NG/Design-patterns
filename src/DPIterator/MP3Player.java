package DPIterator;

public class MP3Player extends Container{
protected static final int nbrMax=10;
protected int nbrSongs=0;
protected String[] songs={"song1","song2","song3"};

    public MP3Player() {
    }

    @Override
    public Iterator createIterator() {
        return new Songs_iterator(songs);
    }

    //Add song method

  /*  public void addSong(String name) {
        if(nbrSongs<nbrMax && songs.length<nbrMax)
       { nbrSongs++;
        songs[nbrSongs] = name;}
    }
*/
    //get song method
    public void restart(){
      nbrSongs=0;
    }
}
