package DPIterator;

public class Client {
    private MP3Player mp3Player;

    public Client(MP3Player mp3Player) {
        this.mp3Player = mp3Player;
    }


    private void displayMenu(Iterator iterator){
        iterator.restart();
        int i=1;
        while (iterator.hasMore()){
            String song = (String) iterator.getNext();
            System.out.println(i+" song :"+song);
            i++;
        }
    }


    public void displayList(){
    Iterator songIterator=mp3Player.createIterator();
    displayMenu(songIterator);
    }

    public void addSong( String name){
        Iterator songIterator=mp3Player.createIterator();
        songIterator.addElement(name);
    }


    public static void main(String[] args) {

MP3Player mp3Player= new MP3Player();
Client client1 = new Client(mp3Player);

client1.displayList();
//client1.addSong("song4");



    }


}
