package com.liu.design_3_model.structure_05Facade.case1_Theater;

public class TheaterFacadeHome {
    // 定义各个子系统对象
    private DVDPlayer dvdPlayer;
    private Light light;
    private Popcorn popcorn;
    private Projector projector;
    private Screen screen;
    private Stereo stereo;

    // 构造器
    public TheaterFacadeHome() {
        this.dvdPlayer = DVDPlayer.getInstance();
        this.light = Light.getInstance();
        this.popcorn = Popcorn.getInstance();
        this.projector = Projector.getInstance();
        this.screen = Screen.getInstance();
        this.stereo = Stereo.getInstance();
    }

    /* 操作分成4步 第1步：各个设备的准备阶段 */
    public void ready() {
        popcorn.on();
        popcorn.pop();
        screen.down();
        projector.on();
        stereo.on();
        dvdPlayer.on();
        light.dark();
        System.out.println("====== Theater is ready... =======");
    }

    /* 操作分成4步 第2步：电影的播放阶段 */
    public void play() {
        dvdPlayer.play();
        stereo.volume();
        System.out.println("====== Movie is playing... =======");
    }

    /* 操作分成4步 第3步：电影的播放暂停 */
    public void pause() {
        dvdPlayer.pause();
        System.out.println("====== Movie is paused... =======");
    }

    /* 操作分成4步 第4步：电影播放结束 */
    public void end() {
        popcorn.off();
        screen.up();
        projector.off();
        stereo.off();
        dvdPlayer.off();
        light.on();
        System.out.println("====== Theater is end... =======");
    }
}
