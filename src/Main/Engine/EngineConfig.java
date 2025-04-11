package Main.Engine;

public class EngineConfig {
    // window config
    public int windowWidth;
    public int windowHeight;
    public boolean fullscreen;
    public boolean vsync;
    public String windowTitle;
    // renderer config
    public int maxFPS;
    // audio config
    public float masterVolume;
    public float musicVolume;
    public float sfxVolume;
    // debug config
    public boolean releaseMode;
    public boolean debugMode;
    public boolean showDebugInfo;
    public boolean logToFile;
    // assets config
    public String assetsPath;

    // Constructor
    public EngineConfig() {
    }
    // Getters and setters

    public int getWindowWidth() {
        return windowWidth;
    }

    public void setWindowWidth(int windowWidth) {
        this.windowWidth = windowWidth;
    }

    public int getWindowHeight() {
        return windowHeight;
    }

    public void setWindowHeight(int windowHeight) {
        this.windowHeight = windowHeight;
    }

    public boolean isFullscreen() {
        return fullscreen;
    }

    public void setFullscreen(boolean fullscreen) {
        this.fullscreen = fullscreen;
    }

    public boolean isVsync() {
        return vsync;
    }

    public void setVsync(boolean vsync) {
        this.vsync = vsync;
    }

    public String getWindowTitle() {
        return windowTitle;
    }

    public void setWindowTitle(String windowTitle) {
        this.windowTitle = windowTitle;
    }

    public int getMaxFPS() {
        return maxFPS;
    }

    public void setMaxFPS(int maxFPS) {
        this.maxFPS = maxFPS;
    }

    public float getMasterVolume() {
        return masterVolume;
    }

    public void setMasterVolume(float masterVolume) {
        this.masterVolume = masterVolume;
    }

    public float getMusicVolume() {
        return musicVolume;
    }

    public void setMusicVolume(float musicVolume) {
        this.musicVolume = musicVolume;
    }

    public float getSfxVolume() {
        return sfxVolume;
    }

    public void setSfxVolume(float sfxVolume) {
        this.sfxVolume = sfxVolume;
    }

    public boolean isReleaseMode() {
        return releaseMode;
    }

    public void setReleaseMode(boolean releaseMode) {
        this.releaseMode = releaseMode;
    }

    public boolean isDebugMode() {
        return debugMode;
    }

    public void setDebugMode(boolean debugMode) {
        this.debugMode = debugMode;
    }

    public boolean isShowDebugInfo() {
        return showDebugInfo;
    }

    public void setShowDebugInfo(boolean showDebugInfo) {
        this.showDebugInfo = showDebugInfo;
    }

    public boolean isLogToFile() {
        return logToFile;
    }

    public void setLogToFile(boolean logToFile) {
        this.logToFile = logToFile;
    }

    public String getAssetsPath() {
        return assetsPath;
    }

    public void setAssetsPath(String assetsPath) {
        this.assetsPath = assetsPath;
    }


}
