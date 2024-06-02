package baseball;

public class BaseBallTeam {
    private String name;
    private int win;
    private int lose;
    private int draw;
    double rate;


    public BaseBallTeam(){

    }
    public BaseBallTeam(String name,int win,int lose,int draw) {
        this.name = name;
        this.win = win;
        this.lose = lose;
        this.draw = draw;
    }

    public void getRate() {
        double rate = ((double)win/(double)(win+lose));
        //System.out.println(rate);
        this.rate=rate;
        //return rate;

    }
    public void report() {
        System.out.println(name+"の2022年の成績は "+win+"勝 "+lose+"敗 "+draw+"分、勝率は"+rate+"です。");
    }

    public void setname(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }



public int getWin() {
        return win;
    }

    public void setWin(int win) {
        this.win = win;
    }

    public int getLose() {
        return lose;
    }

    public void setLose(int lose) {
        this.lose = lose;
    }

    public int getDraw() {
        return draw;
    }

    public void setDraw(int draw) {
        this.draw = draw;
    }




}
