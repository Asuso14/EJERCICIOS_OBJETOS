package org.example.TV;

public class TV {
    private int channel = 1;
    private int volume = 5;

    public TV(){}
    public TV(int channel, int volume){
        this.channel = channel;
        this.volume = volume;
    }

    public int getChannel() {
        return channel;
    }

    public void uploadChannel(){
        setChannel(this.channel+1);
    }
    public void downChannel(){
        setChannel(this.channel-1);
    }

    public void setChannel(int channel){
        if (channel > 100 || channel < 1){
            System.out.println("Error");
        }else {
            this.channel = channel;
            System.out.println("Canal: " + this.channel);
        }
    }

    public int getVolume(){
        return this.volume;
    }
    public void setVolume(int volume){
        if (volume < 0 || volume > 100){
            System.out.println("error");
        }else {
            this.volume = volume;
            System.out.println("Volumen: " + this.volume);
        }
    }

    @Override
    public String toString(){
        return "TV: con el canal " + this.channel + " y volumen " + this.volume;
    }
}
