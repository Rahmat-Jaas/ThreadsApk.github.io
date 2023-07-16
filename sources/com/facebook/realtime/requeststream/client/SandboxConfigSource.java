package com.facebook.realtime.requeststream.client;

public interface SandboxConfigSource {
    String getBladerunnerSandbox();

    String getDistillerySandbox();

    String getJavascriptSandbox();

    String getWwwSandbox();

    void setBladerunnerSandbox(String str);

    void setDistillerySandbox(String str);

    void setJavascriptSandbox(String str);

    void setWwwSandbox(String str);
}
