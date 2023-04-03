package DPIterator;

public class Songs_iterator implements Iterator{
    private MP3Player mp3Player;
    private int position=0;
    protected String[] elements;

    public Songs_iterator(String[] elements) {
        this.elements = elements;
    }

    public boolean hasMore() {
        if(position >= elements.length || elements[position]==null)
            return false;
        return true;
    }

    public Object getNext(){
      String song = elements[position];
        position++;
        return song;
    }

    public void restart(){
        position=0;
    }

    public void addElement(Object elmnt){
            position++;
            elements[position] = (String) elmnt;
    }
}
