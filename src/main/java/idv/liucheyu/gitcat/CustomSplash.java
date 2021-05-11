package idv.liucheyu.gitcat;

import de.felixroske.jfxsupport.SplashScreen;

public class CustomSplash extends SplashScreen {

    @Override
    public String getImagePath() {
        return "/splash/cat.jpg";
    }

    @Override
    public boolean visible() {
        return super.visible();
    }
}
